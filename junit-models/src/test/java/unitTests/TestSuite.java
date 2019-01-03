package unitTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	BasicTests.class,
	ConditionsBeforeAndAfterClass.class
})
public class TestSuite {

}

/*

**************
* IMPORTANTE *
**************

- Criação/Divisão de suíte de testes por:
	> Testes MAIS importantes
	> Por Módulo/Funcionalidades
	> Por processos de negócio
	
*/