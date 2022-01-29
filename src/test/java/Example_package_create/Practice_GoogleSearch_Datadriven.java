package Example_package_create;

import All_Reusable_Methods.Reusable_Actions;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.security.PublicKey;

import static jxl.Workbook.getWorkbook;

public class Practice_GoogleSearch_Datadriven {
    //declare the web driver outside of the annotation so it can be call on all methods
    WebDriver driver;

    @BeforeSuite
    public void setDriver() {
        driver = Reusable_Actions.setDriver();
    }//end of before suite

    @Test
    public void GoogleSearchDataDriven() throws IOException, BiffException, WriteException {
        /*//Step1: read the data from the Excel sheet that you created
        Workbook readableFile = Workbook.getWorkbook(new File("src/main/resources/GoogleSearch.xls"));
        Sheet readableSheet = readableFile.getSheet(0);

        WritableWorkbook writableFile = Workbook.createWorkbook(new File("src/main/resources/GoogleSearch_Results.xls"), readableFile);
        //save write file into Writable sheet
        WritableSheet writableSheet = writableFile.getSheet(0);
        //will return the physical rows present on the sheet
        int rowCount = writableSheet.getRows();*/
        //step 1:
        Workbook readableFile = Workbook.getWorkbook(new File("src/main/resources/googleSearch.xls"));
        Sheet readableSheet = readableFile.getSheet(0);

        WritableWorkbook writableFile = Workbook.createWorkbook(new File("src/main/resources/GoogleSearch_Results.xls"),readableFile);
        WritableSheet writableSheet = writableFile.getSheet(0);
        int rowCount = writableSheet.getRows();
        for (int i = 1; i < rowCount; i++){

           String Countries = writableSheet.getCell(0,i).getContents();
            System.out.println("My values are" +Countries);
            //navigate google
            driver.navigate().to("https://www.google.com");
            //enter countries on google search field
            Reusable_Actions.sendKeysMethod(driver, "//*[@name='q']", Countries, "Search field");
            //submit the key words
            Reusable_Actions.submitMethod(driver, "//*[@name='btnK']", "Google Search Button");

            //capture the results
            String results = Reusable_Actions.getTexMethod(driver, "//*[@id='result-stats']", "Search Result");
            String[] arrayResult = results.split(" ");

            Label label = new Label(1, i,
                    arrayResult[1]);

            //I need to write back in the writableSheet
            writableSheet.addCell(label);

        }//end of for loop

        writableFile.write();
        writableFile.close();


    }//end of @Test

    @AfterSuite
    public void quitSession() {
        driver.quit();
    }


}//end of java class
