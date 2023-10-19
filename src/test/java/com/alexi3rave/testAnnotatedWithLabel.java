 package com.alexi3rave;

 import com.alexi3rave.steps.WebSteps;
 import io.qameta.allure.*;
 import org.junit.jupiter.api.DisplayName;
 import org.junit.jupiter.api.Test;


 public class testAnnotatedWithLabel extends TestBase {


     private static final String REPOSITORY = "alexi3rave/test";

     private WebSteps steps = new WebSteps();

     @Test
     @DisplayName("Аннотационный тест с разметкой")
     @Severity(SeverityLevel.BLOCKER)
     @Owner("Alex Brave")
     @Feature("Авторизация")
     @Story("Авторизация через E-mail")

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