package ruuner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import metodos.Cotacao;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", // Caminho da feature
		glue = "steps", 
		tags = "@auto", 
		monochrome = false, 
		dryRun = false, 
		plugin = { "pretty", "html:target/cucumber-report.html" }, 
		snippets = SnippetType.CAMELCASE)

public class Executa extends Cotacao {
	public static void abrirNavegador(String nav, String site) {
		String url = site;
		String navegador = nav;

		if (navegador.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();

		} else if (navegador.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./src/Driver/gecko.exe");
			driver = new ChromeDriver();

		} else {
			System.out.println("Insira Chrome ou Firefox");
		}
		driver.get(url);
		driver.manage().window().maximize();

	}
}
