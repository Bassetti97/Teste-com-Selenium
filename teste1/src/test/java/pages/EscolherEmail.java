package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EscolherEmail {

    static WebDriver driver;

    public EscolherEmail(WebDriver driver){
        this.driver = driver;
    }

    public void preencherCampo(){

        WebElement email = driver.findElement(By.id("selectionc4"));
        email.click();

        WebElement name = driver.findElement(By.name("Username"));
        name.sendKeys("silvadaiane.bb33");

        WebElement botaoAvancar = driver.findElement(By.xpath("//span[contains(text(),'Avançar')]"));
        botaoAvancar.click();

        WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(50));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[contains(text(),'Crie uma senha forte com uma combinação de letras, números e símbolos')]")));

    }

}
