package Fifth_Day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Search {

    public static void main(String[] args) throws InterruptedException {
        //set the system property of where the driver is located so you can use it
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        //define the WebDriver with a variable to use
        WebDriver driver = new ChromeDriver();
        //navigate/get to google home page
        driver.navigate().to("http://www.google.com");
        //maximize the driver
        driver.manage().window().maximize();
        //anytime when you go to a new page you should put some wait statement
        Thread.sleep(2000);

        //searching for cars on google search field
        driver.findElement(By.xpath("//*[@name= 'q']")).sendKeys("cars");

        //hit submit on google search button
        driver.findElement(By.xpath("//*[@name='btnK']")).submit();

         //
        Thread.sleep(2000);

        //
        String value = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
        //
        String[] arrayResult = value.split(" ");
        //
        System.out.println("My Search  result is " + arrayResult[1]);
        //
        driver.quit();

    }//end of main method
}//end of class
