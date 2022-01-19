package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_XpathText {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1- https://the-internet.herokuapp.com/add_remove_elements/ gidiş dönüş
        driver. get( " https://the-internet.herokuapp.com/add_remove_elements/ " );
        // 2- Element havzası ekle
        driver . findElement( By . xpath( " //button[text()='Eleman Ekle'] " )) . click();
        // 3- butonu'nun gorunur oldugunu test edin edin
        WebElement deleteButonu = driver . findElement( By . xpath( " //button[text()='Delete'] " ));
        if (deleteButonu .isDisplayed ()) {
            System.out.println(" butonu gorunuyor testi PASS'ı sil ");
        } else {
            System.out.println(" sil butonu gorunuyor testi BAŞARISIZ ");
        }
        // 4- Tusuna havzasını sil
        deleteButonu.click();
        // 5- “Eleman Ekle/Kaldır” yazısının görüldüğünü test edin

        WebElement addYazisiElementi = driver . findElement( By . xpath( " //h3[text()='Eleman Ekle/Kaldır'] " ));


        if (addYazisiElementi .isDisplayed ()) {
            System.out.println(" Yazisi gorunuyor testi PASS ekleyin ");
        } else {
            System.out.println(" Testi BAŞARISIZ yazisi gorunuyor ekle ");
        }

       driver . close();
        }
    }





