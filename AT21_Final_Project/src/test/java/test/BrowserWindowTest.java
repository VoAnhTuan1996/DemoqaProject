package test;

import core.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Obj.BrowserWindowPageObj;
import pages.UI.BrowserWindowUI;

import java.util.Set;

public class BrowserWindowTest extends BaseTest {
    BrowserWindowPageObj objBrowserWindow;
    @BeforeMethod
    public void openUrl(){
        String url = BaseUrl + "browser-windows";
        driver.get(url);
        objBrowserWindow = new BrowserWindowPageObj(driver);
    }
    //@Test(priority = 1)
    public void clickNewTabTest(){
        objBrowserWindow.clickNewTabButton();
        String parentIdTab = driver.getWindowHandle();
        System.out.println(parentIdTab);
        Set<String> listIdTab = driver.getWindowHandles();
        for(String item:listIdTab){
            //switch vào từng id
            driver.switchTo().window(item);
            //get ra title từng tab
            String title = driver.getTitle();
            if (title.equals("")){
                WebElement text = objBrowserWindow.getElementById(driver,BrowserWindowUI.TEXT);
                System.out.println(text.getText());
                break;
            }
        }
    }
    //@Test(priority = 2)
    public void clickNewWindowTest(){
        objBrowserWindow.clickNewWindowButton();
        String parentWindow = driver.getWindowHandle();;
        for (String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
            String title = driver.getTitle();
            if(title.equals("")){
                WebElement text = objBrowserWindow.getElementById(driver,BrowserWindowUI.TEXT);
                System.out.println(text.getText());
                break;
            }
        }
        driver.switchTo().window(parentWindow);
    }
    @Test(priority = 3)
    public void clickNewWindowMessageTest(){
        objBrowserWindow.clickNewWindowMessageButton();
        String parentWindow = driver.getWindowHandle();
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
            String title = driver.getTitle();
            if(title.equals("")){
                WebElement text = objBrowserWindow.getElementById(driver,BrowserWindowUI.TEXT);
                System.out.println(text.getText());
                break;
            }
        }
        driver.switchTo().window(parentWindow);
    }
}
