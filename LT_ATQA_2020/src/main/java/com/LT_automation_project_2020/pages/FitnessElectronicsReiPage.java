package com.LT_automation_project_2020.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FitnessElectronicsReiPage extends Page{

    private String textFitnessElectronicsReiTitle = "//h1";
    private String getTextFitnessElectronicsReiTitle = "Fitness Electronics";

    public FitnessElectronicsReiPage(RemoteWebDriver driver) {
        super(driver);

    }

    public boolean setFitnessElectronicsReiTitle () {
        return driver.findElement(By.xpath(textFitnessElectronicsReiTitle)).getText().contains(getTextFitnessElectronicsReiTitle);
    }



}
