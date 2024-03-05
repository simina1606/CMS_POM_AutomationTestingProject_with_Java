package project_for_testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import project_for_testing.pages.CMSBasePageObject;

public class CMSRegisterPageObject extends CMSBasePageObject {
    public CMSRegisterPageObject(WebDriver driver) {
        super(driver);
    }

    String registerPageUrl = "https://testare-manuala.locdejoacapentruitsti.com/blog/register/";
    private By usernameLocator = By.id("username");
    private By firstNameLocator = By.id("first_name");
    private By lastNameLocator = By.id("last_name");
    private By nickNameLocator = By.id("nickname");
    private By emailLocator = By.id("email");
    private By websiteLocator = By.id("website");
    private By passwordLocator = By.id("passw1");
    private By repeatPasswordLocator = By.id("passw2");
    private By registerButtonLocator = By.id("register");

    public void openRegisterPage() {
        openUrl(registerPageUrl);
    }
/*
    public void nameSection(){
        type(usernameLocator, "Username");
        type(firstNameLocator, "First");
        type(lastNameLocator,"Last");
        type(nickNameLocator,"Nickname");
    }

    public void contactSection(){
        type(emailLocator, "email@email.com");
        type(websiteLocator, "https://www.peviitor.ro");
    }

    public void aboutSection(){
        type(passwordLocator, "Password123!");
        type(repeatPasswordLocator, "Password123!");
    }

 */

    public void requiredFields(String username, String email, String password, String repeatPassword){
        type(usernameLocator, username);
        type(emailLocator, email);
        type(passwordLocator, password);
        type(repeatPasswordLocator, repeatPassword);

    }

    public boolean isRegisterButtonVisible(){
        find(registerButtonLocator);
        return true;
    }

    public CMSAccountCreatedPageObject clickRegisterButton(){
        click(registerButtonLocator);
        return new CMSAccountCreatedPageObject(driver);
    }





}
