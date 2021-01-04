package com.LT_automation_project_2020.journeys;

import com.LT_automation_project_2020.BaseTest;
import com.LT_automation_project_2020.listeners.TestListener;
import com.LT_automation_project_2020.pages.HomePage;
import com.LT_automation_project_2020.pages.OutletReiPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class ReiTest extends BaseTest {

    private HomePage homePage;
    private OutletReiPage outletReiPage;

    @BeforeMethod(alwaysRun = true)
    public void setupTest() {
        driver.get(getReiUrl());
        homePage = new HomePage(driver);
    }

    @Test(groups = "main", suiteName = "ui")
    public void reiUrlTest() throws Exception {

        //Given user opens a browser and provides a valid url "https://www.rei.com/"
        //When user clicks enter, system redirects him to the rei`s main page
        //Then user can find the "Fitness Electronics" link by it`s xpath and be redirected to the "REI Outlet" page by clicking on it
        outletReiPage = homePage.navigateToOutletReiPage();
        //And user can ensure that the "REI Outlet" page contains the "Fitness" header
        Assert.assertTrue(outletReiPage.setOutletReiTitle(), "Title is wrong!");
    }


}
