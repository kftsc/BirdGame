package tests;

import static org.junit.jupiter.api.Assertions.*;

import javax.management.timer.Timer;

import org.junit.jupiter.api.Test;

import main_package.*;

class ModelTest {
	
	@Test
	void testWinGame() {
		Model m = new Model();
		m.winGame();
		assertEquals(m.getCurState(), Type.WIN);
	}

	@Test
	void testGameOver() {
		Model m = new Model();
		m.gameOver();
		assertEquals(m.getCurState(), Type.GAMEOVER);
	}

	@Test
	void testUpdatePosition() {
		Model m = new Model();
		m.setList(new);
	}
	
	@Test
	void testForGameOver() {
		Model m = new Model();
		m.gameOver();
		assertEquals(Type.GAMEOVER,m.getCurState());
	}
	
	void testForWinGame() {
		Model m = new Model();
		m.winGame();
		assertEquals(Type.WIN,m.getCurState());
	}
	
	
	@Test
	void testSubmitQuizofNH() {
		Model m = new Model();
		m.submitQuiz();
		
		assertEquals(m.getEggs(),m.getNumAns()); // for eggs
		assertFalse(m.getQuizing());
		assertEquals(BirdType.NH,m.getCurState());
		// for NH game
		// check the number of right answer in the quiz
		// set the number of egg to be the number of right answers
		// set the quizing boolean to be false
		// set curState to be NH2
		
	}

}
