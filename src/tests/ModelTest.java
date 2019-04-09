package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

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
	void testSubmitQuizofNH() {
		Model m = new Model();
		m.submitQuiz();
		
		assertEquals(m.getEggs(),m.getNumAns()); // for eggs
		assertFalse(m.getQuizing());
		assertEquals(BirdType.NH,m.getCurState());
		
	}
	
	@Test
	void testCheckQuiz() {
		Model m = new Model();
		m.setQuiz("1111?", "yes");
		m.getQuiz().setChosenAnser("yes");
		m.checkQuiz();
		assertEquals(false, m.getQuizing());
		
		m.setBird(0, 0, 3, BirdType.NH);
		m.getQuiz().setChosenAnser("no");
		m.checkQuiz();
		assertEquals(false,m.getQuizing());
		assertEquals(2, m.getBird().getLife());
	}
	
	@Test
	void testStartQuiz() {
		Model m = new Model();
		m.startQuiz();
		assertEquals(true, m.getQuizing());
	}
	
	@Test
	void testCheckCollision() {
		Model m = new Model();
		m.setBird(50, 50, 2, BirdType.OSPREY);
		m.checkCollision(new HitItem(50,50,ItemType.AIRPLANE));
		assertEquals(true, m.getQuizing());
		
		m.checkCollision(new HitItem(50,50,ItemType.FISH));
		assertEquals(3, m.getBird().getLife());
		
		m.checkCollision(new HitItem(50,50,ItemType.WINFLAG));
		assertEquals(Type.WIN, m.getCurState());
		
	}


}
