package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class ClimatePage extends BasePage {

    public ClimatePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[contains(text(),'Global Climate Debate')]")
    private WebElement nameOfFirstArticle;

    public ClimatePage() {
        super(driver);
    }

    public String getNameOfTheFirstArticle() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return nameOfFirstArticle.getText();
    }
}
