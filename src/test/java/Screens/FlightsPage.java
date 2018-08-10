package Screens;

import Help.HelperMethod;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FlightsPage {//pagina cu lista de filghturi gasite

    WebDriver driver;
    HelperMethod functions= new HelperMethod(driver);
    JavascriptExecutor jsx=(JavascriptExecutor)driver;


    @FindBy( how=How.XPATH, using="//button[@class='price-button js-raise-booking']")// lista de butoane select
    private List<WebElement>flightsList;
    @FindBy(how=How.XPATH, using="//span[@class='place-title__heading place-title--text js-place-title-nav']")
    private WebElement findFlightsPageTitle;

    public FlightsPage(WebDriver driver){ //constructor
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }

    public FlightsPage checkTitle()
    {
        Assert.assertTrue("actual"+ driver.getTitle(), driver.getTitle().contains("Minute"));
        return this;
    }

    public FirstFlightPage clickOnFirstFlight()
    {   functions.validatePage("Cheap", driver);
       // jsx.executeScript("window.scrollBy(0, 650)", "");
        functions.waitExplicit(flightsList.get(0), driver);//merge wait explicit cu lista?
        flightsList.get(0).click();
        return new FirstFlightPage(driver);
    }



}
