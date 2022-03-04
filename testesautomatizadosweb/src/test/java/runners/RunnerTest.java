package runners;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty","html:cucumber/target-report"},// mostra o estado atual de execucao do cucumber//  gera um relatorio
		features= "src/test/resources/features",
		glue = "stepsDefinitions",
	    tags = "@dropdown",// executo somente o ceanrio com a tag especificada
		snippets = SnippetType.CAMELCASE, // serve para gerar o nome dos metodos sem underline, com boa pratica
		monochrome = true, // deixo as palavras que aparecem no console em branco, mas como o console ta branco fica preto, padrao eh vermelho
		dryRun = false// padrao dele eh falso para abrir o navegador, mas quando quero gerar os steps deixo true
        )
public class RunnerTest{

}
