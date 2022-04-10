package co.com.sofka.orange.stepdefinition.adminModule;

import co.com.sofka.orange.stepdefinition.setup.WebKey;
import co.com.sofkla.orange.model.LoginModel;
import co.com.sofkla.orange.page.payGradeActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.hc.core5.util.Asserts;
import org.apache.log4j.Logger;
import co.com.sofkla.orange.page.loginPageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class adminModuleStepDefinition extends WebKey {

    private static final Logger LOGGER = Logger.getLogger(adminModuleStepDefinition.class);
    private final LoginModel loginModel = new LoginModel();


    @Given("El usuario hace login en la pagina inicial")
    public void elUsuarioHaceLoginEnLaPaginaInicial() {
        String user= "Admin";
        String password= "admin123";
        setUpLog4j2();
        setupClass();
        loginModel.setUsername(user);
        loginModel.setPassword(password);
        loginPageActions loginPageActions = new loginPageActions(webDriver, loginModel);
        loginPageActions.LoginFields();

    }


    @Given("El usuario ingresa a la opcion Pay grades de Job")
    public void elUsuarioIngresaALaOpcionPayGradesDeJob() {

       try {

           payGradeActions payGradeActions = new payGradeActions(webDriver);
           payGradeActions.intoPayGrade();
           payGradeActions.currencyInfo();

       }catch (Exception e){
           LOGGER.error("Ha ocurrido un error");
       }



    }
    @When("El usuario crea un nuevo Pay grade y llena su currency")
    public void elUsuarioCreaUnNuevoPayGradeYLlenaSuCurrency() {

        try {
            webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            payGradeActions payGradeActions = new payGradeActions(webDriver);
            payGradeActions.currencyInfo();

        }catch (Exception ignored){

        }
    }
    @Then ("Como resultado el cliente valida el nuevo pay grade en la pagina")
    public void comoResultadoElClienteValidaElNuevoPayGradeEnLaPagina()  {


            payGradeActions payGradeActions = new payGradeActions(webDriver);
            String name="";
            name = webDriver.findElement(By.id("payGrade_name")).getAttribute("value");
            payGradeActions.confirmCurrency();
            WebElement webElement = webDriver.findElement(By.linkText(name));
            webElement.click();
            Asserts.notNull(name,"esta es tu pay grade");

            closeClass();

    }

}
