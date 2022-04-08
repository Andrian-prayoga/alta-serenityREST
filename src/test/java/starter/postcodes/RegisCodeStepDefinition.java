package starter.postcodes;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisCodeStepDefinition {
    @Given("user is on resgistration page")
    public void onregistrationPage(){
        System.out.println("registration page");
    }

    @And("user input email data")
    public void userInputEmailData(){
        System.out.println("input email");
    }

    @And("user input password data")
    public void userInputPasswordData(){
        System.out.println("input password");
    }

    @And("user input address data")
    public void userInputAddressData(){
        System.out.println("input alamat");
    }

    @When("user click register button")
    public void clickRegisterButton() {
        System.out.println("click register button");
    }

    @When("user click register with google")
    public void registerWithGoogle() {
        System.out.println("click register with google button");
    }

    @When("user click register with facebook")
    public void registerWithFacebook() {
        System.out.println("click register with facebook button");
    }

    @Then("user should be redirected to homepage")
    public void redirectedtoHomepage(){
        System.out.println("welcome to your homepage");
    }

    @Then("user should be able to see warning message")
    public void warningMessage(){
        System.out.println("your data incomplete!");
    }

    @Then("user should redirected to google page")
    public void googlePage(){
        System.out.println("redirected google page");
    }

    @Then("user should redirected to facebook page")
    public void facebookPage(){
        System.out.println("redirected google page");
    }


}
