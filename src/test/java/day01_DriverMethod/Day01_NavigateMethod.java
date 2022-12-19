package day01_DriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_NavigateMethod {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        //AmazonSayfasına gidelim
       driver.navigate().to("https://amazon.com");

        //techproeducation sayfasına gidelim
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.navigate().to("https://techproeducation.com");

        //Tekrar amazon sayfasına dönelim
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.navigate().back();
        //Tekrar techproeducation sayfasına gidelim
        driver.navigate().forward();

        //Son sayfada sayfayı yenileyelim(refresh)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.navigate().refresh();
        //Sayfayı kapatın
        driver.close();
    }
}
