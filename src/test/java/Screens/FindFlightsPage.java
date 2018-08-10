package Screens;

import Help.HelperMethod;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Date;

public class FindFlightsPage {
    WebDriver driver;
    HelperMethod functions;

    @FindBy( how = How.XPATH, using = "//input[@id='js-from-city']")
    private WebElement fromField;
    @FindBy ( how = How.XPATH, using = "//input[@id='js-to-city']")
    private WebElement toField;
    @FindBy ( how = How.ID, using = "flight-depart-date")
    private WebElement departureField;
    @FindBy (how= How.XPATH, using ="//*[@id='flight-depart-date']/..//div[contains(text(),'17') and contains(@class, 'infocus')]")
    private WebElement departureDate;
    @FindBy ( how = How.ID, using = "flight-return-date")
    private WebElement arrivalField;
    @FindBy ( how = How.XPATH, using = "//*[@id='flight-return-date']/..//div[contains(text(),'20') and contains(@class, 'infocus')]")
    private WebElement arrivalDate;
    @FindBy ( how = How.ID, using = "round-trip")
    private WebElement roundTripRadioButton;
    @FindBy(how=How.ID, using="flight-currency")
    private WebElement currencyDrop;
    @FindBy ( how = How.ID, using = "adult-num")
    private WebElement adultNumDrop;
    @FindBy ( how = How.ID, using = "child-num")
    private WebElement childNumDrop;
    @FindBy ( how = How.ID, using = "js-flights-submit")
    private WebElement submitButton;


    public FindFlightsPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public FindFlightsPage fillSearch(String from, String to){
    fromField.sendKeys(from);
    toField.sendKeys(to);
    departureField.click();
    departureDate.click();
    arrivalField.click();//find element by value?? //cred ca trebuie select by value din helper method
    arrivalDate.click();
    roundTripRadioButton.click();
   // currencyDrop.click();
  //  functions.selectByText(currencyDrop, "EUR");
   // adultNumDrop.click();

        return this;
    }

       //metoda care da click pe gaseste flights
    public FlightsPage goToFlightsPage()
    {
        submitButton.click();
       // psdbComponent.submitButton.click();
        //ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
       // driver.switchTo().window(tabs2.get(1));  //i tried
        return new FlightsPage(driver);
    }
    /*  public String FindFlightsPage switchToChild() {  //??wtf  //another solution

        String parentWindow = driver.getWindowHandle();
        for (String winhandle : driver.getWindowHandles()) {
            if (!parentWindow.equals(winhandle)) {
                driver.switchTo().window(winhandle);
            }
        }
        return parentWindow;
    }  */
}
