package selenium_tekrar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Selenium_02 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon sayfasına gidelin
        driver.get("https:/wwwamazon.com");

        //Search bolumunu locate edelim
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));

        //Search bölümünde iphone aratalım
          aramaKutusu.sendKeys("iphone", Keys.ENTER);
driver.close();


    }
}
