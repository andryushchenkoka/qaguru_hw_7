package pages;

import pages.components.FooterComponent;
import pages.components.HeaderComponent;

import static com.codeborne.selenide.Selenide.open;

public class MacPage {

    private final String RELATIVE_URL = "apple-mac/";

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
}