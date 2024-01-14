package pages.Obj;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.UI.SortableUI;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortPageObj extends BasePage {
    WebDriver driver;
    public SortPageObj(WebDriver driver){this.driver = driver;}
    public void clickTabList(){clickToElementById(driver, SortableUI.tabList);}
    public void clickTabGrid(){clickToElementById(driver,SortableUI.tabGrid);}

    public WebElement getItemOne(){return getElementByXpath(driver,SortableUI.itemOne);}
    public WebElement getItemTwo(){return getElementByXpath(driver,SortableUI.itemTwo);}
    public WebElement getItemThree(){return getElementByXpath(driver,SortableUI.itemThree);}
    public WebElement getItemFour(){return getElementByXpath(driver,SortableUI.itemFour);}
    public WebElement getItemFive(){return getElementByXpath(driver,SortableUI.itemFive);}
    public WebElement getItemSix(){return getElementByXpath(driver,SortableUI.itemSix);}
    public WebElement getItemSeven(){return getElementByXpath(driver,SortableUI.itemSeven);}
    public WebElement getItemEight(){return getElementByXpath(driver,SortableUI.itemEight);}
    public WebElement getItemNine(){return getElementByXpath(driver,SortableUI.itemNine);}
}
