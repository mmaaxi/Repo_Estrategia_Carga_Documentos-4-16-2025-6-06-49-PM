package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_003Page {
    WebDriver driver;
    WebDriverWait wait;

    By uploadButton = By.id("uploadInput");
    By errorMessage = By.id("errorMessage");
    By processButton = By.id("processButton");
    By processedConfirmation = By.id("processedConfirmation");

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void selectLargeFile() {
        WebElement uploadElement = driver.findElement(uploadButton);
        uploadElement.sendKeys("/path/to/large/file.txt");
    }

    public boolean isErrorMessageDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
        return driver.findElement(errorMessage).isDisplayed();
    }

    public void attemptToUploadFile() {
        driver.findElement(processButton).click();
    }

    public boolean isFileProcessed() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(processedConfirmation));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}