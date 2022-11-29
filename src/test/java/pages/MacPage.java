package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.FooterComponent;
import pages.components.HeaderComponent;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class MacPage {

    private final String RELATIVE_URL = "apple-mac/";

    private final SelenideElement RAM_FILTER_BLOCK = $x("//span[text()[contains(.,'оперативной памяти')]]"),
            ACCEPT_BUTTON = $("#submit_filters_btn");
    HeaderComponent headerComponent = new HeaderComponent();
    FooterComponent footerComponent = new FooterComponent();

    public MacPage openPage() {
        open(RELATIVE_URL);

        return this;
    }

    public MacPage headerContainsUnit(String value) {
        headerComponent.findUnitInHeader(value);

        return this;
    }

    public MacPage footerContainsUnit(String head, String unit) {
        footerComponent.findUnitInFooter(head, unit);

        return this;
    }

    public MacPage setRamFilter(int value) {
        RAM_FILTER_BLOCK.parent().scrollTo();
        RAM_FILTER_BLOCK.parent().$(withText(value + "")).click();

        return this;
    }

    public MacPage acceptFilter() {
        ACCEPT_BUTTON.click();

        return this;
    }
}