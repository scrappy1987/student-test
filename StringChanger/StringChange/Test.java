package StringChange;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		StringChange sc = new StringChange();
		String initial = "Maven is pretty cool";
		String end = "Sandwhich lady is life";
		int complete = sc.changeString(initial, end);
		
		int expected = 18;
		assertEquals(expected, complete);
	}

}
