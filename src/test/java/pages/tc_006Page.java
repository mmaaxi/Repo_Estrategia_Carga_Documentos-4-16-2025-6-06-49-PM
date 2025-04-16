package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_006Page {
    private WebDriver driver;
    private By loadFunctionality = By.id("loadFunctionality");
    private By uploadButton = By.id("uploadButton");
    private By uploadSuccessMessage = By.id("uploadSuccess");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToSystem() {
        driver.get("https://example.com");
    }

    public boolean isLoadFunctionalityVisible() {
        WebElement element = driver.findElement(loadFunctionality);
        return element.isDisplayed();
    }

    public void uploadDocument() {
        WebElement uploadBtn = driver.findElement(uploadButton);
        uploadBtn.click(); // Assumes a file is set to upload programmatically or through HTML
    }

    public boolean isDocumentUploadedSuccessfully() {
        WebElement successMessage = driver.findElement(uploadSuccessMessage);
        return successMessage.isDisplayed();
    }
}