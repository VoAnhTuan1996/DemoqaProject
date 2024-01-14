package test;

import core.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Obj.ResizeablePageObj;
import pages.UI.ResizeableUI;

public class ResizeableTest extends BaseTest {
    ResizeablePageObj objResizeable;
    @BeforeMethod
    public void openUrl(){
        String url = BaseUrl + "resizable";
        driver.get(url);
        objResizeable = new ResizeablePageObj(driver);
    }
    //@Test
    public void resizeableBoxTest() throws InterruptedException {
        int maxWidth = objResizeable.getConstraintArea().getSize().getWidth();
        int maxHeight = objResizeable.getConstraintArea().getSize().getHeight();
        WebElement spanResizeableBox = objResizeable.getElementByXpath(driver,ResizeableUI.spanResizeableBox);
        System.out.println(maxWidth+":"+maxHeight);
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(spanResizeableBox,maxWidth,maxHeight).perform();
        Thread.sleep(3000);
    }
    @Test
    public void resizeHandleTest() throws InterruptedException{
        int width = 450;
        int height = 150;
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(objResizeable.getResizeHandle(), width,height).perform();
        Thread.sleep(3000);
    }
}
