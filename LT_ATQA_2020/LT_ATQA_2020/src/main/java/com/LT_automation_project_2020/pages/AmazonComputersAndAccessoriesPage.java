package com.LT_automation_project_2020.pages;

import com.LT_automation_project_2020.framework.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AmazonComputersAndAccessoriesPage extends Page{

    private String tabletsAmazonPageLocator = "//div[@class='a-section octopus-pc-category-card-v2-category-title']//span[contains(text(), 'Tablets')]";
    private String monitorsAmazonPageLocator = "//div[@class='a-section octopus-pc-category-card-v2-category-title']//span[contains( text(), 'Monitors')]";

    public AmazonComputersAndAccessoriesPage(RemoteWebDriver driver) {
        super(driver);
    }

    public AmazonTabletsPage navigateToAmazonTablets() throws Exception {
        driver.findElement(By.xpath(tabletsAmazonPageLocator)).click();
        return PageFactory.newPage(driver, AmazonTabletsPage.class);
    }

    public AmazonMonitorsPage navigateToAmazonMonitors() throws Exception {
        driver.findElement(By.xpath(monitorsAmazonPageLocator)).click();
        return PageFactory.newPage(driver, AmazonMonitorsPage.class);
    }
}
