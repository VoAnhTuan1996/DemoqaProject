package pages.Obj;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import pages.UI.TabsUI;

public class TabsPageObj extends BasePage {
    WebDriver driver;
    public TabsPageObj(WebDriver driver){this.driver = driver;}
    public void clickTabWhat(){clickToElementById(driver,TabsUI.tabWhat);}
    public void clickTabOrigin(){clickToElementById(driver,TabsUI.tabOrigin);}
    public void clickTabUse(){clickToElementById(driver,TabsUI.tabUse);}
}
