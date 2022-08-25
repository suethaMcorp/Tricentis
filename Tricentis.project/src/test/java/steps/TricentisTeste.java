package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Cotacao;
import metodos.HomePage;
import metodos.Metodos;
import ruuner.Executa;

public class TricentisTeste {
	Metodos metodos = new Metodos();
	HomePage home = new HomePage();
	Cotacao cotacao = new Cotacao();

	@Given("que o usuario entre no site da tricentis {string}")
	public void queOUsuarioEntreNoSiteDaTricentis(String site) {
		Executa.abrirNavegador("Chrome", site);

	}

	@Given("que clico no menu {string}")
	public void queClicoNaOpçãoDesejada(String menu) {
		home.menu(menu);
	}

	@When("preencho os dados do veiculo")
	public void preenchoOsDadosDoVeiculo() {
		cotacao.preencherDadosDoVeiculo();
	}

	@When("preencho os dados do seguro")
	public void preenchoOsDadosDoSeguro() {
		cotacao.preencherDadosDoSeguro();
	}

	@When("preencho os dados do produto")
	public void preenchoOsDadosDoProduto() {
		cotacao.preencherDadosDoProduto();
	}

	@When("preencho os dados do preco")
	public void preenchoOsDadosDoPreco() throws InterruptedException {
		cotacao.preencherDadosDoPreco();
	}

	@When("envio cotacao")
	public void envioCotacao() {
		cotacao.enviarCotacao();
	}

	@Then("cotacao enviada com sucesso")
	public void cotacaoEnviadaComSucesso() throws InterruptedException {
		
	}

}
