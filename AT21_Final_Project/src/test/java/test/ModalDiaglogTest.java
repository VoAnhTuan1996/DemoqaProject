package test;

import core.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Obj.ModalDialogsPageObj;

import java.time.Duration;

public class ModalDiaglogTest extends BaseTest {
    ModalDialogsPageObj objModalDialog;
    @BeforeMethod
    public void openUrl(){
        String url = BaseUrl + "modal-dialogs";
        driver.get(url);
        objModalDialog = new ModalDialogsPageObj(driver);
    }
    //@Test(priority = 1)
    public void SmallDialogTest(){
        objModalDialog.clickSmallDialogButton();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("modal-content")));
        WebElement text = objModalDialog.getElementByXpath(driver,"//div[contains(text(),'This is a small modal. It has very less content')]");
        System.out.println(text.getText());
        objModalDialog.clickToElementById(driver,"closeSmallModal");
    }

    @Test(priority = 2)
    public void LargeDialogTest(){
        objModalDialog.clickLargeDialogButton();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("modal-content")));
        WebElement text = objModalDialog.getElementByXpath(driver,"//p[contains(text(),'Lorem Ipsum ')]");
        System.out.println(text.getText());
        objModalDialog.clickToElementById(driver,"closeLargeModal");
    }
}
