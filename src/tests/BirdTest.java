package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BirdTest {
		Bird osprey1 = new Bird(0,0,3,NH);
	@Test
	void testMove() {
		osprey1.move(1,1);
		
	}

}
