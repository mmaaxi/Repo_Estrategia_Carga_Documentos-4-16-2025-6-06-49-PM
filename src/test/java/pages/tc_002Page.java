package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_002Page {

    WebDriver driver;

    By uploadInput = By.id("upload-input");
    By errorMessage = By.id("error-message");
    By uploadButton = By.id("upload-button");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void selectUnsupportedFile() {
        driver.findElement(uploadInput).sendKeys("path/to/unsupported_file.format");
    }

    public boolean isErrorMessageDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }

    public void attemptToUpload() {
        driver.findElement(uploadButton).click();
    }

    public boolean isUploadBlocked() {
        // Assuming the presence of an error message indicates the upload was blocked
        return isErrorMessageDisplayed();
    }
}