package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main_package.HitItem;
import main_package.ItemType;

class HitItemTest {

	@Test
	void test() {
		HitItem h1 = new HitItem(0,0,ItemType.FOX);
		
		h1.move(1, 1);
		
		assertEquals(1,h1.getX());
		assertEquals(1,h1.getY());
	}

}
