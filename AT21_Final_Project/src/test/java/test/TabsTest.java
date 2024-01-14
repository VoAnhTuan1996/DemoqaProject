package test;

import core.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Obj.TabsPageObj;

public class TabsTest extends BaseTest {
    TabsPageObj objTabs;
    @BeforeMethod
    public void openUrl(){
        String url = BaseUrl + "tabs";
        driver.get(url);
        objTabs = new TabsPageObj(driver);
    }
    @Test
    public void tabsTest() throws InterruptedException {
        String text1 = objTabs.getElementByXpath(driver,"//div[@id='demo-tabpane-what']//p").getText();
        System.out.println(text1);
        objTabs.clickTabOrigin();
        Thread.sleep(3000);
        String text2 = objTabs.getElementByXpath(driver,"//div[@id='demo-tabpane-origin']//p").getText();
        System.out.println(text2);
        objTabs.clickTabUse();
        Thread.sleep(3000);
        String text3 = objTabs.getElementByXpath(driver,"//div[@id='demo-tabpane-use']//p").getText();
        System.out.println(text3);
    }
}
