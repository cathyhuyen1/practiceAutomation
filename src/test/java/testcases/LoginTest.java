package testcases;

import base.BaseTest;
import base.Page;
import com.google.common.collect.ClassToInstanceMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.LoginPage;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage l;

    @Test (priority = 1)
    public void verifyLoginTitle(){
        System.out.println("testing");
        l = new LoginPage(driver);

        String title = l.getLoginPageTitle();
        System.out.println("title = " + title);
        //log.info("Verify Title of Login Page");
       Assert.assertEquals(title,"Google" );
    }
    @Test (priority = 2)
    public void search(){
        System.out.println("testing");
        l.doSearch("Selenium");
        //log.info("Verify Title of Login Page");
        Assert.assertTrue(true );
    }

}
