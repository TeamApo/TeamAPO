import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;


/**
 * Created by W520 on 19.4.2016 г..
 */
public class LoginPagePositiveTests {

    private WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new FirefoxDriver();
    }

    @Test
    public void verifySuccessfulLogin () {

        driver.get("http://195.34.100.202:60010/book/Login");
        String validUsername = "admin";
        String validPassword = "admin";

        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".container-fluid.bg-3.text-center")));
        WebElement txtUsername = driver.findElement(By.id("MainContent_tbUser"));
        txtUsername.clear();
        txtUsername.sendKeys(validUsername);

        WebElement txtPassword = driver.findElement(By.id("MainContent_tbPass"));
        txtPassword.clear();
        txtPassword.sendKeys(validPassword);

        WebElement submitButton = driver.findElement(By.id("MainContent_btnLogin"));
        submitButton.click();

        WebDriverWait waitForWelcomeMessage = new WebDriverWait(driver, 10);
        waitForWelcomeMessage.until(ExpectedConditions.visibilityOfElementLocated(By.id("MainContent_welcome")));
        WebElement welcomeTextUser = driver.findElement(By.id("MainContent_welcome"));
        String textFromElement = welcomeTextUser.getText();
        assertThat(textFromElement, equalTo("Здравей, Мариян !"));


    }
    @AfterMethod

    public void tearDown(){
        driver.quit();
    }


}
