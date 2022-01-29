package Express_POM;

import All_Reusable_Methods.Reusable_Annotations;
import com.relevantcodes.extentreports.LogStatus;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class POM_ExpressTest extends Reusable_Annotations {


    @Test
    public void POM_ExpressTest() throws IOException, BiffException {

        Workbook readableFile = Workbook.getWorkbook(new File("src/main/resources/Express_HTML.xls"));
        Sheet readableSheet = readableFile.getSheet(0);
        WritableWorkbook writableFile = Workbook.createWorkbook(new File("src/main/resources/Express_HTML_Results.xls"), readableFile);
        WritableSheet writableSheet = writableFile.getSheet(0);
        int rowCount = writableSheet.getRows();

        logger = reports.startTest(" Express Website logging ");

        //using for loop
        for (int i = 1; i < rowCount; i++) {

            String size = writableSheet.getCell(0, i).getContents();
            String quantity = writableSheet.getCell(1, i).getContents();
            String firstName = writableSheet.getCell(2, i).getContents();
            String lastName = writableSheet.getCell(3, i).getContents();
            String email = writableSheet.getCell(4, i).getContents();
            String phoneNumber = writableSheet.getCell(5, i).getContents();
            String address = writableSheet.getCell(6, i).getContents();
            String zipCode = writableSheet.getCell(7, i).getContents();
            String city = writableSheet.getCell(8, i).getContents();
            String state = writableSheet.getCell(9, i).getContents();
            String cardNumber = writableSheet.getCell(10, i).getContents();
            String expMonth = writableSheet.getCell(11, i).getContents();
            String expYear = writableSheet.getCell(12, i).getContents();
            String cvv = writableSheet.getCell(13, i).getContents();
            String errorMessage = writableSheet.getCell(14, i).getContents();


            //navigate to Express web page
            logger.log(LogStatus.INFO, "Navigate to Express home page");
            driver.navigate().to("https://www.express.com");
            driver.manage().deleteAllCookies();

            //verify express page title
            String actualTitle = driver.getTitle();
            if (actualTitle.equals("Men's & Women's Clothing")) {
                System.out.println("Title Matches");
            } else {
                System.out.println("Title does not match.Actual title is " + actualTitle);
            }//end of verify page title


            BaseClassExpress.homepageExpress().mouseHoverOnWomen();

            BaseClassExpress.homepageExpress().DressLink();

            BaseClassExpress.seeAllOffers().clickSelectDress();

            BaseClassExpress.sizeAndCart().selectSize(size);

             BaseClassExpress.sizeAndCart().ClickOnAddToBag();

             BaseClassExpress.sizeAndCart().ClickOnViewBag();

             BaseClassExpress.quantityAndCheckout().selectQuantity(quantity);

             BaseClassExpress.quantityAndCheckout().clickOnCheckout();

             BaseClassExpress.quantityAndCheckout().clickOnCheckoutAsGuest();

             BaseClassExpress.contactAndBillingInformationAndDelivery().EnterFirstName(firstName);

             BaseClassExpress.contactAndBillingInformationAndDelivery().EnterLastName(lastName);

             BaseClassExpress.contactAndBillingInformationAndDelivery().EnterEmail(email);

             BaseClassExpress.contactAndBillingInformationAndDelivery().EnterConfirmEmail();

             BaseClassExpress.contactAndBillingInformationAndDelivery().ClickOnContinue();

             BaseClassExpress.contactAndBillingInformationAndDelivery().EnterAddress(address);

             BaseClassExpress.contactAndBillingInformationAndDelivery().EnterZipcode(zipCode);

             BaseClassExpress.contactAndBillingInformationAndDelivery().EnterCity(city);

             BaseClassExpress.contactAndBillingInformationAndDelivery().EnterState(state);

             BaseClassExpress.contactAndBillingInformationAndDelivery().ClickOnContinue();

             BaseClassExpress.payment().EnterCreditCardNumber(cardNumber);

             BaseClassExpress.payment().EnterexpMonth(expMonth);

             BaseClassExpress.payment().EnterExpYear(expYear);

             BaseClassExpress.payment().EnterCvv(cvv);

























        }//end of loop




        }//end of test




















}//end of class
