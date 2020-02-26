package WebTest3;

import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class CheckOutResult extends Utils {

    private By _checkoutsuccessmessage = By.xpath("//div[@class='section order-completed']/div[1]/strong");

    String accepted = "Your order has been successfully processed!";

    public void verifyCheckoutSuccessMessage() {
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertURL("checkout completed");
        //String accepted = "Your order has been successfully processed!";
        //assertTextMessage("checkout is not successful",accepted,_checkoutsuccessmessage);


    }



}
