package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public abstract class Page {
    WebDriver driver;

    public Page(WebDriver driver){
        this.driver = driver;
    }
    public abstract  <TPage extends BasePage> TPage getInstance(Class<TPage> pageClass) throws Exception ;

    public abstract WebElement getElement(By locator);
    public abstract String getPageTitle();

}
