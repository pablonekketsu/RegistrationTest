package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.AccountCreatePage.ACCOUNT_CREATED_MESSAGE;

public class VerifyMessage implements Question<Boolean> {
    static String message;

    public static Question<Boolean> message(String successfulProcess) {
        message = successfulProcess;
        return new VerifyMessage();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        System.out.println(message);
        System.out.println(ACCOUNT_CREATED_MESSAGE.resolveFor(actor).getText());
        return message.equals(ACCOUNT_CREATED_MESSAGE.resolveFor(actor).getText());
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }
}
