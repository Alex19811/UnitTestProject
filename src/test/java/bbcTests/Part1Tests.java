package bbcTests;

import org.apache.commons.compress.utils.Lists;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NewsPage;

import java.util.List;

public class Part1Tests extends BaseTest {

    public static final long DEFAULT_WAITING_TIME = 60;

    @Test(priority = 1)
    public void checksTheNameOfTheHeadlineArticle() throws InterruptedException {
        getHomePage().waitForPageLocalComplete(DEFAULT_WAITING_TIME);
        getHomePage().isNewsButtonVisibility();
        getHomePage().clickOnNews();
        Assert.assertTrue(getNewsPage().isNameOfTheHeadlineVisible());
        Assert.assertEquals(getNewsPage().getTextOfTheHeadlineArticle(), "Sweden confirms it will apply to join Nato");
    }

    @Test(priority = 2)
    public void checksSecondaryArticleTitles() throws InterruptedException {
        getHomePage().waitForPageLocalComplete(DEFAULT_WAITING_TIME);
        getHomePage().isNewsButtonVisibility();
        getHomePage().clickOnNews();
        List<String> articleList = Lists.newArrayList();
        articleList.add("Fighters from Mariupol arrive in Russian-held town");
        articleList.add("Fighters are leaving steelworks - Zelensky");
        articleList.add("In maps: Russian advances remain marginal");
        String content = getNewsPage().getContent();
        boolean result = true;
        for (String title : articleList) {
            result = result && content.contains(title);
        }
        Assert.assertTrue(result);

    }

    @Test(priority = 3)
    public void checkNameOFFirstArticleAgainstASpecifiedValue() throws InterruptedException {
        getHomePage().waitForPageLocalComplete(DEFAULT_WAITING_TIME);
        getHomePage().isNewsButtonVisibility();
        getHomePage().clickOnNews();
        getHomePage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getNewsPage().getCategoryLinkOfHeadlineArticleClimate());
        getNewsPage().getTextOfCategorylinkOfHeadlineArticle();
        NewsPage newsPage = new NewsPage(driver);
        newsPage.getTextOfCategorylinkOfHeadlineArticle();
        newsPage.isBBCButtonVisibility();
        getNewsPage().clickSearchBBCButton();
        getSearchPage().searchByKeyword(newsPage.gettextOfCategorylink());
        Assert.assertEquals(getClimatePage().getNameOfTheFirstArticle(), "Global Climate Debate");
    }
}
