package unitTests.DDT;

import static org.junit.Assert.*;

import org.junit.Test;

public class VotacaoValidacao_1 {
	
	@Test
	public void idadeIgual15Anos_NaoPodeVotar() {
		String nome = "Maria";
		int anoDeNascimento = 2003;
		assertEquals(nome + " voce nao pode votar", Votacao.podeVotar(nome, anoDeNascimento));
	}
	
	@Test
	public void idadeIgual16Anos_VotoFacultativo() {
		String nome = "Rodrigo";
		int anoDeNascimento = 2002;
		assertEquals(nome + " seu voto e facultativo", Votacao.podeVotar(nome, anoDeNascimento));
	}
	
	@Test
	public void idadeIgual17Anos_VotoFacultativo() {
		String nome = "João";
		int anoDeNascimento = 2001;
		assertEquals(nome + " seu voto e facultativo", Votacao.podeVotar(nome, anoDeNascimento));
	}
	
	@Test
	public void idadeIgual18Anos_VotoObrigatorio() {
		String nome = "Carla";
		int anoDeNascimento = 2000;
		assertEquals(nome + " seu voto e obrigatorio", Votacao.podeVotar(nome, anoDeNascimento));
	}
	
	@Test
	public void idadeIgual25Anos_VotoObrigatorio() {
		String nome = "Jose";
		int anoDeNascimento = 1993;
		assertEquals(nome + " seu voto e obrigatorio", Votacao.podeVotar(nome, anoDeNascimento));
	}
	
	@Test
	public void idadeIgual70Anos_VotoObrigatorio() {
		String nome = "Ana";
		int anoDeNascimento = 1948;
		assertEquals(nome + " seu voto e obrigatorio", Votacao.podeVotar(nome, anoDeNascimento));
	}
	
	@Test
	public void idadeIgual71Anos_VotoFacultativo() {
		String nome = "Pedro";
		int anoDeNascimento = 1947;
		assertEquals(nome + " seu voto e facultativo", Votacao.podeVotar(nome, anoDeNascimento));
	}

}
