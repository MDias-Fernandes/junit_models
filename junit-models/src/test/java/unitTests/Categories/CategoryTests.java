package unitTests.Categories;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class CategoryTests {
	
	@Test
	@Category(Smoke.class)
	public void test_1() {
		
	}
	
	@Test
	@Category(Positivos.class)
	public void test_2() {
		
	}
	
	@Test
	@Category(Negativos.class)
	public void test_3() {
		
	}
	
	@Test
	public void testWithoutCategory() {
		
	}

}
