package main_package;
import java.util.Collection;
import javax.management.timer.Timer;
// author Sicheng Tian
public class Model {
	Timer myTimer;
	Collection<Element> list;
	Bird bird;
	boolean quizing;
	Type curState;
	Quiz quiz;
	int eggs;
	int numTrueAns;
	
	// initialize the timer and all the element in the Collection and bird
	// initializing the quizing to be false
	// set curState to be the main menu
	// initialize the egg 
	public Model() {
		
	}
	
	//getter for eggs
	public int getEggs() {return this.eggs;};
	//getter for numofTrueAns
	public int getNumAns() {return this.numTrueAns;};
	//getter for quizing
	public boolean getQuizing() {return this.quizing;};
	
	// loop through the collection list update their position by calling the move method
	// if the curState is NH2 call collisionNH2()
	// if the curState is OP call checkCollision
	public void updatePosition() {
		
	}
	
	// update the bird position by calling the move method
	// if the curState is NH1 call collisionNH1()
	public void updateBirdPosition(int incX, int incY) {
		
	}
	
	//for OP game
	// check if the bird position has collision with other hitItem except fish
	// if it is call the startQize method
	// if has collision with fish call eat() in the bird
	// remove the hitItem that has collision from the Element list
	// check if the bird has collision with the final flag
	// if it is call winGame()
	public void checkCollision(HitItem ht) {
		
	}
	
	// the method will generate a quiz
	// and set quizing boolean to be true
	public void startQuiz() {
		
	}
	
	// for OP Game
	// check the answer of the quiz
	// if it is true, set the quizing boolean to be false;
	// if it is false, call the collision method in the bird and then set the quizing boolean to be false
	// and check the remaining life of bird, if it is zero call gameOver()
	public void checkQuiz() {
		
	}
	
	// set curState to be End
	public void gameOver() {
	
	}
	
	// set curState to be Win 
	public void winGame() {
	
	}
	
	// for NH game
	// check if current bird position has collision with CollectedItem in the Element list
	// if the item has collision call isCollected() method in Collected
	// if all the CollectedItem is collected, call the startQuiz() method
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
	// check whether the hitItem fox has collision with egg
	// if it is remove the egg item and the hitItem from list, subtract one from int eggs
	// if the fox has collision with bird, call the move method of the fox
	// check the number of eggs left. if it is zero, call gameOver()
	public void collisionNH2(HitItem ht) {
		
	}
	
	public Type getCurState() {
		return curState;
	}
	
	public void setList(Collection<Element> list){
		this.list = list;
	}
	
	public void setQuiz(String question, String answer) {
		quiz = new Quiz(question, answer);
	}
	
	public Quiz getQuiz() {
		return quiz;
	}
	
	public void setBird(int x, int y, int l, BirdType bt) {
		bird = new Bird(x,y,l,bt);
	}
	
	public Bird getBird() {
		return bird;
	}
	
}
