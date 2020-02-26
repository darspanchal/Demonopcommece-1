package WebTest3;

import org.openqa.selenium.By;

public class ProductComparision extends Utils {
    String expected = "Compare products";
    private By _pageTitle = By.xpath("//ul[contains(@class,'notmobile')]//li//a[contains(@href,'downloads')]");
    public static void verifyUserOnProductComparisonPage(){
        // assertTextMessage("page not found", expected,_pageTitle);
        assertURL("compareproducts");
    }
}