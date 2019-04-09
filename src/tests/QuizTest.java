package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main_package.Quiz;
// @author Yufan Wang
class QuizTest {

	
	@Test
	void testCheckAnswer() {
		Quiz q = new Quiz("question", "answer");
		q.setChosenAnser("231234");
		assertEquals(false, q.checkAnswer());
		q.setChosenAnser("answer");
		assertTrue(q.checkAnswer());
	}

}
