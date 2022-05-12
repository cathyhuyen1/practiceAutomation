package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import pages.LoginPage;

public class BaseTest {
    public  WebDriver driver;

    @BeforeSuite
    public void launchBrowser() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.manage().window().maximize();

    }

    @AfterSuite
    public void tearDown(){
        // driver.close();
        System.out.println("END testing");
      //  driver.quit();

    }
}
