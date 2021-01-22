package com.LT_automation_project_2020.framework;

import com.LT_automation_project_2020.pages.PravdaEconomicsIfPage;
import com.LT_automation_project_2020.pages.Page;
import com.LT_automation_project_2020.pages.W3SchoolsExercisesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Header extends GeneralElements{

    private String w3SchoolsExercisesLocator = "//a[@id='navbtn_exercises']";
    private String economicsPravdaIfPageLocator = "//body/div[@id='td-outer-wrap']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[2]/a[1]";
    private String searchWikiFieldLocator = "//input[@id='searchInput']";
    private String searchWikiButtonLocator = "//input[@id='searchButton']";
    protected RemoteWebDriver driver;

    public Header(RemoteWebDriver driver) {
        this.driver = driver;
    }

    public W3SchoolsExercisesPage navigateToW3SchoolsExercises() throws Exception {
        driver.findElement(By.xpath(w3SchoolsExercisesLocator)).click();
        return PageFactory.newPage(driver, W3SchoolsExercisesPage.class);
    }

    public PravdaEconomicsIfPage navigateToEconomicsPravdaIf() throws Exception {
        driver.findElement(By.xpath(economicsPravdaIfPageLocator)).click();
        return PageFactory.newPage(driver, PravdaEconomicsIfPage.class);
    }

    public Header setSearchWikiTerm(String searchTerm) {
        driver.findElement(By.xpath(searchWikiFieldLocator)).sendKeys(searchTerm);
        return this;
    }

    public <T extends Page> T clickOnSearchButton(Class<T> clazz) throws Exception {
        driver.findElement(By.xpath(searchWikiButtonLocator)).click();
        return PageFactory.newPage(driver, clazz);
    }
}

