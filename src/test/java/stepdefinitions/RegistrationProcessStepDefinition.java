package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.DataModel;
import questions.VerifyMessage;
import tasks.InitiallyOpen;
import tasks.FillTheForm;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistrationProcessStepDefinition {
    @Given("^that (.*) wants to register in the page, he introduce the name and the email$")
    public void thatTheUserWantsToRegisterInThePageHeIntroduceTheNameAndTheEmail(String actor, List<DataModel> data) {
        theActorCalled(actor).wasAbleTo(InitiallyOpen.thePage(data));
    }
    @When("^the user is in the account information page he fills the information form$")
    public void theUserIsInTheAccountInformationPageHeFillsTheInformationForm(List<DataModel> data) {
        theActorInTheSpotlight().attemptsTo(FillTheForm.dataUser(data));
    }

    @Then("^Verify the text successful_process$")
    public void verifyTheTextSuccessful_process(List<DataModel> data) {
        theActorInTheSpotlight().should(seeThat(VerifyMessage.message(data.get(0).getSuccessful_process())));
    }
}
