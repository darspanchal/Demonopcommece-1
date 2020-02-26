package WebTest3;

import org.openqa.selenium.By;

public class HomePage extends Utils {

    private By _registerLink = By.xpath("//a[contains(., 'Register')]");
    private By _DigitalDownloads = By.linkText("Digital downloads");
    private By _computer = By.linkText("Computers");
    private By _jewelryLink = By.xpath("//ul[contains(@class,'notmobile')]//li//a[contains(text(),'Jewelry')]");
    private By _viewNewsArchive = By.xpath("//a[contains(text(),'Archive')]");
    private By _currency = By.id("customerCurrency");
    private String value = "Euro";


    public void clickOnRegisterButton(){clickOnElement(_registerLink);}
    public void clickOnDigitalDownloads() {clickOnElement(_DigitalDownloads);}
    public void ClickOnComputerCategory(){ clickOnElement(_computer); }
    public void clickOnJewelryCategory() { clickOnElement(_jewelryLink);
   // public void ClickOnJewelryCategory() {clickOnElement(_jewelryLink);}
            //public void clickOnViewNewsArchive(){clickOnElement(_viewNewsArchive);}

    }
}


