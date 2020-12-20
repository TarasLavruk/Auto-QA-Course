package com.LT_automation_project2020;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
        @Test(priority = 1, suiteName = "allo")
        public void alloUrlTest() {

            //Given user opens a browser and provides a valid url "https://allo.ua/"
            driver.get("https://allo.ua/");
            //When user clicks enter, system redirects him to the allo`s main page
            //Then user can find the "Gadgets" link by it`s xpath
            Assert.assertTrue(driver.findElement(By.xpath("//body/div[@id='__allo']/div[@id='__layout']/div[1]/div[4]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]")).isDisplayed());
        }

        @Test(priority = 2, suiteName = "ikea")
        public void ikeaUrlTest() {

            //Given user opens a browser and provides a valid url "https://www.ikea.com/"
            driver.get("https://www.ikea.com/");
            //When user clicks enter, system redirects him to the ikea`s main page
            //Then user can find the "Go to" link by it`s xpath
            Assert.assertTrue(driver.findElement(By.xpath("//body/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]")).isDisplayed());
        }

        @Test(priority = 3, suiteName = "wiki")
        public void wikiUrlTest() {

            //Given user opens a browser and provides a valid url "https://en.wikipedia.org/wiki/Main_Page"
            driver.get("https://en.wikipedia.org/wiki/Main_Page");
            //When user clicks enter, system redirects him to the wikipedia`s main page
            //Then user can find the "Search" input by it`s cssSelector
            Assert.assertTrue(driver.findElement(By.cssSelector("#searchInput")).isDisplayed());
        }

        @Test(priority = 4, suiteName = "pravda")
        public void pravdaUrlTest() {

            //Given user opens a browser and provides a valid url "https://pravda.if.ua"
            driver.get("https://pravda.if.ua");
            //When user clicks enter, system redirects him to the pravda`s main page
            //Then user can find the "Economics" link by it`s xpath
            Assert.assertTrue(driver.findElement(By.xpath("//body/div[@id='td-outer-wrap']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[2]/a[1]")).isDisplayed());
        }

        @Test(priority = 5, suiteName = "sierra")
        public void sierraUrlTest() {

            //Given user opens a browser and provides a valid url "https://sierradesigns.com"
            driver.get("https://sierradesigns.com");
            //When user clicks enter, system redirects him to the sierradesign`s main page
            //Then user can find the "Tents" link by it`s xpath
            Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Tents')]")).isDisplayed());
        }

}
