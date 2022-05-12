package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.security.Key;

public class LoginPage extends BasePage {
    private final By searchtxt = By.name ("q");
    private final By searchbtn = By.name("btnK");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getTxtSearch() { return getElement(searchtxt);  }
    public WebElement getBtnSearch() { return getElement(searchbtn);  }

    public String getLoginPageTitle(){
        return getPageTitle();
    }
    public void doSearch(String searchValue) {
        getTxtSearch().sendKeys(searchValue);
        getTxtSearch().sendKeys(Keys.ENTER);
       // getBtnSearch().click();
    }

}
