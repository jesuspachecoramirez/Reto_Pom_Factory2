package co.com.sofkla.orange.page;


import co.com.sofkla.orange.model.payGradeModel;
import co.com.sofkla.orange.util.infoDates;
import org.openqa.selenium.WebDriver;



public class payGradeActions extends payGradePage {
    public WebDriver webDriver;

    payGradeModel model;



    public payGradeActions(WebDriver webDriver) {
        super(webDriver);

    }

    public void intoPayGrade(){
        click(admin);
        click(job);
        click(paygrades);
        scrollOn(add);
        click(add);

    }

    public void currencyInfo(){
        model = infoDates.generateDates();
        scrollOn(title);
        type(title, model.getTitle());
        click(save);
        scrollOn(addCur);
        click(addCur);
        scrollOn(curName);
        type(curName,model.getMoney());
        enter(curName);
        scrollOn(minSalary);
        type(minSalary, model.getMinSalary());
        scrollOn(maxSalary);
        type(maxSalary, model.getMaxSalary());
        click(saveCur);


    }


    public void confirmCurrency(){
        scrollOn(back);
        click(back);

    }



}
