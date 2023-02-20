import com.sun.source.tree.TryTree;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Text;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class cenario1 {
    //
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src\\drive_oficial\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        driver.get("https://verity.com.br");
        String text = driver.findElement(By.xpath("//*[@id=\"comp-kwv1yx4h\"]/h1/span")).getText();

        if  (driver.getPageSource().contains("//*[@id=\"comp-kwv1yx4h\"]/h1/span"))
        {
            System.out.println("O texto pesquisado : " + text + " existe.");
        } else {
            System.out.println("O texto pesquisado : " + text + " existe.");

            driver.quit();
            }

        }
    }



