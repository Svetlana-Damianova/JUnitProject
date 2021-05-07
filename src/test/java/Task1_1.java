import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task1_1 {

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
        driver.close();
    }

    @Test
    public void registration() {
        driver.get(url);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1552, 840));
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"contact-link\"]/a")).click();
        WebElement dropdown = driver.findElement(By.id("id_contact"));
        dropdown.click();
        dropdown.findElement(By.xpath("//option[. = 'Customer service']")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("testtest1234@abv.bg");
        driver.findElement(By.id("id_order")).click();
        driver.findElement(By.id("id_order")).sendKeys("1234567890");
        driver.findElement(By.name("message")).click();
        driver.findElement(By.name("message")).sendKeys("This is test! I will send some test to custom service.");
        driver.findElement(By.cssSelector("#submitMessage > span")).click();

    }
}
