package bbcTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import static bbcTests.Part1Tests.DEFAULT_WAITING_TIME;


public class Part2Tests extends BaseTest {

    private static final String QUESTIONS = "Hello BBC";
    private static final String NAME = "Gregory";
    private static final String EMAIL_ADDRESS = "Gregory@Gmail.com";
    private static final String CONTACT_NUMBER = "8 (0432) 55 23 45";
    private static final String LOCATION = "Vinnytsia Ukraine";
    private static final String AGE = "30";
    private static final String EMAIL_ERROR_MASSAGE = "//div[@class='input-error-message']";

    @Test(priority = 1)
    public void verifiesThatUserCanSubmitAQuestionToBBCEmailError() throws InterruptedException {
        getHomePage().waitForPageLocalComplete(DEFAULT_WAITING_TIME);
        getHomePage().isNewsButtonVisibility();
        getHomePage().clickOnNews();
        getNewsPage().clickCategorylinkOfHeadlineArticleCoronavirus();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getCoronavirusPage().clicksCloseRegisterWindow();
        getCoronavirusPage().clicksOnYourCoronavirusStories();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getCoronavirusPage().clicksOnYourQuestions();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        getQuestionsFormPage().inputQuestions(QUESTIONS);
        getQuestionsFormPage().inputName(NAME);
        getQuestionsFormPage().inputContactNumber(CONTACT_NUMBER);
        getQuestionsFormPage().inputLocation(LOCATION);
        getQuestionsFormPage().inputAge(AGE);
        getQuestionsFormPage().clickAccept();
        getQuestionsFormPage().clickSubmit();
        Assert.assertEquals(getQuestionsFormPage().getEmailErrorMassage(), "Email address can't be blank");
    }

    @Test(priority = 2)
    public void verifiesThatUserCanSubmitAQuestionToBBCAcceptedError() throws InterruptedException {
        getHomePage().waitForPageLocalComplete(DEFAULT_WAITING_TIME);
        getHomePage().isNewsButtonVisibility();
        getHomePage().clickOnNews();
        getNewsPage().clickCategorylinkOfHeadlineArticleCoronavirus();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getCoronavirusPage().clicksCloseRegisterWindow();
        getCoronavirusPage().clicksOnYourCoronavirusStories();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getCoronavirusPage().clicksOnYourQuestions();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        getQuestionsFormPage().inputQuestions(QUESTIONS);
        getQuestionsFormPage().inputName(NAME);
        getQuestionsFormPage().inputEmailAddress(EMAIL_ADDRESS);
        getQuestionsFormPage().inputContactNumber(CONTACT_NUMBER);
        getQuestionsFormPage().inputLocation(LOCATION);
        getQuestionsFormPage().inputAge(AGE);
        getQuestionsFormPage().clickSubmit();
        Assert.assertEquals(getQuestionsFormPage().getAcceptErrorMassage(), "must be accepted");
    }

    @Test(priority = 3)
    public void verifiesThatUserCanSubmitAQuestionToBBCNameError() throws InterruptedException {
        getHomePage().waitForPageLocalComplete(DEFAULT_WAITING_TIME);
        getHomePage().isNewsButtonVisibility();
        getHomePage().clickOnNews();
        getNewsPage().clickCategorylinkOfHeadlineArticleCoronavirus();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getCoronavirusPage().clicksCloseRegisterWindow();
        getCoronavirusPage().clicksOnYourCoronavirusStories();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        getCoronavirusPage().clicksOnYourQuestions();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        getQuestionsFormPage().inputQuestions(QUESTIONS);
        getQuestionsFormPage().inputEmailAddress(EMAIL_ADDRESS);
        getQuestionsFormPage().inputContactNumber(CONTACT_NUMBER);
        getQuestionsFormPage().inputLocation(LOCATION);
        getQuestionsFormPage().inputAge(AGE);
        getQuestionsFormPage().clickAccept();
        getQuestionsFormPage().clickSubmit();
        Assert.assertEquals(getQuestionsFormPage().getNameErrorMassage(), "Name can't be blank");
    }
}
