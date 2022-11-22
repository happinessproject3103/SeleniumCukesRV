package Managers;

import PageObjects.LoginPage;
import PageObjects.Parent;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class PageObjectManager {

    private final WebDriver webDriver;
    private Parent homePage;
    private LoginPage loginPage;

    public PageObjectManager(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public Parent getHomePage() throws IOException {
        return (homePage == null) ? homePage = new Parent(webDriver) : homePage;
    }

    public LoginPage getLoginPage() throws IOException {

        if (loginPage == null) {
            loginPage = new LoginPage(webDriver);
        }
        return loginPage;
    }
}
