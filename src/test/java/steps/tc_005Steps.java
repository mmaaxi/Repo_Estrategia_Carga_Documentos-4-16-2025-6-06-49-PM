package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_005Page;

public class tc_005Steps {
    private WebDriver driver;
    private tc_005Page page;

    @Given("el usuario accede al sistema desde un dispositivo móvil")
    public void el_usuario_accede_al_sistema_desde_un_dispositivo_móvil() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        // Configuramos el navegador para emular un dispositivo móvil
        page = new tc_005Page(driver);
        page.openMobileVersion();
    }

    @Then("el sistema adapta la interfaz para móviles")
    public void el_sistema_adapta_la_interfaz_para_móviles() {
        page.verifyMobileInterface();
    }

    @When("el usuario selecciona y carga un documento")
    public void el_usuario_selecciona_y_carga_un_documento() {
        page.uploadDocument("path/to/document");
    }

    @Then("el documento se carga correctamente y se muestra la confirmación")
    public void el_documento_se_carga_correctamente_y_se_muestra_la_confirmación() {
        page.verifyUploadSuccess();
        driver.quit();
    }
}