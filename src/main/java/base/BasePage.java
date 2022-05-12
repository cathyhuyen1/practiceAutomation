package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage extends Page{


    public BasePage(WebDriver driver) {
        super(driver);
    }

        @Override
        public <TPage extends BasePage> TPage getInstance(Class<TPage> pageClass) throws Exception {

            try {
                return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);

            }catch (Exception e){

                throw e;
            }
        }


    public String getPageTitle(){
        return  driver.getTitle();
    }
    @Override
    public WebElement getElement(By locator) {
        WebElement element;
        try{
            element = driver.findElement(locator);
            return element;
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }
}
