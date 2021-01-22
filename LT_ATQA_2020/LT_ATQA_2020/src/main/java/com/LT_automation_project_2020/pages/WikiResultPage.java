package com.LT_automation_project_2020.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WikiResultPage extends Page{

    private String seleniumIDELocator = "//li[@class='toclevel-2 tocsection-3']//span[contains(text(), 'IDE')]";
    private String searchTermResultLocator = "//h1[@id='firstHeading']";

    public WikiResultPage(RemoteWebDriver driver) {
        super(driver);
    }

    public boolean ifSeleniumIDEDisplayed() {

        return driver.findElement(By.xpath(seleniumIDELocator)).isDisplayed();
    }

    public boolean ifSearchTermIsDisplayed() {
        return driver.findElement(By.xpath(searchTermResultLocator)).isDisplayed();
    }
}
