package tests;

import pages.MacPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FooterTest extends TestBase{

    @CsvSource({
            "О компании, Услуги",
            "Помощь, Гарантии",
            "Каталог, iPhone",
            "Услуги, Сервисные центры"
    })
    @ParameterizedTest(name = "Наличие раздела {1} в блоке {0} футера страницы")
    @Tag("FOOTER")
    public void footerContainsUnits(String head, String value){
        new MacPage()
            .openPage()
            .findUnitInFooter(head, value);
    }
}