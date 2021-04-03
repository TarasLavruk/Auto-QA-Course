package com.LT_automation_project_2020.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PravdaEconomicsIfPage extends Page{

    private String economicsPravdaIfTitleLocator = "//h1";

    public PravdaEconomicsIfPage(RemoteWebDriver driver) {
        super(driver);
    }

    public boolean ifEconomicsPravdaIfTitle() {
        return driver.findElement(By.xpath(economicsPravdaIfTitleLocator)).isDisplayed();
    }
}
