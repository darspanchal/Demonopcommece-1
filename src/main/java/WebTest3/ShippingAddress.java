package WebTest3;

import org.openqa.selenium.By;

public class ShippingAddress extends Utils {
    private By _continue = By.xpath("//input[@onclick='ShippingMethod.save()']");

    public void userShippingAddress(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clickOnElement(_continue);


    }
}

