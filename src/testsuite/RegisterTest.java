package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        this.openBrowser(this.baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        String expectedMessage = "Register";
        WebElement register = driver.findElement(By.linkText("Register"));
        register.click();
        WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Register')]"));
        String actualMessage = actualMessageElement.getText();
        Assert.assertEquals("Register tab is not matching", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        String expectedMessage = "Your registration completed";
        WebElement register = driver.findElement(By.linkText("Register"));
        register.click();
        WebElement radioButton = driver.findElement(By.id("gender-female"));
        radioButton.click();
        WebElement firstName = driver.findElement(By.id("FirstName"));
        firstName.sendKeys(new CharSequence[]{"Minesh"});
        WebElement lastName = driver.findElement(By.id("LastName"));
        lastName.sendKeys(new CharSequence[]{"Desai"});
        WebElement dayOfBirthday = driver.findElement(By.name("DateOfBirthDay"));
        dayOfBirthday.sendKeys(new CharSequence[]{"5"});
        WebElement dateOfBirthMonth = driver.findElement(By.name("DateOfBirthMonth"));
        dateOfBirthMonth.sendKeys(new CharSequence[]{"May"});
        WebElement dateOfBirthYear = driver.findElement(By.name("DateOfBirthYear"));
        dateOfBirthYear.sendKeys(new CharSequence[]{"1980"});
        WebElement emailId = driver.findElement(By.id("Email"));
        emailId.sendKeys(new CharSequence[]{"Minesh1234@gmail.com"});
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys(new CharSequence[]{"Minesh123"});
        WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
        confirmPassword.sendKeys(new CharSequence[]{"Minesh123"});
        WebElement registerButton = driver.findElement(By.id("register-button"));
        registerButton.click();
    }

    @After
    public void tearDown() {
        this.closeBrowser();
    }
}


