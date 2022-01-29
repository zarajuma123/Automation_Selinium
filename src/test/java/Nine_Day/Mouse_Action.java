package Nine_Day;

import All_Reusable_Methods.Reusable_Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Action {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = Reusable_Actions.setDriver();

        //navigate to usps
        driver.navigate().to("https://www.usps.com");
        Thread.sleep(2000);

        //verify the welcome page title appears as expected
        String actualTitle = driver.getTitle();
        //by using if else to compare expected with actual title
        if (actualTitle.equals("Welcome | USPS")){
            System.out.println("Title matches" + actualTitle);

        }else{
            System.out.println("Title doesn't match.Actual title is" + actualTitle);
        }//end of verify page title

        //declare mouse actions
        Actions mouseAction = new Actions(driver);
        //hover over Send tab to open up the drop down list
        try{
            WebElement sendTab = driver.findElement(By.xpath("//*[text()='Send']"));
            mouseAction.moveToElement(sendTab).perform();
        }catch (Exception e){
            System.out.println("Unable to hover to Send tab" + e);
        }//end of send tab


        // click on  Zip codeLook up

        try{
            WebElement zipCodeLookup = driver.findElement(By.xpath("//*[text()='Look Up a ZIP Code']"));
            mouseAction.moveToElement(zipCodeLookup).click().perform();
        }catch (Exception e){
            System.out.println("Unable to  Zip codeLook up" + e);

        }//end of Zip codeLook up




    }//end of main
}//end of java class
