package com.LT_automation_project_2020.journeys;

import com.LT_automation_project_2020.BaseTest;
import com.LT_automation_project_2020.listeners.TestListener;
import com.LT_automation_project_2020.pages.HomePage;
import com.LT_automation_project_2020.pages.ResultWikiPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class WikiTest extends BaseTest {

    private HomePage homePage;
    private String searchTerm = "Selenium (software)";
    private ResultWikiPage resultWikiPage;

    @BeforeMethod(alwaysRun = true)
    public void setupTest() {
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        homePage = new HomePage(driver);
    }

    @Test(groups = "main", suiteName = "ui")
    public void wikiUrlTest() throws Exception {

        //Given user opens a browser and provides a valid url "https://en.wikipedia.org/wiki/Main_Page"
        //When user clicks enter, system redirects him to the wikipedia`s main page
        //Then user can find the search field and enter the search term and be redirected to the search result page
        resultWikiPage = homePage.searchWikiForItem(ResultWikiPage.class, searchTerm);
        //And user can find the "Selenium IDE" link on the result page
        Assert.assertTrue(resultWikiPage.setSeleniumIDEDisplayed(), "The term is not correct!");
    }
}
