import org.testng.annotations.Test;
import org.testng.Assert;
import ui.screens.HomePage;

public class WebTablesTest extends BaseTest{

    @Test
    public void elementsTest() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://demoqa.com/webtables/");
        homePage.addButton().click();
        Assert.assertTrue(homePage.registrationFormTitle().isDisplayed());
        homePage.firstNameField().sendKeys("Jhon");
        homePage.lastNameField().sendKeys("Conor");
        homePage.emailField().sendKeys("test@test.com");
        homePage.ageField().sendKeys("23");
        homePage.salaryField().sendKeys("2000");
        homePage.departmentField().sendKeys("IT");
        homePage.submitButton().click();
        Assert.assertTrue(homePage.firstNameInTable().isDisplayed());
        Assert.assertTrue(homePage.lastNameInTable().isDisplayed());
        Assert.assertTrue(homePage.ageInTable().isDisplayed());
        Assert.assertTrue(homePage.emailInTable().isDisplayed());
        Assert.assertTrue(homePage.salaryInTable().isDisplayed());
        Assert.assertTrue(homePage.departmentInTable().isDisplayed());
        homePage.editButton().click();
        homePage.ageField().clear();
        homePage.ageField().sendKeys("35");
        homePage.salaryField().clear();
        homePage.salaryField().sendKeys("3000");
        homePage.departmentField().clear();
        homePage.departmentField().sendKeys("QA");
        homePage.submitButton().click();
    }
}
