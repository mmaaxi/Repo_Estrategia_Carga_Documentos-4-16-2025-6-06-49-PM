package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.Tc007Page;

public class Tc007Steps {
    WebDriver driver;
    Tc007Page tc007Page;
    
    @Given("^I select a medium-sized document$")
    public void selectMediumSizedDocument() {
        tc007Page = new Tc007Page(driver);
        tc007Page.selectDocument();
    }

    @When("^I measure the time until the upload confirmation$")
    public void measureUploadResponseTime() {
        tc007Page.measureUploadTime();
    }

    @Then("^The response time is within the acceptable limit$")
    public void verifyResponseTime() {
        tc007Page.assertResponseTime();
    }
}