package unitTests.ADD;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import unitTests.DDT.Votacao;

@RunWith(JUnitParamsRunner.class)
public class IgnoreSomeTest {
	
	@Test
	@FileParameters(value= "../junit-models/data/dataForTests.csv", mapper = CsvWithHeaderMapper.class)
	public void validacaoObrigatoriedadeDeVotoComCsv(String nome, int anoDeNascimento, String resultado) {
		assertEquals(nome + " " + resultado, Votacao.podeVotar(nome, anoDeNascimento));
	}
	
	@Ignore(value = "Teste ignorado, pendente de desenvolvimento")
	@Test
	public void testToBeIgnored() {
		System.out.println("Teste não será executado");
	}

}
