package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastrarUsuarioPage;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class CadastrarUsuarioSteps {

	@Quando("eu acionar a aba admin")
	public void euAcionarAAbaAdmin() {
	    // Write code here that turns the phrase above into concrete actions
	   Na(TelaInicialPage.class).acionarAbaAdmin();
	}

	@Quando("a acionar o botao add")
	public void aAcionarOBotaoAdd() {
	    // Write code here that turns the phrase above into concrete actions
		 Na(TelaInicialPage.class).acionarBotaoAdd();
	}

	@Quando("informar no campo employer name {string}")
	public void informarNoCampoEmployerName(String employerName) {
	    // Write code here that turns the phrase above into concrete actions
		Na(CadastrarUsuarioPage.class).informarCampoEmployerName(employerName) ;
	}

	@Quando("informar no campo username {string}")
	public void informarNoCampoUsername(String userName) {
	    // Write code here that turns the phrase above into concrete actions
		Na(CadastrarUsuarioPage.class).informarCampoUserName(userName) ;
	}

	@Quando("informar no campo password {string}")
	public void informarCampoUserName(String senha) {
	    // Write code here that turns the phrase above into concrete actions
		Na(CadastrarUsuarioPage.class).informarCampoPassword(senha) ;
	}

	@Quando("informar no campo confirmar password {string}")
	public void informarNoCampoConfirmarPassword(String senha) {
	    // Write code here that turns the phrase above into concrete actions
		Na(CadastrarUsuarioPage.class).informarCampoConfirmarPassword(senha) ;
	}
	
	@Quando("acionar o botao salvar")
	public void acionarOBotaoSalvar() {
	    // Write code here that turns the phrase above into concrete actions
		Na(CadastrarUsuarioPage.class).acionarBotaoSalvar() ;
	}
// saio da minha tela de cadastro e vou para a que tem a lista de usuarios cadastrados
	// nela procuro o elemento na tela
	//validacao
	@Entao("o sistema cadastra o usuario {string}")
	public void oSistemaCadastraOUsuario(String Username ) {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(driver.findElement(By.xpath("//a[text()='"+ Username+"']")).isDisplayed());
		//isDisplayed() retorna true se o elemento em questao esta sendo exibido
		// is selected retorna true se o elemento estah selecionado
	}

}
