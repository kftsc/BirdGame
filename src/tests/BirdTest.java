package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main_package.Bird;
import main_package.BirdType;

class BirdTest {
		Bird osprey1 = new Bird(0,0,3,BirdType.NH);
	@Test
	void testMove1() {
		osprey1.move(1,1);
		assertEquals(1,osprey1.getX());
	}
	
	@Test
	void testMove2() {
		osprey1.move(1,1);
		assertEquals(1,osprey1.getY());
	}
	
	@Test
	void testCollision() {
		osprey1.collision();
		assertEquals(2,osprey1.getLife());
	}
	
	@Test
	void testEat() {
		osprey1.eat();
		assertEquals(3,osprey1.getLife());
	}

}
