package tests.UITests;

import framework.pages.CheckboxPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class CheckboxTests extends BaseTest {
    @Test
    void testCheckBoxSelection() {
        CheckboxPage checkboxPage = new CheckboxPage();
        open("https://demoqa.com/checkbox");

        // развернуть тогл
        checkboxPage.expandAll();
        // отметить чекбокс "Desktop"
        checkboxPage.clickCheckbox("Desktop");
        // проверить что чекбокс выбран
        checkboxPage.checkCheckboxSelected("Desktop");
        // проверить текст результата
        checkboxPage.checkResultTextContains("""
                desktop
                notes
                commands""");
        // снять отметку с чекбокса "Desktop"
        checkboxPage.clickCheckbox("Desktop");
        // проверить что отметка снята с "Desktop"
        checkboxPage.checkCheckboxNotSelected("Desktop");
    }
}


