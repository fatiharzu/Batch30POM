package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {
   protected WebDriver driver;
        // abstract yaparak bu class'dan obje olusturulmasinin onune geceriz
        // biz test base class'i sadece extends ile inherit ederek kullanacagiz
        // dolayisiyla olusturdugumuz driver variable'i icin protected access modifier'i seciyoruz
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @AfterClass
    public void tearDown(){
        driver.quit();

    }
}
