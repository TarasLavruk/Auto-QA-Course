package com.LT_automation_project_2020.journeys;

import com.LT_automation_project_2020.BaseTest;
import com.LT_automation_project_2020.listeners.TestListener;
import com.LT_automation_project_2020.pages.PravdaEconomicsIfPage;
import com.LT_automation_project_2020.pages.PravdaHomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class PravdaIfTest extends BaseTest {

    private PravdaHomePage pravdaHomePage;
    private PravdaEconomicsIfPage pravdaEconomicsIfPage;

    @BeforeMethod(alwaysRun = true)
    public void setupTest() {
        pravdaHomePage = new PravdaHomePage(driver);
        driver.get(getPravdaUrl());
    }

    @Test(groups = "main", suiteName = "ui")
    public void pravdaUrlTest() throws Exception {
        //Given user opens a browser and provides a valid url "https://pravda.if.ua"
        //When user clicks enter, system redirects him to the pravda`s main page
        //Then user can find the "Economics" link by it`s xpath and be redirected to the "Economics" page by clicking on it
        pravdaEconomicsIfPage = pravdaHomePage.navigateToEconomicsPravdaIf();
        //And user can ensure that the "Economics" title is present on the page
        Assert.assertTrue(pravdaEconomicsIfPage.ifEconomicsPravdaIfTitle(), "Title doesn't exist!!");
    }

}
