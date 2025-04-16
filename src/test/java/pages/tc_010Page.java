package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc_010Page {
    WebDriver driver = new ChromeDriver();

    By uploadButton = By.id("uploadButton");
    By confirmationMessage = By.id("confirmationMessage");
    By logoutButton = By.id("logoutButton");
    By loginPage = By.id("loginPage");

    public void navigateToHomePage() {
        driver.get("http://application-url.com");
    }

    public void login() {
        // Add login logic here, such as entering username and password
    }

    public void uploadDocument() {
        driver.findElement(uploadButton).click();
        // Handle file selection and upload process
    }

    public boolean isUploadConfirmed() {
        return driver.findElement(confirmationMessage).isDisplayed();
    }

    public void logout() {
        driver.findElement(logoutButton).click();
    }

    public boolean isReauthenticationRequested() {
        return driver.findElement(loginPage).isDisplayed();
    }

    public void closeBrowser() {
        driver.quit();
    }
}