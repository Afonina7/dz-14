package ui.screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement buttonsButton() {
        return getElement("(//li[@id='item-4'])[1]");
    }

    public WebElement clickMeButton() {
        return getElement("(//*[contains(text(),'Click Me')])[3]");
    }

    public WebElement clickMessageText() {
        return getElement("//p[@id='dynamicClickMessage']");
    }

    public WebElement addButton() {
        return getElement("//button[@id='addNewRecordButton']");
    }

    public WebElement registrationFormTitle() {
        return getElement("//div[@id='registration-form-modal']");
    }

    public WebElement firstNameField() {
        return getElement("//input[@id='firstName']");
    }

    public WebElement lastNameField() {
        return getElement("//input[@id='lastName']");
    }

    public WebElement emailField() {
        return getElement("//input[@id='userEmail']");
    }

    public WebElement ageField() {
        return getElement("//input[@id='age']");
    }

    public WebElement salaryField() {
        return getElement("//input[@id='salary']");
    }

    public WebElement departmentField() {
        return getElement("//input[@id='department']");
    }

    public WebElement submitButton() {
        return getElement("//button[@id='submit']");
    }

    public WebElement firstNameInTable() {
        return getElement("//div[contains(@class,'rt-tr -even')]/div[contains(text(),'Jhon')]");
    }

    public WebElement lastNameInTable() {
        return getElement("//div[contains(@class,'rt-tr -even')]/div[contains(text(),'Conor')]");
    }

    public WebElement ageInTable() {
        return getElement("//div[contains(@class,'rt-tr -even')]/div[contains(text(),'23')]");
    }

    public WebElement emailInTable() {
        return getElement("//div[contains(@class,'rt-tr -even')]/div[contains(text(),'test@test.com')]");
    }

    public WebElement salaryInTable() {
        return getElement("//div[contains(@class,'rt-tr -even')]/div[contains(text(),'2000')]");
    }

    public WebElement departmentInTable() {
        return getElement("//div[contains(@class,'rt-tr -even')]/div[contains(text(),'IT')]");
    }

    public WebElement editButton() {
        return getElement("//div[contains(@class,'action-buttons')]/span[@id='edit-record-4']");
    }
}
