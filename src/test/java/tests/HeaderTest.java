package tests;

import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pages.MacPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.List;
import java.util.stream.Stream;

public class HeaderTest extends TestBase {

    @CsvFileSource(resources = "/headerUnits.csv")
    @ParameterizedTest(name = "Меню в хедере содержит раздел {0}")
    @Tag("HEADER")
    public void headerContainsUnit(String value) {
        new MacPage()
                .openPage()
                .headerContainsUnit(value);
    }

    static Stream<Arguments> miniMenuContainsUnits(){
        return Stream.of(
                Arguments.of(List.of("Магазины", "Сервисные центры", "Для бизнеса", "Оплата и доставка", "Блог"))
        );
    }

    @MethodSource
    @ParameterizedTest(name = "Наличие в мини-меню хедера разделов из списка: {0}")
    @Tag("HEADER")
    public void miniMenuContainsUnits(List<String> values){
        new MacPage()
                .openPage()
                .miniMenuContainsUnits(values);
    }
}