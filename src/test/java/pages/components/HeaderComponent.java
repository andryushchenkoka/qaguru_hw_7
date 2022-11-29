package pages.components;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HeaderComponent {

    private final static SelenideElement MAIN_MENU = $(".main-menu");
    private final static ElementsCollection MINI_MENU = $$(".mini-item");
    public void findUnitInHeader(String value) {
        MAIN_MENU.shouldHave(text(value));
    }

    public void findUnitsInMinuMenu(List<String> units){
        MINI_MENU.filter(visible).shouldHave(CollectionCondition.texts(units));
    }
}