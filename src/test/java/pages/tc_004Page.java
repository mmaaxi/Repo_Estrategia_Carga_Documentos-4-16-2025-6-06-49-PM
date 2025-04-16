package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc_004Page {

    private WebDriver driver;

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "username")
    private WebElement inputUsuario;

    @FindBy(id = "password")
    private WebElement inputContrasena;

    @FindBy(id = "loginButton")
    private WebElement botonIniciarSesion;

    @FindBy(id = "errorMessage")
    private WebElement mensajeError;

    public boolean esPaginaDeLogin() {
        return driver.getCurrentUrl().contains("login");
    }

    public void ingresarCredenciales(String usuario, String contrasena) {
        inputUsuario.sendKeys(usuario);
        inputContrasena.sendKeys(contrasena);
    }

    public void enviarFormulario() {
        botonIniciarSesion.click();
    }

    public boolean esVisibleMensajeErrorDeAutenticacion() {
        return mensajeError.isDisplayed();
    }
}