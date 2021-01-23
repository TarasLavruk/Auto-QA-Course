package com.LT_automation_project_2020.journeys;

import com.LT_automation_project_2020.BaseTest;
import com.LT_automation_project_2020.listeners.TestListener;
import com.LT_automation_project_2020.pages.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class FinalAssignmentTest extends BaseTest {

@Listeners(TestListener.class)
public static class FinalAssignmentTests extends BaseTest {

    private AmazonHomePage amazonHomePage;
    private AmazonNewReleasesPage amazonNewReleasesPage;
    private AmazonBooksMostGiftedPage amazonBooksMostGiftedPage;
    private AmazonMostGiftedPage amazonMostGiftedPage;
    private AmazonResultPage amazonResultPage;
    private AmazonTabletsPage amazonTabletsPage;
    private AmazonElectronicsPage amazonElectronicsPage;
    private AmazonComputersAndAccessoriesPage amazonComputersAndAccessoriesPage;
    private AmazonMonitorsPage amazonMonitorsPage;
    private String searchAmazonTerm = "go pro 4k";
    private String acceptCookiesButtonLocator = "//input[@id='sp-cc-accept']";

    @BeforeMethod(alwaysRun = true)
    public void setupTest() {
        driver.get(getAmazonUrl());
        if (driver.findElement(By.xpath(acceptCookiesButtonLocator)).isDisplayed()) {
            driver.findElement(By.xpath(acceptCookiesButtonLocator)).click();
        }
        amazonHomePage = new AmazonHomePage(driver);
    }

    @Test(groups = "main")
    public void newReleaseTest() throws Exception {

//        Given user opens a browser and provides a valid url "https://www.amazon.co.uk/"
//        When user clicks enter, system redirects him to the amazon's main page
//        Then user can be redirected to the "New Releases"page by clicking on the proper link
        amazonNewReleasesPage = amazonHomePage.navigateToAmazonNewReleases();
//        And user can make sure that all titles of the ne releases points are present in the list of links
        Assert.assertTrue(amazonNewReleasesPage.ifAllTitlesAreExist(), "The title is not correct!");
    }

    @Test(groups = "main")
    public void mostGiftedAmazonTest() throws Exception {

//        Given user opens a browser and provides a valid url "https://www.amazon.co.uk/"
//        When user clicks enter, system redirects him to the amazon's home page
//        Then user can find the New Releases tab on the header of the home page and can be redirected to the New Releases page by clicking the link
        amazonNewReleasesPage = amazonHomePage.navigateToAmazonNewReleases();
//        And can find the Most Gifted page link on the New Releases page and be redirected to the Most Gifted page by clicking on the link
        amazonMostGiftedPage = amazonNewReleasesPage.navigateToAmazonMostGifted();
//        And can find the Book link in the list on the Most Gifted page and can be redirected to the book page by clicking on the link
        amazonBooksMostGiftedPage = amazonMostGiftedPage.navigateToAmazonBooksMostGifted();
//        And user can verify that all books items have a rating element
        Assert.assertTrue(amazonBooksMostGiftedPage.isRatingFieldPresented(), "The rating is not present!");
    }

    @Test(groups = "main")
    public void searchResultsAmazonTest() throws Exception {

//        Given user opens a browser and provides a valid url "https://www.amazon.co.uk/"
//        When user clicks enter, system redirects him to the amazon's home page
//        Then user can find the search field and enter the search term "go pro 4k " and be redirected to the search result page
        amazonResultPage = amazonHomePage.searchAmazonForItem(AmazonResultPage.class, searchAmazonTerm);

        amazonResultPage.selectRatingToResult().setMinPrice().clickPriceSetButton();
//        And user can find the Title is on the result page
        Assert.assertTrue(amazonResultPage.ifActualResultValid(), "Actual result is not valid!");
    }

        @Test(groups = "main")
    public void filterOnMonitorAmazonTest() throws Exception {

//        Given user opens a browser and provides a valid url "https://www.amazon.co.uk/"
//        When user clicks enter, system redirects him to the amazon's home page
//        Then user can find the search field and enter the search term from the data provider and be redirected to the search result page
            amazonElectronicsPage = amazonHomePage.navigateToAmazonElectronics();
//        And on the Electronics page can find the Computers And Accessories tab and be redirected to the Computers And Accessories page
            amazonComputersAndAccessoriesPage = amazonElectronicsPage.navigateToAmazonComputers();
//        And on the Computers And Accessories page can find the Monitors tab and be redirected to the Monitors page
            amazonMonitorsPage = amazonComputersAndAccessoriesPage.navigateToAmazonMonitors();
//        And on Monitors Page user can find SeeMore link and click then can sort results by Avg. Customer Review and verify that refreshed list is sorted by customer review in descending order
            Assert.assertTrue(amazonMonitorsPage.ifActualResultValid(), "The result is not valid!");
    }

    @Test(groups = "main")
    public void primeOptionAmazonTest() throws Exception {

//        Given user opens a browser and provides a valid url "https://www.amazon.co.uk/"
//        When user clicks enter, system redirects him to the amazon's home page
//        Then user can find the Electronics tab and be redirected to the Electronics page
        amazonElectronicsPage = amazonHomePage.navigateToAmazonElectronics();
//        And on the Electronics page can find the Computers And Accessories tab and be redirected to the Computers And Accessories page
        amazonComputersAndAccessoriesPage = amazonElectronicsPage.navigateToAmazonComputers();
//        And on the Computers And Accessories page can find the Tablets tab and be redirected to the Tablets page
        amazonTabletsPage = amazonComputersAndAccessoriesPage.navigateToAmazonTablets();
//        And on Tablets Page user can find the Prime checkbox and check it and verify that all the items of refreshed list contain the Prime label or Free Delivery
        Assert.assertTrue(amazonTabletsPage.isPrimeLabelPresented(), "The label is not present!");
        }
    }
}
