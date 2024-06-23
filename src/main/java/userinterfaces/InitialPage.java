package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.automationexercise.com/")
public class InitialPage  extends PageObject {
    public static final Target REGISTRACION_PAGE = Target.the("Go to registration page")
            .located(By.xpath("//a[contains(text(), ' Signup / Login')]"));
    public static final Target EMAIL = Target.the("Insert the email").located(By.xpath("//input[@data-qa='signup-email']"));
    public static final Target NAME = Target.the("Insert the name").located(By.xpath("//input[@data-qa='signup-name']"));
    public static final Target SIGNUP_BUTTON = Target.the("Signup button").located(By.xpath("//button[@data-qa='signup-button']"));
}