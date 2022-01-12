package PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class HomeModel extends BaseModel {

    public static By siteName = By.cssSelector(".sc-1fjiks5-1.dCMDfb");
    public static By girisYap = By.cssSelector(".gekhq4-6.hnYHyk");
    public static By closeCookiesButton = By.xpath("//span[text()='Kapat']");
    public static By loginButton = By.cssSelector(".qjixn8-0.sc-1bydi5r-0.lghPw");
    public static By userName = By.id("L-UserNameField");
    public static By password = By.id("L-PasswordField");
    public static By loginPageLoginButton = By.id("gg-login-enter");


    public void userVisitSite(String key) {
        webDriver.get(key);
    }

    public boolean checkHomePageOpenAndLogin() throws InterruptedException {
        closeCookiesPopUp(closeCookiesButton);

        if (getAttribute(siteName, "title").contains("GittiGidiyor")) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(girisYap));
            WebElement ele = findElement(girisYap);

            Actions action = new Actions(webDriver);
            action.moveToElement(ele).perform();
            clickElement(loginButton);

            sendKeys(userName, "hacicelik0710@gmail.com");
            sendKeys(password, "**********");
            Thread.sleep(5000);
            clickElement(loginPageLoginButton);

            return true;
        }

        return false;

    }

}
