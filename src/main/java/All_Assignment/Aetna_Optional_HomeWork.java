package All_Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Aetna_Optional_HomeWork {
    public static void main(String[] args) {
        //set the web driver manager
        WebDriverManager.chromedriver().setup();
        //define the chrome option before set web driver
        ChromeOptions options = new ChromeOptions();
        //set up the maximized and incognito mode
        options.addArguments("start-maximized");
        //options.addArguments("incognito");
        // set the web driver
        WebDriver driver = new ChromeDriver(options);


        //create Array list for zipcode
        ArrayList<String> zipcode = new ArrayList<>();
        zipcode.add("11235");
        zipcode.add("11228");
        zipcode.add("11218");



    }//end of main method
}//end of java class
