package tasks;

import models.DataModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import org.openqa.selenium.Keys;

import java.util.List;

import static userinterfaces.FormPage.*;

public class FillTheForm implements Task {
    private static String  password,firstName,lastName,company
            ,address,state ,city,zip,number;

    public static Performable dataUser(List<DataModel> data) {
        firstName = data.get(0).getFirst_name();
        lastName = data.get(0).getLast_name();
        password= data.get(0).getPassword();
        company=data.get(0).getCompany();
        address=data.get(0).getAddress();
        state=data.get(0).getState();
        city=data.get(0).getCity();
        zip = data.get(0).getZip();
        number = data.get(0).getNumber();
        return Tasks.instrumented(FillTheForm.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(GENDER),
                Enter.theValue(password).into(PASSWORD),
                Scroll.to(DAY),
                Click.on(DAY),
                Enter.keyValues(Keys.DOWN).into(DAY),
                Click.on(MONTH),
                Enter.keyValues(Keys.DOWN).into(MONTH),
                Click.on(YEAR),
                Enter.keyValues(Keys.DOWN).into(YEAR),
                Click.on(NEWSLETTER),
                Click.on(OFFERS),
                Enter.theValue(firstName).into(FIRST_NAME),
                Enter.theValue(lastName).into(LAST_NAME),
                Enter.theValue(company).into(COMPANY),
                Enter.theValue(address).into(ADDRESS),
                Scroll.to(COUNTRY),
                Click.on(COUNTRY),
                Enter.keyValues(Keys.DOWN).into(COUNTRY),
                Enter.theValue(state).into(STATE),
                Enter.theValue(city).into(CITY),
                Enter.theValue(zip).into(ZIP),
                Enter.theValue(number).into(NUMBER),
                Click.on(CREATE_ACCOUNT_BUTTON)
        );
    }
}
