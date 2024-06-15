package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CadastroNome;
import pages.CadastroSenha;
import pages.DataNascimento;
import pages.EscolherEmail;

import static org.junit.Assert.*;

public class CadastroNomeTest {

    static WebDriver driver;
    static CadastroNome cadastrarNome;
    static DataNascimento dataNascimento;
    static EscolherEmail escolherEmail;
    static CadastroSenha cadastroSenha;



    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void test1(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/SignUp?hl=pt");

        cadastrarNome = new CadastroNome(driver);
        cadastrarNome.preencherCampo();

        dataNascimento = new DataNascimento(driver);
        dataNascimento.preencherNascimento();

        escolherEmail = new EscolherEmail(driver);
        escolherEmail.preencherCampo();

        cadastroSenha = new CadastroSenha(driver);
        cadastroSenha.preencherCampo();


    }


    @After
    public void tearDown() throws Exception {
    }
}