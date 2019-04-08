import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Action;

public class Controller {
	Model model;
	View view;
	final int drawDelay = 30;
	Action drawAction;
	
	// initialize the model and view
	public Controller() {
		
	}
	
	// if the restart button is clicked, set the curGame in model to be MainMenu
	class RestartButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	// if the NH button is clicked, set the curGame in the model to be NHGame
	class NHButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	// if the OP button is clicked, set the curGame in the model to be OPGame
	class OPButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
	// if the submit quiz button is clicked, call the method chechQuiz() in the model
	class QuizButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	// call the updateBirdPosition method according to the input key
	// if it is "up" updateBirdPosition(0,-1)
	// "down" updateBirdPosition(0,1)
	// "left" updateBirdPosition(-1.0)
	// "right" updateBirdPosition(1,0)
	class CustomKeyListener implements KeyListener {

		@Override
		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	// use EventQueue to create a timer and call start() by the timer
	// initialize the drawAction to be a AbstractAction and implements the actionPerforemed method
	// in the implemented method, check
	// if the curGame in model is MainMenu, call update(model) by view
	// if the quizing boolean in model is true, call update(model) by view
	// if the curGame in model is NHGame, call updateTimer() by model
	// if the curGame in model is OPGame, call updatePosition() by model and update(model) by view and updateTimer() by model
	// if the CurGame in model is End, call update(model) by view
	// if the curGame in model is Win, call update(model) by view
	public void start() {
		
	}
}
