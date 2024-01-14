package test;

import core.BaseTest;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Obj.SortPageObj;
import pages.UI.SortableUI;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortableTest extends BaseTest {
    SortPageObj objSort;
    @BeforeMethod
    public void openUrl(){
        String url = BaseUrl + "sortable";
        driver.get(url);
        objSort = new SortPageObj(driver);
    }
    //@Test
    public void SortableTabListTest() throws InterruptedException {
        objSort.clickTabList();
        List<WebElement> itemsList = objSort.getListElementByXpath(driver, SortableUI.listItem);
        Actions actions = new Actions(driver);
        //Sắp xếp giảm dần
        for(int i=0; i< itemsList.size()-1;i++){
            for(int j=0; j< itemsList.size()-i-1;j++){
                WebElement currentItem = itemsList.get(j);
                WebElement nextItem = itemsList.get(j+1);
                actions.clickAndHold(currentItem)
                        .moveToElement(nextItem)
                        .release()
                        .perform();

                // Cập nhật lại danh sách sau khi sắp xếp
                itemsList = objSort.getListElementByXpath(driver,SortableUI.listItem);
            }
        }
        // Chuyển đổi sang tab "Grid"
        Thread.sleep(3000);
    }
    @Test
    public void SortableTabGrid() throws InterruptedException {
        objSort.clickTabGrid();

        // Lấy danh sách các mục
        List<WebElement> itemsGrid = objSort.getListElementByXpath(driver,SortableUI.gridItem);
        System.out.println(itemsGrid.size());
        Actions actions = new Actions(driver);
        actions.dragAndDrop(objSort.getItemNine(),objSort.getItemOne()).perform();
        actions.dragAndDrop(objSort.getItemEight(),objSort.getItemOne()).perform();
        actions.dragAndDrop(objSort.getItemSeven(),objSort.getItemOne()).perform();
        actions.dragAndDrop(objSort.getItemSix(),objSort.getItemOne()).perform();
        actions.dragAndDrop(objSort.getItemFive(),objSort.getItemOne()).perform();
        actions.dragAndDrop(objSort.getItemFour(),objSort.getItemOne()).perform();
        actions.dragAndDrop(objSort.getItemThree(),objSort.getItemOne()).perform();
        actions.dragAndDrop(objSort.getItemTwo(),objSort.getItemOne()).perform();
        Thread.sleep(3000);
    }


}
