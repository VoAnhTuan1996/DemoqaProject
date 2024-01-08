package pages.Obj;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import pages.UI.BrowserWindowUI;

public class BrowserWindowPageObj extends BasePage {
    WebDriver driver;
    public BrowserWindowPageObj(WebDriver driver){this.driver = driver;}
    public void clickNewTabButton(){getElementById(driver,BrowserWindowUI.NEW_TAB_BUTTON);}
    public void clickNewWindowButton(){getElementById(driver,BrowserWindowUI.NEW_WINDOW_BUTTON);}
    public void clickNewWindowMessageButton(){getElementById(driver,BrowserWindowUI.NEW_WINDOW_MESSAGE_BUTTON);}
}
