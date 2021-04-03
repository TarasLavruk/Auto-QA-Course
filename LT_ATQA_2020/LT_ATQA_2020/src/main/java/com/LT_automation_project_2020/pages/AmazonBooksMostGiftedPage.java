package com.LT_automation_project_2020.pages;

import com.LT_automation_project_2020.framework.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.List;

public class AmazonBooksMostGiftedPage extends Page{

    private String booksLinkLocator = "//div[@class='a-section a-spacing-none aok-relative']";
    private String ratingSlotLocator = "//a[@class='a-link-normal']";

    public AmazonBooksMostGiftedPage(RemoteWebDriver driver) {
        super(driver);
    }

    public boolean isRatingFieldPresented() {
        boolean result = true;

        List<WebElement> elements = getElements(By.xpath(booksLinkLocator));

        for (WebElement element : elements) {
            if (!element.findElement(By.xpath(ratingSlotLocator)).isDisplayed()) {

                result = false;
                    break;
                }
            }
            return result;
        }

}
