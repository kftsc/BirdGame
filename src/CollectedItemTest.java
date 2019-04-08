import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CollectedItemTest {

	@Test
	// test for if Collected method is being used
	void testCollected() {
		CollectedItem c = new CollectedItem(d,0,0,i);
		c.isCollected();
		
		assertEquals(true, c.collected);
	}

}
