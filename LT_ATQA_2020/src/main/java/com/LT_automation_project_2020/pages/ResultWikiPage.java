package com.LT_automation_project_2020.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ResultWikiPage extends Page{

    private String seleniumIDELocator = "//li[@class='toclevel-2 tocsection-3']//span[contains(text(), 'IDE')]";

    public ResultWikiPage(RemoteWebDriver driver) {
        super(driver);
    }

    public boolean setSeleniumIDEDisplayed() {

        return driver.findElement(By.xpath(seleniumIDELocator)).isDisplayed();
    }
}
