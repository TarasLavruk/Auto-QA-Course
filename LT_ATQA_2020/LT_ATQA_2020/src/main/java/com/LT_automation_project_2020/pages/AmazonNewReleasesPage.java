package com.LT_automation_project_2020.pages;

import com.LT_automation_project_2020.framework.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.List;

public class AmazonNewReleasesPage extends Page{

    private String newReleasesTitlesLocator = "//h3";
    private String newReleasesListLocator = "//div[@id='zg_left_col2']";
    private String mostGiftedAmazonPageLinkLocator = "//a[contains(text(), 'Most Gifted')]";

    public AmazonNewReleasesPage(RemoteWebDriver driver) {
        super(driver);
    }

    public boolean ifAllTitlesAreExist() {
        boolean result = true;

        List<WebElement> elements = getElements(By.xpath(newReleasesTitlesLocator));

        for (WebElement element : elements) {
            System.out.println(elements);
            if (!element.findElement(By.xpath(newReleasesListLocator)).isDisplayed()) {
                result = false;
                break;
            }
        }
        return result;
    }

    public AmazonMostGiftedPage navigateToAmazonMostGifted() throws Exception {
        driver.findElement(By.xpath(mostGiftedAmazonPageLinkLocator)).click();
        return PageFactory.newPage(driver, AmazonMostGiftedPage.class);
    }
}
