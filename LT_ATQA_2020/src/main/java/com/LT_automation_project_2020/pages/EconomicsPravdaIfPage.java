package com.LT_automation_project_2020.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class EconomicsPravdaIfPage extends Page{

    private String economicsPravdaIfTitleLocator = "//h1";

    public EconomicsPravdaIfPage(RemoteWebDriver driver) {
        super(driver);
    }
//TODO please rename this method as you're not setting anything here, also you can explore if driver.getTitle() can be used
    public boolean setEconomicsPravdaIfTitle() {
        return driver.findElement(By.xpath(economicsPravdaIfTitleLocator)).isDisplayed();
    }
}
