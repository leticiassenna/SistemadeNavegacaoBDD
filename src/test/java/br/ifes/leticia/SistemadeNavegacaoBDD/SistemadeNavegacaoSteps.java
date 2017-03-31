package br.ifes.leticia.SistemadeNavegacaoBDD;

import static org.junit.Assert.assertEquals;
import br.ifes.leticia.SistemadeNavegacao.control.Cidade;
import br.ifes.leticia.SistemadeNavegacao.model.AbstractAvaliadorDirecional;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SistemadeNavegacaoSteps {

	String pontoCardial;
	String cidadesStr;
	Cidade cidadeSelecionada;

	@Given("^Eu tenho um ponto cardial \"([^\"]*)\"$")
	public void eu_tenho_um_ponto_cardial(String arg1) throws Throwable {
		this.pontoCardial = arg1;
	}

	@When("^Eu recebo as cidades \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void eu_recebo_as_cidades(String arg1, String arg2, String arg3, String arg4) throws Throwable {
        this.cidadesStr = this.pontoCardial + " " + arg1 + " " + arg2 + " " + arg3 + " " + arg4;
        cidadeSelecionada = AbstractAvaliadorDirecional.processar(this.cidadesStr.toString());
	}

	@Then("^Eu tenho a cidade desejada \"([^\"]*)\"$")
	public void eu_tenho_a_cidade_desejada(String arg1) throws Throwable {
		assertEquals(arg1, cidadeSelecionada.getNome());
	}

}
