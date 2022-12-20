package selenium_tekrar;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Selenium_01 {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        //İlk önce Browser'i maxzimize yapalım. Sonra tum sayfa için max beklme suresi olarak 15 saniye belirtelim
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //facebook, amazon ve yotube sayfalarına gidelim.
        driver.get("https://www.amazon.com");
        driver.get("https://www.facebook");
        driver.get("https://www.youtube.com");
        //Amazon  sayfasına geri dönelim
       driver.navigate().back();
        driver.navigate().back();
        //Amazon sayfasının Url 'sinde "https://www.amazon.com" adresine eşit oldugunu test ediniz.
    String actualUrl=driver.getCurrentUrl();
    String expected="https://www.amazon.com";
    if(actualUrl.equals(expected)){
        System.out.println("Url testi PASSED");
    }else System.out.println("Url testi FAİLED");

        //Sayfanın  konumu ve size ni yadırın
        System.out.println("Sayfanın size :"+driver.manage().window().getSize());
        System.out.println("Sayfanın Konumu:"+driver.manage().window().getPosition());

        //Sayfanın  konumu ve size'ni istedigimiz şekilde ayarlayınız.
        driver.manage().window().setSize(new Dimension(600,600));
        driver.manage().window().setPosition(new Point(50,50));

        System.out.println("Sayfanın size :"+driver.manage().window().getSize());
        System.out.println("Sayfanın Konumu:"+driver.manage().window().getPosition());
        //İstedigimiz şekilde old.test ediniz
       Dimension actualYeniSize=driver.manage().window().getSize();
      if(actualYeniSize.getWidth()==600 && actualYeniSize.getHeight()==600){
          System.out.println("Size testi PASSED");
      }else System.out.println("Size Testi FAİled");



        //Syfayı kapatınız...

driver.close();
    }
}
