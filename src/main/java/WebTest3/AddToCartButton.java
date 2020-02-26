package WebTest3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddToCartButton extends Utils {

    //verify add to cart button
    public void verifyAddToCartButton()
    {
        List<WebElement> listOfItems = driver.findElements(By.xpath("//div[@class='product-item']"));
        for (WebElement item : listOfItems)
        {
            if (!item.getAttribute("innerHTML").contains("Add to cart"))
            {
                System.out.println("This item does Not have ADD to Cart Button --- " + item.getText());
            }
        }

    }
}
