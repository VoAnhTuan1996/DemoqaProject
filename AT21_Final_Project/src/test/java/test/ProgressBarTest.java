package test;

import core.BaseTest;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Obj.ProgressBarPageObj;
import pages.UI.ProgressBarUI;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ProgressBarTest extends BaseTest {
    ProgressBarPageObj objProgressBar;
    @BeforeMethod
    public void openUrl(){
        String url = BaseUrl + "progress-bar";
        driver.get(url);
        objProgressBar = new ProgressBarPageObj(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void ProgressBarTest() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement progressBar = objProgressBar.getElementByXpath(driver,ProgressBarUI.progressBar);
        objProgressBar.clickStartStopButton();
        Wait<WebDriver> fluentWait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofMillis(50)).ignoring(ElementNotInteractableException.class);
        fluentWait.until(d->"50%".equals(progressBar.getText()));
        objProgressBar.clickStartStopButton();
        Thread.sleep(3000);
    }
}
