package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by user on 14/06/17.
 */
public class WebDriverWaitUtil {

    public static void waitForElementToBeClickable(WebDriver driver, By locator, int waitTime) {
        new WebDriverWait(driver, waitTime).until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void waitForElementToBeAvailable(WebDriver driver, By locator, int waitTime) {
        new WebDriverWait(driver, waitTime).until(ExpectedConditions.presenceOfElementLocated(locator));
    }
}
