package com.LT_automation_project_2020.pages;

import com.LT_automation_project_2020.framework.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.List;


public class AmazonMonitorsPage extends Page{

    private String topRatedMonitorsLinkLocator = "//span[@class='a-size-base-plus a-color-link octopus-pc-card-title-seeMore']";
    private String itemRatingLocator = "//span[@class='a-declarative']";
    private String sortDropdownMonitorsLocator = "//span[@id='a-autoid-0-announce']";
    private String selectDropdownLocator = "//a[contains(text(), 'Avg. Customer Review')]";

    public AmazonMonitorsPage(RemoteWebDriver driver) {
        super(driver);
    }

    public AmazonMonitorsPage selectTopRatedMonitorsToPage() {
        return clickOnElement(By.xpath(topRatedMonitorsLinkLocator), AmazonMonitorsPage.class);
    }

    public AmazonMonitorsPage selectDropdown() {
        return clickOnElement(By.xpath(sortDropdownMonitorsLocator), AmazonMonitorsPage.class);
    }

    public AmazonMonitorsPage selectDropdownSelector() {
        return clickOnElement(By.xpath(selectDropdownLocator), AmazonMonitorsPage.class);
    }

        public boolean ifActualResultValid(){
        List<WebElement> elements = getElements(By.xpath(itemRatingLocator));
        boolean result = true;

        for (int i = 0; i < elements.size(); i++) {
            WebElement el = elements.get(i);

//            if (el > elements.get(i)  ){
//            if (!isDisplayed(element, By.xpath(sponsoredLabelLocator))) {
//                if ((!element.findElement(By.xpath(rating4Locator)).isDisplayed() ||
//                        !element.findElement(By.xpath(rating5Locator)).isDisplayed()) &&
//                        Integer.parseInt(element.findElement(By.xpath(itemPriceLocator)).getText())<100){
//                    result = false;
//                    break;
                }
//            }
//        }
        return result;
    }

}
