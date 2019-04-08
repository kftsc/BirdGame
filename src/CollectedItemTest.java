import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CollectedItemTest {

	// test for if Collected method is being used
	@Test
	void test() {
		CollectedItem c = new CollectedItem(0,0,i);
		c.isCollected();
		
		assertEquals(true, c.collected);
	}

}
