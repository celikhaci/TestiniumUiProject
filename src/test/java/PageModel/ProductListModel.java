package PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ProductListModel extends BaseModel {
    public static By productsList = By.cssSelector(".sc-1nx8ums-0.dyekHG");
    public static By txtSearchBar = By.cssSelector(".sc-4995aq-0.sc-14oyvky-0.gHqOYK");
    public static By paginationSecond = By.cssSelector(".sc-12aj18f-3.kLmKCh > li:nth-of-type(3)");
    public static By closeCookiesButton = By.xpath("//span[text()='Kapat']");
    public static  By addToBasket=By.cssSelector(".control-button.gg-ui-button.plr10.gg-ui-btn-default");
    public static By productDetailPagePrice=By.id("sp-price-lowPrice");
    public static By goToBacket=By.cssSelector(".gg-ui-btn-default.padding-none");




    List<WebElement> product;

    Random random =new Random();
    String productDetailPrice;
    public void selectRandomProduct(){
        product = findElements(productsList);
        int productNumber = random.nextInt(product.size());
        clickElement(product.get(productNumber));

    }

    public void setSearchBar(String key){
        sendKeys(txtSearchBar,key);
        webDriver.findElement(txtSearchBar).sendKeys(Keys.ENTER);

    }
    public void clickSecondPagination(){
        closeCookiesPopUp(closeCookiesButton);
        scrollToElement(findElement(paginationSecond));
        clickElement(paginationSecond);
    }
    public void addToBasket(){
        productDetailPrice=getText(productDetailPagePrice);
        closeCookiesPopUp(closeCookiesButton);
        clickElement(addToBasket);
        clickElement(goToBacket);


    }


    }








