package com.LT_automation_project_2020.pages;

import com.LT_automation_project_2020.framework.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AmazonElectronicsPage extends Page{

    private String computersAmazonPageLocator = "//div[@id='nav-subnav']//span[contains(text(), 'Computers & Accessories')]";

    public AmazonElectronicsPage(RemoteWebDriver driver) {
        super(driver);
    }

    public AmazonComputersAndAccessoriesPage navigateToAmazonComputers() throws Exception {
        driver.findElement(By.xpath(computersAmazonPageLocator)).click();
        return PageFactory.newPage(driver, AmazonComputersAndAccessoriesPage.class);
    }
}
