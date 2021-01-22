package com.LT_automation_project_2020.pages;

import com.LT_automation_project_2020.framework.Header;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WikiHomePage extends Page{

    private Header header;

    public WikiHomePage(RemoteWebDriver driver) {
        super(driver);
        this.header = new Header(driver);
    }

    public <T extends Page> T searchWikiForItem(Class<T> clazz, String searchTerm) throws Exception {
        return header.setSearchWikiTerm(searchTerm).clickOnSearchButton(clazz);
    }

}
