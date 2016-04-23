import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class LoginPageNegativeTests {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = new FirefoxDriver();
    }

    @Test
    public void verifyLoginWrongPassword() {

        driver.get("http://195.34.100.202:60010/book/Login");
        String validUsername = "admin";
        String wrongPassword = "admin1";

        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".container-fluid.bg-3.text-center")));

        WebElement txtUsername = driver.findElement(By.id("MainContent_tbUser"));
        txtUsername.clear();
        txtUsername.sendKeys(validUsername);

        WebElement txtPassword = driver.findElement(By.id("MainContent_tbPass"));
        txtPassword.clear();
        txtPassword.sendKeys(wrongPassword);

        WebElement submitButton = driver.findElement(By.id("MainContent_btnLogin"));
        submitButton.click();


        WebDriverWait waitForErrorMessage = new WebDriverWait(driver, 10);
        waitForErrorMessage.until(ExpectedConditions.visibilityOfElementLocated(By.id("MainContent_lblError")));
        WebElement errorMessage = driver.findElement(By.id("MainContent_lblError"));
        String textFromElement = errorMessage.getText();
        assertThat(textFromElement, equalTo("Нe съществува потребител с такова име или парола!"));
    }

    @Test
    public void verifyLoginEmptyPassword (){
        driver.get("http://195.34.100.202:60010/book/Login");
        String validUsername = "admin";

        new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".container-fluid.bg-3.text-center")));

        WebElement txtUsername = driver.findElement(By.id("MainContent_tbUser"));
        txtUsername.clear();
        txtUsername.sendKeys(validUsername);

        WebElement txtPass = driver.findElement(By.id("MainContent_tbPass"));
        txtPass.clear();
        txtUsername.sendKeys("");

        WebElement submitButton = driver.findElement(By.id("MainContent_btnLogin"));
        submitButton.click();

        WebDriverWait waitForErrorMessage = new WebDriverWait(driver, 10);
        waitForErrorMessage.until(ExpectedConditions.visibilityOfElementLocated(By.id("MainContent_lblError")));
        WebElement errorMessage = driver.findElement(By.id("MainContent_lblError"));
        String textFromElement = errorMessage.getText();
        assertThat(textFromElement, equalTo("Нe съществува потребител с такова име или парола!"));
    }

    @Test
    public void verifyLoginEmptyFields (){
        driver.get("http://195.34.100.202:60010/book/Login");

        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".container-fluid.bg-3.text-center")));

        WebElement txtUsername = driver.findElement(By.id("MainContent_tbUser"));
        txtUsername.clear();
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.id("MainContent_tbPass"));
        txtPassword.clear();
        txtPassword.sendKeys();

        WebElement submitButton = driver.findElement(By.id("MainContent_btnLogin"));
        submitButton.click();

        WebDriverWait waitForErrorMessage = new WebDriverWait(driver, 10);
        waitForErrorMessage.until(ExpectedConditions.visibilityOfElementLocated(By.id("MainContent_lblError")));
        WebElement errorMessage = driver.findElement(By.id("MainContent_lblError"));
        String textFromElement = errorMessage.getText();
        assertThat(textFromElement, equalTo("Нe съществува потребител с такова име или парола!"));

    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
