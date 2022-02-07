package tests.day14;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ConcortHotelPage;
import utilities.TestBase;

import java.sql.Driver;

public class C01_ConcortHotelLoginPositive extends TestBase {
    @Test
    public void positiveLoginTest(){
        // 	https://www.concorthotel.com/ adresine git
       driver.get("https://www.concorthotel.com/");

        ConcortHotelPage concortHotelPage = new ConcortHotelPage(driver);
        //	login butonuna bas
        concortHotelPage.ilkLoginLinki.click();
        //	test data username: manager ,
        concortHotelPage.userName.sendKeys("manager");
        //	test data password : Manager1!
        concortHotelPage.password.sendKeys("manager1!");

        concortHotelPage.loginButonu.click();
        //	Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(concortHotelPage.basariliGiris.isDisplayed());
    }
}
