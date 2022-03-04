package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.core.api.Scenario;

//configurando o meu driver
public class Utils {
	public static WebDriver driver; // crio uma variavel do tipo webdriver
	
	public static void acessarSistema() { /* metodo que irei chamar em outras classes*/
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe"); // mostra o caminho driver chrome no meu pc
		driver= new ChromeDriver(); // instancia um novo objeto do tipo chrome driver
		driver.manage().window().maximize(); // maximiza a tela que irei abrir
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // espera até 5 segundos para o navegador abrir a pagina
		driver.get("https://opensource-demo.orangehrmlive.com/"); // pagina que irei testar
		
	}
	
	public static <T> T Na(Class<T>classe){// o <T> diz que o tipo da classe eh generico, sem restricoes de entrada
		return PageFactory.initElements(driver, classe);
		
	}
	// criar um metodo para fazer as capturas de tela
	public static void capturarTela( Scenario scenario) {// aqui o cenario eh do proprio arquivo do cucumber
		final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png");// depois de cada cenario faco uma captura de tela
	}

}
