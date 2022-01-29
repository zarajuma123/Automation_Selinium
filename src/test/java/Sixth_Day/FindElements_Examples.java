package Sixth_Day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElements_Examples {
    public static void main(String[] args) throws InterruptedException {
        //Set the property
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        //declare and define the chrome option;
        ChromeOptions options = new ChromeOptions();

        // to maximized my driver
        options.addArguments("Start-maximize");
        //set as private mode
        options.addArguments("incognito");
        //set as headless (running the driver on background)
        //  options.addArguments("headless");
        //define the webDriver that we are using
        WebDriver driver = new ChromeDriver(options);


        //navigate to google
        driver.navigate().to("http://www.yahoo.com");
        Thread.sleep(2000);
        System.out.println("navigate the yahoo home page");
        Thread.sleep(2000);
        //enter a keyword on google search
        driver.findElements(By.xpath("//*[contains(@class,'_yb_1rhax')]")).get(1).click();
        System.out.println("Entered news home page ");

    }// end of main method
}//end of java class
