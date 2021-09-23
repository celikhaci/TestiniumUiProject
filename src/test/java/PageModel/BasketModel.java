package PageModel;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasketModel extends BaseModel {

    public static By basketButton = By.className("dIB");
    public static By basketOldPrice = By.className("total-price");
    public static By bTwoProduct = By.cssSelector(".amount option:nth-of-type(2)");
    public static By selectCountProduct = By.cssSelector(".gg-input.gg-input-select .amount");
    public static By lblProductCount = By.cssSelector(".gg-d-16.gg-m-14.detail-text");
    public static By deleteButton = By.cssSelector(".btn-delete.btn-update-item");
    public static By notProductBasketMessage = By.cssSelector(".gg-d-19.gg-w-21.gg-t-19.gg-m-18 h2");


    ProductListModel productListModel = new ProductListModel();

    public boolean checkBasketPrice() {
        if (productListModel.productDetailPrice==getText(basketOldPrice)){
            return true;
        }
        return true;
    }

    public boolean basketTwoProduct() throws InterruptedException {
        clickElement(selectCountProduct);
        clickElement(bTwoProduct);

        Thread.sleep(6000);
        if (getText(lblProductCount).contains("Ürün Toplamı (2 Adet)")) {
            return true;
        }
        return false;
    }

    public boolean deleteProductAndCheck() throws InterruptedException {
        clickElement(deleteButton);
        Thread.sleep(10000);
        if (getText(notProductBasketMessage).contains("Sepetinizde ürün bulunmamaktadır.")) {
            return true;
        }
        return false;
    }


}
