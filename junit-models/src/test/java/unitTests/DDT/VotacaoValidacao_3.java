package unitTests.DDT;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class VotacaoValidacao_3 {
	
	@Parameter(0) public String nome; 
	@Parameter(1) public int anoDeNascimento;
	@Parameter(2) public String resultado;
	
	@Test
	public void validacaoObrigatoriedadeDeVoto() {
		assertEquals(nome + resultado, Votacao.podeVotar(nome, anoDeNascimento));
	}
	
	@Parameters(name = "{0} | {1} | {2}")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object [] [] {
			{"Carina"	, 2004, " voce nao pode votar"},
			{"Maria"	, 2003, " voce nao pode votar"},
			{"Rodrigo"	, 2002, " seu voto e facultativo"},
			{"João"		, 2001, " seu voto e facultativo"},
			{"Carla"	, 2000, " seu voto e obrigatorio"},
			{"José"		, 1993, " seu voto e obrigatorio"},
			{"Ana"		, 1948, " seu voto e obrigatorio"},
			{"Pedro"	, 1947, " seu voto e facultativo"}
		});
	}
}
