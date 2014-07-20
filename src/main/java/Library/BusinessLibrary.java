package Library;

import Utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by SRI on 15-Jul-14.
 */
public class BusinessLibrary {
    static WebDriver driver;

    public BusinessLibrary(WebDriver driver) {
        this.driver=driver;
    }

    public  void gotoHomePage() {
        WebElement homePage=driver.findElement(By.xpath(".//*[@id='nav-home']/ul[1]/li[1]/a"));
        homePage.click();
    }
   public static boolean isBasketPresent()
    {

      return driver.findElement(By.id("shopbar-cart")).isDisplayed();
    }


    public static void computerPage() {
        WebElement compCategory=driver.findElement(By.linkText("Computer"));
        compCategory.click();
    }

    public static void addItemToBasket(String qty) {
        WebElement item=driver.findElement(By.xpath(".//*[@id='content-center']/div/div/div[3]/div[2]/div/div[1]/div[2]/div/div[2]/h3/a/span"));
        item.click();
        WebElement quantity=driver.findElement(By.xpath(".//*[@id='addtocart_260_AddToCart_EnteredQuantity']"));
        quantity.clear();
        quantity.sendKeys(qty);
        WebElement addToCart=driver.findElement(By.xpath(".//*[@id='AddToCart']/div[2]/div/a"));
        addToCart.click();
            Utils.pause(10);
    }
        public static boolean isItemInBasket(String item){
        return driver.findElement(By.linkText(item)).isDisplayed();

    }

    public static void goToCart() {
        WebElement cart=driver.findElement(By.xpath(".//*[@id='shopbar-cart']/a/span[1]/span[2]"));
        cart.click();
    }

    public static boolean isPriceInBasket(String price) {
        return driver.findElement(By.linkText(price)).isDisplayed();


    }
}



