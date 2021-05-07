import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Task4_4 {

    WebDriver driver;
    String url;

    @Before
    public void setUp() {
        String driverExecutablePath = "C://WebDriver//Bin//chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverExecutablePath);
        url = "http://automationpractice.com/index.php";
        driver = new ChromeDriver();

    }

    @After
    public void tearDown() {
        //driver.quit();
    }

    @Test
    public void registration() throws InterruptedException {
        driver.get(url);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1552, 840));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(" prompt(\"Please enter your name:\", \"Name:\");");

        //WebDriverWait wait2 = wait2.until(ExpectedConditions.alertIsPresent());
        //wait2.until();
        driver.switchTo().alert().sendKeys("Text");
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver,4);
        WebElement confirmButton = wait.until(ExpectedConditions.elementToBeClickable(By.name(" prompt(\"Please enter your name:\", \"Name:\");")));
        Thread.sleep(3000);
        confirmButton.click();
        Thread.sleep(3000);
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.sendKeys("Testtest123");
        alert.accept();



    }
}
