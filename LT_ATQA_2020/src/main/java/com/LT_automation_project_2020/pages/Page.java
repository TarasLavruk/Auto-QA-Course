package com.LT_automation_project_2020.pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {

    protected RemoteWebDriver driver;
    protected WebDriverWait wait;
    public Page(final RemoteWebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
    }
//TODO please uncomment these methods and try to reuse common methods on all pages instead of duplicating code
//    protected <T extends Page>T clickOnElement(By selector, Class<T> clazz) {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
//
//        try {
//            driver.findElement(selector).click();
//            return PageFactory.newPage(driver, clazz);
//        } catch (Exception ex) {
//            return null;
//        }
//    }
//
//    protected <T extends Page>T setText(By selector, String text, Class<T> clazz) {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
//
//        try {
//            driver.findElement(selector).sendKeys(text);
//            return PageFactory.newPage(driver, clazz);
//        } catch (Exception ex) {
//            return null;
//        }
//    }
//
//    protected WebElement getElement(By selector) {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
//
//        try {
//            return driver.findElement(selector);
//        } catch (Exception ex) {
//            return null;
//        }
//    }
//
//    protected List<WebElement> getElements(By selector) {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
//
//        try {
//            return driver.findElements(selector);
//        } catch (Exception ex) {
//            return null;
//        }
//    }
}
