package app;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppPractice {

    public static void main (String[] args){

        System.setProperty("webdriver.chrome.driver",  "./src/main/resources/drivers/chromedriver.exe");
        WebDriver d = new ChromeDriver();
        d.get("https://www.google.com/");

        WebElement e = d.findElement(By.id ("input"));

        e.sendKeys("selenium");

        d.quit();
    }
}
