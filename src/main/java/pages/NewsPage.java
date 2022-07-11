package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsPage extends BasePage {

    public NewsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h3[contains(@class,'paragon-bold nw-o-link-split__text')]")

    private WebElement nameOfTheHeadline;

    @FindBy(xpath = "//ul[@class ='gs-o-list-ui--top-no-border nw-c-nav__wide-sections']//span[contains(text(),'Climate')]")

    private WebElement categoryLinkOfHeadlineArticleClimate;
    @FindBy(xpath = "//a[@id='orbit-search-button']")

    private WebElement bbcButton;
    @FindBy(xpath = "//ul[@class ='gs-o-list-ui--top-no-border nw-c-nav__wide-sections']//span[contains(text(),'Coronavirus')]")

    private WebElement categoryLinkOfHeadlineArticleCoronavirus;

    public NewsPage() {
        super();
    }

    public boolean isNameOfTheHeadlineVisible() {
        return nameOfTheHeadline.isDisplayed();

    }

    public String getTextOfTheHeadlineArticle() {
        return nameOfTheHeadline.getText();
    }

    public String getContent() {
        return driver.getPageSource();
    }

    private String textOfCategorylink;

    public String gettextOfCategorylink() {
        return textOfCategorylink;
    }

    public WebElement getCategoryLinkOfHeadlineArticleClimate() {
        return categoryLinkOfHeadlineArticleClimate;
    }

    public String getTextOfCategorylinkOfHeadlineArticle() {
        textOfCategorylink = categoryLinkOfHeadlineArticleClimate.getText();
        return textOfCategorylink;
    }

    public boolean isBBCButtonVisibility() {
        return bbcButton.isDisplayed();
    }

    public void clickSearchBBCButton() {
        bbcButton.click();
    }

    public void clickCategorylinkOfHeadlineArticleCoronavirus() {
        categoryLinkOfHeadlineArticleCoronavirus.click();
    }
}
