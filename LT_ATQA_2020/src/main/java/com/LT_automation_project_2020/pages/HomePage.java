package com.LT_automation_project_2020.pages;

import com.LT_automation_project_2020.framework.Footer;
import com.LT_automation_project_2020.framework.Header;
import com.LT_automation_project_2020.framework.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HomePage extends Page{

    private Header header;
    private Footer footer;
    private String outletReiPage = "//a[contains(text(),'Shop REI Outlet')]";


    public HomePage(RemoteWebDriver driver) {
        super(driver);
        this.header = new Header(driver);
        this.footer = new Footer(driver);
    }

    public OutletReiPage navigateToOutletReiPage() throws Exception {
        driver.findElement(By.xpath(outletReiPage)).click();
        return PageFactory.newPage(driver, OutletReiPage.class);
    }

    public W3SchoolsExercisesPage navigateToW3SchoolsExercises() throws Exception {
        return header.navigateToW3SchoolsExercises();
    }

    public EconomicsPravdaIfPage navigateToEconomicsPravdaIf() throws Exception {
        return header.navigateToEconomicsPravdaIf();
    }

    public <T extends Page> T searchWikiForItem(Class<T> clazz, String searchTerm) throws Exception {
        return header.setSearchWikiTerm(searchTerm).clickOnSearchButton(clazz);
    }

    public SierraDesignsTentsPage navigateToSierraDesignsTents() throws Exception {
        return footer.navigateToSierraDesignsTents();
    }
}
