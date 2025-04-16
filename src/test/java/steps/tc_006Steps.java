package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.tc_006Page;

public class tc_006Steps {
    WebDriver driver;
    tc_006Page page;

    @Given("el usuario abre el navegador {string}")
    public void el_usuario_abre_el_navegador(String navegador) {
        switch (navegador) {
            case "Chrome":
                driver = new ChromeDriver();
                break;
            case "Firefox":
                driver = new FirefoxDriver();
                break;
            case "Edge":
                driver = new EdgeDriver();
                break;
        }
        page = new tc_006Page(driver);
    }

    @When("el usuario accede al sistema")
    public void el_usuario_accede_al_sistema() {
        page.navigateToSystem();
    }

    @Then("la funcionalidad de carga se visualiza correctamente")
    public void la_funcionalidad_de_carga_se_visualiza_correctamente() {
        Assert.assertTrue("La funcionalidad de carga no se visualiza correctamente",
                page.isLoadFunctionalityVisible());
    }

    @When("el usuario carga un documento")
    public void el_usuario_carga_un_documento() {
        page.uploadDocument();
    }

    @Then("el sistema procesa la carga sin errores")
    public void el_sistema_procesa_la_carga_sin_errores() {
        Assert.assertTrue("El sistema no procesa la carga sin errores",
                page.isDocumentUploadedSuccessfully());
        driver.quit();
    }
}