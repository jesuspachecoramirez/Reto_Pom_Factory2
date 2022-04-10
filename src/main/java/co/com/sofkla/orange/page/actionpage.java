package co.com.sofkla.orange.page;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class actionpage {

    private static final Logger LOGGER = Logger.getLogger(actionpage.class);
    private WebDriver webDriver;


    public actionpage(WebDriver webDriver) {
       this.webDriver = webDriver;
    }


    protected void pageFactoryInit(WebDriver webDriver, Object page) {
        PageFactory.initElements(webDriver, page);
    }

    protected void click(WebElement webElement){
        webElement.click();
    }

    protected void enter(WebElement webElement){
        webElement.sendKeys(Keys.ENTER);
    }

    protected void type(WebElement webElement, CharSequence... charSequences) {
        webElement.sendKeys(charSequences);
    }


    protected void scrollOn(WebElement webElement) {
        JavascriptExecutor jse = (JavascriptExecutor) webDriver;
        jse.executeScript("arguments[0].scrollIntoView();", webElement);
    }

    protected void Submit(WebElement webElement) {
        webElement.submit();
            }


}
