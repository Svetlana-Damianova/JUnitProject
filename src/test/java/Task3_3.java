import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Task3_3 {

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
        String mainWindowId = driver.getWindowHandle();
        System.out.println(mainWindowId);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript(" window.open('https://www.abv.bg');");
        driver.findElement(By.className("mat-ripple mat-button-ripple")).click();
        Set<String> windowsIds = driver.getWindowHandles();
        String childId = null;
        for (String ids:windowsIds) {

            if (ids != mainWindowId) {
                childId=ids;
                break;
            }

        }
        Assert.assertNotNull(childId);
        driver.switchTo().window(childId);
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys("dadanene");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.id("loginBut")).click();
        driver.close();
        driver.switchTo().window(mainWindowId);
        driver.findElement(By.id("search_query_top")).click();
        driver.findElement(By.id("search_query_top")).sendKeys("skirt");
        driver.close();

    }
}
