package Example_package_create;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practice_FindElements {
    public static void main(String[] args) throws InterruptedException {

        //set the property that are we using
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        //defining chrome options before defining the web driver
        ChromeOptions options = new ChromeOptions();
        //set browser in maximized mode
        options.addArguments("start-maximized");
        //set private mode
        options.addArguments("incognito");
        //set headless mode
        //options.addArguments("headless");

        WebDriver driver = new ChromeDriver(options);

        //navigate the yahoo page
        driver.navigate().to("http://www.yahoo.com");
        System.out.println("navigating the yahoo page ");
        Thread.sleep(2000);

        //using xpath click on 2nd ,5th and 8th link
        driver.findElements(By.xpath("//*[contains(@class,'_yb_1rhax')]")).get(1).click();
        System.out.println("entered on news home page");

        driver.navigate().to("http://www.yahoo.com");
        System.out.println("navigating the yahoo page ");
        Thread.sleep(2000);


        driver.findElements(By.xpath("//*[contains(@class,'_yb_1rhax')]")).get(4).click();
        System.out.println("open fourth link");

        driver.navigate().to("http://www.yahoo.com");
        System.out.println("navigating the yahoo page ");
        Thread.sleep(2000);


        driver.findElements(By.xpath("//*[contains(@class,'_yb_1rhax')]")).get(7).click();

        driver.quit();


    }//end of main method
}//end of java class
