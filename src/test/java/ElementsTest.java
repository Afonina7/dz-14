import org.testng.annotations.*;
import org.testng.Assert;
import ui.screens.HomePage;

public class ElementsTest extends BaseTest{

    @Test
    public void elementsTest() {
        HomePage homePage = new HomePage(driver);
        openUrl("https://demoqa.com/elements");
        Assert.assertEquals(driver.getTitle(), "DEMOQA");
        scrollDown();
        homePage.buttonsButton().click();
        homePage.clickMeButton().click();
        System.out.println(homePage.clickMessageText().getText());
    }
}
