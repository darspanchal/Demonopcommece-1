package WebTest3;

import org.openqa.selenium.By;

public class RegistrationResultPage extends Utils {

    private By _registerSuccessMessage = By.cssSelector("div.result");
    String expected = "Your registration completed";

    public void verifyUserSeeRegistrationSuccessMessage(){
        assertURL("registerresult");
        assertTextMessage( "Your registration completed", _registerSuccessMessage);
    }
}
