package com.LT_automation_project_2020.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class W3SchoolsExercisesPage extends Page{

    private String rulesLocator = "//div[@class='w3-col l4 m12']//a[contains(text(), 'Java Exercises')]";

    public W3SchoolsExercisesPage(RemoteWebDriver driver) {
        super(driver);
    }

    public boolean isTitleCorrect(){
        return driver.findElement(By.xpath(rulesLocator)).getText().contains("Java");
    }
}
