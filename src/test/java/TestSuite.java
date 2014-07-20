import Library.BusinessLibrary;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;import java.lang.String;

/**
 * Created by SRI on 15-Jul-14.
 */
public class TestSuite extends BaseTest {
    ///-----data

    String quantity="1";
    String item="Apple iPhone 5";
    String price=" 579.00 € incl tax";

    ////----

    @Test
    public void basketPresentInHomePage() {
        Library.gotoHomePage();
        Assert.assertTrue(BusinessLibrary.isBasketPresent());
    }
    @Test
    public void basketPresentInShoppingPage()
    {
        BusinessLibrary.computerPage();
        Assert.assertTrue(BusinessLibrary.isBasketPresent());
    }
    @Test
    public void isItemAddingToBasket()
    {
        Library.gotoHomePage();
        BusinessLibrary.addItemToBasket(quantity);
        BusinessLibrary.goToCart();
        boolean result=BusinessLibrary.isItemInBasket(item);
        Assert.assertTrue(result);
    }

    @Test
    public void isPriceOfTheItemAvailableInBasket(){
        Library.gotoHomePage();
        BusinessLibrary.addItemToBasket(quantity);
        BusinessLibrary.goToCart();
        Assert.assertTrue(BusinessLibrary.isPriceInBasket(price));
    }
}
