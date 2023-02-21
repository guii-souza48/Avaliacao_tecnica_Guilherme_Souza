import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cenario2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src\\drive_oficial\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-infobars");
        options.addArguments("--disable-extensions");
        WebDriver driver = new ChromeDriver();

        driver.get("https://verity.com.br");

        var waitTime = new Thread();
        waitTime.sleep(5000);
        WebElement acessomenu = driver.findElement(By.id("comp-kevyodnk5label"));
        acessomenu.click();
        waitTime.sleep(5000);
        driver.findElement(By.id("input_comp-kwz6tqej")).sendKeys("Guilherme Souza");
        waitTime.sleep(5000);
        driver.findElement(By.id("input_comp-kwz6tqf7")).sendKeys("guilherme-souza16@hotmail.com");
        waitTime.sleep(5000);
        driver.findElement(By.id("input_comp-kwz6tqfe")).sendKeys("963415887");
        waitTime.sleep(5000);
        driver.findElement(By.id("textarea_comp-kwz6tqfr")).sendKeys("""
            Não dominar uma habilidade necessária para a sua função;
            Lidar com a pressão e entregar algo com rapidez, mesmo que o tempo pareça insuficiente;
            Precisar atender a um imprevisto mesmo estando em uma tarefa prioritária;""");

        //Validacao de valores
        String nomeRetornado = driver.findElement(By.id("input_comp-kwz6tqej")).getAttribute("value");
        String emailRetornado = driver.findElement(By.id("input_comp-kwz6tqf7")).getAttribute("value");
        String telefoneRetornado = driver.findElement(By.id("input_comp-kwz6tqfe")).getAttribute("value");
        String desafioRetornado = driver.findElement(By.id("textarea_comp-kwz6tqfr")).getAttribute("value");

        waitTime.sleep(5000);

        WebElement chkBox = driver.findElement(By.className("cCdhN7"));
        waitTime.sleep(5000);
        chkBox.click();

        driver.findElement(By.className("M3I7Z2")).click();
        waitTime.sleep(5000);

        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name,'a-') and starts-with (@src, 'https://www.google.com/recaptcha')]")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class =  'recaptcha-checkbox-border']"))).click();
        driver.switchTo().defaultContent();

        waitTime.sleep(30000);//tempo para resolver o captcha
        driver.findElement(By.className("M3I7Z2")).click();
        driver.close();
    }
}