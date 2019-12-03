package subproject;

import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

public class DemoTest {

	@Test
	public void testObject() {
		assertTrue(true);
		DemoSubproject2 demoSubproject = new DemoSubproject2();
		DemoSubproject.main(null);
	}

	@Test
	public void testObjectFail() {
		assertTrue(false);
	}

	@Ignore
	@Test
	public void testObjectIgnore() {
		assertTrue(false);
	}
}
