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
	public void testObject2() {
		assertTrue(true);
		DemoSubproject2 demoSubproject = new DemoSubproject2();
		DemoSubproject2.main(null);
	}
	
	@Test
	public void testObject3() {
		assertTrue(true);
		DemoSubproject demoSubproject = new DemoSubproject2();
		DemoSubprojectCopy.main(null);
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
