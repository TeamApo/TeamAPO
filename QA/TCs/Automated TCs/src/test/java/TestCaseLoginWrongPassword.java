import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by W520 on 16.4.2016 г..
 */
public class TestCaseLoginWrongPassword {
    private WebDriver driver;

    @Before
    public void setUp() {

        driver = new FirefoxDriver();
    }

    @Test
    public void test_Login() {

        driver.get("http://books.tto.bg/Login.aspx");
        String username = "admin";
        String password = "admin1";

        new WebDriverWait(driver, 10).until(ExpectedConditions.titleIs("Book Store"));
        assertTrue((driver.getTitle().equals("Book Store")));

        WebElement txtUsername = driver.findElement(By.id("Login_name"));
        txtUsername.sendKeys(username);

        WebElement txtPassword = driver.findElement(By.id("Login_password"));
        txtPassword.sendKeys(password);

        WebElement submitButton = driver.findElement(By.cssSelector("[type='submit'][id='Login_login']"));
        submitButton.click();

        new WebDriverWait(driver, 10).until(ExpectedConditions.titleIs("Book Store"));
        assertTrue((driver.getTitle().equals("Book Store")));

        WebElement errorMessage = driver.findElement(By.cssSelector("[id=Login_message]"));
        String textFromElement = errorMessage.getText();
        assertThat(textFromElement, equalTo("Login or Password is incorrect."));
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
