package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main_package.CollectedItem;
import main_package.ItemType;

class CollectedItemTest {

	@Test
	void test() {
		CollectedItem c = new CollectedItem(0,0,ItemType.EGG);
		c.isCollected();
		assertTrue(c.getCollected());
	}

}
