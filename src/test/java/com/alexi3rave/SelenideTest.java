package com.alexi3rave;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;


public class SelenideTest extends TestBase {
    @Test
    public void testGitHub() {
        SelenideLogger.addListener("allure", new AllureSelenide());
open ("https://github.com/");
$(".search-input").click();
$("#query-builder-test").setValue("alexi3rave/test");
$("#query-builder-test").pressEnter();
$(By.linkText("alexi3rave/test")).click();
$(By.partialLinkText("gradle")).click();
$(By.linkText("build.gradle")).should(Condition.visible);
    }
}
