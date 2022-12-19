package day01_DriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_ManageMethods {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        //Amazon Sayfasına gidelim.
        driver.get("https://www.amazon.com");

        //Sayfanın konum ve boyutlarını yazdırın
        System.out.println("Sayfanın Konumu :"+driver.manage().window().getPosition());
        System.out.println("Sayfanın Boyutu  :"+driver.manage().window().getSize());

        //Sayfayı simge durumuna getirin
        driver.manage().window().minimize();


        //Simge durumunda 3 Sn ye bekletip sayfayı maximize edin.
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.manage().window().minimize();
        driver.manage().window().maximize();

        //sayfanın konum ve boyutlarını maximize durumunda yazdırın
        System.out.println("Sayfanın Konumu :"+driver.manage().window().getPosition());
        System.out.println("Sayfanın Boyutu  :"+driver.manage().window().getSize());

        // Sayfayı FullSecren yapın...
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.manage().window().fullscreen();

        //Sayfanın konum ve boyutlarını fulscreen durumunda yazdırın
        System.out.println("Sayfanın Konumu :"+driver.manage().window().getPosition());
        System.out.println("Sayfanın Boyutu  :"+driver.manage().window().getSize());

        //Sayfayı Kaptın...
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.close();

    }
}
