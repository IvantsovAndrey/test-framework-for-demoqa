package framework.pages;

import com.codeborne.selenide.Selenide;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public void openPage(String url) {
        Selenide.open(url);
    }

    public void login(String fullName, String email, String currentAddress, String permanentAddress) {
        $(byId("userName")).setValue(fullName);
        $(byId("userEmail")).setValue(email);
        $(byId("currentAddress")).setValue(currentAddress);
        $(byId("permanentAddress")).setValue(permanentAddress);
        $(byId("submit")).click();
    }

    public String getErrorMessage() {
       // return $(byClassName("mr-sm-2 field-error form-control")).getText();
        return $(byId("userEmail")).getText();
    }
}
