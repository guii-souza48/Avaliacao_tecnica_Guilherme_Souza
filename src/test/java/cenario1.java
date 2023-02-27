import com.sun.source.tree.TryTree;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Text;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class cenario1 {
    //
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://verity.com.br");

        try{
            WebElement textculture = driver.findElement(By.xpath("//*[text()='Culture e Tech']"));

            if(textculture.isDisplayed())
            {
                System.out.println("O texto pesquisado" + textculture.getText() + "não existe");
            }
        }catch(Exception ex){
            System.out.println("O texto pesquisado Culture e Tech não existe");
        }
        try{
            WebElement textsolucoes = driver.findElement(By.xpath("//*[text()='Nossas soluções']"));

            if(textsolucoes.isDisplayed())
            {
                System.out.println("O texto pesquisado " + textsolucoes.getText() + " existe");
            }
        }catch(Exception ex){
            System.out.println("O texto pesquisado 'Nossas soluções' existe");
        }
        }
    }



