package com.LT_automation_project_2020.journeys;

import com.LT_automation_project_2020.BaseTest;
import com.LT_automation_project_2020.listeners.TestListener;
import com.LT_automation_project_2020.pages.EconomicsPravdaIfPage;
import com.LT_automation_project_2020.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class PravdaIfTest extends BaseTest {

    private HomePage homePage;
    private EconomicsPravdaIfPage economicsPravdaIfPage;

    @BeforeMethod(alwaysRun = true)
    public void setupTest() {
        homePage = new HomePage(driver);
    }

    @Test(groups = "main", suiteName = "ui")
    public void pravdaUrlTest() throws Exception {

        //Given user opens a browser and provides a valid url "https://pravda.if.ua"
        driver.get("https://pravda.if.ua");
        //When user clicks enter, system redirects him to the pravda`s main page
        //Then user can find the "Economics" link by it`s xpath and be redirected to the "Economics" page by clicking on it
        economicsPravdaIfPage = homePage.navigateToEconomicsPravdaIf();
        //And user can ensure that the "Economics" title is present on the page
        Assert.assertTrue(economicsPravdaIfPage.setEconomicsPravdaIfTitle(), "Title doesn't exist!!");
    }

}
