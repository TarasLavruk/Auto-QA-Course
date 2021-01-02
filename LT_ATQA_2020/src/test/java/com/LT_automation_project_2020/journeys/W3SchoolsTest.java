package com.LT_automation_project_2020.journeys;

import com.LT_automation_project_2020.BaseTest;
import com.LT_automation_project_2020.listeners.TestListener;
import com.LT_automation_project_2020.pages.HomePage;
import com.LT_automation_project_2020.pages.W3SchoolsExercisesPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class W3SchoolsTest extends BaseTest {

    private HomePage homePage;
    private W3SchoolsExercisesPage w3SchoolsExercisesPage;

    @BeforeMethod(alwaysRun = true)
    public void setupTest() {
        driver.get("https://www.w3schools.com/");
        homePage = new HomePage(driver);
    }

    @Test(groups = "main", suiteName = "ui")
    public void w3SchoolsTest() throws Exception {

        //Given user opens a browser and provides a valid url "https://www.w3schools.com/"
        //When user clicks enter, system redirects him to the w3schools`s main page
        //Then user can find the "Exercises" link by it`s xpath and be redirected to the "Exercises" page by clicking on it
        w3SchoolsExercisesPage = homePage.navigateToW3SchoolsExercises();
        //And user can ensure that the "Java Exercises" title is present on the page
        Assert.assertTrue(w3SchoolsExercisesPage.isTitleCorrect(), "Title is different!!");
    }
}
