package main_package;
import java.util.Collection;
import java.util.Timer;
// author Sicheng Tian
public class Model {
	Timer myTimer;
	Collection<Element> list;
	Bird bird;
	boolean quizing;
	Type curState;
	int eggs;
	
	// initialize the timer and all the element in the Collection and bird
	// initializing the quizing to be false
	// set curState to be the main menu
	// initialize the egg 
	public Model() {
		
	}
	
	// update the timer while the game is running
	public void updateTimer() {
		
	}
	
	// loop through the collection list update their position by calling the move method
	public void updatePosition() {
		
	}
	
	// update the bird position by calling the move method
	// and call checkCollision()
	public void updateBirdPosition(int incX, int incY) {
		
	}
	
	// check if the bird position has collision with other hitItem except fish
	// if it is call the startQize method
	// if has collision with fish call eat() in the bird
	public void checkCollision() {
		
	}
	
	// the method will generate a quiz
	// and set quizing boolean to be true
	public void startQuiz() {
		
	}
	
	// for OP Game
	// check the answer of the quiz
	// if it is true, set the quizing boolean to be false;
	// if it is false, call the collision method in the bird and then set the quizing boolean to be false;
	public void checkQuiz() {
		
	}
	
	// check the remaining life in the bird
	// if it is zero, set curState to be End
	// otherwise do nothing
	public void gameOver() {
	
	}
	
	// if reach the final flag, set curState to be Win 
	public void winGame() {
	
	}
	
	// for NH game
	// check if current bird position has collision with CollectedItem in the Element list
	// if the item has collision call isCollected() method in Collected
	// if all the CollectedItem is collected, set the quizing boolean to be true
	public void collisionNH1() {
		
	}
	
	// for NH game
	// check the number of right answer in the quiz
	// set the number of egg to be the number of right answers
	// set the quizing boolean to be false
	// set curState to be NH2
	public void submitQuiz() {
		
	}
	
	// for NH game
	// 
	public void collisionNH2() {
		
	}
	
	public Type getCurState() {
		return curState;
	}
}
