package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;

        // implement error handling

    }

    public LoginPage logOut() {

        driver.findElement(By.partialLinkText("Log Out")).click();
        return new LoginPage(driver);
    }

    public String getWelcomeString() {

        return driver.findElement(By.className("smallText")).getText();
    }

}