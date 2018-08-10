package Help;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class HelperMethod {
    WebDriver driver;

    //constructor
    public HelperMethod(WebDriver driver) {
        this.driver = driver;

    }
    //METHODS//
    //CLICK ON A RANDOM WEBELEMENT
    public void clickWebElement(WebElement element) {
        element.click();
    }

    //Validate a page displayed
    public void validatePage(String expected, WebDriver driver) {
        if (!(expected.isEmpty())) {
            String actual = driver.getTitle();
            Assert.assertEquals(expected, actual);
        }
    }

    //fill a webelement with a value
    public void fillWebElement(WebElement element, String value)
    {
        element.sendKeys(value);
    }

    //select by text
    public void selectByText( WebElement element, String text){

        Select dropDown=new Select(element);
        dropDown.selectByVisibleText(text);}

    //select by value
    public void selectByValue(WebElement element, String value)
    {Select dropDown=new Select(element);
        dropDown.selectByValue(value);}

    //hover a webelement
    public void hoverWebElement(WebElement element, WebDriver driver)
    { Actions action= new Actions(driver);
        action.moveToElement(element).build().perform(); }

    //wait explicit on webElement
    public void waitExplicit(WebElement element, WebDriver driver)
    {
        new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOf(element));}


     /*   public String switchToAnotherTab(){
            driver.get("https://www.lonelyplanet.com/flights");
            String windowHandle = driver.getWindowHandle();
            driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
            ArrayList tabs = new ArrayList(driver.getWindowHandles());
            System.out.println(tabs.size());
            driver.switchTo().window(tabs.get(0));
        }  */
  /*  public String switchToChildWindow() {

         String parentWindow = driver.getWindowHandle();
         for (String winhandle : driver.getWindowHandles()) {
             if (!parentWindow.equals(winhandle)) {
                 driver.switchTo().window(winhandle);
             }
         }
         return parentWindow;
     }
*/
}
