package day02_DriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_WebElementsVeLocators {
    public static void main(String[] args) {
       /*
Eger bir webelementi (Web sayfasindaki her bir buton ya da text/yazi) locate (konumunu belirleme)
etmek istersek once manual olarak web sayfasini acip sayfa uzerinde sag click yapip incele/inspect butonuna tiklariz.
Karsimiza cikan HTML code'larindan locator'lardan (konum belirleyiciler) unique (essiz) olani seceriz.
Genellikle id Attribute'u kullanilir. Sectigimiz attribute degerini findElement() method'u icine
findElement(BY.id("attribute degeri")) seklinde yazariz.
 */

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon Sayfasına gidelim.
        driver.get("https://www.amazon.com");

        //Search Bölümü Locate edelim
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        //Searc bölümünde iphone aratalım.
        aramaKutusu.sendKeys("iphone", Keys.ENTER);

        //Amazon sayfasındaki <input> ve <a> tag'laarının sayısını yazdırınız...
        List<WebElement> linkler = driver.findElements(By.tagName("input"));
        System.out.println("linkler.size() = " + linkler.size());

        List<WebElement> linklerList = driver.findElements(By.tagName("a"));
        System.out.println("Link Sayısı = "+linklerList.size());
    }
}
