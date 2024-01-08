package pages.Obj;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import pages.UI.FrameUI;

public class FramePageObj extends BasePage {
    WebDriver driver;
    public FramePageObj(WebDriver driver){this.driver = driver;}
    public void getFrame1(){driver.switchTo().frame(FrameUI.FRAME1);}
    public void getFrame2(){driver.switchTo().frame(FrameUI.FRAME2);}
    public void withoutFrame(){driver.switchTo().defaultContent();}
}
