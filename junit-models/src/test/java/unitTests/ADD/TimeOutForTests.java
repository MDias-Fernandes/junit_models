package unitTests.ADD;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TimeOutForTests {

	@Rule public Timeout timeoutGlobal = Timeout.seconds(1);

	@Test
	public void failByTimeoutGlobal() throws InterruptedException {
		Thread.sleep(1001);
	}

  //@Test(timeout = 1000)
	@Test
	public void failByTimeout() throws InterruptedException {
		Thread.sleep(1001);
	}
	
	@Test
	public void noTimeout() throws InterruptedException {
		Thread.sleep(500);
	}

}
