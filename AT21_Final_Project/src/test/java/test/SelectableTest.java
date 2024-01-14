package test;

import core.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Obj.SelectPageObj;
import pages.UI.SelectableUI;

public class SelectableTest extends BaseTest {
    SelectPageObj objSelectable;
    @BeforeMethod
    public void openUrl(){
        String url = BaseUrl + "selectable";
        driver.get(url);
        objSelectable = new SelectPageObj(driver);
    }
    @Test
    public void SelectableTest(){
        WebElement item1 = objSelectable.getElementByXpath(driver, SelectableUI.item1);
        WebElement item2 = objSelectable.getElementByXpath(driver, SelectableUI.item2);
        objSelectable.clickItem1();
        // Kiểm tra xem item đã được chọn và có màu xanh hay không
        String itemColor1 = item1.getCssValue("background-color");
        String itemColor2 = item2.getCssValue("background-color");
        System.out.println(itemColor1);
        System.out.println(itemColor2);
        Assert.assertEquals(itemColor1,"rgba(0, 123, 255, 1)");
        Assert.assertNotEquals(itemColor2,"rgba(0, 123, 255, 1)");
    }
}
