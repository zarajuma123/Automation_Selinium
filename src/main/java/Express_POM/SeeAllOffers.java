package Express_POM;

import All_Reusable_Methods.Reusable_Actions_Loggers_POM;
import All_Reusable_Methods.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeeAllOffers extends Reusable_Annotations {


    ExtentTest logger;
    public SeeAllOffers(WebDriver driver){
        PageFactory.initElements(driver,this);

        this.logger = Reusable_Annotations.logger;
    }//end of the constructor method

    @FindBy(xpath = "//*[text()='cdS1D9eKI7bXTMHp5xeAA']")
    WebElement SelectDress;


     public void clickSelectDress(){
         Reusable_Actions_Loggers_POM.clickByIndex(driver,SelectDress,1,logger,"Select Dress");
     }//end of SelectDress





































}//end of class see all offers
