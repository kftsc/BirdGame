import java.util.Collection;
import java.util.Timer;

public class Model {
	Timer myTimer;
	Collection<Element> list;
	Bird bird;
	boolean quizing;
	Type curState;
	
	// initialize the timer and all the element in the Collection and bird
	// initializing the quizing to be false
	// set curState to be the main menu
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
	public void updateBirdPosition() {
		
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
}
