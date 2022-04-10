package co.com.sofkla.orange.page;

import co.com.sofkla.orange.model.LoginModel;
import org.openqa.selenium.WebDriver;

public class loginPageActions extends loginPage{
    private final LoginModel loginModel;



    public loginPageActions(WebDriver webDriver, LoginModel loginModel) {
        super(webDriver);
        this.loginModel = loginModel;
    }

    public void LoginFields(){
        scrollOn(username);
        type(username,loginModel.getUsername());
        scrollOn(password);
        type(password,loginModel.getPassword());
        scrollOn(getLogin());
        Submit(getLogin());
    }




}
