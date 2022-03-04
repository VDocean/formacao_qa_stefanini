package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class TestandoActionsSteps {
	
    //faco o mouse mover e clicar
	@Quando("acionar o menu customField")
	public void acionarOMenuCustomField() {
		 Na(TelaInicialPage.class).AcessarMenuCustomField();
	}

     // validacao
	@Entao("o sitema apresenta a tela customField")
	public void oSitemaApresentaATelaCustomField() {
	     assertEquals("Add",driver.findElement(By.id("buttonAdd")).getText());
	}
}