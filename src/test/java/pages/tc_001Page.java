package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;

public class tc_001Page {

    WebDriver driver;

    @FindBy(id = "inputDocument")
    WebElement inputDocument;

    @FindBy(id = "btnCargar")
    WebElement btnCargar;

    @FindBy(id = "confirmationMessage")
    WebElement confirmationMessage;

    @FindBy(id = "documentListado")
    WebElement documentListado;

    public tc_001Page() {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void seleccionarDocumento() {
        inputDocument.sendKeys("ruta/del/documento/permitido.pdf");
    }

    public void clicCargar() {
        btnCargar.click();
    }

    public boolean verificarConfirmacionCarga() {
        return confirmationMessage.isDisplayed();
    }

    public boolean verificarDocumentoListado() {
        return documentListado.getText().contains("documento_permitido.pdf");
    }
}