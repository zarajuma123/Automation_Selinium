package Sixth_Day;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Google_chromeOption {


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

        //
        WebElement searchField = driver.findElement(By.xpath("//*[@name='p']"));
        //clear search field
        searchField.clear();
        //
        searchField.sendKeys("cars");
        searchField.submit();
        //need to scroll to capture the search result
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        //scroll down by using executor script command
        jse.executeScript("scroll(0,5000)");
        //capture the entire footer including the result
        String searchResult = driver.findElement(By.xpath("//*[@]")).getText();
        //
        String[] arrayResult = searchResult.split("Next");
        //
        String[] resultNumber = arrayResult[1].split(" ");
        System.out.println("My search result is" + resultNumber[0]);










        //enter a keyword on google search
       // driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cars");
       // System.out.println("Entered keyword on Google Search");


        
    }// end of main
}//end of java
