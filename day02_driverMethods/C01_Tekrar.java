package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Tekrar {

        // Normalde slenium'un kendi IDE'si de var fakat biz daha kullanisli oldugu icin intellij kullaniyoruz
        // intellij'de yeni bir proje actigimizda oncelikle selenium kutuphanelerini projeye eklememiz gerekir
        // Biz en ilkel haliyle projemize kutuphaneleri jar dosyalari olarak yukledik
        // Bu ekledigimiz dosyalara artik driver'in ayarlarini yapabiliriz

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");

        // setProperty method'u 2 parametre ister
        // ilki kullanacagimiz browser'a ait driver
        // ikinci parametre ise selenium sitesinden indirip projemize ekledigimiz chromedriver'in path'i
        // windows kullanicilari sana .exe eklerken, apple kullananlar .exe eklememeli

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        Thread.sleep(5000);

         // java'dan gelir, icine yazilan milisaniye kadar kodlarin calismasini durdurur

         driver.close();

         // driver.close class'ın sonuna yazilir.Cunku bu kod calisinca driver'imiz kapanir
         // bu koddan sonra yeniden bir browser acmak istiyorsak driver'a yeni deger atamaliyiz

    }
}





