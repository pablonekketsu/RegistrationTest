package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AccountCreatePage {
    public static final Target ACCOUNT_CREATED_MESSAGE = Target.the("Message of account created").located(By.xpath("//h2[@data-qa='account-created']"));
}
