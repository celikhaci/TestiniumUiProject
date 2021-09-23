package Tests;

import PageModel.BasketModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class BasketTest {
    BasketModel basketModel = new BasketModel();

    @Step("Ürün sayfasındaki fiyat ile sepette yer alan ürün fiyatının doğruluğu karşılaştırılır.")
    public void checkBasketPrice() {
        Assert.assertTrue(basketModel.checkBasketPrice());
    }

    @Step("Adet arttırılarak ürün adedinin 2 olduğu doğrulanır.")
    public void basketTwoProduct() throws InterruptedException {
        Assert.assertTrue("Ürün 2 adet olmadı.", basketModel.basketTwoProduct());
    }

    @Step("Ürün sepetten silinerek sepetin boş olduğu kontrol edilir.")
    public void deleteProductAndCheck() throws InterruptedException {
        Assert.assertTrue("Ürün silinmedi",basketModel.deleteProductAndCheck());
    }
}
