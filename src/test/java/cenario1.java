import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class cenario1 {
    //
    public static boolean main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src\\drive_oficial\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://verity.com.br");
        var existenatela = driver.findElement(By.xpath("//[text()='Nossas soluções']");
    if (driver.findElement(By.xpath("//[text()='Nossas soluções']"));
            assertEquals("Nossas soluções",existenatela );
            return true;
        }else{
            return false;
        }



