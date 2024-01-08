package pages.Obj;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import pages.UI.FormUI;

public class FormPageObj extends BasePage {
    WebDriver driver;
    public FormPageObj(WebDriver driver){this.driver = driver;}
    public void enterFirstNameTxt(String txt){sendKeyToElementById(driver, FormUI.fNameInput,txt);}
    public void enterLastNameTxt(String txt){sendKeyToElementById(driver,FormUI.lNameInput,txt);}
    public void enterEmailTxt(String txt){sendKeyToElementById(driver,FormUI.emailInput,txt);}
    public void enterPhoneNumberTxt(String txt){sendKeyToElementById(driver,FormUI.phoneInput,txt);}
    public void sendKeyInputDate(String txt){sendKeyToElementById(driver,FormUI.dateInput,txt);}
    public void clickRdbMale(){clickToElementByXpath(driver,FormUI.rdbMale);}
    public void clickRdbFemale(){clickToElementById(driver,FormUI.rdbFemale);}
    public void clickRdbOther(){clickToElementById(driver,FormUI.rdbOther);}
    public void enterSubjectsInput(String txt){sendKeyToElementById(driver,FormUI.subjectInput,txt);}
    public void clickCbSport(){clickToElementByXpath(driver,FormUI.cbSports);}
    public void clickCbReading(){clickToElementByXpath(driver,FormUI.cbReading);}
    public void clickCbMusic(){clickToElementByXpath(driver,FormUI.cbMusic);}
    public void sendkeyUploadFilePicture(String img){sendKeyToElementById(driver,FormUI.pictureInput,img);}
    public void enterCurrentAddressInput(String txt){sendKeyToElementById(driver,FormUI.currentAddress,txt);}
    public void clickSelectState(){clickToElementById(driver,FormUI.stateInput);}
    public void clickSelectCity(){clickToElementById(driver,FormUI.cityInput);}
    public void clickBtnSubmit(){clickToElementById(driver,FormUI.submitBtn);}

}
