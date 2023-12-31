 package com.alexi3rave;

import org.junit.jupiter.api.Test;
import com.alexi3rave.steps.WebSteps;


 public class SteplAnnotatedTest {

     private static final String REPOSITORY = "alexi3rave/test";

     private WebSteps steps = new WebSteps();

     @Test
     public void testGitHub() {
         steps.OpenMainPage();
         steps.FindRepository(REPOSITORY);
         steps.GoToRepository(REPOSITORY);
         steps.OpenGradleFolder();
         steps.FindGradleFile();
     }
 }
