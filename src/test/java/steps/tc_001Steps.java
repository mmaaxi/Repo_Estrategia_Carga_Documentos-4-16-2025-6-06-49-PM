package steps;

import pages.tc_001Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.testng.Assert.assertTrue;

public class tc_001Steps {

    tc_001Page page = new tc_001Page();

    @Given("^que el usuario ha seleccionado un documento en formato permitido$")
    public void seleccionarDocumento() {
        page.seleccionarDocumento();
    }

    @When("^el usuario hace clic en el botón 'Cargar'$")
    public void clicBotonCargar() {
        page.clicCargar();
    }

    @Then("^el documento se carga exitosamente y se muestra una confirmación$")
    public void verificarConfirmacionCarga() {
        assertTrue(page.verificarConfirmacionCarga(), "La confirmación de carga no se muestra.");
    }

    @Then("^el documento aparece en el listado de documentos cargados$")
    public void verificarDocumentoListado() {
        assertTrue(page.verificarDocumentoListado(), "El documento no aparece en el listado.");
    }
}