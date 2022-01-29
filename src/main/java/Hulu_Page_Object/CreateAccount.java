package Hulu_Page_Object;

import All_Reusable_Methods.Reusable_Actions_Loggers_POM;
import All_Reusable_Methods.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Month;

public class CreateAccount extends Reusable_Annotations {

    ExtentTest logger;

    public CreateAccount(WebDriver driver) {
        PageFactory.initElements(driver, this);

        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method


    @FindBy(xpath = "//*[@id='email']")
    WebElement InputEmail;

    @FindBy(xpath = "//*[@id ='password']")
    WebElement InputPassword;

    @FindBy(xpath = "//*[@id ='firstName']")
    WebElement EnterName;

    @FindBy(xpath = "//*[contains(@class,'field__month')]")
    WebElement birthMonth;

    @FindBy(xpath = "//*[contains(text(),'Day')]")
    WebElement birthDay;

    @FindBy(xpath = "//*[contains(text(),'Year')]")
    WebElement birthYear;

    @FindBy(xpath = "//*[contains(text(),'Select')]")
    WebElement Gender;

    @FindBy(xpath = "//*[contains(text(),'CONTINUE')]")
    WebElement Continue;



    //enter Email
    public void InputEmail(String emails) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, InputEmail, emails, logger, "Enter email");
    }//end of method

    //enter password
    public void InputPassword(String passWord) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, InputPassword, passWord, logger, "Enter passWord");
    }//end of method

    //enter name
    public void EnterName(String name) {
        Reusable_Actions_Loggers_POM.sendKeysMethod(driver, EnterName, name, logger, "Enter Name");
    }//end of method


    //select birthMonth from dropdown
    public void selectBirthMonth(String month) {
        Reusable_Actions_Loggers_POM.clickMethod(driver, birthMonth, logger, "select birthMonth");

        //explicit wait element
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='" + month + "']")));

        } catch (Exception e) {
            System.out.println("Unable to select birth month");
        }


    }//end of method

    //select birthDay from dropdown
    public void selectBirthDay(String day) {
        Reusable_Actions_Loggers_POM.clickMethod(driver, birthDay, logger, "select birthday");

        //explicit wait element
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='" + day + "']")));

        } catch (Exception e) {
            System.out.println("Unable to select birthDay");
        }


    }//end of method


    //select birthYear from dropdown
    public void selectBirthYear(String year) {
        Reusable_Actions_Loggers_POM.clickMethod(driver, birthYear, logger, "select birthyear");

        //explicit wait element
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='" + year + "']")));

        } catch (Exception e) {
            System.out.println("Unable to select birthYear");
        }


    }//end of method


    //select gender from dropdown
    public void SelectGender(String gender) {
        Reusable_Actions_Loggers_POM.clickMethod(driver, Gender, logger, "select gender");

        //explicit wait element
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='" + gender + "']")));

        } catch (Exception e) {
            System.out.println("Unable to select gender");
        }


    }//end of method

    //click on continue
    public void ClickOnContinue() {
        Reusable_Actions_Loggers_POM.clickMethod(driver, Continue, logger, "Continue");
    }//end of method


}//