package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_004Page;

import static org.junit.Assert.assertTrue;

public class tc_004Steps {

    private WebDriver driver;
    private tc_004Page page;

    public tc_004Steps() {
        this.driver = Hooks.getDriver();
        this.page = PageFactory.initElements(driver, tc_004Page.class);
    }

    @Given("^el usuario intenta acceder a la carga de funcionalidades sin autenticarse$")
    public void accederSinAutenticacion() {
        driver.get("http://example.com/funcionalidad");
    }

    @Then("^el sistema redirige al usuario a la página de login$")
    public void verificarRedireccionLogin() {
        assertTrue(page.esPaginaDeLogin());
    }

    @Given("^el usuario está en la página de login$")
    public void navegarPaginaDeLogin() {
        driver.get("http://example.com/login");
    }

    @When("^el usuario ingresa credenciales incorrectas$")
    public void ingresarCredencialesIncorrectas() {
        page.ingresarCredenciales("usuario_falso", "contraseña_incorrecta");
        page.enviarFormulario();
    }

    @Then("^el sistema muestra un mensaje de error de autenticación$")
    public void verificarMensajeDeError() {
        assertTrue(page.esVisibleMensajeErrorDeAutenticacion());
    }
}