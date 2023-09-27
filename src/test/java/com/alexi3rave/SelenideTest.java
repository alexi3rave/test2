package com.alexi3rave;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class SelenideTest {
    @Test
    public void testGitHub() {
open ("https://github.com/");
$(".search-input").click();
$("#query-builder-test").setValue("alexi3rave/test");
$("#query-builder-test").pressEnter();
$(By.linkText("alexi3rave/test")).click();
$(By.partialLinkText("gradle")).click();
$(By.linkText("build.gradle")).should(Condition.visible);
    }
}
