package Nine_Day;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class ImplicitWait_UPS {
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

        //declare and define your global implicit wait for all web elements
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //navigate to usps
        driver.navigate().to("https://www.ups.com/us/en/Home.page");
        Thread.sleep(2000);
        //click on track
        driver.findElement(By.xpath("//*[text()='Tracking']")).click();
        //click on track a package
        driver.findElement(By.xpath("//*[text()='Track a Package']")).click();


    }//end of main method
}//end of java

