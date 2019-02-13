package tests.steps;

import com.actions.HomePageActions;
import com.driverInitializer.DriverManager;
import com.driverInitializer.FirefoxDriverManager;
import com.support.Config;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import tests.BaseUtil;

public class BaseTest {

    private BaseUtil baseUtil;

    public BaseTest(BaseUtil baseUtil) {
        this.baseUtil = baseUtil;
    }

    protected WebDriver driver;
    protected DriverManager driverManager;

    @Before
    public void getDriver() {
        Config.loadConfig();
        String browser = Config.getBrowser();
        if (browser.equalsIgnoreCase("FIREFOX")) {
            driverManager = new FirefoxDriverManager();
            this.driver = driverManager.getDriver();
        } else if (browser.equalsIgnoreCase("CHROME")) {
            // TODO
        }
        this.driver.get("https://www.google.co.in/");
        this.driver.manage().window().maximize();
        baseUtil.driver = driver;
    }

    @After
    public void afterTest() {
        this.driverManager.quitDriver();
    }

}
