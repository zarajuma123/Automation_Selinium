package Hulu_Page_Object;

import All_Reusable_Methods.Reusable_Annotations;
import USPS_Page_Object.Homepage;
import USPS_Page_Object.SendMailAndPackages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass extends Reusable_Annotations {


        public BaseClass(WebDriver driver){
            PageFactory.initElements(driver,this);
        }//end of constructor class

        //create static reference for hulu home page
        public static HomePageHulu homePageHulu(){
            HomePageHulu homePageHulu = new HomePageHulu(driver);
            return  homePageHulu;
        }//end of HomePageHulu

        //create static reference for send mail and packages page
        public static CreateAccount createAccount(){
            CreateAccount createAccount = new CreateAccount(driver);
            return  createAccount;
        }//end of  CreateAccount




    }//end of base class

