package test;

import core.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Obj.FramePageObj;
import pages.UI.FrameUI;

public class FrameTest extends BaseTest {
    FramePageObj objFrame;
    @BeforeMethod
    public void openUrl(){
        String url = BaseUrl + "frames";
        driver.get(url);
        objFrame = new FramePageObj(driver);
    }
    @Test()
    public void switchFrameTest(){
        objFrame.getFrame1();
        WebElement txt1 = objFrame.getElementById(driver,FrameUI.TEXT);
        System.out.println(txt1.getText());
        objFrame.withoutFrame();
        objFrame.getFrame2();
        WebElement txt2 = objFrame.getElementById(driver,FrameUI.TEXT);
        System.out.println(txt2.getText());
    }
}
