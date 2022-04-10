package co.com.sofkla.orange.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class loginPage extends actionpage{

 @CacheLookup
 @FindBy(id = "txtUsername")
  protected WebElement username;

 @CacheLookup
 @FindBy(id = "txtPassword")
 protected WebElement password;

 @CacheLookup
 @FindBy(id = "btnLogin")
 WebElement login;



    public loginPage(WebDriver webDriver) {
        super(webDriver);
        pageFactoryInit(webDriver,this);
    }


    public WebElement getLogin() {
        return login;
    }
}
