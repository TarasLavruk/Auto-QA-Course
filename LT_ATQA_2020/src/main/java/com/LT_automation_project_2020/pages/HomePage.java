package com.LT_automation_project_2020.pages;

import com.LT_automation_project_2020.framework.Footer;
import com.LT_automation_project_2020.framework.Header;
import com.LT_automation_project_2020.framework.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HomePage extends Page{

    private Header header;
    private Footer footer;
    private String fitnessElectronicsReiPage = "//span[contains(text(), 'Fitness')]";


    public HomePage(RemoteWebDriver driver) {
        super(driver);
        this.header = new Header(driver);
        this.footer = new Footer(driver);
    }

    public FitnessElectronicsReiPage navigateToFitnessElectronicsReiPage() throws Exception {
        driver.findElement(By.xpath(fitnessElectronicsReiPage)).click();
        return PageFactory.newPage(driver, FitnessElectronicsReiPage.class);
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
