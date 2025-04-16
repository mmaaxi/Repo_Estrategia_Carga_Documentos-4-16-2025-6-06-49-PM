package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class tc_005Page {
    private WebDriver driver;
    private By uploadButton = By.id("uploadButton");
    private By successMessage = By.id("successMessage");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openMobileVersion() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=375,812"); // Emulate a mobile device screen size
        driver = new ChromeDriver(options);
        driver.get("http://example.com");
    }

    public void verifyMobileInterface() {
        // Implement logic to check if mobile interface is loaded
    }

    public void uploadDocument(String filePath) {
        driver.findElement(uploadButton).sendKeys(filePath);
    }

    public void verifyUploadSuccess() {
        boolean isDisplayed = driver.findElement(successMessage).isDisplayed();
        if (!isDisplayed) {
            throw new AssertionError("Upload success message not displayed.");
        }
    }
}