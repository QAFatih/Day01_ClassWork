package day01_DriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_ClassWork {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();


//        Yeni bir class olusturalim : C03_GetMethods
//        Amazon sayfasina gidelim. https://www.amazon.com/
            driver.get("https://www.amazon.com");
//
//        Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());
//
//        Sayfa basliginin “Amazon” icerdigini test edin
        String actualTitle=driver.getTitle();
        if(actualTitle.contains("Amazon")){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title Testi FAİLED");

//
//          Sayfa url’inin yazdırın
        System.out.println("Sayfa URL  :"+driver.getCurrentUrl());
//
//        Sayfa adresini(url)nin "amazon" icerdigini test edin yazdirin
         String actualUrl= driver.getCurrentUrl();
         if(actualUrl.contains("amazon")){
             System.out.println("Testiniz PASSED");
         }else System.out.println("Testiniz FAİLED");

//        Sayfa handle degerini yazdirin
        System.out.println("Window Hanle degri :"+driver.getWindowHandle());

//        Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String sayfaKodlari=driver.getPageSource();
        if(sayfaKodlari.contains("Gateway")){
            System.out.println("Gateway Kelimesi Testi  PASSED");
        }else System.out.println("Gateway Testi FAİLED");

//        Sayfayi kapatin.
        driver.close();//Syafayı Kapatmak için kullanılır.
    }
}
