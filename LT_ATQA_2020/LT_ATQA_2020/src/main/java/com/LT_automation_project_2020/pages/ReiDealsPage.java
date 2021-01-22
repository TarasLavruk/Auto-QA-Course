package com.LT_automation_project_2020.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ReiDealsPage extends Page{

    private String textDealsReiTitle = "//h1";
    private String getDealsReiTitle = "Deals";

    public ReiDealsPage(RemoteWebDriver driver) {
        super(driver);

    }

    public boolean ifDealsReiTitle () {
        return driver.findElement(By.xpath(textDealsReiTitle)).getText().contains(getDealsReiTitle);
    }

}
