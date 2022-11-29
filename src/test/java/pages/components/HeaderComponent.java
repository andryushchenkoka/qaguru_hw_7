package pages.components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class HeaderComponent {

    public void findUnitInHeader(String value) {
        $(".main-menu").shouldHave(text(value));
    }
}