package com.LT_automation_project_2020.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SierraDesignsTentsPage extends Page {

    public String sierraDesignsTentsLocator = "//span[contains(text(), 'Clearwing 2')]";
//    public String sierraDesignsTents2PersonTentsLocator = "//a[contains(text(), '2 Person Tents')]";

    public SierraDesignsTentsPage(RemoteWebDriver driver) {
        super(driver);
    }

    public boolean setTents () {
        return driver.findElement(By.xpath(sierraDesignsTentsLocator)).isDisplayed();
    }

//    public Header setSearchWikiTerm(String searchTerm) {
//        driver.findElement(By.xpath(searchWikiFieldLocator)).sendKeys(searchTerm);
//        return this;
//    }
//
//    public <T extends Page> T clickOnSearchButton(Class<T> clazz) throws Exception {
//        driver.findElement(By.xpath(searchWikiButtonLocator)).click();
//        return PageFactory.newPage(driver, clazz);
//    }
}

