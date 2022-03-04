package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage {
	//classe criada para mapear os elementos da barra de ferramentas comum a todas as paginas da hrm orange

	@FindBy (linkText="Admin") //mapeia o meu campo usuario
	 public WebElement abaAdmin;	
	 
	@FindBy (linkText="PIM") //mapeia o setor na aba pim
	 public WebElement abaPim;	
	 
	@FindBy (id="menu_pim_Configuration") //mapeia o meu campo usuario
	 public WebElement MenuConfiguration;	
	
	@FindBy (id="menu_pim_listCustomFields") //mapeia o meu campo usuario
	 public WebElement MenuField;	
	
	
	
}
