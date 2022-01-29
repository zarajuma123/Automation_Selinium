package Hulu_Page_Object;

import All_Reusable_Methods.Reusable_Actions_Loggers_POM;
import All_Reusable_Methods.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePageHulu extends Reusable_Annotations{

    ExtentTest logger;
    public HomePageHulu(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method

    //define all the WebElement we need for this page per use case
    @FindBy(xpath = "//*[text()='SELECT']")
    WebElement Select;




    public void clickOnSelect(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,Select,logger,"Select");
    }//end of select




}





