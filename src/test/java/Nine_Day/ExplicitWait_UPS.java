package Nine_Day;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ExplicitWait_UPS {
    public static void main(String[] args) throws InterruptedException {
        //setup chrome driver
        WebDriverManager.chromedriver().setup();
        //declare and define the chrome options
        ChromeOptions options = new ChromeOptions();
        //declare all the arguments you need
        //to maximize my driver
        options.addArguments("start-maximized");
        //set as incognito mode
        options.addArguments("incognito");
        //set as headless(running the driver on background)
        //options.addArguments("headless");
        //define the web driver you are using
        WebDriver driver = new ChromeDriver(options);


        //navigate to usps
        driver.navigate().to("https://www.ups.com/us/en/Home.page");

        //declaring the explicit wait
        WebDriverWait wait = new WebDriverWait(driver,15);


        //click on Track
        try {
            System.out.println("click on track");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Tracking']"))).click();

        } catch (Exception e) {
            System.out.println("Unable to click on Track " + e);
        }//end of click on Track

        //click on track a package
        try {
            //click on Track package
            System.out.println("click on track a package");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Track a Package']"))).click();
        } catch (Exception e) {
            System.out.println("Unable to click on Track a Package " + e);
        }//end of click on track a package


    }//end of main method
}//end of java class
