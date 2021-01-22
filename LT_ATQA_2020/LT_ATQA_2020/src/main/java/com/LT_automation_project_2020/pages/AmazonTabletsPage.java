package com.LT_automation_project_2020.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.List;

public class AmazonTabletsPage extends Page{


    private String checkBoxLocator = "//body[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[8]/ul[1]/li[1]/span[1]/a[1]/div[1]/label[1]/i[1]";
    private String primeLabelLocator = "//i[@class='a-icon a-icon-prime a-icon-medium']";
    private String tabletsListLocator = "//div[@class='a-section aok-relative s-image-fixed-height']";

    public AmazonTabletsPage(RemoteWebDriver driver) {
        super(driver);
    }

    public AmazonTabletsPage clickCheckBox(){
        return clickOnElement(By.xpath(checkBoxLocator), AmazonTabletsPage.class);
    }

    public boolean isPrimeLabelPresented() {
        boolean result = true;

        List<WebElement> elements = getElements(By.xpath(tabletsListLocator));

        for (WebElement element : elements) {
            if (!element.findElement(By.xpath(primeLabelLocator)).isDisplayed()) {
                result = false;
                break;
            }
        }
        return result;
    }

}
