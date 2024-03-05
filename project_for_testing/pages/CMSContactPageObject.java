package project_for_testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import project_for_testing.pages.CMSBasePageObject;

import java.util.List;

public class CMSContactPageObject extends CMSBasePageObject {
    public CMSContactPageObject(WebDriver driver) {
        super(driver);
    }

    String contactPageUrl = "https://testare-manuala.locdejoacapentruitsti.com/blog/contact/";
    private By nameLocator = By.name("your-name");
    private By emailLocator = By.name("your-email");
    private By phoneLocator = By.name("tel-437");
    private By subjectLocator = By.name("your-subject");
    private By dropdownLocator = By.name("Select");
    private By checkboxLocator = By.xpath("//span[@class='wpcf7-form-control-wrap Wheredidyoufindus']");
    private By radioButtonITLocator = By.xpath("//input[@value='IT']");
    private By radioButtonSalesLocator = By.xpath("//input[@value='Sales']");
    private By radioButtonPRMediaLocator = By.xpath("//input[@value='PR & Media']");
    private By radioButtonOther = By.xpath("//input[@value='Other']");
    private By allRadioButtons = By.xpath("//span[@class='wpcf7-form-control wpcf7-radio']");
    private By sendButtonLocator = By.xpath("//input[@value='Send']");


    public void sendMessage(){
        type(nameLocator, "Name");
        type(emailLocator, "name@test.com");
        type(phoneLocator, "0000000000");
        type(subjectLocator, "Thank you");
    }
    public void selectTopic(String option){
        WebElement dropdownElement = find(dropdownLocator);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByValue(option);
    }
     public void selectAllCheckBoxes(){
         List<WebElement> checkboxes = findAll(checkboxLocator);
                 for(WebElement checkbox : checkboxes){
                     if(!checkbox.isSelected()){
                         checkbox.click();
                     }
                 }
     }

     public void selectRadioButton() {
         List<WebElement> radioButtons = findAll(allRadioButtons);
         for (WebElement radioButton : radioButtons) {
             if (!radioButton.isSelected()) {
                 radioButton.click();
             }
         }
     }

     public boolean isSendButtonVisible(){
        find(sendButtonLocator);
        return true;
     }

     public void clickSendButton(){
        click(sendButtonLocator);
     }


}
