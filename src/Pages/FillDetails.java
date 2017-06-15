package Pages;


import Beans.UserDetails;
import Utils.propertiesReader;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    By country = By.id("select2-drop-mask");
    By country2 = By.className("select2-input");
    By SelectedCountry = By.className("select2-match");
    By address1 = By.name("address1");
    By address2 = By.name("address3");





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
//       driver.findElement(country).click();
//       driver.findElement(country2).sendKeys(ud.getCountry2());
//       driver.findElement(SelectedCountry).equals(country2);
        WebElement droplist = driver.findElement(By.className("select2-drop-mask"));
        droplist.sendKeys("India");

       // List<WebElement> allOptions = droplist.findElements(By.tagName("option"));

        driver.findElement(address1).sendKeys(ud.getAddress1());
        driver.findElement(address2).sendKeys(ud.getAddress2());

    }




}