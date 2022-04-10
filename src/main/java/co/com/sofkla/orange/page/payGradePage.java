package co.com.sofkla.orange.page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class payGradePage extends actionpage {



    @CacheLookup
    @FindBy(id ="menu_admin_viewAdminModule")
    WebElement admin;

    @CacheLookup
    @FindBy(id = "menu_admin_Job")
    WebElement job;

    @CacheLookup
    @FindBy(id = "menu_admin_viewPayGrades")
    WebElement paygrades;

    @CacheLookup
    @FindBy(id = "btnAdd")
    WebElement add;

    @CacheLookup
    @FindBy(id = "payGrade_name")
    WebElement title;

    @CacheLookup
    @FindBy(id = "btnSave")
    WebElement save;

    @CacheLookup
    @FindBy(id = "btnAddCurrency")
    WebElement addCur;

    @CacheLookup
    @FindBy(id = "payGradeCurrency_currencyName")
    WebElement curName;

    @CacheLookup
    @FindBy(id = "payGradeCurrency_minSalary")
    WebElement minSalary;

    @CacheLookup
    @FindBy(id="payGradeCurrency_maxSalary")
    WebElement maxSalary;

    @CacheLookup
    @FindBy(id = "btnSaveCurrency")
    WebElement saveCur;

    @CacheLookup
    @FindBy(id = "btnCancel")
    WebElement back;







    public payGradePage(WebDriver webDriver) {
        super(webDriver);
        pageFactoryInit(webDriver,this);
    }
}
