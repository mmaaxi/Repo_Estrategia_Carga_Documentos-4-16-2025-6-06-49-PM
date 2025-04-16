package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_002Page;

public class tc_002Steps {

    tc_002Page uploadPage = new tc_002Page();

    @Given("I am on the document upload page")
    public void i_am_on_the_document_upload_page() {
        uploadPage.navigateToUploadPage();
    }

    @When("I select an unsupported file format")
    public void i_select_an_unsupported_file_format() {
        uploadPage.selectUnsupportedFile();
    }
    
    @Then("the system should reject the file and display an error message")
    public void the_system_should_reject_the_file_and_display_an_error_message() {
        Assert.assertTrue(uploadPage.isErrorMessageDisplayed());
    }

    @When("I attempt to upload the document")
    public void i_attempt_to_upload_the_document() {
        uploadPage.attemptToUpload();
    }
    
    @Then("the upload should be blocked and inform the user about the unsupported format")
    public void the_upload_should_be_blocked_and_inform_the_user_about_the_unsupported_format() {
        Assert.assertTrue(uploadPage.isUploadBlocked());
    }
}