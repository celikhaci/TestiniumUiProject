package Tests;

import PageModel.HomeModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class HomeTest {

    HomeModel homeModel = new HomeModel();

    @Step("Kullanıcı <key> sitesini ziyaret eder")
    public void userVisitSite(String value) {
        homeModel.userVisitSite(value);
    }

    @Step("Ana sayfanın açıldığı kontrol edilir. Siteye login olunur.")
    public void checkHomePageOpenAndLogin() throws InterruptedException {
        Assert.assertTrue(homeModel.checkHomePageOpenAndLogin());


    }
}