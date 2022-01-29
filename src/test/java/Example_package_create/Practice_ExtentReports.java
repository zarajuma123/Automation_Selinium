package Example_package_create;

import All_Reusable_Methods.Reusable_Actions;
import All_Reusable_Methods.Reusable_Actions_Loggers;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Practice_ExtentReports {

    WebDriver driver;
    ExtentReports reports;
    ExtentTest logger;
    @BeforeSuite
            public void setDriver(){
        driver = Reusable_Actions.setDriver();
        reports = new ExtentReports("src/main/java/HTML_Report/Mortgage_Calculator.html",true);

    }//end of before suit

    @Test
    public void mlcalcTest(){
        logger = reports.startTest("Mortgage Calculator");
        logger.log(LogStatus.INFO,"Navigate to mlcalc website");
        driver.navigate().to("https://www.mlcalc.com");

        //click on purchase price
        Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='ma']","400,000",logger,"Purchase price");

        Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Show advanced options']",logger,"click on advance option");
        //select from dropdown menu
        Reusable_Actions_Loggers.dropDownMenu(driver,"//*[@name='sm']","May",logger,"Start month");
        //
        Reusable_Actions_Loggers.getTextMethod(driver,"//*[text()='Monthly payment']",logger,"mortgage payment");

        reports.endTest(logger);

    }//end of test

    @AfterSuite
    public void quitDriver(){
        driver.quit();
        reports.flush();
    }//





}//
