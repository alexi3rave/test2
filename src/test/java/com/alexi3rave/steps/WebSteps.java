package com.alexi3rave.steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebSteps {

    @Step("Открыть главную страницу")
    public void OpenMainPage() {

    open ("https://github.com/");
}
    @Step("Найти репозиторий {repository}")
    public void FindRepository(String repository) {
        $(".search-input").click();
        $("#query-builder-test").setValue(repository);
        $("#query-builder-test").pressEnter();
    }
    @Step("Перейти в репозиторий {repository}")
    public void GoToRepository(String repository) {
        $(By.linkText("alexi3rave/test")).click();
    }

   @Step("Открыть папку GRADLE")
    public void OpenGradleFolder() {
       $(By.partialLinkText("gradle")).click();
    }
   @Step("Найти build.gradle")
    public void FindGradleFile() {
       $(By.linkText("build.gradle")).should(Condition.visible);
    }

}
