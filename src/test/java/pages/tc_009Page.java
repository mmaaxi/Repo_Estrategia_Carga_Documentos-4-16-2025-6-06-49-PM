package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_009Page {
    WebDriver driver;

    By uploadButton = By.id("uploadBtn");
    By logSection = By.id("logSection");

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadDocument(String documentPath) {
        driver.findElement(uploadButton).sendKeys(documentPath);
        // Add wait and submit logic as needed
    }

    public boolean isUploadLoggedCorrectly() {
        // Logic to confirm the log includes a new entry about the document upload
        String logContent = driver.findElement(logSection).getText();
        return logContent.contains("Document uploaded successfully");
    }

    public boolean logContainsCorrectDetails() {
        // Logic to verify the log entry contains user, date, and status details
        String logContent = driver.findElement(logSection).getText();
        return logContent.contains("User:") && logContent.contains("Date:") && logContent.contains("Status:");
    }
}