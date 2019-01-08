package unitTests.DDT;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class VotacaoValidacao_2 {
	
	String resultado;
	String nome;
	int anoDeNascimento;
	
	public VotacaoValidacao_2(String nome, int anoDeNascimento, String resultado) {
		this.anoDeNascimento = anoDeNascimento;
		this.nome = nome;
		this.resultado = resultado;
	}
	
	@Test
	public void validacaoObrigatoriedadeDeVoto() {
		assertEquals(nome + resultado, Votacao.podeVotar(nome, anoDeNascimento));
	}
	
	@Parameters(name = "{0} | {1} | {2}")
	public static Collection<Object[]> data(String nome, int anoDeNascimento, String resultado) {
		return Arrays.asList(new Object [] [] {
			{"Carina"	, 2004, " voce nao pode votar"},
			{"Maria"	, 2003, " voce nao pode votar"},
			{"Rodrigo"	, 2002, " seu voto e facultativo"},
			{"João"		, 2001, " seu voto e facultativo"},
			{"Carla"	, 2000, " seu voto e obrigatorio"},
			{"João"		, 1993, " seu voto e obrigatorio"},
			{"Ana"		, 1948, " seu voto e obrigatorio"},
			{"Pedro"	, 1947, " seu voto e facultativo"}
		});
	}

}