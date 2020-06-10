
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ocp.equals.Lion;

public class TestLion {

	@Test
	public void testEqual1() {
		Lion lion1 = new Lion(1, 10, "Simba");
		Lion lion2 = new Lion(2, 10, "Zimba");
		assertFalse(lion1.equals(lion2));
	}
	
	@Test
	public void testEqual2() {
		Lion lion1 = new Lion(1, 10, "Simba");
		Lion lion2 = new Lion(1, 10, "Simba");
		assertTrue(lion1.equals(lion2));
	}

}
