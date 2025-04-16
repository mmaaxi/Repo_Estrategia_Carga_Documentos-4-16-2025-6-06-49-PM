package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_003Page;

public class tc_003Steps {
    tc_003Page page = new tc_003Page();

    @Given("el usuario está en la página de carga de documentos")
    public void elUsuarioEstaEnLaPaginaDeCargaDeDocumentos() {
        page.navigateToUploadPage();
    }

    @When("el usuario selecciona un documento que excede el tamaño máximo permitido")
    public void elUsuarioSeleccionaUnDocumentoQueExcedeElTamañoMaximoPermitido() {
        page.selectLargeFile();
    }

    @Then("el sistema debe mostrar un mensaje de error indicando que el tamaño del archivo es excesivo")
    public void elSistemaDebeMostrarUnMensajeDeErrorIndicandoQueElTamanoDelArchivoEsExcesivo() {
        Assert.assertTrue(page.isErrorMessageDisplayed());
    }

    @Given("el usuario ha recibido el mensaje de error por tamaño excedido")
    public void elUsuarioHaRecibidoElMensajeDeErrorPorTamañoExcedido() {
        elUsuarioSeleccionaUnDocumentoQueExcedeElTamañoMaximoPermitido();
        elSistemaDebeMostrarUnMensajeDeErrorIndicandoQueElTamanoDelArchivoEsExcesivo();
    }

    @When("el usuario intenta cargar dicho documento")
    public void elUsuarioIntentaCargarDichoDocumento() {
        page.attemptToUploadFile();
    }

    @Then("el sistema debe rechazar la carga y no procesar el documento")
    public void elSistemaDebeRechazarLaCargaYNoProcesarElDocumento() {
        Assert.assertFalse(page.isFileProcessed());
    }
}