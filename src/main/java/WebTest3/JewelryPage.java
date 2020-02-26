package WebTest3;

import org.openqa.selenium.By;

public class JewelryPage extends Utils {
    private By _product = By.xpath("//input[@value='Add to cart']");
    //private By _addtocart = By.className("cart-label");

    private By _addtocart = By.xpath("//span[@class='cart-label']");
    private By _checkbox = By.xpath("//input[@id='termsofservice']");
    private By _checkout = By.xpath("//button[@type='submit']");

    //verify that user os on jewelry category page
    public void verifyUserIsOnJewelryPage(){ assertURL("jewelry"); }

    public void addToCartProduct(){
        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e){e.printStackTrace();}

        clickOnElement(_product);
        clickOnElement(_addtocart);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clickOnElement(_checkbox);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOnElement(_checkout);
    }


}
