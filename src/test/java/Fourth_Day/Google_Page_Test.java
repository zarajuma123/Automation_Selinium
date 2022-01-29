package Fourth_Day;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Page_Test {

    public static void main(String[] args) {
        //set the system property of where the driver is located so you can use it
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        //define the WebDriver with a variable to use
        WebDriver driver = new ChromeDriver();
        //navigate/get to google home page
        driver.navigate().to("http://www.google.com");
        //maximize the driver
        driver.manage().window().maximize();



    }//end main method
}// end java class
