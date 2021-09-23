package Tests;

import PageModel.ProductListModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class ProductListTest {


    ProductListModel productListModel = new ProductListModel();

    @Step("Listelenen ürünler arasından rastgele ürün seçilir.")
    public void selectRandomProduct() {
        productListModel.selectRandomProduct();
    }

    @Step("Kullanıcı <key> anahtar kelimesini arama kısmına yazar.")
    public void setSearchBar(String key) {
        productListModel.setSearchBar(key);
    }



    @Step("Arama sonuclarından 2. sayfa açılır.")
    public void clickSecondPagination() {
        productListModel.clickSecondPagination();
    }

    @Step("Seçilen ürün sepete eklenir.")
    public void addToBasket() {
        productListModel.addToBasket();
    }
}
