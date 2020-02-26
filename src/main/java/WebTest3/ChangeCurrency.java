package WebTest3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class ChangeCurrency extends Utils {

    private By _currency = By.id("customerCurrency");
    private String currency = "Euro";

    public void userselectcurrency() {
        selectFromDropdownByVisibleText(_currency,currency);}

    public void verifyCurrency(){

        SoftAssert softAssert = new SoftAssert();
        List<WebElement> productList = driver.findElements(By.xpath("//span[@class='price actual-price']"));
        for (WebElement we : productList) {
            System.out.println(we.getText());
            System.out.println("------------");
            softAssert.assertTrue(we.getText().contains("€"),"$ not found" + we.getText());
        }
        softAssert.assertAll();
    }
}
