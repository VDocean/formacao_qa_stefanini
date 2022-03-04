package pageObjects;

//import static utils.Utils.*; // importo o objeto driver da classe utils

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage {
// mapear os elementos da pagina pelo padrao page factory
    @FindBy (name="txtUsername") //mapeia o meu campo usuario
    // 
    private WebElement campoUsuario;	
	
    @FindBy (name="txtPassword") //mapeia o meu campo senha, poderia ser id no lugar de name tambem
    private WebElement campoSenha;
    
    @FindBy (name="Submit") // mapeia o botao
    private WebElement botaoLogin;
	
	public void informarCampoUsuario(String usuario) { // metodo para o campo usuario
		//driver.findElement(By.name("txtUsername")).sendKeys(usuario); // mapeio o campo usuario da minha pagina em teste e passo o valor usuario para ele
        campoUsuario.sendKeys(usuario);	
	
	}
	public void informarCampoSenha(String senha) { // metodo para o campo senha
		//driver.findElement(By.name("txtPassword")).sendKeys(senha); // mapeio o campo senha da minha pagina em teste e coloco nela o valor senha
	    campoSenha.sendKeys(senha);
	
	}
	public void acionarBotaoLogin() { // metodo que aciona o botao login
		//driver.findElement(By.name("Submit")).click(); // mapeio o botao da minha pagina em teste e clico nele
		botaoLogin.click();
		
	}
	
	public void realizarLogin(String usuario, String senha) {
		informarCampoUsuario(usuario);
		informarCampoSenha(senha);
		acionarBotaoLogin();
	}
	
}
