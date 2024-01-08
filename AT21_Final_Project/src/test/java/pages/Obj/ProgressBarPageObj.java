package pages.Obj;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import pages.UI.ProgressBarUI;

public class ProgressBarPageObj extends BasePage {
    WebDriver driver;
    public ProgressBarPageObj(WebDriver driver){this.driver = driver;}
    public void clickStartStopButton(){clickToElementById(driver,ProgressBarUI.startStopButton);}
}
