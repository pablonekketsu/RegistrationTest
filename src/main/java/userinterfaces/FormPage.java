package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormPage {
    public static final Target GENDER = Target.the("Select the Gender").located(By.id("id_gender1"));
    public static final Target PASSWORD = Target.the("Enter the password").located(By.id("password"));
    public static final Target DAY = Target.the("Select the day").located(By.id("days"));
    public static final Target MONTH = Target.the("Select the month").located(By.id("months"));
    public static final Target YEAR = Target.the("Select the year").located(By.id("years"));
    public static final Target NEWSLETTER = Target.the("Select the newsletter").located(By.id("newsletter"));
    public static final Target OFFERS = Target.the("Select the name").located(By.id("optin"));
    public static final Target FIRST_NAME = Target.the("Enter the first name").located(By.id("first_name"));
    public static final Target LAST_NAME = Target.the("Enter the lastname").located(By.id("last_name"));
    public static final Target COMPANY = Target.the("Enter the company name").located(By.id("company"));
    public static final Target ADDRESS = Target.the("Enter the address").located(By.id("address1"));
    public static final Target COUNTRY = Target.the("Enter the country").located(By.id("country"));
    public static final Target STATE = Target.the("Enter the state").located(By.id("state"));
    public static final Target CITY = Target.the("Enter the city").located(By.id("city"));
    public static final Target ZIP = Target.the("Enter the zip").located(By.id("zipcode"));
    public static final Target NUMBER = Target.the("Enter the phone number").located(By.id("mobile_number"));
    public static final Target CREATE_ACCOUNT_BUTTON = Target.the("Click on create account button").located(By.xpath("//button[@data-qa='create-account']"));
}
