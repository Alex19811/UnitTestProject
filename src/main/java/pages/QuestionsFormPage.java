package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuestionsFormPage extends BasePage {

    public QuestionsFormPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//textarea[@placeholder='What questions would you like us to answer?']")
    private WebElement inputQuestions;
    @FindBy(xpath = "//input[@placeholder='Name']")
    private WebElement inputName;
    @FindBy(xpath = "//input[@placeholder='Email address']")
    private WebElement inputEmailAddress;
    @FindBy(xpath = "//input[@placeholder='Contact number']")
    private WebElement inputContactNumber;
    @FindBy(xpath = "//input[@placeholder='Location ']")
    private WebElement inputLocation;
    @FindBy(xpath = "//input[@placeholder='Age']")
    private WebElement inputAge;
    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement accept;
    @FindBy(xpath = "//button[@class='button']")
    private WebElement submit;
    @FindBy(xpath = "//div[@class='input-error-message']")
    private WebElement emailErrorMassage;
    @FindBy(xpath = "//div[@class='checkbox']//div[@class='input-error-message']")
    private WebElement acceptErrorMassage;
    @FindBy(xpath = "//div[@class ='text-input--error']//div[@class='input-error-message']")
    private WebElement nameErrorMassage;

    public void inputQuestions(final String questions) {
        inputQuestions.sendKeys(questions);
    }

    public void inputName(final String name) {
        inputName.sendKeys(name);
    }

    public void inputEmailAddress(final String email) {
        inputEmailAddress.sendKeys(email);
    }

    public void inputContactNumber(final String contactNumber) {
        inputContactNumber.sendKeys(contactNumber);
    }

    public void inputLocation(final String location) {
        inputLocation.sendKeys(location);
    }

    public void inputAge(final String age) {
        inputAge.sendKeys(age);
    }

    public void clickAccept() {
        accept.click();
    }

    public void clickSubmit() {
        submit.click();
    }

    public String getEmailErrorMassage() {
        return emailErrorMassage.getText();
    }

    public String getAcceptErrorMassage() {
        return acceptErrorMassage.getText();
    }

    public String getNameErrorMassage() {
        return nameErrorMassage.getText();
    }
}
