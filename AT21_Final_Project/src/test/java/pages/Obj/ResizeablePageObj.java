package pages.Obj;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.UI.ResizeableUI;

public class ResizeablePageObj extends BasePage {
    WebDriver driver;
    public ResizeablePageObj(WebDriver driver){this.driver = driver;}
    public WebElement getConstraintArea(){return getElementByClassName(driver,ResizeableUI.constraintArea);}
    public WebElement getResizeHandle(){return getElementByXpath(driver,ResizeableUI.spanResizeableHandle);}
}
