package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastrarUsuarioPage {
	@FindBy (id="systemUser_employeeName_empName") //mapeia o campo employer
	 public WebElement campoEmployer;
	
	@FindBy (name="systemUser[userName]") //mapeia o meu campo user name
	 public WebElement campoUsername;
	
	@FindBy (name="systemUser[password]") //mapeia o campo senha
	 public WebElement campoPassword;
	
	@FindBy (name="systemUser[confirmPassword]") //mapeia o campo confirmar senha
	 public WebElement campoConfirmarPassword;
	
	@FindBy (name="btnSave") //mapeia o meu botao salvar
	 public WebElement botaoSalvar;
	
	public void informarCampoEmployerName(String employerName) {
		campoEmployer.sendKeys(employerName);
	}
    public void informarCampoUserName(String userName) {
    	campoUsername.sendKeys(userName);
	}
    public void informarCampoPassword(String senha) {
    	campoPassword.sendKeys(senha);
	}
    public void informarCampoConfirmarPassword(String senha) {
    	campoConfirmarPassword.sendKeys(senha);
	}
    public void acionarBotaoSalvar() {
    	botaoSalvar.click();
	}
	

}
