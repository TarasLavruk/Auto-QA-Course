package com.LT_automation_project_2020.framework;

import com.LT_automation_project_2020.pages.SierraDesignsTentsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Footer extends GeneralElements {

    private String sierraDesignsTentsLocator = "//a[contains(text(),'Tents')]";
    protected RemoteWebDriver driver;

    public Footer(final RemoteWebDriver driver){
        this.driver = driver;
    }

    public SierraDesignsTentsPage navigateToSierraDesignsTents() throws Exception {
        driver.findElement(By.xpath(sierraDesignsTentsLocator)).click();
        return PageFactory.newPage(driver, SierraDesignsTentsPage.class);
    }
}
