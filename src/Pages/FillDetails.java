package Pages;


import Beans.UserDetails;
import Utils.propertiesReader;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FillDetails extends LoadableComponent<FillDetails> {

    private WebDriver driver = null;


    By firstName = By.name("fname");
    By lastName = By.name("lname");
    By email = By.name("email");
    By mobilenumber = By.name("mobile");
    By password = By.name("password");
    By country = By.name("country");
    By address1 = By.name("address1");
    By address2 = By.name("address2");





    public FillDetails(WebDriver driver) {
        this.driver = driver;
    }


    @Override
    protected void isLoaded() throws Error {
        driver.getPageSource().contains("Admin");
    }

    @Override
    protected void load() {
        // TODO Auto-generated method stub

    }

    public void populateAllRequiredDetails() {

        UserDetails ud = UserDetails.getUserDetails();


        driver.findElement(firstName).sendKeys(ud.getFirstName());
        driver.findElement(lastName).sendKeys(ud.getLastName());
        driver.findElement(email).sendKeys(ud.getEmail());
        driver.findElement(password).sendKeys(ud.getPassword());
       driver.findElement(mobilenumber).sendKeys(ud.getMobileNo());

         Select dropdown = new Select(driver.findElement(country));
        dropdown.selectByValue(ud.getCountry());

        driver.findElement(address1).sendKeys(ud.getAddress1());
        driver.findElement(address2).sendKeys(ud.getAddress2());

        driver.findElement(By.xpath("//*[@id='content']/form/div/div[2]/div/div[17]/div[1]/div/div[2]/ul/li[3]/label/div/ins")).click();

         driver.findElement(By.xpath("//*[@id='content']/form/div/div[3]/button")).click();

    }




}