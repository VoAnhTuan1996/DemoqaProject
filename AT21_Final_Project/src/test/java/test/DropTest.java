package test;

import core.BaseTest;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Obj.DropPageObj;

public class DropTest extends BaseTest {
    DropPageObj objDrop;
    @BeforeMethod
    public void openUrl(){
        String url = BaseUrl + "droppable";
        driver.get(url);
        objDrop = new DropPageObj(driver);
    }
    @Test(priority = 1)
    public void simpleTest() throws InterruptedException {
        objDrop.clickSimpleTab();
        Actions actions = new Actions(driver);
        actions.dragAndDrop(objDrop.dragbox(), objDrop.dropbox()).perform();
        Thread.sleep(3000);
    }
    @Test(priority = 2)
    public void acceptTest() throws InterruptedException{
        objDrop.clickAcceptTab();
        Actions actions = new Actions(driver);
        actions.dragAndDrop(objDrop.notAcceptableBox(), objDrop.dropboxAccept()).perform();
        String itemColorDrop1 = objDrop.dropboxAccept().getCssValue("background-color");
        Assert.assertEquals(itemColorDrop1,"rgba(0, 0, 0, 0)");
        Thread.sleep(1500);
        actions.dragAndDrop(objDrop.acceptableBox(), objDrop.dropboxAccept()).perform();
        String itemColorDrop2 = objDrop.dropboxAccept().getCssValue("background-color");
        Assert.assertEquals(itemColorDrop2,"rgba(70, 130, 180, 1)");
        Thread.sleep(3000);
    }
    @Test(priority = 3)
    public void preventTest() throws InterruptedException{
        objDrop.clickPreventTab();
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        actions.dragAndDrop(objDrop.dragBox(),objDrop.dropBoxNotGreedyInner()).perform();
        Thread.sleep(1000);
        actions.dragAndDrop(objDrop.dragBox(), objDrop.dropBoxGreedyInner()).perform();
        String text1 = objDrop.txtDropBoxOuter1().getText();
        System.out.println(text1);
        Assert.assertEquals(text1,"Dropped!");
        String text2 = objDrop.txtDropBoxOuter2().getText();
        System.out.println(text2);
        Assert.assertEquals(text2,"Outer droppable");
        Thread.sleep(3000);
    }
    @Test(priority = 4)
    public void revertTest() throws InterruptedException{
        objDrop.clickRevertTab();
        Actions actions = new Actions(driver);
        actions.dragAndDrop(objDrop.revertBox(),objDrop.dropboxRevert()).perform();
        Thread.sleep(2000);
        actions.dragAndDrop(objDrop.notRevertBox(),objDrop.dropboxRevert()).perform();
        Thread.sleep(2500);
    }

}
