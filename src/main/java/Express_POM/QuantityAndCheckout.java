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

public class QuantityAndCheckout extends Reusable_Annotations {

    ExtentTest logger;
    public QuantityAndCheckout(WebDriver driver){
        PageFactory.initElements(driver,this);

        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method


    @FindBy(xpath = "//*[@id='qdd-0-quantity']")
    WebElement selectQuantity;

    @FindBy(xpath = "//*[@id='Checkout']")
    WebElement ClickOnCheckout;

    @FindBy(xpath = "//*[text()='Checkout as Guest']")
    WebElement ClickOnCheckoutAsGuest;

    //select on quantity from dropdown
    public void selectQuantity(String quantity) {
        Reusable_Actions_Loggers_POM.clickMethod(driver, selectQuantity, logger, "select birthMonth");

        //explicit wait element
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='" +quantity+ "']")));

        } catch (Exception e) {
            System.out.println("Unable to click on quantity");
        }


    }//end of quantity

    //Click on checkout
    public void clickOnCheckout(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,ClickOnCheckout,logger,"Click on checkout");
    }//end of checkout


    //Click on checkout as guest
    public void clickOnCheckoutAsGuest(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,ClickOnCheckoutAsGuest,logger,"Click on checkout as guest");
    }//end of checkout


}//end of class Checkout
