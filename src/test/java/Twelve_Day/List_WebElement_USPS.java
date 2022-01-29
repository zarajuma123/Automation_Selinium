package Twelve_Day;

import All_Reusable_Methods.Reusable_Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;

public class List_WebElement_USPS {

    //declare the web driver outside of the annotation methods so it can be called on all the methods
    WebDriver driver;

    @BeforeSuite
    public void SetTheDriver() {
        driver = Reusable_Actions.setDriver();

    }//end of precondition

    @Test
    public void WebElement_USPS() {
        //navigate usps page
        driver.navigate().to("https://www.usps.com");
        //using explicit wait to get the count of elements within class group
        WebDriverWait wait = new WebDriverWait(driver, 10);

        try {
            List<WebElement> uspsTabs = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[contains(@class,'menuheader')]")));
            System.out.println(" My Total count of Tabs are " + uspsTabs.size());
        } catch (Exception e) {
            System.out.println("Total count of Tabs are " + e);
        }


    }//end @test

    @AfterSuite
    public void quitSession() {
        driver.quit();
    }


}//end of java class
