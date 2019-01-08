package unitTests.ADD;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class FluentValidations {
	
	@Test
	public void equalsToSomething() {
		String produto = "Note I7";
		assertThat(produto, equalTo("Note I7"));
	}
	
	@Test
	public void isSomething() {
		int code = 200;
		assertThat(code, is(200));
	}
	
	@Test
	public void anyOfSomething() {
		String result = "cor selecionada é vermelha";
		assertThat(result, anyOf(containsString("vermelho"), containsString("vermelha")));
	}
	
	@Test
	public void hasItemOfSomething() {
		List<String> productsList = new ArrayList<String>();
		productsList.add("prod-1");
		productsList.add("prod-2");
		productsList.add("prod-3");
		productsList.add("prod-4");
		productsList.add("prod-5");
		assertThat(productsList, hasItem("prod-3"));
	}

}
