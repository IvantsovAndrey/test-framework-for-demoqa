package framework.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CheckboxPage {

    private final SelenideElement toggleButton = $("[aria-label='Toggle']");
    private final SelenideElement result = $("#result");

    public void expandAll() {
        toggleButton.click();
    }

    public void clickCheckbox(String checkboxText) {
        $x("//span[text()='" + checkboxText + "']").click();
    }

    public void checkCheckboxSelected(String checkboxText) {
        $x("//span[text()='" + checkboxText + "']/ancestor::label//input")
                .shouldHave(Condition.attribute("checked"));
    }

    public void checkCheckboxNotSelected(String checkboxText) {
        $x("//span[text()='" + checkboxText + "']/ancestor::label//input")
                .shouldNotHave(Condition.attribute("checked"));
    }

    public void checkResultTextContains(String expectedText) {
        result.shouldHave(Condition.text(expectedText));
    }


}
