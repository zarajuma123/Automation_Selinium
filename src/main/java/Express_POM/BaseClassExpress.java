package Express_POM;

import All_Reusable_Methods.Reusable_Annotations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClassExpress extends Reusable_Annotations {

    public BaseClassExpress(WebDriver driver){
        PageFactory.initElements(driver,this);
    }//end of constructor class


    //create static reference for Express home page
    public static HomepageExpress homepageExpress(){
        HomepageExpress homepageExpress = new HomepageExpress(driver);
        return  homepageExpress;
    }//end of homepage


    //create static reference for seeAllOffers
    public static SeeAllOffers seeAllOffers(){
        SeeAllOffers seeAllOffers = new SeeAllOffers(driver);
        return  seeAllOffers;
    }//end of seealloffers

    //create static reference for SizeAndCart
    public static SizeAndCart sizeAndCart(){
        SizeAndCart sizeAndCart = new SizeAndCart(driver);
        return  sizeAndCart;
    }//end of sizeandcart

    //create static reference for Quality and Checkout
    public static QuantityAndCheckout  quantityAndCheckout (){
        QuantityAndCheckout quantityAndCheckout = new QuantityAndCheckout(driver);
        return quantityAndCheckout;
    }//end of quantityAndCheckout

    //create static reference for ContactAndBillingInformationAndDelivery
    public static ContactAndBillingAndDelivery contactAndBillingInformationAndDelivery (){
        ContactAndBillingAndDelivery contactAndBillingAndDelivery = new ContactAndBillingAndDelivery(driver);
        return contactAndBillingAndDelivery;
    }//end of ContactAndBillingAndDelivery


    //create static reference for payment
    public static Payment  payment (){
        Payment payment = new Payment(driver);
        return payment;
    }//end of quantityAndCheckout
}
