import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IlkClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/recources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://amazon.com");




    }
}
