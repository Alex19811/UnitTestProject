package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BbcSearchPage extends BasePage {

    public BbcSearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='search-input']")
    private WebElement searchInput;

    @FindBy(xpath = "//div[@class='ssrcss-1qt5at0-StyledDiv e56i0qu1']//button[@width='content-length']")
    private WebElement searchButton;

    public void searchByKeyword(String keyword) {
        searchInput.sendKeys(keyword);
        searchButton.click();
    }
}
