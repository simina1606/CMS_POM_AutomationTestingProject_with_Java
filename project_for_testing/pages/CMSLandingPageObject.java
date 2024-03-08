package project_for_testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CMSLandingPageObject extends CMSBasePageObject {
    public CMSLandingPageObject(WebDriver driver) {
        super(driver);
    }

    private String pageUrl = "https://testare-manuala.locdejoacapentruitsti.com/blog/";
    private By contactFormLink = By.xpath("//a[@href='https://testare-manuala.locdejoacapentruitsti.com/blog/contact/' and text()='Contact']");
    private By searchBar = By.xpath("//input[@placeholder='Search …']");
    private By registerFormLink = By.xpath("//a[@href='https://testare-manuala.locdejoacapentruitsti.com/blog/register/' and text()='Register']");
    private By loginFormLink = By.xpath("//a[@href='https://testare-manuala.locdejoacapentruitsti.com/blog/login/' and text()='Login']");
    private By logoutLink = By.xpath("//a[@href='https://testare-manuala.locdejoacapentruitsti.com/blog/logout/' and text()='Logout']");

       public void openChromeBrowser(){
        System.setProperty("webdriver.chrome.driver","C://Users//ACER//Downloads//chromedriver.exe");
    }

    public void openHomePage(){
        openUrl(pageUrl);
        //drivet.get(pageUrl);
    }
    public void search(){
        type(searchBar, "Testing levels");
    }

    public CMSContactPageObject clickContactForm(){
       // driver.findElement(contactFormLink).click();
        click(contactFormLink);
        return new CMSContactPageObject(driver);
    }

    public CMSRegisterPageObject clickRegisterForm(){
        click(registerFormLink);
        return new CMSRegisterPageObject(driver);
    }

    public CMSLoginPageObject clickLoginForm(){
        click(loginFormLink);
        return new CMSLoginPageObject(driver);
    }

    public CMSLogoutPageObject clickLogoutLink(){
        click(logoutLink);
        return new CMSLogoutPageObject(driver);
    }



}
