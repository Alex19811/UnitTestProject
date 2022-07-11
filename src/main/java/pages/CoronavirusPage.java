package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoronavirusPage extends BasePage {

    public CoronavirusPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//li[contains(@class,'container')]//span[contains(text(),'Your Coronavirus Stories')]")
    private WebElement yourCoronavirusStories;

    @FindBy(xpath = "//a[@href='/news/52143212']")
    private WebElement yourQuestions;

    @FindBy(xpath = "//button[@class='tp-close tp-active']")
    private WebElement closeRegisterWindow;

    public void clicksOnYourCoronavirusStories() {
        yourCoronavirusStories.click();
    }

    public void clicksOnYourQuestions() {
        yourQuestions.click();
    }

    public WebElement clicksCloseRegisterWindow() {
        closeRegisterWindow.click();
        return null;
    }
}
