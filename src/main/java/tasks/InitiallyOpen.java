package tasks;

import models.DataModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import userinterfaces.InitialPage;

import java.util.List;

import static userinterfaces.InitialPage.*;

public class InitiallyOpen implements Task {
    private static String email, name;
    InitialPage initialPage;

    public static Performable thePage(List<DataModel> data) {
        name = data.get(0).getName();
        email = data.get(0).getEmail();
        return Tasks.instrumented(InitiallyOpen.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(this.initialPage),
                Click.on(REGISTRACION_PAGE),
                Enter.theValue(name).into(NAME),
                Enter.theValue(email).into(EMAIL),
                Click.on(SIGNUP_BUTTON)
        );
    }
}