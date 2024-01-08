package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class BasePage {
    private long TIMEOUT = 30;
    private WebDriverWait wait;
    private Actions actions;

    public By getByXpath(String locator){return By.xpath(locator);}
    public By getById(String locator){return  By.id(locator);}

    public WebElement getElementByXpath(WebDriver driver, String locator){
        return driver.findElement(getByXpath(locator));
    }

    public WebElement getElementById(WebDriver driver, String locator){
        return driver.findElement(getById(locator));
    }

    public void clickToElementByXpath(WebDriver driver, String locator){getElementByXpath(driver, locator).click();}
    public void clickToElementById(WebDriver driver, String locator){getElementById(driver,locator).click();}

    public void sendKeyToElementByXpath(WebDriver driver, String locator, String text){
        getElementByXpath(driver,locator).sendKeys(text);
    }
    public void sendKeyToElementById(WebDriver driver, String locator, String text){
        getElementById(driver,locator).sendKeys(text);
    }

    public void doubleClickToElement(WebDriver driver, String locator){
        actions = new Actions(driver);
        actions.doubleClick(getElementByXpath(driver, locator)).build().perform();
    }
}
