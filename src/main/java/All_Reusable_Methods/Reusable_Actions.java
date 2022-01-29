package All_Reusable_Methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xml.sax.Locator;

public class Reusable_Actions {

    public static WebDriver setDriver() {
        //setup chrome driver
        WebDriverManager.chromedriver().setup();
        //declare and define the chrome options
        ChromeOptions options = new ChromeOptions();
        //declare all the arguments you need
        //to maximize my driver
        options.addArguments("start-maximized");
        //set as incognito
        options.addArguments("incognito");
        //set as headless(running the driver on background)
        //options.addArguments("headless");
        //define the web driver you are using
        WebDriver driver = new ChromeDriver(options);
        return driver;


    }//end of set driver method

    //creating void click method for any web element
    public static void clickMethod(WebDriver driver, String xpath, String elementName) {
        //declare local explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 15);
        System.out.println("Clicking on element " + elementName);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).click();
        } catch (Exception e) {
            System.out.println("Unable to click on " + elementName + " Error:" + e);
        }
    }//end of click method

    //creating void submit method for any web element
    public static void submitMethod(WebDriver driver, String xpath, String elementName) {
        //declare local explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 15);
        System.out.println("Submitting on element " + elementName);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).submit();
        } catch (Exception e) {
            System.out.println("Unable to submit on " + elementName + " Error:" + e);
        }
    }

    //creating void sedKeys method for any element
    public static void sendKeysMethod(WebDriver driver, String xpath, String userData, String elementName) {
        //declare local explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 15);
        System.out.println("Typing on element " + elementName);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            //clear first
            element.clear();
            //enter user data
            element.sendKeys(userData);
        } catch (Exception e) {
            System.out.println("Unable to typing on " + elementName + "Error: " + e);
        }

    }//end of click sendKeys method

    //creating return getText method for any tax web element
    public static String getTexMethod(WebDriver driver, String xpath, String elementName) {
        //declare local explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 15);
        System.out.println("capturing text on element " + elementName);
        //declare a global variable to capture the text So I can return it
        String result = "";
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            //capture text
            result = element.getText();
        } catch (Exception e) {
            System.out.println(" Unable to capturing text on element " + elementName + " Error:" + e);
        }
        return result;
    }//end of getTax method

    //remove popup
    public static void Click_Popup(WebDriver driver, String locator, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            System.out.println("Clicking on element" + elementName);

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator))).click();
        } catch (Exception err) {
            System.out.println("Unable to click on element" + err);
        }//end of exception
    }//end of popUp

    //method to select from drop down menu
    public static void dropDownMenu(WebDriver driver, String locator, String userInput, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            System.out.println("Selecting " + userInput + elementName);

            WebElement dropDown = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
            Select selectDropDown = new Select(dropDown);
            selectDropDown.selectByVisibleText(userInput);
        } catch (Exception err) {
            System.out.println("Unable to select from drop down " + err);

        }
    }//end of drop down by text method

//create javaScript for scroll page

    public static void scrollMethod(WebDriver driver, String x, String y) {
        System.out.println(" scroll the page ");
        try {

            JavascriptExecutor Ajse = (JavascriptExecutor) driver;

            Ajse.executeScript("scroll(" + x + "," + y + ")");
        } catch (Exception e) {
            System.out.println("Unable to  scroll page ");
        }

    }//end of scroll page
}
