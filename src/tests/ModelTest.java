package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main_package.*;

class ModelTest {

	@Test
	void testWinGame() {
		Model m = new Model();
		m.winGame();
		assertEquals(m.getCurState(), Type.WIN);
	}

}
