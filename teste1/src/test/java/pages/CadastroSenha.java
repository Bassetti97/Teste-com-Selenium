package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroSenha {

    static WebDriver driver;

    public CadastroSenha(WebDriver driver){
        this.driver = driver;
    }

    public void preencherCampo(){

        WebElement senha = driver.findElement(By.name("Passwd"));
        senha.sendKeys("123Ba*25");

        WebElement confirmacao = driver.findElement(By.name("PasswdAgain"));
        confirmacao.sendKeys("123Ba*25");

        WebElement email = driver.findElement(By.id("selectionc6"));
        email.click();


        WebElement botaoAvancar = driver.findElement(By.xpath("//span[contains(text(),'Avançar')]"));
        botaoAvancar.click();

    }
}
