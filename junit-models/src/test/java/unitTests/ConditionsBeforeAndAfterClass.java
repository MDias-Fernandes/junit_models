package unitTests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class ConditionsBeforeAndAfterClass {
	
	@BeforeClass
	public static void beforeClassCondition() {
		System.out.println("Antes da Classe");
	}
	
	@Before
	public void beforeTestCondition() {
		System.out.println("Antes do Teste");
	}
	
	@Test
	public void test_1() {
		System.out.println("Execução do Teste --- 1");
	}
	
	@Test
	public void test_2() {
		System.out.println("Execução do Teste --- 2");
	}
	
	@After
	public void afterTestCondition() {
		System.out.println("Depois do Teste");
	}
	
	@AfterClass
	public static void afterClassCondition() {
		System.out.println("Depois da Classe");
	}

}
