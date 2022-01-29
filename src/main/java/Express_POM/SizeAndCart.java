package Express_POM;

import All_Reusable_Methods.Reusable_Actions_Loggers_POM;
import All_Reusable_Methods.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SizeAndCart extends Reusable_Annotations {

    ExtentTest logger;
    public SizeAndCart (WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method

    @FindBy(xpath = "//*[text()='Add to Bag']")
    WebElement AddToBag;

    @FindBy(xpath = "//*[text()='View Bag']")
    WebElement ViewBag;


    //select birthMonth from dropdown
    public void selectSize(String size) {
        //explicit wait element
        WebDriverWait wait = new WebDriverWait(driver, 15);
        System.out.println("Clicking on element Size");
        logger.log(LogStatus.INFO, "Clicking on element Size");
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='" + size + "']"))).click();
        } catch (Exception e) {
            System.out.println("Unable to click on Size Error:" + e);
            logger.log(LogStatus.FAIL, "Unable to click on Size Error:" + e);
        }


    }//end of SelectSize


    public void ClickOnAddToBag(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,AddToBag,logger,"Add to bag");
    }//end of Add to Bag

    public void ClickOnViewBag() {
        Reusable_Actions_Loggers_POM.clickMethod(driver,ViewBag,logger,"View Bag");
    }
}//end of class Size and cart
