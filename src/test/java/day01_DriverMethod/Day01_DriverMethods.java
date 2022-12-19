package day01_DriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_DriverMethods {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
// uzerine geldigimizde interface yazdigini göruruz.webdriver interface oldugu icin ondan obje olusturamiyoruz ama
// chrome driver klasindan obje olusturabiliyoruz.

        driver.get("https://www.amazon.com");//Gitmek istedigim,z sayfaya safayı catık

        System.out.println("Sayafa Başlıgı  :"+driver.getTitle());//Sayfa başlıgını actık

        System.out.println("Sayfa URL  :"+driver.getCurrentUrl());

       // System.out.println("Kaynak Code  :"+driver.getPageSource());

        System.out.println(driver.getWindowHandle()); // Bize windowa ait hash degrini verir Biz u hash degerlerini
                                                      // bir stringe atayıp pencereler arası geçis yapabiliriz...




    }
}
