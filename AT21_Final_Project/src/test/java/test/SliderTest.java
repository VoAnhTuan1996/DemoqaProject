package test;

import core.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Obj.SliderPageObj;
import pages.UI.SliderUI;

public class SliderTest extends BaseTest {
    SliderPageObj objSlider;
    @BeforeMethod
    public void openUrl(){
        String url = BaseUrl + "slider";
        driver.get(url);
        objSlider = new SliderPageObj(driver);
    }
    @Test
    public void sliderTest() throws InterruptedException {
        WebElement slider = objSlider.getElementByXpath(driver,SliderUI.slider);
        int width = slider.getSize().getWidth();
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(slider,(int)(width*0.3),0).build().perform();
        Thread.sleep(3000);
    }
}
