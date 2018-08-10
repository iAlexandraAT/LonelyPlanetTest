package Screens;

import Help.HelperMethod;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LonelyPlanetHomepage {

    WebDriver driver;
    public HelperMethod functions = new HelperMethod(driver);
  // public HelperMethod helper=new HelperMethod(driver);

    @FindBy (how=How.XPATH, using = "//a[contains(text(), 'Bookings')]")
    private WebElement bookingsButton;
    @FindBy (how = How.XPATH, using="//ul[@class='sub-navigation__list']//a[@href='https://www.lonelyplanet.com/flights']")
    private WebElement flightsButton;
    //Actions action=new Actions(driver);
    @FindBy(how = How.XPATH, using="//a[@href='//www.lonelyplanet.com/search']")
    private WebElement shopButton;  //ptr al doilea test

    //constructor
    public LonelyPlanetHomepage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public FindFlightsPage goToFindFlightsPage() {
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        functions.validatePage("Lonely Planet", driver);
        functions.waitExplicit(bookingsButton, driver);
        functions.hoverWebElement(bookingsButton, driver);
        functions.waitExplicit(flightsButton, driver);
      //  functions.clickWebElement(bookingsButton);
        functions.clickWebElement(flightsButton);
        return new FindFlightsPage(driver);
    }
    /* public FindFlightsPage verifyTitle()
   {
       Assert.assertTrue(LonelyPlanetHomepageTitle.getText().contains("Lonely Planet"));
       return this;
   }
*/
    public ShopPage goToBooks(){
        functions.clickWebElement(shopButton);
        return new ShopPage(driver);
    }

}
