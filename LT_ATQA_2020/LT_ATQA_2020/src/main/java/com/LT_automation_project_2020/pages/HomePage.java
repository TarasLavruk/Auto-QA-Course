package com.LT_automation_project_2020.pages;

import com.LT_automation_project_2020.framework.Footer;
import com.LT_automation_project_2020.framework.Header;
import com.LT_automation_project_2020.framework.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HomePage extends Page{

    private Header header;
    private Footer footer;

    public HomePage(RemoteWebDriver driver) {
        super(driver);
        this.header = new Header(driver);
        this.footer = new Footer(driver);
    }


}
