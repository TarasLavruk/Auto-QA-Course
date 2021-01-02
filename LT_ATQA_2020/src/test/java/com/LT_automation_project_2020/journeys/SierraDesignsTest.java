package com.LT_automation_project_2020.journeys;

import com.LT_automation_project_2020.BaseTest;
import com.LT_automation_project_2020.listeners.TestListener;
import com.LT_automation_project_2020.pages.HomePage;
import com.LT_automation_project_2020.pages.SierraDesignsTentsPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class SierraDesignsTest extends BaseTest {

    private HomePage homePage;
    private SierraDesignsTentsPage sierraDesignsTentsPage;

    @BeforeMethod(alwaysRun = true)
    public void setupTest() {
        driver.get("https://sierradesigns.com");
        if(driver.findElement(By.xpath("//button[@class='needsclick DismissButton__closeButtonImage-spg526-0 kvcQJV kl-private-reset-css-Xuajs1']")).isDisplayed()){
            driver.findElement(By.xpath("//button[@class='needsclick DismissButton__closeButtonImage-spg526-0 kvcQJV kl-private-reset-css-Xuajs1']")).click();
        }
        homePage = new HomePage(driver);
    }

    @Test(groups = "main", suiteName = "ui")
    public void sierraUrlTest() throws Exception {

        //Given user opens a browser and provides a valid url "https://sierradesigns.com"
        //When user clicks enter, system redirects him to the sierradesign`s main page
        //Then user can find the "Tents" link by it`s xpath and be redirected to the "Tents" page by clicking on it
        sierraDesignsTentsPage = homePage.navigateToSierraDesignsTents();
        //And user can ensure by xpath that the certain tent is present on the page
        Assert.assertTrue(sierraDesignsTentsPage.setTents(), "Those tents are sold already)");
    }
}
