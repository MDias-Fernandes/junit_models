package unitTests;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;

public class BasicTests {
	
	@After
	public void afterCondition3() {
		System.out.println("Pós-Condição 3" + "\n\n");
	}
	
	@After
	public void afterCondition1() {
		System.out.println("Pós-Condição 1");
	}
	
	@After
	public void afterCondition2() {
		System.out.println("Pós-Condição 2");
	}
	
	
	
	@Test
	public void validacaoVerdadeiro() {
		boolean isFieldPresent = true;
		assertTrue("espero true, obtive false", isFieldPresent);
		System.out.println(">>> Test_1");
	}
	
	@Test
	public void validacaoFalso() {
		boolean isFieldPresent = false;
		assertFalse("espero false, obtive true", isFieldPresent);
		System.out.println(">>> Test_2");
	}
	
	@Test
	public void validacaoIgualdadeEquals() {
		String text1 = "Texto igual como o esperado";
		assertEquals("Texto igual como o esperado", text1);
		System.out.println(">>> Test_3");
	}
	
	@Test
	public void validacaoIgualdadeNotEquals() {
		String text1 = "Texto igual como o esperado";
		assertNotEquals("Texto DIFERENTE como o esperado", text1);
		System.out.println(">>> Test_4");
	}
	
	
	
	@Before
	public void beforeCondition3() {
		System.out.println("Pré-Condição 3");
	}
	
	@Before
	public void beforeCondition1() {
		System.out.println("Pré-Condição 1");
	}
	
	@Before
	public void beforeCondition2() {
		System.out.println("Pré-Condição 2");
	}
	
}