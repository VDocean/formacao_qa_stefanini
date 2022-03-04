package stepsDefinitions;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.LoginPage;

import static utils.Utils.*; // importo esta classe jah que vou chamar o metodo acessarsistema
public class Hooks {
	@Before
	// sem parametro executa antes de qualquer teste
	// com tag, parametro executa somente onde ha a tag 
	//ex  @Before(value="@login") soh acessar os cenarios que tem a tag login
	// posso ter varias @Before e gerencialos com @Before(order = 1) ou 2 ou 3, sempre modificando o nome dos metodos abaixo tambem
	// Ex @Before(order= 1, value= "@login")
	/*public void novoNome() {
		acessarSistema();// abre o sistema antes de qualquer coisa, ateh mesmo da feature
	}*/
	public void setUp() {
		acessarSistema();// abre o sistema antes de qualquer coisa, ateh mesmo da feature
		Na(LoginPage.class).realizarLogin("Admin","admin123");
	}
	//@Before(value= "@login")
	//public void funcionalidadeLogin() {
		//acessarSistema(); 
		 
	//}
	@After // eh  executado depois de cada cenario // as mesmas  consideracoes escritas acimas valem pro after, somente o order deve ser decrescente 3,2,1
	public void tearDowns(Scenario scenario) {
		//acessarSistema();// vou deixar soh um para nao abrir duas paginas
		//driver.quit(); //fecha o navegador depois de cada teste 
	    capturarTela(scenario);
	    // atualizo a pasta TesteAutomatizados para ver a minha pasta target
	    //clico com o mouse direito nela, vou em preferencias, seta, vejo a pasta no pc
	    //  para cada feature e cada um dos cenarios um print
	}
	

}
