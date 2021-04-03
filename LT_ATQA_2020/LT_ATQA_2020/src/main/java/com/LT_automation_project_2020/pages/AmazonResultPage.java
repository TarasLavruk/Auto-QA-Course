package com.LT_automation_project_2020.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.List;

public class AmazonResultPage extends Page{

    private String ratingLingLocator = "//i[@class='a-icon a-icon-star-medium a-star-medium-4']";
    private String minPriceFieldLocator = "//input[@id='low-price']";
    private String priceTerm = "100";
    private String priceSetButton = "//span[@id='a-autoid-1-announce']";
    private String searchAmazonResultsListLocator = "//*[@data-component-type='s-search-result']";
    private String sponsoredLabelLocator = "//span[@class='a-size-mini a-color-secondary']";
    private String rating4Locator = "//i[@class='a-icon a-icon-star-small a-star-small-4-5 aok-align-bottom']";
    private String rating5Locator = "//i[@class='a-icon a-icon-star-small a-star-small-5 aok-align-bottom']";
    private String itemPriceLocator = "//span[@class='a-price-whole']";

    public AmazonResultPage(RemoteWebDriver driver) {
        super(driver);
    }

    public AmazonResultPage selectRatingToResult() {
        return clickOnElement(By.xpath(ratingLingLocator), AmazonResultPage.class);
    }

    public AmazonResultPage setMinPrice(){
        return setText(By.xpath(minPriceFieldLocator), priceTerm, AmazonResultPage.class);
    }

    public AmazonResultPage clickPriceSetButton(){
        return clickOnElement(By.xpath(priceSetButton), AmazonResultPage.class);
    }

    public boolean ifActualResultValid(){
        List<WebElement> elements = getElements(By.xpath(searchAmazonResultsListLocator));
        boolean result = true;

        for (WebElement element : elements) {
            if (!isDisplayed(element, By.xpath(sponsoredLabelLocator))) {
                if ((!element.findElement(By.xpath(rating4Locator)).isDisplayed() ||
                    !element.findElement(By.xpath(rating5Locator)).isDisplayed()) &&
                    Integer.parseInt(element.findElement(By.xpath(itemPriceLocator)).getText())<100){
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
