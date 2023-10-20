package com.alexi3rave;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@Tag("remote")
@Disabled
public class ParametersTest extends TestBase {

    @DisplayName("Проверка города")
    @ParameterizedTest(name = "{displayName} {0}")
    @ValueSource (strings = {"Москва", "Таганрог", "Прочие города"})
public void parametersTest(String city) {
        Allure.parameter("Город", city);
    }
}

