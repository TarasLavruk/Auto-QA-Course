package com.LT_automation_project_2020.framework;


import com.LT_automation_project_2020.pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;
import java.util.List;

public class AmazonHeader extends GeneralElements {

    private String newReleasesLinkLocator = "//a[@data-csa-c-content-id='nav_cs_newreleases']";
    private String amazonSearchFieldLocator = "//input[@id='twotabsearchtextbox']";
    private String getAmazonSearchButtonLocator = "//input[@id='nav-search-submit-button']";
    private String searchAmazonTerm = "go pro 4k";
    private String electronicsAmazonPageLocator = "//a[@href='/electronics-camera-mp3-ipod-tv/b/?ie=UTF8&node=560798&ref_=nav_cs_electronics']";
//    private String dropdownAllAmazonLocator = "//span[@class='hm-icon-label']";
//    private String optionName = "Electronics & Computers";

    protected RemoteWebDriver driver;

    public AmazonHeader(RemoteWebDriver driver){
        this.driver = driver;
    }
//    protected WebDriverWait wait;

    public AmazonNewReleasesPage navigateToAmazonNewReleases() throws Exception {
        driver.findElement(By.xpath(newReleasesLinkLocator)).click();
        return PageFactory.newPage(driver, AmazonNewReleasesPage.class);
    }

    public AmazonHeader setAmazonGoProTerm() {
        driver.findElement(By.xpath(amazonSearchFieldLocator)).sendKeys(searchAmazonTerm);
        return this;
    }

    public <T extends Page> T clickOnAmazonSearchButton(Class<T> clazz) throws Exception {
        driver.findElement(By.xpath(getAmazonSearchButtonLocator)).click();
        return PageFactory.newPage(driver, clazz);
    }

    public AmazonElectronicsPage navigateToAmazonElectronics() throws Exception {
        driver.findElement(By.xpath(electronicsAmazonPageLocator)).click();
        return PageFactory.newPage(driver, AmazonElectronicsPage.class);
    }

//    protected <T extends Page>T selectDropdownOption(By selector, String optionName, Class<T> clazz) throws Exception {
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dropdownAllAmazonLocator)));
//        Select select = new Select(driver.findElement(By.xpath(dropdownAllAmazonLocator)));
//        List<WebElement> options = select.getOptions();
//        for (WebElement option : options) {
//            if (option.getText().equals(optionName)) {
//                option.click();
//            }
//        }
//        return PageFactory.newPage(driver, clazz);
//    }

}
