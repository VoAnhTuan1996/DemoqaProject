package test;

import core.BaseTest;
import org.openqa.selenium.Alert;
import org.testng.annotations.*;
import pages.Obj.AlertPageObj;

public class AlertTest extends BaseTest {
    AlertPageObj objAlert;
    @BeforeMethod
    public void openUrl(){
        String url = BaseUrl + "alerts";
        driver.get(url);
        objAlert = new AlertPageObj(driver);
    }
    @Test(priority = 1)
    public void simpleAlertTest() throws InterruptedException {
        objAlert.clickSimpleAlert();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(3000);
    }
    @Test(priority = 2)
    public void confirmAlertTest(){
        objAlert.clickConfirmAlert();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
    }
    @Test(priority = 3)
    public void promptAlertTest(){
        objAlert.clickPromptAlert();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
    }
    @Test(priority = 4)
    public void authenticationAlert(){
        String url = "https://the-internet.herokuapp.com";
        String []lists = url.split("//");
        for(int i=0; i< lists.length;i++){
            System.out.println(lists[i]);
        }
        String username = "admin";
        String password = "admin";
        String newUrl = lists[0] + "//" + username + ":" + password + "@" + lists[1];
        driver.get(newUrl);
        System.out.println(newUrl);
    }

}
