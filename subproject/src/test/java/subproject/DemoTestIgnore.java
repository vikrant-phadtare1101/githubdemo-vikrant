package subproject;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class DemoTestIgnore {

	@Test
	public void testObject() {
		assertTrue(true);
	}

	@Test
	public void testObjectFail() {
		assertTrue(false);
	}

	@Ignore
	public void testObjectIgnore() {
		assertTrue(false);
	}
}
