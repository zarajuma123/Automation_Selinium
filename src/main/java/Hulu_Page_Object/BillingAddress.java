package Hulu_Page_Object;

import All_Reusable_Methods.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingAddress extends Reusable_Annotations{

    ExtentTest logger;

    public BillingAddress(WebDriver driver) {
        PageFactory.initElements(driver, this);

        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method


    @FindBy(xpath = "//*[@class='ledger__price']")
    WebElement Fee;

    @FindBy(xpath = "//*[@class='ledger__summary']")
    WebElement due;
     /* //creating return getText method for any text web element
    public void  getTextMethod() {
        //declare local explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 15);
        System.out.println("Capturing text on element");
        logger.log(LogStatus.INFO, "Typing on element ");
        //declare a global variable to capture the text so I can return it
      String result;
        try {
            WebElement  element=  wait.until(ExpectedConditions.(()
            //capture text

        } catch (Exception e) {
            System.out.println("Unable to capture text on " + e);
            logger.log(LogStatus.FAIL, "Unable to type on " + e);

        }
        return result;
    }//end of click getTextMethod */

}
