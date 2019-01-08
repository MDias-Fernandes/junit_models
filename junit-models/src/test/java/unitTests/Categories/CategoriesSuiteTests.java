package unitTests.Categories;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class) 			// Execute com categorias de testes
@IncludeCategory(Positivos.class) 	// Execute os testes com a Interface Positivos
@SuiteClasses({
	CategoryTests.class 			//Execute as categorias definidas em @IncludeCategory dentro da classe descrita
})
public class CategoriesSuiteTests {
	
}
