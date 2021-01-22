package com.LT_automation_project_2020.journeys;

import com.LT_automation_project_2020.BaseTest;
import com.LT_automation_project_2020.listeners.TestListener;
import com.LT_automation_project_2020.pages.HomePage;
import com.LT_automation_project_2020.pages.W3SchoolsExercisesPage;
import com.LT_automation_project_2020.pages.W3SchoolsHomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class W3SchoolsTest extends BaseTest {

    private W3SchoolsHomePage w3SchoolsHomePage;
    private W3SchoolsExercisesPage w3SchoolsExercisesPage;

    @BeforeMethod(alwaysRun = true)
    public void setupTest() {
        driver.get(getW3SchoolsUrl());
        w3SchoolsHomePage = new W3SchoolsHomePage(driver);
    }

    @Test(groups = "main", suiteName = "ui")
    public void w3SchoolsTest() throws Exception {

        //Given user opens a browser and provides a valid url "https://www.w3schools.com/"
        //When user clicks enter, system redirects him to the w3schools`s main page
        //Then user can find the "Exercises" link by it`s xpath and be redirected to the "Exercises" page by clicking on it
        w3SchoolsExercisesPage = w3SchoolsHomePage.navigateToW3SchoolsExercises();
        //And user can ensure that the "Java Exercises" title is present on the page
        Assert.assertTrue(w3SchoolsExercisesPage.isTitleCorrect(), "Title is different!!");
    }
}
