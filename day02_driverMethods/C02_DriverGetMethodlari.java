package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverGetMethodlari {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        System.out.println(driver.getTitle()); // sayfanin title'ini getirir

        System.out.println(driver.getCurrentUrl()); // sayfanin adresini getirir

        System.out.println(driver.getWindowHandle()); // CDwindow-D952DA09AF153F8F819F91B36A63DC30

        System.out.println(driver.getPageSource()); // kaynak dosyaları getirir




    }
}
