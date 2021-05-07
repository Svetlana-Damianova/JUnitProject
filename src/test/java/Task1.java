import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class Task1 {

    WebDriver driver;
    String url;

    @Before
    public void setUp() {
        String driverExecutablePath = "C://WebDriver//Bin//chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverExecutablePath);
        url = "http://www.google.com";
        driver = new ChromeDriver();

    }

    @After
    public void tearDown() {
        //driver.close();
    }



    @Test
    public void openBrowser() {
        driver.get(url);
        driver.manage().window().setSize(new Dimension(1552, 840));
        //Cookie cookie = new Cookie("CONSENT", "YES+BG.bg+V9+BX");
        //driver.manage().addCookie(cookie);
        //Cookie cookie = new Cookie("CONSENT", "YES+shp.gws-20210421-0-RC1.bg+FX+097","www.google.com",null,null);
        //driver.manage().addCookie(cookie);
        driver.findElement(By.xpath("//*[@id=\"zV9nZe\"]/div")).submit();

        WebElement webElement = driver.findElement(By.name("q"));
        webElement.click();
        webElement.sendKeys("selenium");
        webElement.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/a/h3")).click();
        String expectedText = "SeleniumHQ Browser Automation";
        Assert.assertEquals("SeleniumHQ Browser Automation", expectedText);


    }



}

