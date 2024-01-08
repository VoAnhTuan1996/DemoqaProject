package pages.Obj;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import pages.UI.ModalDialogsUI;

public class ModalDialogsPageObj extends BasePage {
    WebDriver driver;
    public ModalDialogsPageObj(WebDriver driver){this.driver = driver;}
    public void clickSmallDialogButton(){clickToElementById(driver,ModalDialogsUI.smallDialogButton);}
    public void clickLargeDialogButton(){clickToElementById(driver,ModalDialogsUI.largeDialogButton);}
}
