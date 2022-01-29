package Express_POM;

import All_Reusable_Methods.Reusable_Actions_Loggers_POM;
import All_Reusable_Methods.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageExpress extends Reusable_Annotations {


    //constructor is helper method that allows you to identify objects in your pom
    //so later you can call those methods in your test class
    //because your pom class is not static
    //declare local logger to your class

    ExtentTest loggers;
    public HomepageExpress(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.loggers = Reusable_Annotations.logger;
    }//end of the constructor method

    //define all the web element we need for this page per use case

    @FindBy(xpath = "//*[text()='Women']")
    WebElement WomenTab;

    @FindBy(xpath = "//*[text()='Dresses']")
    WebElement DressLink;

    public void mouseHoverOnWomen(){
        Reusable_Actions_Loggers_POM.mouseHover(driver,WomenTab,logger,"Women Tab");
    }//end of mouse hover


    public void DressLink(){
        Reusable_Actions_Loggers_POM.mouseHover(driver,DressLink,logger,"Dress Link");
    }//end of dress link













}
