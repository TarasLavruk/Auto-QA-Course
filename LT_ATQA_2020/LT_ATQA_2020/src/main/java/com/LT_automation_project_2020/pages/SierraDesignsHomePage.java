package com.LT_automation_project_2020.pages;

import com.LT_automation_project_2020.framework.Footer;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SierraDesignsHomePage extends Page{

    private Footer footer;

    public SierraDesignsHomePage(RemoteWebDriver driver) {
        super(driver);
        this.footer = new Footer(driver);
    }

    public SierraDesignsTentsPage navigateToSierraDesignsTents() throws Exception {
        return footer.navigateToSierraDesignsTents();
    }

}
