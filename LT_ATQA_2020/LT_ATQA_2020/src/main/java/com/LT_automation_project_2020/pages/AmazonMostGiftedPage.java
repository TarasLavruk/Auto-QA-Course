package com.LT_automation_project_2020.pages;

import com.LT_automation_project_2020.framework.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AmazonMostGiftedPage extends Page{

    private String booksMostGiftedAmazonPageLinkLocator = "//ul[@id='zg_browseRoot']//a[contains(text(), 'Book')]";
    public AmazonMostGiftedPage(RemoteWebDriver driver) {
        super(driver);
    }

    public AmazonBooksMostGiftedPage navigateToAmazonBooksMostGifted() throws Exception {
        driver.findElement(By.xpath(booksMostGiftedAmazonPageLinkLocator)).click();
        return PageFactory.newPage(driver, AmazonBooksMostGiftedPage.class);
    }
}
