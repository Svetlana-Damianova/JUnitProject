import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {


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
    public void registration() throws InterruptedException {
        driver.get(url);
        driver.manage().window().setSize(new Dimension(1552, 840));
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("email_create")).click();
        driver.findElement(By.id("email_create")).sendKeys("svetlanatest1234@abv.bg");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
        Thread.sleep(3000);
        WebElement webElement = driver.findElement(By.id("id_gender2"));
        if (!webElement.isSelected()) {
            webElement.click();
        }
        driver.findElement(By.id("customer_firstname")).click();
        driver.findElement(By.id("customer_firstname")).sendKeys("Sara");
        driver.findElement(By.id("customer_lastname")).click();
        driver.findElement(By.id("customer_lastname")).sendKeys("Andreeva");
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).sendKeys("SaraAndreeva123");
        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"days\"]"));
        dropdown.findElement(By.xpath("//*[@id=\"days\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"months\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"years\"]")).click();
        driver.findElement(By.id("address1")).click();
        driver.findElement(By.id("address1")).sendKeys("Sofia, Geo milev, 16");
        driver.findElement(By.id("city")).click();
        driver.findElement(By.id("city")).sendKeys("Sofia");
        driver.findElement(By.cssSelector(".columns-container")).click();
        driver.findElement(By.id("id_state")).click();
        WebElement dropdown2 = driver.findElement(By.id("id_state"));
        dropdown2.findElement(By.xpath("//option[. = 'California']")).click();
        driver.findElement(By.id("postcode")).click();
        driver.findElement(By.id("postcode")).sendKeys("12345");
        driver.findElement(By.cssSelector("#phone_mobile")).click();
        driver.findElement(By.cssSelector("#phone_mobile")).sendKeys("0888456331");
        driver.findElement(By.xpath("//*[@id=\"alias\"]")).click();;
        driver.findElement(By.xpath("//*[@id=\"alias\"]")).sendKeys("Sofia,12345,Sofia");
        driver.findElement(By.cssSelector("#submitAccount > span")).click();
        String expectedText ="Welcome to your account. Here you can manage all of your personal information and orders.";
        Assert.assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.",expectedText);

    }
}
