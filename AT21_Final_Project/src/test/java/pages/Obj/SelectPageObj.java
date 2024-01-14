package pages.Obj;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import pages.UI.SelectableUI;

public class SelectPageObj extends BasePage {
    WebDriver driver;
    public SelectPageObj(WebDriver driver){this.driver = driver;}
    public void clickItem1(){clickToElementByXpath(driver, SelectableUI.item1);}
}
