package project_for_testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import project_for_testing.pages.CMSBasePageObject;

public class CMSLoginPageObject extends CMSBasePageObject {

    public CMSLoginPageObject(WebDriver driver) {
        super(driver);
    }

    private String loginPageUrl = "https://testare-manuala.locdejoacapentruitsti.com/blog/login/";
    private By usernameOrEmailLocator = By.id("user_login");
    private By passwordLocator = By.id("user_pass");
    private By rememberMeCheckboxLocator = By.id("rememberme");
    private By loginButtonLocator = By.id("wppb-submit");

    public void openLoginPage(){
        openUrl(loginPageUrl);
    }

    public void loginFields(String usernameOrEmail, String password){
        type(usernameOrEmailLocator, usernameOrEmail);
        type(passwordLocator, password);
    }

    public boolean isRememberMeVisible(){
        find(rememberMeCheckboxLocator);
        return true;
    }

    public void checkboxRememberMe(){
        click(rememberMeCheckboxLocator);
    }

    public CMSLandingPageObject clickLoginButton(){
        click(loginButtonLocator);
        return new CMSLandingPageObject(driver);
    }


}
