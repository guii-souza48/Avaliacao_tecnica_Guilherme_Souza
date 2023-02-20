import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class cenario2 {

    public static void main (String[] args) {
        System.setProperty("webdriver.chrome.driver", "src\\drive_oficial\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://verity.com.br");


        WebElement acessomenu = driver.findElement(By.id("comp-kevyodnk5label"));
        acessomenu.click();

        driver.findElement(By.id("input_comp-kwz6tqej")).sendKeys("Guilherme Souza");
        driver.findElement(By.id("input_comp-kwz6tqf7")).sendKeys("guilherme-souza16@hotmail.com");
        driver.findElement(By.id("input_comp-kwz6tqfe")).sendKeys("963415887");
        driver.findElement(By.id("textarea_comp-kwz6tqfr")).sendKeys("Não dominar uma habilidade necessária para a sua função;\n" +
                "Lidar com a pressão e entregar algo com rapidez, mesmo que o tempo pareça insuficiente;\n" +
                "Precisar atender a um imprevisto mesmo estando em uma tarefa prioritária;");

        //Validacao de valores
        String nomeRetronado = driver.findElement(By.id("input_comp-kwz6tqej")).getAttribute("value");
        String emailRetronado = driver.findElement(By.id("input_comp-kwz6tqf7")).getAttribute("value");
        String telefoneRetronado = driver.findElement(By.id("input_comp-kwz6tqfe")).getAttribute("value");
        String desafioRetronado = driver.findElement(By.id("textarea_comp-kwz6tqfr")).getAttribute("value");

        assertEquals("Guilherme Souza",nomeRetronado );
        assertEquals("guilherme-souza16@hotmail.com",emailRetronado );
        assertEquals("963415887", telefoneRetronado );
        assertEquals("Não dominar uma habilidade necessária para a sua função;\n" +
                "Lidar com a pressão e entregar algo com rapidez, mesmo que o tempo pareça insuficiente;\n" +
                "Precisar atender a um imprevisto mesmo estando em uma tarefa prioritária;", desafioRetronado);

       WebElement chkBox= driver.findElement(By.className("cCdhN7"));
       chkBox.click();
       System.out.println(chkBox.isSelected());

       driver.findElement(By.className("M3I7Z2")).click();

       //driver.close();




    }
}

