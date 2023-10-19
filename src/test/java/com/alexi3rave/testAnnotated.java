 package com.alexi3rave;

 import com.alexi3rave.steps.WebSteps;
 import com.codeborne.selenide.WebDriverRunner;
 import com.codeborne.selenide.impl.Screenshot;
 import io.qameta.allure.Attachment;
 import org.junit.jupiter.api.Test;
 import org.openqa.selenium.OutputType;
 import org.openqa.selenium.TakesScreenshot;
 import org.openqa.selenium.WebDriver;


 public class testAnnotated extends TestBase {

     private static final String REPOSITORY = "alexi3rave/test";

     private WebSteps steps = new WebSteps();

     @Test
     public void testGitHub() {
         steps.OpenMainPage();
         steps.takeSreenshot();
         steps.FindRepository(REPOSITORY);
         steps.takeSreenshot();
         steps.GoToRepository(REPOSITORY);
         steps.takeSreenshot();
         steps.OpenGradleFolder();
         steps.takeSreenshot();
         steps.FindGradleFile();
         steps.takeSreenshot();
     }


 }