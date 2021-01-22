package com.LT_automation_project_2020.journeys;

import com.LT_automation_project_2020.BaseTest;
import com.LT_automation_project_2020.framework.SearchTermDataProvider;
import com.LT_automation_project_2020.listeners.TestListener;
import com.LT_automation_project_2020.pages.WikiResultPage;
import com.LT_automation_project_2020.pages.WikiHomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class WikiTest extends BaseTest {

    private WikiHomePage wikiHomePage;
    private String searchTerm1 = "Selenium (software)";
    private WikiResultPage wikiResultPage;

    @BeforeMethod(alwaysRun = true)
    public void setupTest() {
        driver.get(getWikiUrl());
        wikiHomePage = new WikiHomePage(driver);
    }

    @DataProvider(name = "getSearchTerms")
    public Object[][] getSearchTerms(){
        return SearchTermDataProvider.getAllSearchTerms();
    }

    @Test(groups = "main", dataProvider = "getSearchTerms")
    public void wikiSearchTest(String searchTerm) throws Exception {

        //Given user opens a browser and provides a valid url "https://en.wikipedia.org/wiki/Main_Page"
        //When user clicks enter, system redirects him to the wikipedia`s main page
        //Then user can find the search field and enter the search term from the data provider and be redirected to the search result page
        wikiResultPage = wikiHomePage.searchWikiForItem(WikiResultPage.class, searchTerm);
        //And user can find the Title is on the result page
        Assert.assertTrue(wikiResultPage.ifSearchTermIsDisplayed(), "The title is not correct!");
    }

    @Test(groups = "main", suiteName = "ui")
    public void wikiUrlTest() throws Exception {

        //Given user opens a browser and provides a valid url "https://en.wikipedia.org/wiki/Main_Page"
        //When user clicks enter, system redirects him to the wikipedia`s main page
        //Then user can find the search field and enter the search term and be redirected to the search result page
        wikiResultPage = wikiHomePage.searchWikiForItem(WikiResultPage.class, searchTerm1);
        //And user can find the "Selenium IDE" link on the result page
        Assert.assertTrue(wikiResultPage.ifSeleniumIDEDisplayed(), "The term is not correct!");
    }
}
