package stepsDefinitions;

import io.cucumber.java.pt.Entao;

import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class LoginSteps {
	//LoginPage lp= new LoginPage();
	
	@Quando("eu informar o usuario {string}")
	public void euInformarOUsuario(String usuario) {
	    // Write code here that turns the phrase above into concrete actions
	    //lp.informarCampoUsuario(usuario);
		Na(LoginPage.class).informarCampoUsuario(usuario);
	}

	@Quando("a senha {string}")
	public void aSenha(String senha) {
	    // Write code here that turns the phrase above into concrete actions
	    //lp.informarCampoSenha(senha);
		Na(LoginPage.class).informarCampoSenha(senha);
	}

	@Quando("clicar no botao login")
	public void clicarNoBotaoLogin() {
	    // Write code here that turns the phrase above into concrete actions
	     //lp.acionarBotaoLogin();
		Na(LoginPage.class).acionarBotaoLogin();
	}

	@Entao("o sistema exibe a mensagem de usuario invalido")
	public void oSistemaExibeAMensagemDeUsuarioInvalido() {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals("Invalid credentials",driver.findElement(By.id("spanMessage")).getText());// valida o caso em que a entrada do usuario eh invalida
	}

	@Entao("o sistema exibe a mensagem de usuario logado")
	public void oSistemaExibeAMensagemDeUsuarioLogado() {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals("welcome Admin",driver.findElement(By.id("welcome")).getText()); //pega  o texto retornado pelo sistema e compara com o valor esperado 
	    //validacao do meu login feito com sucesso
	    // a funcao assertEquals compara o valor que eh esperado a esquerda da virgula, com o valor a direita da virgula
	    // o find elemente dentro do objeto driver mapeia o nome associado a id welcome na pagina em teste
	    // eh mais importante a validacao que o login em si
	    
	    
}
}
