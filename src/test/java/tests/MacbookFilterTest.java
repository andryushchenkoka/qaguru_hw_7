package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.MacPage;

public class MacbookFilterTest extends TestBase {

    @ValueSource(ints = {
            8, 16, 32, 64
    })
    @ParameterizedTest(name = "Применение фильтра {0} ГБ ОЗУ для macbook")
    @Tags({@Tag("FILTER"), @Tag("MACBOOK")})
    public void successfulRamFilter(int ram) {
        new MacPage()
                .openPage()
                .setRamFilter(ram)
                .acceptFilter();
    }
}
