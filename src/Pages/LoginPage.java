package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by user on 14/06/17.
 */
public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {

    this.driver = driver;

        if(!driver.getTitle().contains("login")) {
            driver.get("http://www.phptravels.net/admin");
        }
    }

    public FillDetails incorrectLogin(String username, String password) {

        driver.findElement(By.name("email")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);

        driver.findElement(By.linkText("Login")).click();
        return new FillDetails(driver);
    }

    public HomePage correctLogin(String username, String password) {

        driver.findElement(By.name("email")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
        return new HomePage(driver);
    }
}
