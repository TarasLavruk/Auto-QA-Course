package com.LT_automation_project_2020.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class EconomicsPravdaIfPage extends Page{

    private String economicsPravdaIfTitleLocator = "//h1";

    public EconomicsPravdaIfPage(RemoteWebDriver driver) {
        super(driver);
    }

    public boolean setEconomicsPravdaIfTitle(){
        return driver.findElement(By.xpath(economicsPravdaIfTitleLocator)).isDisplayed();
    }
}
