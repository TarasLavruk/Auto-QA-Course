package com.LT_automation_project_2020.pages;

import com.LT_automation_project_2020.framework.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ReiHomePage extends Page{

    private String dealsReiPage = "//a[contains(text(), 'Shop all deals')]";

    public ReiHomePage(RemoteWebDriver driver) {
        super(driver);
    }

    public ReiDealsPage navigateToDealsReiPage() throws Exception {
        driver.findElement(By.xpath(dealsReiPage)).click();
        return PageFactory.newPage(driver, ReiDealsPage.class);
    }

}
