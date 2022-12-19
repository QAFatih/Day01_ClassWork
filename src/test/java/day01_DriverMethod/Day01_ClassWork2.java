package day01_DriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day01_ClassWork2 {
    public static void main(String[] args) {


        //get(), belirli bir URL’de (web sitesinde) gezinmek ve sayfa yüklenene kadar beklemek için kullanılır.
        //Navigation(), belirli bir URL’ye gitmek için kullanılır ve sayfanın yüklenmesini beklemez (edited)

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//Bu method sayfadaKİ HER BİR WEB ELementin max BEKLEME SURESİNİ BELİRLER


//    ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
//        oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https:www.facebook.com");
        String actualTitle = driver.getTitle();
        if (actualTitle.contains("facebook")) {
            System.out.println("TitleTesti PASSED");
        } else System.out.println("Title Testi FAİLED" + actualTitle);

//    Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains("facebook")) {
            System.out.println("URL Testi PASSED");
        } else System.out.println("URL Testi FAİLED :" + actualUrl);

//    https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com");

//    Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String actualTitle1 = driver.getTitle();
        if (actualTitle1.contains("Walmart.com")) {
            System.out.println("Walmart.com Testi PASSED");
        } else System.out.println("Walmart.com Tseti FAİLED");

//    Tekrar “facebook” sayfasina donun
        driver.navigate().back();

//    Sayfayi yenileyin
        driver.navigate().refresh();

//
        driver.close();
    }
}