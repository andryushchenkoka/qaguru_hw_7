package tests;

import pages.MacPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class HeaderTest extends TestBase {

    @CsvFileSource(resources = "/headerUnits.csv")
    @ParameterizedTest(name = "Меню в хедере содержит раздел {0}")
    @Tag("HEADER")
    public void headerContainsUnit(String value) {
        new MacPage()
                .openPage()
                .headerContainsUnit(value);
    }
}