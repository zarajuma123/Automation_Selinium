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

public class ContactAndBillingAndDelivery extends Reusable_Annotations {

    ExtentTest logger;
    public ContactAndBillingAndDelivery(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method


    @FindBy(xpath = "//*[text()='firstname']")
    WebElement EnterFirstName;

    @FindBy(xpath = "//*[text()='lastname']")
    WebElement EnterLastName;

    @FindBy(xpath = "//*[text()='email']")
    WebElement EnterEmail;

    @FindBy(xpath = "//*[text()='confirmEmail']")
    WebElement EnterConfirmEmail;

    @FindBy(xpath = "//*[text()='phone']")
    WebElement EnterPhoneNumber;

    @FindBy(xpath = "//*[text()='Continue']")
    WebElement ClickOnContinue;

    @FindBy(xpath = "//*[text()='shipping.line1']")
    WebElement EnterAddress;

    @FindBy(xpath = "//*[text()='shipping.postalCode']")
    WebElement EnterZipcode;

    @FindBy(xpath = "//*[text()='shipping.city']")
    WebElement EnterCity;

    @FindBy(xpath = "//*[text()='shipping.state']")
    WebElement EnterState;

    @FindBy(xpath = "//*[text()='Continue']")
    WebElement Continue;

    //Enter first name
    public void EnterFirstName(String firstname){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,EnterFirstName,firstname,logger,"Enter FirstName");
    }//end of first name

    //Enter last name
    public void EnterLastName(String lastname){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,EnterFirstName,lastname,logger,"Enter LastName");
    }//end of last name

    //Enter email
    public void EnterEmail(String email){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,EnterFirstName,email,logger,"Enter email");
    }//end of email

    //Enter confirm email
    public void EnterConfirmEmail(String confirmEmail){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,EnterFirstName,confirmEmail,logger,"Enter confirm email");
    }//end of confirm email

    //Click on continue button
    public void ClickOnContinue(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,ClickOnContinue,logger,"click on continue");
    }//end of Continue

    //Enter on Address
    public void EnterAddress(String address){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,EnterAddress,address,logger,"click on address");
    }//end of Continue

    //Enter on zipcode
    public void EnterZipcode(String zipcode){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,EnterZipcode,zipcode,logger,"click on zipcode");
    }//end of Continue

    //Enter on city
    public void EnterCity(String city){
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver,EnterCity,city,logger,"click on city");
    }//end of Continue


    //Enter on state
    public void EnterState(String state){
        Reusable_Actions_Loggers_POM.dropDownMenu(driver,EnterState,state,logger,"click on state");

        //explicit wait element
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='" + state + "']")));

        } catch (Exception e) {
            System.out.println("Unable to click on state");
        }
    }//end of state

    //Click on continue button
    public void Continue(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,Continue,logger,"click on continue");
    }//end of Continue








}//end of class
