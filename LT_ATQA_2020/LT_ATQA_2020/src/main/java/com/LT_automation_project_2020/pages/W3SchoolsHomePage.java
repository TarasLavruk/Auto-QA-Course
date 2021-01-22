package com.LT_automation_project_2020.pages;

import com.LT_automation_project_2020.framework.Header;
import org.openqa.selenium.remote.RemoteWebDriver;

public class W3SchoolsHomePage extends Page{

    private Header header;

    public W3SchoolsHomePage(RemoteWebDriver driver) {
        super(driver);
        this.header = new Header(driver);
    }

    public W3SchoolsExercisesPage navigateToW3SchoolsExercises() throws Exception {
        return header.navigateToW3SchoolsExercises();
    }

}
