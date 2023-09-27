 package com.alexi3rave;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;


 public class SteplAMBDATest {

    private static final String REPOSITORY = "alexi3rave/test";
    @Test
    public void testGitHub() {
step("Открываем главную страницу", () -> {
    open ("https://github.com/");
});
step("Найдем рпозиторий " + REPOSITORY, () -> {
    $(".search-input").click();
    $("#query-builder-test").setValue(REPOSITORY);
    $("#query-builder-test").pressEnter();
});
step("Перейдем в репозиторий " + REPOSITORY,() ->{
            $(By.linkText("alexi3rave/test")).click();
        });
step("Открываем папку GRADLE", () -> {
    $(By.partialLinkText("gradle")).click();
});
step("Найдем файл билд грэдл", () -> {
    $(By.linkText("build.gradle")).should(Condition.visible);
});

    }
}
