package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {

        String baseurl = "https://demo.nopcommerce.com";

        @Before
        public void setUp() {
            this.openBrowser(this.baseurl);
        }

        @After
        public void terminateBrowser() {
            this.closeBrowser();
        }

        @Test
        public void userShouldNavigateToComputerPageSuccessfully() {
            String expectedMessage = "Computers";
            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']")).click();
            WebElement getMessage = driver.findElement(By.xpath("//h1"));
            String actualMessage = getMessage.getText();
            Assert.assertEquals("Fail to click on Computer tab", expectedMessage, actualMessage);
        }

        @Test
        public void userShouldNavigateToElectronicsPageSuccessfully() {
            String expectedMessage = "Electronics";
            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']")).click();
            WebElement getMessage = driver.findElement(By.xpath("//h1"));
            String actualMessage = getMessage.getText();
            Assert.assertEquals("Fail to click on Electronics tab", expectedMessage, actualMessage);
        }

        @Test
        public void userShouldNavigateToApparelPageSuccessfully() {
            String expectedMessage = "Apparel";
            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']")).click();
            WebElement getMessage = driver.findElement(By.xpath("//h1"));
            String actualMessage = getMessage.getText();
            Assert.assertEquals("Fail to click on Apparel tab", expectedMessage, actualMessage);
        }

        @Test
        public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
            String expectedMessage = "Digital downloads";
            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']")).click();
            WebElement getMessage = driver.findElement(By.xpath("//h1"));
            String actualMessage = getMessage.getText();
            Assert.assertEquals("Fail to click on Digital downloads tab", expectedMessage, actualMessage);
        }

        @Test
        public void userShouldNavigateToBooksPageSuccessfully() {
            String expectedMessage = "Books";
            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']")).click();
            WebElement getMessage = driver.findElement(By.xpath("//h1"));
            String actualMessage = getMessage.getText();
            Assert.assertEquals("Fail to click on Books tab", expectedMessage, actualMessage);
        }

        @Test
        public void userShouldNavigateToJewelryPageSuccessfully() {
            String expectedMessage = "Jewelry";
            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']")).click();
            WebElement getMessage = driver.findElement(By.xpath("//h1"));
            String actualMessage = getMessage.getText();
            Assert.assertEquals("Fail to click on Jewelry tab", expectedMessage, actualMessage);
        }

        @Test
        public void userShouldNavigateToGiftCardsPageSuccessfully() {
            String expectedMessage = "Gift Cards";
            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']")).click();
            WebElement getMessage = driver.findElement(By.xpath("//h1"));
            String actualMessage = getMessage.getText();
            Assert.assertEquals("Fail to click on Gift Cards tab", expectedMessage, actualMessage);
        }
    }


