package com.LT_automation_project_2020.pages;

import com.LT_automation_project_2020.framework.Header;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PravdaHomePage extends Page{

    private Header header;

    public PravdaHomePage(RemoteWebDriver driver) {
        super(driver);
        this.header = new Header(driver);
    }

    public PravdaEconomicsIfPage navigateToEconomicsPravdaIf() throws Exception {
        return header.navigateToEconomicsPravdaIf();
    }

}
