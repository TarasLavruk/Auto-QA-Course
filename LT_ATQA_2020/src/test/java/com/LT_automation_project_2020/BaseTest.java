package com.LT_automation_project_2020;


import com.LT_automation_project_2020.listeners.TestListener;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import static org.apache.commons.lang3.SystemUtils.*;

@Listeners(TestListener.class)
public abstract class BaseTest {

    private static final String DEFAULT_ENV_PROPERTIES_PATH = "src/test/resources/test.properties";
    protected RemoteWebDriver driver = null;
    private static Properties properties;

    static {
        properties = new Properties();
        loadPropertiesFromFile(DEFAULT_ENV_PROPERTIES_PATH);
    }

    @BeforeMethod(alwaysRun = true)
    public void setUp() {

        if (IS_OS_MAC || IS_OS_LINUX) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        } else if (IS_OS_WINDOWS) {
            System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
        }
        driver = new ChromeDriver();
//        driver.manage().window().maximize();
        System.out.println("setup");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        System.out.println("teardown");
    }

    protected String getPravdaUrl(){
        String result = properties.getProperty("test.pravdaUrl");
        return (result != null) ? result.trim() : null;
    }

    protected String getReiUrl(){
        String result = properties.getProperty("test.reiUrl");
        return (result != null) ? result.trim() : null;
    }

    protected String getSierraDesignsUrl(){
        String result = properties.getProperty("test.sierraDesignsUrl");
        return (result != null) ? result.trim() : null;
    }

    protected String getW3SchoolsUrl(){
        String result = properties.getProperty("test.w3SchoolsUrl");
        return (result != null) ? result.trim() : null;
    }

    protected String getWikiUrl(){
        String result = properties.getProperty("test.wikiUrl");
        return (result != null) ? result.trim() : null;
    }
    protected String getProperty(String key){
        String result = properties.getProperty(key);
        return (result != null) ? result.trim() : null;
    }

    private static void loadPropertiesFromFile(String propertiesFilePath){
        try {
            InputStream propertiesStream;
            propertiesStream = new FileInputStream(new File(propertiesFilePath).getPath());
            properties.load(propertiesStream);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
