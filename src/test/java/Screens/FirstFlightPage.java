package Screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FirstFlightPage {
    WebDriver driver;

    @FindBy(how=How.ID,using = "h-restInfoPanel-orderOnlineId")  //nici macar nu se incarca pagina la ei
    private WebElement preorderButton;

    //constructor

    public FirstFlightPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }



}
