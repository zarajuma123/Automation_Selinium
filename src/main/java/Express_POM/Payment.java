package Express_POM;

import All_Reusable_Methods.Reusable_Actions_Loggers_POM;
import All_Reusable_Methods.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Payment extends Reusable_Annotations {

    ExtentTest logger;
    public Payment(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method

    @FindBy(xpath = "//*[text()='creditCardNumber']")
    WebElement EnterCreditCardNumber;

    @FindBy(xpath = "//select[contains(@id,'rvndd--expMonth')]")
    WebElement EnterExpMonth;

    @FindBy(xpath = "//select[contains(@id,'rvndd--expYear')]")
    WebElement EnterExpYear;

    @FindBy(xpath = "//*[(@name='cvv')]")
    WebElement EnterCvv;


    //Enter creditCardNumber
    public void EnterCreditCardNumber(String creditCardNumber){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,EnterCreditCardNumber,creditCardNumber,logger,"enter creditCardNumber");
    }//end of creditCardNumber

    //Enter expireMonth
    public void EnterexpMonth(String expMonth){
        Reusable_Actions_Loggers_POM.dropDownMenu(driver,EnterExpMonth,expMonth,logger,"enter expMonth");

        //explicit wait element
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='" +expMonth+"']")));

        } catch (Exception e) {
            System.out.println("Unable to enter expMonth");
        }
    }//end of expMonth


    //Enter expireyear
    public void EnterExpYear(String expYear){
        Reusable_Actions_Loggers_POM.dropDownMenu(driver,EnterExpYear,expYear,logger,"enter expYear");

        //explicit wait element
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='" +expYear+"']")));

        } catch (Exception e) {
            System.out.println("Unable to enter expYear");
        }
    }//end of expYear

    //Enter cvv
    public void EnterCvv(String cvv ){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,EnterCvv,cvv,logger,"enter cvv");
    }//enter cvv
















}//end of class payment
