 package com.alexi3rave;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;


 public class SteplAMBDATest extends TestBase {

    private static final String REPOSITORY = "alexi3rave/test";
    @Test
    public void testGitHub() {
step("Open main page", () -> {
    open ("https://github.com/");
});
step("Find repository " + REPOSITORY, () -> {
    $(".search-input").click();
    $("#query-builder-test").setValue(REPOSITORY);
    $("#query-builder-test").pressEnter();
});
step("Go to repository " + REPOSITORY,() ->{
            $(By.linkText("alexi3rave/test")).click();
        });
step("Open GRADLE folder", () -> {
    $(By.partialLinkText("gradle")).click();
});
step("Find build.gradle file", () -> {
    $(By.linkText("build.gradle")).should(Condition.visible);
});

    }
}
