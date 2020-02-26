package WebTest3;

import org.openqa.selenium.By;

public class GuestCheckout extends Utils {
    LoadProp loadProp = new LoadProp();

    private By _checkoutguest = By.xpath("//input[@value='Checkout as Guest']");
    private By _firstname = By.xpath("//input[@name='BillingNewAddress.FirstName']");
    private String FirstName = "Boris";
    private By _lastname = By.xpath("//input[@name='BillingNewAddress.LastName']");
    private String LastName = "Jhonson";
    private By _email = By.id("BillingNewAddress_Email");
    private By _dropdown = By.id("BillingNewAddress_CountryId");
    //private By _dropdown = By.xpath("//select[@name='BillingNewAddress.CountryId']");
    private String _country = "United Kingdom";
    private By _city = By.xpath("//input[@name = 'BillingNewAddress.City']");
    private String city = "London";
    private By _address = By.xpath("//input[@name='BillingNewAddress.Address1']");
    private String address = "15 Talbot Road";
    private By _postcode = By.xpath("//input[@name ='BillingNewAddress.ZipPostalCode']");
    private String postcode = "HA0 3EL";
    private By _phonenum = By.xpath("//input[@name='BillingNewAddress.PhoneNumber']");
    private String phonenum = "07897665623";
    private By _continue = By.xpath("//input[@onclick='Billing.save()']");


    public void checkoutAsGuest(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOnElement(_checkoutguest);


        sendText(_firstname,FirstName);
        sendText(_lastname,LastName);
        sendText(_email,"premchopda1@gmail.com");
        selectTextFromDropDown(_dropdown,"233");
        sendText(_city,city);
        sendText(_address,address);
        sendText(_postcode,postcode);
        sendText(_phonenum,phonenum);
        clickOnElement(_continue);

    }

    public String get_country() {
        return _country;
    }

    public void set_country(String _country) {
        this._country = _country;
    }
}
