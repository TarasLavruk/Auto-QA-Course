package com.LT_automation_project_2020.journeys;

import com.LT_automation_project_2020.listeners.TestListener;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class FirstWebTests {

    private RemoteWebDriver driver;

        @BeforeMethod
        public void setup() {
            System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
            driver = new ChromeDriver();
        }

        @AfterMethod
        public void tearDown() {
            if (driver != null) {
                driver.quit();
            }
        }

//        @Test(priority = 2, suiteName = "ikea")
//        public void ikeaUrlTest() {
//
//            //Given user opens a browser and provides a valid url "https://www.ikea.com/"
//            driver.get("https://www.ikea.com/");
//            //When user clicks enter, system redirects him to the ikea`s main page
//            //Then user can find the "Go to" link by it`s xpath
////            Assert.assertTrue(driver.findElement(By.xpath("//body/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]")).isDisplayed());
//        }



        @Test(priority = 5, suiteName = "sierra")
        public void sierraUrlTest() {

            //Given user opens a browser and provides a valid url "https://sierradesigns.com"
            driver.get("https://sierradesigns.com");
            //When user clicks enter, system redirects him to the sierradesign`s main page
            //Then user can find the "Tents" link by it`s xpath
            Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Tents')]")).isDisplayed());
        }

}
