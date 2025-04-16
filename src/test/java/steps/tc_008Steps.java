package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_008Page;

public class tc_008Steps {
    tc_008Page page = new tc_008Page();

    @Given("el usuario navega a la página de carga")
    public void elUsuarioNavegaALaPaginaDeCarga() {
        page.navegarAPaginaDeCarga();
    }

    @When("se simula una desconexión de red")
    public void seSimulaUnaDesconexionDeRed() {
        page.simularDesconexionDeRed();
    }

    @Then("el sistema detecta la interrupción")
    public void elSistemaDetectaLaInterrupcion() {
        page.verificarDeteccionDeInterrupcion();
    }

    @Given("el usuario está en la página de carga con error de red")
    public void elUsuarioEstaEnLaPaginaDeCargaConErrorDeRed() {
        page.navegarConErrorDeRed();
    }

    @When("el usuario intenta reintentar la carga")
    public void elUsuarioIntentaReintentarLaCarga() {
        page.intentarReintentarCarga();
    }

    @Then("el sistema ofrece opción de reintento")
    public void elSistemaOfreceOpcionDeReintento() {
        page.verificarOpcionDeReintento();
    }

    @Then("muestra un mensaje de error adecuado si falla nuevamente")
    public void muestraUnMensajeDeErrorAdecuadoSiFallaNuevamente() {
        page.verificarMensajeDeErrorAdecuado();
    }
}