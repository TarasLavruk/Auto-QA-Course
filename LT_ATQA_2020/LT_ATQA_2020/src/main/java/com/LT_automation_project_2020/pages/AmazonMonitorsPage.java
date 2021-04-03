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


        public static void main(String[] args) {
            List<String> wordsList = Arrays.asList("I", "love", "learning", "on", "JavaRush");
            String[] wordsArray = (String[]) wordsList.toArray();

            for (String word : wordsArray) {
                System.out.println(word);
            }

        }


        public boolean ifActualResultValid(){
        List<WebElement> elements = getElements(By.xpath(itemRatingLocator));
        boolean result = true;
//        But i don`t know how to convert the List to the Array((
        for (int i = 0; i < elements.size(); i++) {
            int max = elements(i);
            for (int j = i + 1; j < elements.size(); j++) {

                if (max < elements(j)) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

}
