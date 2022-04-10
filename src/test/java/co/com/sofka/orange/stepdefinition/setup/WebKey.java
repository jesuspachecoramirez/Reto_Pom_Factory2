package co.com.sofka.orange.stepdefinition.setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static co.com.sofkla.orange.util.Log4jValues.LOG4J_PROPERTIES_FILE_PATH;
import static com.google.common.base.StandardSystemProperty.USER_DIR;

public class WebKey {

    public WebDriver webDriver;


     public void setupClass() {
        WebDriverManager.chromedriver().setup();
         webDriver = new ChromeDriver();
         webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         webDriver.get("https://opensource-demo.orangehrmlive.com");
         webDriver.manage().window().maximize();

    }

    public void closeClass()  {
         webDriver.quit();

    }

    public void setUpLog4j2(){
        PropertyConfigurator.configure(USER_DIR.value() + LOG4J_PROPERTIES_FILE_PATH.getValue());
    }



}
