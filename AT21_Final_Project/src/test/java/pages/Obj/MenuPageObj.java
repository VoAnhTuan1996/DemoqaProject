package pages.Obj;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import pages.UI.MenuUI;

public class MenuPageObj extends BasePage {
    WebDriver driver;
    public MenuPageObj(WebDriver driver){this.driver = driver;}
    public void clickSelectValueDropdown(){clickToElementById(driver, MenuUI.SELECT_VALUE_DROPDOWN);}
    public void clickSelectOneDropdown(){clickToElementById(driver,MenuUI.SELECT_ONE_DROPDOWN);}
    public void clickMultiselectDropdown(){clickToElementByXpath(driver,MenuUI.MULTISELECT_MENU_DROPDOWN);}

}
