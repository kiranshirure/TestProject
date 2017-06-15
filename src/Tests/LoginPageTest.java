package Tests;

import Beans.UserDetails;
import Pages.FillDetails;
import Pages.WebDriverWaitUtil;
import Utils.propertiesReader;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Created by user on 14/06/17.
 */
public class LoginPageTest extends AbstractTest {


    @Test(dataProvider = "LoginDetails")
    public void LoginTest(String email, String password) throws InterruptedException {


        driver.get(propertiesReader.getProperty("config","url"));
        //   Thread.sleep(5000);
        driver.findElement(By.name("email")).sendKeys(email);
        //  Thread.sleep(5000);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.cssSelector("[data-style]")).click();
//        WebDriverWait wait = new WebDriverWait(driver, 15);
//        wait.until(ExpectedConditions.elementToBeClickable(driver.getTitle())));
        //  Assert.assertEquals("Dashboard", driver.getTitle());
        //Actions builder = new Actions(driver);
        driver.findElement(By.cssSelector("#social-sidebar-menu > li:nth-of-type(4) > a > span")).click();
       // builder.moveToElement(driver.findElement(By.linkText("Accounts"))).build().perform();
        driver.findElement(By.cssSelector("#Accounts > li:nth-of-type(1) > a")).click();
        driver.findElement(By.className("add_button")).click();

        FillDetails fd = new FillDetails(driver).get();
        fd.populateAllRequiredDetails();



        }



    @DataProvider(name = "LoginDetails")
    public static Object[][] LoginDetails() {
        return new Object[][]{
                {"admin@phptravels.com", "demoadmin"}


        };
    }}
