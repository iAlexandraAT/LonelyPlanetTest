package Tests;

import Help.BaseTest;
import Help.HelperMethod;
import Screens.LonelyPlanetHomepage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tests extends BaseTest {
    public HelperMethod functions;

    @Before
    public void initiate()
    {
        functions=new HelperMethod(driver);
    }


    //  public WebDriver driver;

    @Test
    public void firstTest() {

        LonelyPlanetHomepage homepage= new LonelyPlanetHomepage(driver);
        homepage.goToFindFlightsPage()
                .fillSearch("Cluj Napoca", "Dusseldorf")
                .goToFlightsPage()
                .checkTitle()
                //.switchToChild()
                .clickOnFirstFlight();


    }

  /*  @Test
    public void secondTest(){
        LonelyPlanetHomepage homepage= new LonelyPlanetHomepage(driver);
        homepage.goToBooks()
                .checkTitle()
                .clickOnBook()
                .

    } */

}
