package tests.day13;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.TestBase;

public class C02_PagesFacebook extends TestBase {

    @Test
    public void test() {
    // facebook login sayfasina gidin
        driver.get("https://www.facebook.com");
        FacebookPage facebookPage = new FacebookPage(driver);

    // page sayfasinda cookiesGec() method'u olusturun
        facebookPage.coociesGec();

    // kullanici adi : techproed@hotmail.com
        facebookPage.mailKutusu.sendKeys("techproed@hotmail.com");

    // sifre : 12345
        facebookPage.sifre.sendKeys("12345");
    // yazdigimizda giris yapamadigimizi test edin
        facebookPage.loginButonu.click();

        // yazdigimizda giris yapamadigimizi test edin
        Assert.assertTrue(facebookPage.girilemediYazisi.isDisplayed());
    }
}
