package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id='orb-header']//li[@class='orb-nav-newsdotcom']")
    private WebElement news;

    public boolean isNewsButtonVisibility() {
        return news.isDisplayed();
    }

    public void clickOnNews() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        news.click();
    }
}
