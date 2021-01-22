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

    public AmazonMonitorsPage(RemoteWebDriver driver) {
        super(driver);
    }

    public AmazonMonitorsPage selectTopRatedMonitorsToPage() {
        return clickOnElement(By.xpath(topRatedMonitorsLinkLocator), AmazonMonitorsPage.class);
    }

//    protected <T extends Page>T selectDropdownOption(By selector, String optionName, Class<T> clazz) throws Exception {
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dropdownAllAmazonLocator)));
//        Select select = new Select(driver.findElement(By.xpath(dropdownAllAmazonLocator)));
//        List<WebElement> options = select.getOptions();
//        for (WebElement option : options) {
//            if (option.getText().equals(optionName)) {
//                option.click();
//            }
//        }
//        return PageFactory.newPage(driver, clazz);
//    }

//    public boolean ifActualResultValid(){
//        List<WebElement> elements = getElements(By.xpath(itemRatingLocator));
//        boolean result = true;
//
////        for (WebElement element : elements) {
////            if (!isDisplayed(element, By.xpath(sponsoredLabelLocator))) {
////                if ((!element.findElement(By.xpath(rating4Locator)).isDisplayed() ||
////                        !element.findElement(By.xpath(rating5Locator)).isDisplayed()) &&
////                        Integer.parseInt(element.findElement(By.xpath(itemPriceLocator)).getText())<100){
////                    result = false;
////                    break;
////                }
////            }
////        }
////        return result;
//    }
}
