package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_010Page;

public class tc_010Steps {
    tc_010Page page = new tc_010Page();

    @Given("que estoy autenticado en la aplicación")
    public void que_estoy_autenticado_en_la_aplicación() {
        page.navigateToHomePage();
        page.login();
    }

    @When("cargo un documento exitosamente")
    public void cargo_un_documento_exitosamente() {
        page.uploadDocument();
    }

    @Then("el sistema confirma la carga")
    public void el_sistema_confirma_la_carga() {
        Assert.assertTrue(page.isUploadConfirmed());
    }

    @When("cierro sesión")
    public void cierro_sesión() {
        page.logout();
    }

    @Then("el sistema cierra la sesión y solicita re-autenticación para nuevas acciones")
    public void el_sistema_cierra_la_sesión_y_solicita_re_autenticación_para_nuevas_acciones() {
        Assert.assertTrue(page.isReauthenticationRequested());
    }
}