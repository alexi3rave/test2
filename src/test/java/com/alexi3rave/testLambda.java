 package com.alexi3rave;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Allure;
import io.qameta.allure.AllureLifecycle;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;


 public class testLambda {
AllureLifecycle lifecycle = Allure.getLifecycle();
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
lifecycle.addAttachment("Screenshot","image/png","png", takeSreenshot());
    }
    private byte[] takeSreenshot() {
        final WebDriver driver = WebDriverRunner.getWebDriver();
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }
}
