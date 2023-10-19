package com.alexi3rave;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {


    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1200";
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
    }
}