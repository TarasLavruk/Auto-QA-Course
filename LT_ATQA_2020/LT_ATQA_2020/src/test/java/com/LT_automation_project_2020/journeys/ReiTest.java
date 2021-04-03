package com.LT_automation_project_2020.journeys;

import com.LT_automation_project_2020.BaseTest;
import com.LT_automation_project_2020.listeners.TestListener;
import com.LT_automation_project_2020.pages.ReiDealsPage;
import com.LT_automation_project_2020.pages.ReiHomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class ReiTest extends BaseTest {

    private ReiHomePage reiHomePage;
    private ReiDealsPage reiDealsPage;

    @BeforeMethod(alwaysRun = true)
    public void setupTest() {
        driver.get(getReiUrl());
        reiHomePage = new ReiHomePage(driver);
    }

    @Test(groups = "main", suiteName = "ui")
    public void reiUrlTest() throws Exception {

        //Given user opens a browser and provides a valid url "https://www.rei.com/"
        //When user clicks enter, system redirects him to the rei`s main page
        //Then user can find the "Fitness Electronics" link by it`s xpath and be redirected to the "REI Outlet" page by clicking on it
        reiDealsPage = reiHomePage.navigateToDealsReiPage();
        //And user can ensure that the "REI Outlet" page contains the "Fitness" header
        Assert.assertTrue(reiDealsPage.ifDealsReiTitle(), "Title is wrong!");
    }

}
