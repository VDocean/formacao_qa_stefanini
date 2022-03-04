package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static utils.Utils.*;

public class TelaInicialPage extends BasePage{ // herdo nas classes filhas o que ha em comum em todas as paginas que estah na base page
	//base page 
	public void acionarAbaAdmin() {
		 abaAdmin.click();
	 }
	 
	//elementos da minha tela inicial
	
	@FindBy (name="btnAdd") //mapeia o meu botao Add depois que cliquei na aba Admin
	 public WebElement botaoAdd;
	
	public void acionarBotaoAdd() {
		botaoAdd.click();
	}
	// metodos que farao o movimento do mouse nas minhas abas
	public void AcessarMenuCustomField() {
		Actions acao= new Actions(driver);
		acao.moveToElement(abaPim).build().perform();
		acao.moveToElement(MenuConfiguration).build().perform();
		acao.moveToElement(MenuField).click().build().perform();
	}
}
