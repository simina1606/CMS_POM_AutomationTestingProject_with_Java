package project_for_testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CMSBasePageObject {

    protected WebDriver driver;


    public CMSBasePageObject(WebDriver driver) {
        this.driver = driver;
    }

    protected void openUrl(String url){
        driver.get(url);
    }

    protected WebElement find(By locator){
        waitForVisibilityOfElement(locator, 5);
        return driver.findElement(locator);
    }

    protected void click(By locator){
        waitForVisibilityOfElement(locator, 5);
        find(locator).click();
    }

    protected void type(By locator, String text){
        waitForVisibilityOfElement(locator, 5);
        find(locator).sendKeys(text);
    }

    public String getPageUrl(){
        return driver.getCurrentUrl();
    }

    protected List<WebElement> findAll(By locator){
       return driver.findElements(locator);
    }

    public void waitForVisibilityOfElement(By locator, int timeOutt){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOutt));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void switchToWindowByTitle(String expectedTitle){
        String firstWindow = driver.getWindowHandle();
        Set<String> allWindowsOpened = driver.getWindowHandles();
        Iterator<String> windowIterator = allWindowsOpened.iterator();

        while (windowIterator.hasNext()){
            String windowHandle = windowIterator.next().toString();
            if(!windowHandle.equals(firstWindow)){
                driver.switchTo().window(windowHandle);
                if(driver.getTitle().equals(expectedTitle));
                break;
            }
        }

    }


}
