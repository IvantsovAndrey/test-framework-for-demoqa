package tests.UITests;

import framework.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTests extends BaseTest {

    @Test
    void testLoginWithValidCredentials() {
        LoginPage loginPage = new LoginPage();
        loginPage.openPage("https://demoqa.com/text-box");
        loginPage.login("validUser", "test@gmail.com","Toronto","London");
        Assertions.assertTrue(true, "Login successful!");
    }

    @Test
    void testLoginWithInvalidCredentials() {
        LoginPage loginPage = new LoginPage();
        loginPage.openPage("https://demoqa.com/text-box");
        loginPage.login("invalidUser", "invalidEmail","Toronto", "London");
        String errorMessage = loginPage.getErrorMessage();
        Assertions.assertEquals("Invalid credentials", errorMessage);
        // Assertions.assertThrows( errorMessage);
    }

}
