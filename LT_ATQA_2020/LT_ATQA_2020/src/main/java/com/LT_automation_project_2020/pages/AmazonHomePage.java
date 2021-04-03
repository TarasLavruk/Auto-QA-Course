package com.LT_automation_project_2020.pages;

import com.LT_automation_project_2020.framework.AmazonHeader;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AmazonHomePage extends Page{

    private AmazonHeader amazonHeader;

    public AmazonHomePage(RemoteWebDriver driver) {
        super(driver);
        this.amazonHeader = new AmazonHeader(driver);
    }

    public AmazonNewReleasesPage navigateToAmazonNewReleases() throws Exception {
        return amazonHeader.navigateToAmazonNewReleases();
    }

    public <T extends Page> T searchAmazonForItem(Class<T> clazz, String searchAmazonTerm) throws Exception {
        return amazonHeader.setAmazonGoProTerm().clickOnAmazonSearchButton(clazz);
    }

    public AmazonElectronicsPage navigateToAmazonElectronics() throws Exception {
        return amazonHeader.navigateToAmazonElectronics();
    }

}

