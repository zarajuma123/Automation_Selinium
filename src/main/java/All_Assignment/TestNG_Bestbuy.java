package All_Assignment;

import All_Reusable_Methods.Reusable_Actions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;



import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG_Bestbuy {
    //declare web driver outside of the annotation methods so it can be called on all methods
    WebDriver driver;

    @BeforeSuite
    public void SetTheDriver(){
        driver = Reusable_Actions.setDriver();
        //navigate the best buy page
        System.out.println("Navigate the best buy website");
        driver.navigate().to("https://www.bestbuy.com");
        driver.manage().deleteAllCookies();
    }//end of pre condition

    @Test(priority = 1)
    public void buyLaptop() throws InterruptedException {
        //verify the best buy title
        String actualTitle = driver.getTitle();
        if(actualTitle.equals("Best Buy | Official Online Store | Shop Now & Save")){
            System.out.println("Title Matches");
        }else{
            System.out.println("Title doesn't match. Actual title is" + actualTitle );

        }//end of verify page title

        Thread.sleep(3000);

        //remove any pop up
        Reusable_Actions.Click_Popup(driver,"//button[@aria-label='Close']","remove popUp");

        //click on search field and enter keyword
        Reusable_Actions.sendKeysMethod(driver,"//input[@id='gh-search-input']","hp Laptop","hp laptop");

         //submit
        Reusable_Actions.submitMethod(driver,"//*[@class ='header-search-icon']","Submit Button");

        //click on add to cart
        Reusable_Actions.clickMethod(driver,"//*[]","Add to cart");

        //click on go to cart
        Reusable_Actions.clickMethod(driver,"//*[]","Add to cart");

        //click on checkout
        Reusable_Actions.clickMethod(driver,"","Checkout");

       //click on continue as guest
        Reusable_Actions.clickMethod(driver,"","Checkout");



    }//end of @test1




    @Test(dependsOnMethods = "buyLaptop")
    public void ShippingAddress(){
    //enter first name
    Reusable_Actions.sendKeysMethod(driver,"","Zannatul","First name");
    //enter last name
    Reusable_Actions.sendKeysMethod(driver,"","Juma","Last name");
    //
    Reusable_Actions.sendKeysMethod(driver,"","Juma","Address");
    //
    Reusable_Actions.sendKeysMethod(driver,"","Juma","City");
    //drop down
     Reusable_Actions.dropDownMenu(driver,"","","");




    }//end of @test 2

    @AfterSuite
    public void quitSession(){
        driver.quit();}


}//end of java
