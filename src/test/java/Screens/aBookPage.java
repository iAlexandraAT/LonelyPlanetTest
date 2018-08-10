package Screens;

import Help.HelperMethod;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class aBookPage {


    WebDriver driver;
    HelperMethod helper;
    JavascriptExecutor jsy = (JavascriptExecutor) driver;

    public aBookPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


  /*  public
assert this:
//img[@class='product-details__primary-image']
*/
}