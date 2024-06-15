package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DataNascimento {

    static WebDriver driver;

    public DataNascimento(WebDriver driver){
        this.driver = driver;
    }

    public void preencherNascimento(){

        WebElement dataDia = driver.findElement(By.id("day"));
        dataDia.sendKeys("15");

        WebElement dataMes = driver.findElement(By.id("month"));
        dataMes.sendKeys("Novembro");

        WebElement dataAno = driver.findElement(By.id("year"));
        dataAno.sendKeys("1999");

        WebElement genero = driver.findElement(By.id("gender"));
        genero.sendKeys("Mulher");

        WebElement botaoAvancar = driver.findElement(By.xpath("//span[contains(text(),'Avançar')]"));
        botaoAvancar.click();

        WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(50));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[contains(text(),'Escolha um endereço do Gmail ou crie seu próprio endereço')]")));

    }
}
