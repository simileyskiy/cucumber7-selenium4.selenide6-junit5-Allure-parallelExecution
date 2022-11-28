package org.example.simileyskiy.hooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Screenshots;
import io.cucumber.java.*;
import io.qameta.allure.Allure;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Objects;


public class Hook {

    @Before
    public void setUp() {
        Configuration.browserSize = "1920x1080";
//        Configuration.headless = true;
    }



    @AfterStep
    public void addScreenshotOnFailed(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                Allure.addAttachment("Failed step", new FileInputStream(Objects.requireNonNull(Screenshots.takeScreenShotAsFile())));
            } catch (FileNotFoundException fileNotFoundException) {
                System.out.println("Fail add screenShot: " + fileNotFoundException.getMessage());
            }
        }
    }

//    @AfterEach
//    public void tearDown() {
//        System.out.println("Tests ended");
//        try {
//            getWebDriver().quit();
//        } catch (Exception ignored) {
//        }
////        driver.quit();
//    }

//    @AfterAll
//    public static void end() {
//        System.out.println("All the tests are executed");
//
//    }
}
