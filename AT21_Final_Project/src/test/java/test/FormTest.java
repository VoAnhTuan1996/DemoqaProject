package test;

import core.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Obj.FormPageObj;
import pages.UI.FormUI;

import java.time.Duration;

public class FormTest extends BaseTest {
    FormPageObj objForm;
    @BeforeMethod
    public void openUrl(){
        String url = BaseUrl + "automation-practice-form";
        driver.get(url);
        objForm = new FormPageObj(driver);
    }
    @Test(priority = 1)
    public void RegisterFormTest() throws InterruptedException {
        objForm.enterFirstNameTxt("Vo");
        objForm.enterLastNameTxt("Anh Tuan");
        objForm.enterEmailTxt("harrytuan@gmail.com");
        objForm.clickRdbMale();
        objForm.enterPhoneNumberTxt("0523124769");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        WebElement inputDate = objForm.getElementById(driver, FormUI.dateInput);
        inputDate.sendKeys(Keys.CONTROL+"a");
        inputDate.sendKeys("07 December 2023");
        objForm.enterSubjectsInput("En");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        By suggestionLocator = By.cssSelector("#react-select-2-option-0");
        WebElement suggestion = wait.until(ExpectedConditions.visibilityOfElementLocated(suggestionLocator));
        // Thực hiện chọn gợi ý "English"
        suggestion.click();
        objForm.clickCbSport();
        objForm.clickCbMusic();
        String path = System.getProperty("user.dir");
        String imgFile = path + "\\src\\test\\image\\avt.jpg";
        objForm.sendkeyUploadFilePicture(imgFile);
        objForm.enterCurrentAddressInput("150 Nguyen Thai Son, p4, Go Vap");
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo( 0, document.body.scrollHeight)");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        objForm.clickSelectState();
        WebElement itemState = objForm.getElementByXpath(driver,"//div[text()='NCR']");
        itemState.click();
        objForm.clickSelectCity();
        WebElement itemCity = objForm.getElementByXpath(driver,"//div[text()='Delhi']");
        itemCity.click();
        objForm.clickToElementById(driver,FormUI.submitBtn);
        Thread.sleep(3000);
    }
}
