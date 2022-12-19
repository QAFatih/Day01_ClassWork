package day02_DriverMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Examples {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        //İlk önce Browser'i maxzimize yapalım. Sonra tum sayfa için max beklme suresi olarak 15 saniye belirtelim
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //sırasıyla amazon,facebook ve youtube sayfalarına gidelim,
       driver.get("https://www.amazon.com");
       driver.get("https://www.facebook.com");
       driver.get("https://www.youtube.com");

        //amazon sayfasına tekrar donelim.
        driver.navigate().back();
        driver.navigate().back();

        //Amazon sayfasının Url'inin https://www.amazon.com adresine eşit oldugunu test edelim.
        String actulaUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.amazon.com";
        if(actulaUrl.equals(expectedUrl)){
            System.out.println("URL testi PASSED");
        }else System.out.println("URL testi FAİLED");

        // Sayfanın konumunu ve size 'nı yazdıralim
        driver.manage().window().setSize(new Dimension(600,600));
        driver.manage().window().setPosition(new Point(50,50));
        System.out.println("Sayfanın size'ı :"+driver.manage().window().getSize());
        System.out.println("Sayfanın Konumu :"+driver.manage().window().getPosition());

        // Sayfanın konumunu ve size 'nıistedigimiz sekilde ayarlayalım ve istedigimiz sekilde oldugunu test edelim
        Dimension actualSize=driver.manage().window().getSize();
        if (actualSize.equals(new Dimension(800,600))) {
            System.out.println("Sayfa konumu" + actualSize + " ile aynı.");
        }else System.out.println("Sayfa konumu" + actualSize + "ile aynı değil.");

        Point actualYeniKonum=driver.manage().window().getPosition();
        if(actualYeniKonum.getX()==50 && actualYeniKonum.getX()==50){
            System.out.println("KonumTesti PASSED");
        }else System.out.println("Konum Testi FAILED");

        //Sayfayı kapatalım

        driver.close();
    }

}
