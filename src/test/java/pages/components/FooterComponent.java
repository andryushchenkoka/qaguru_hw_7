package pages.components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class FooterComponent {

    public void findUnitInFooter(String head, String value) {
        $x("//div[@class = 'footer-bottom']//p[contains(., '" + head + "')]").parent().shouldHave(text(value));
    }
}