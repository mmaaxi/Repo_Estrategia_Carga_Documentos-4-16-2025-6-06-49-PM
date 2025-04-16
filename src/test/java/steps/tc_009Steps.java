package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_009Page;
import static org.junit.Assert.assertTrue;

public class tc_009Steps {
    WebDriver driver = new ChromeDriver();
    tc_009Page page = new tc_009Page(driver);

    @Given("^el usuario está en la página de carga de documentos$")
    public void usuarioEnPaginaDeCarga() {
        page.navigateToUploadPage();
    }

    @When("^el usuario sube un documento$")
    public void usuarioSubeDocumento() {
        page.uploadDocument("/path/to/document");
    }

    @Then("^el sistema debe registrar la actividad de la carga en el log$")
    public void verificarRegistroEnLog() {
        assertTrue(page.isUploadLoggedCorrectly());
    }

    @Then("^el log debe contener detalles como usuario, fecha y estado de la carga$")
    public void verificarDetallesDelLog() {
        assertTrue(page.logContainsCorrectDetails());
    }
}