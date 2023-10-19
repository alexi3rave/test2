package SimpeForJenkins;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
@Tag("simple")
public class NegativeTests {

    @Test
    void test1() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        assertTrue(false);
    }
    @Test
    void test2() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        assertTrue(false);
    }
    @Test
    void test3() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        assertTrue(false);
    }
    @Test
    void test4() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        assertTrue(false);
    }
}
