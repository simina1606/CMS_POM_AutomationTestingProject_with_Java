package project_for_testing;

import org.junit.Assert;
import org.junit.Test;
import project_for_testing.pages.*;
import utils.BaseTestClass;

public class PositiveTests extends BaseTestClass {
    @Test
    public void CMSContactTests(){
        CMSLandingPageObject cmsLandingPageObject = new CMSLandingPageObject(driver);
        cmsLandingPageObject.openHomePage();
        cmsLandingPageObject.getPageUrl();

        CMSContactPageObject cmsContactPageObject = cmsLandingPageObject.clickContactForm();
        cmsContactPageObject.getPageUrl();
        cmsContactPageObject.sendMessage();
        cmsContactPageObject.selectTopic("Marketing proposal");
        cmsContactPageObject.selectAllCheckBoxes();
        cmsContactPageObject.selectRadioButton();
        Assert.assertTrue("Send button is not visible", cmsContactPageObject.isSendButtonVisible());
        cmsContactPageObject.clickSendButton();

    }

    @Test
    public void CMSRegisterTests(){
        CMSLandingPageObject cmsLandingPageObject = new CMSLandingPageObject(driver);
        cmsLandingPageObject.openHomePage();

        CMSRegisterPageObject cmsRegisterPageObject = cmsLandingPageObject.clickRegisterForm();
        Assert.assertEquals("Register page Url is correct", cmsRegisterPageObject.getPageUrl(), cmsRegisterPageObject.openRegisterPage());

        cmsRegisterPageObject.requiredFields("FirstNameLastName", "A@test.com", "Password123!", "Password123!");
        Assert.assertTrue("Register button is not visible", cmsRegisterPageObject.isRegisterButtonVisible());

        CMSAccountCreatedPageObject cmsAccountCreatedPageObject = cmsRegisterPageObject.clickRegisterButton();
        String expectedUrl = "https://testare-manuala.locdejoacapentruitsti.com/blog/register/";
        Assert.assertEquals("Url is correct", expectedUrl, cmsAccountCreatedPageObject.getPageUrl());

        String expectedSuccesfullMessage = "The account FirstNameLastName has been successfully created!"
        Assert.assertEquals("Successfull account created message is not displayed", expectedSuccesfullMessage,cmsAccountCreatedPageObject.getAccountCreatedSuccesfulMessage());
    }

    @Test
    public void CMSLoginTests(){

        CMSLandingPageObject cmsLandingPageObject = new CMSLandingPageObject(driver);
        cmsLandingPageObject.openHomePage();

        CMSLoginPageObject cmsLoginPageObject = cmsLandingPageObject.clickLoginForm();
        cmsLoginPageObject.openLoginPage();

        cmsLoginPageObject.loginFields("FirstNameLastName","Password123!");
        Assert.assertTrue("Remember me checkbox is not visible", cmsLoginPageObject.isRememberMeVisible());
        cmsLoginPageObject.checkboxRememberMe();

        CMSLandingPageObject cmsLandingPageObject1 = cmsLoginPageObject.clickLoginButton();
        CMSLogoutPageObject cmsLogoutPageObject = cmsLandingPageObject1.clickLogoutLink();
        cmsLogoutPageObject.openLogoutPage();
        String expectedLogoutText ="You are currently logged in as FirstNameLastName."
        Assert.assertEquals("The message on logout page is not displayed", expectedLogoutText, cmsLogoutPageObject.logoutpageText());

        CMSLoginPageObject cmsLoginPageObject1 = cmsLogoutPageObject.clickLogoutButton();

    }
}
