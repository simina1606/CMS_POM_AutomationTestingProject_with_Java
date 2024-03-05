package project_for_testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CMSAccountCreatedPageObject extends CMSBasePageObject{
    public CMSAccountCreatedPageObject(WebDriver driver) {
        super(driver);
    }

    private By succesfulMessage = By.id("wppb_form_success_message");

    public boolean getAccountCreatedSuccesfulMessage(){
        WebElement succes = find(succesfulMessage);
        if(succes.isDisplayed()){
            return true;
        }
        return false;
    }
}
