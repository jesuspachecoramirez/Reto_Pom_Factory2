package co.com.sofkla.orange.util;

import co.com.sofkla.orange.model.payGradeModel;
import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.Random;

public class infoDates {

    public static final String SPANISH_CODE_LANGUAGE = "es";
    public static final String COUNTRY_CODE = "CO";



    public static payGradeModel generateDates(){

        Faker faker =  Faker.instance(
                new Locale(SPANISH_CODE_LANGUAGE, COUNTRY_CODE),
                new Random()
        );

        payGradeModel dates = new payGradeModel();
        dates.setTitle(faker.pokemon().name());
        dates.setMoney(faker.country().currencyCode());
        dates.setMinSalary(String.valueOf(faker.number().numberBetween(800000, 1200000)));
        dates.setMaxSalary(String.valueOf(faker.number().numberBetween(1200001, 2000000)));

        return dates;
    }
}
