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

public class ShopPage {

    WebDriver driver;
    HelperMethod functions;
    JavascriptExecutor jsy=(JavascriptExecutor)driver;

    @FindBy( how=How.XPATH, using="//div[@class='product-summary__media']//div[@class='product-summary__media-image-wrapper']//img[@class='product-summary__media-image']")
    private List<WebElement> booksList;


    public ShopPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    //verifyBook() - click; nextPage; validare; go back;

    public ShopPage checkTitle()
    {
        Assert.assertTrue("actual"+ driver.getTitle(), driver.getTitle().contains("Shop Guide Books, Art & Inspiration, Language Guides, and Lonely Planet Kids - Lonely Planet UK"));
        return this;
    }
  /*  public aBookPage clickOnBook()
    { //  for(i=1; i<=5; i++){

        functions.waitExplicitList(booksList, driver);
        jsy.executeScript("window.scrollBy(0, 850)", "");
        booksList.get(1).click();
        return new aBookPage(driver);
    }*/
}
