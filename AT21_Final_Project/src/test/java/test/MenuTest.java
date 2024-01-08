package test;
import core.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Obj.MenuPageObj;
import pages.UI.MenuUI;
import java.util.Random;

public class MenuTest extends BaseTest {
    MenuPageObj objMenu;
    @BeforeMethod
    public void openUrl(){
        String url = BaseUrl + "select-menu";
        driver.get(url);
        objMenu = new MenuPageObj(driver);
    }
    @Test(priority = 1)
    public void selectValueTest() throws InterruptedException {
        objMenu.clickSelectValueDropdown();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100)");
        objMenu.clickToElementByXpath(driver,"//div[text()='A root option']");
        Thread.sleep(3000);
    }
    @Test(priority = 2)
    public void selectOneTest() throws InterruptedException {
        objMenu.clickSelectOneDropdown();
        objMenu.clickToElementByXpath(driver,"//div[text()='Mr.']");
        Thread.sleep(3000);
    }
    @Test(priority = 3)
    public void selectMenuOldStyleTest() throws InterruptedException {
        Select select = new Select(objMenu.getElementById(driver, MenuUI.SELECT_MENU_DROPDOWN));
        Random random = new Random();
        int index = random.nextInt(11);
        select.selectByIndex(index);
        select.selectByVisibleText("Blue");
        Thread.sleep(3000);
    }
    @Test(priority = 4)
    public void selectMultiTest() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
        objMenu.clickMultiselectDropdown();
        objMenu.clickToElementByXpath(driver,"//div[text()='Blue']");
        objMenu.clickToElementByXpath(driver,"//div[text()='Red']");
        Thread.sleep(3000);
    }
    @Test(priority = 5)
    public void standardMultiSelectTest() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)");
        Select select = new Select(objMenu.getElementById(driver,"cars"));
        select.selectByVisibleText("Volvo");
        Thread.sleep(3000);
    }
}
