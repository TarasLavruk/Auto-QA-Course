package com.LT_automation_project_2020.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SierraDesignsTentsPage extends Page{

    public String sierraDesignsTentsLocator = "//span[contains(text(), 'Clearwing 2')]";
    public SierraDesignsTentsPage(RemoteWebDriver driver) {
        super(driver);
    }

    public boolean setTents () {
        return driver.findElement(By.xpath(sierraDesignsTentsLocator)).isDisplayed();
    }
}

