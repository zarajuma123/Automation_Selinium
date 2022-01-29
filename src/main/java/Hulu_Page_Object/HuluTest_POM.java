package Hulu_Page_Object;

import All_Reusable_Methods.Reusable_Actions;
import All_Reusable_Methods.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class HuluTest_POM extends Reusable_Annotations{

    @Test
    public void HuluTest_POM() {
        ArrayList<String> emails = new ArrayList<>();
        emails.add("hhossain732392@gmail.com");
        emails.add("maghr91@gmail.com");

        ArrayList<String> passWord = new ArrayList<>();
        passWord.add("732345Ar@");
        passWord.add("434345Du@");

        ArrayList<String> name = new ArrayList<>();
        name.add("Rabu");
        name.add("Hossain");

        ArrayList<String> month = new ArrayList<>();
        month.add("January");
        month.add("March");

        ArrayList<String> day = new ArrayList<>();
        day.add("5");
        day.add("10");

        ArrayList<String> year = new ArrayList<>();
        year.add("1991");
        year.add("1992");

        ArrayList<String> gender = new ArrayList<>();
        gender.add("Female");
        gender.add("Male");


        for (int i = 0; i < emails.size(); i++) {
            //navigating to hulu page
            logger.log(LogStatus.INFO, "Navigating to hulu home page");
            driver.navigate().to("https://www.hulu.com");

            //verify the UPS page title
            String actualTitle = driver.getTitle();
            if (actualTitle.equals("Stream TV and Movies")) {
                System.out.println("Title Matches");
            } else {
                System.out.println("Title does not match.Actual title is " + actualTitle);
            }//end of verify page title

            //scroll the page
            Reusable_Actions.scrollMethod(driver, "0", "3000");

            //click on select button
            BaseClass.homePageHulu().clickOnSelect();

            //enter Email
         BaseClass.createAccount().InputEmail(emails.get(i));

           //InputPassword
            BaseClass.createAccount().InputPassword(passWord.get(i));

            //EnterName
            BaseClass.createAccount().EnterName(name.get(i));

            //select birthmonth
            BaseClass.createAccount().selectBirthMonth(month.get(i));

            //select birth day
            BaseClass.createAccount().selectBirthDay(day.get(i));
            //select birth year
            BaseClass.createAccount().selectBirthYear(year.get(i));

            //select gender
            BaseClass.createAccount().SelectGender(gender.get(i));

            //click on continue button
            BaseClass.createAccount().ClickOnContinue();

           break;
        }//end of for loop



    }//end of test

}//end of class