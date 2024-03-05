package project_for_testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CMSLogoutPageObject extends CMSBasePageObject{
    public CMSLogoutPageObject(WebDriver driver) {
        super(driver);
    }

    private  String logoutPageUrl = "https://testare-manuala.locdejoacapentruitsti.com/blog/logout/";
    private By logoutPageTextLocator = By.className("wppb-front-end-logout");
    private By logoutButtonLocator = By.xpath("//a[@class='wppb-logout-url' and text()='Log out »']");


    public void openLogoutPage(){
        openUrl(logoutPageUrl);
    }

    public boolean logoutpageText(){
       WebElement text =  find(logoutPageTextLocator);
        if(!text.isDisplayed()){
            return false;
        }
        return true;
    }

    public CMSLoginPageObject clickLogoutButton(){
        click(logoutButtonLocator);
        return new CMSLoginPageObject(driver);
    }
}
