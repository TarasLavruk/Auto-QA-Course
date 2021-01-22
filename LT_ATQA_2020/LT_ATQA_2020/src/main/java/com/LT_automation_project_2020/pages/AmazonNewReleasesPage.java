package com.LT_automation_project_2020.pages;

import com.LT_automation_project_2020.framework.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AmazonNewReleasesPage extends Page{

    private String newReleasesTitlesLocator = "//h3";
    private String newReleasesListLocator = "//div[@id='zg_left_col2']";
    private String mostGiftedAmazonPageLinkLocator = "//a[contains(text(), 'Most Gifted')]";

    public AmazonNewReleasesPage(RemoteWebDriver driver) {
        super(driver);
    }

    public String getNewReleasesTitles(){
        return driver.findElement(By.xpath(newReleasesTitlesLocator)).getText();
    }

    public boolean ifAllTitlesAreExist () {
        return driver.findElement(By.xpath(newReleasesListLocator)).getText().contains(getNewReleasesTitles());
    }

    public AmazonMostGiftedPage navigateToAmazonMostGifted() throws Exception {
        driver.findElement(By.xpath(mostGiftedAmazonPageLinkLocator)).click();
        return PageFactory.newPage(driver, AmazonMostGiftedPage.class);
    }
}
