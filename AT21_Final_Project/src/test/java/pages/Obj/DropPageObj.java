package pages.Obj;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.UI.DropUI;

public class DropPageObj extends BasePage {
    WebDriver driver;
    public DropPageObj(WebDriver driver){this.driver = driver;}

    public void clickSimpleTab(){clickToElementById(driver, DropUI.simpleTab);}
    public WebElement dragbox(){return getElementById(driver,DropUI.dragbox);}
    public WebElement dropbox(){return getElementById(driver,DropUI.dropbox);}

    public void clickAcceptTab(){clickToElementById(driver,DropUI.acceptTab);}
    public WebElement acceptableBox(){return getElementById(driver,DropUI.acceptableBox);}
    public WebElement notAcceptableBox(){return getElementById(driver,DropUI.notAcceptableBox);}
    public WebElement dropboxAccept(){return getElementByXpath(driver,DropUI.dropboxAccept);}

    public void clickPreventTab(){clickToElementById(driver,DropUI.preventTab);}
    public WebElement dragBox(){return getElementById(driver,DropUI.dragBox);}
    public WebElement txtDropBoxOuter1(){return getElementByXpath(driver,DropUI.textDropBoxOuter1);}
    public WebElement txtDropBoxOuter2(){return getElementByXpath(driver,DropUI.textDropBoxOuter2);}
    public WebElement dropBoxNotGreedyInner(){return getElementById(driver,DropUI.dropBoxNotGreedyInner);}
    public WebElement dropBoxGreedyInner(){return getElementById(driver,DropUI.dropBoxGreedyInner);}

    public void clickRevertTab(){clickToElementById(driver,DropUI.revertTab);}
    public WebElement revertBox(){return getElementById(driver,DropUI.revertableBox);}
    public WebElement notRevertBox(){return getElementById(driver,DropUI.notRevertableBox);}
    public WebElement dropboxRevert(){return getElementByXpath(driver,DropUI.dropboxRevert);}
}
