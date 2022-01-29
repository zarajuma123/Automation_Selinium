package Example_package_create;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practice_mortgage_Cal_Scroll {
    public static void main(String[] args) throws InterruptedException {
       //webdriver manager to open my driver
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
       //start maximize
        options.addArguments("start-maximize");
         //set the driver
        WebDriver driver = new ChromeDriver(options);
        //navigate the mortgage cal
        driver.navigate().to("http://www.mortgagecalculator.org");
        Thread.sleep(2500);
        //scroll to the window of loan view
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        //scroll to the view by pixels
       // jse.executeScript("scroll(0,450)");

        //scroll to view by element 'Home value' text
        ////declare as webelement
        WebElement homevalueText = driver.findElement(By.xpath("//*[contains(text(),'Home value:')]"));
        jse.executeScript("arguments[0].scrollview(true);", homevalueText);





    }//end lof main




}//end of java
