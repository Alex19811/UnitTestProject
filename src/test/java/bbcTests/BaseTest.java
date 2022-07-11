package bbcTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.*;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {

    WebDriver driver;
    private static final String BBC_URL = "https://bbc.com/";

    @BeforeTest
    public void profileSetup() {
        chromedriver().setup();
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BBC_URL);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public NewsPage getNewsPage() {
        return new NewsPage(getDriver());
    }

    public BbcSearchPage getSearchPage() {
        return new BbcSearchPage(getDriver());
    }

    public ClimatePage getClimatePage() {
        return new ClimatePage(getDriver());
    }

    public CoronavirusPage getCoronavirusPage() {
        return new CoronavirusPage(getDriver());
    }

    public QuestionsFormPage getQuestionsFormPage() {
        return new QuestionsFormPage(getDriver());
    }
}
