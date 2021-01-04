package com.LT_automation_project_2020.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class OutletReiPage extends Page{

    private String textOutletReiTitle = "//h1";
    private String getOutletReiTitle = "Fitness";

    public OutletReiPage(RemoteWebDriver driver) {
        super(driver);

    }

    public boolean setOutletReiTitle () {
        return driver.findElement(By.xpath(textOutletReiTitle)).getText().contains(getOutletReiTitle);
    }



}
