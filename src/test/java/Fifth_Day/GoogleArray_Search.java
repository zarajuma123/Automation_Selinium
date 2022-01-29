package Fifth_Day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleArray_Search {
    public static void main(String[] args) throws InterruptedException {
        String[] countries = new String[4]; //you set the limit/boundaries for your array
        //now you define your values by the variables indexing
        countries[0] = "USA";
        countries[1] = "Canada";
        countries[2] = "Bangladesh";
        countries[3] = "Russia";

        //set the system property of where the driver is located so you can use it
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        //define the WebDriver with a variable to use
        WebDriver driver = new ChromeDriver();
        //
        for (int i = 0; i < countries.length; i++) {
            //navigate/get to google home page
            driver.navigate().to("http://www.google.com");
            //maximize the driver
            driver.manage().window().maximize();
            //anytime when you go to a new page you should put some wait statement
            Thread.sleep(2000);

            //searching for cars on google search field
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(countries[i]);

            //hit submit on google search button
            driver.findElement(By.xpath("//*[@value='Google Search']")).submit();

            //every time when open new page put some wait time
            Thread.sleep(2000);

            //Searching for countries on google search field
            String value = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
            //another put some wait time
            Thread.sleep(2000);
            //declaring the array variable to split the result
            String[] arrayResult = value.split(" ");
            //now print the countries and Search number
            System.out.println(" My Countries name is " + countries[i]  + " And Search  result is " + arrayResult[1]);


        }//end of for loop

        driver.quit();
    }//end of main method
}//end of java class
