package main_package;
// author Yixiong Wu
public class Quiz {
	// The question for one quiz
	String question;
	// matched answer to the question
	String answer;
	// the answer which the player has chosen
	String chosenAnswer;
	
	public Quiz(String question, String answer) {
		this.answer = answer;
		this.question = question;
	}
	
	// record player's choice for one quiz question
	public void setChosenAnser(String chosenAnswer) {
		this.chosenAnswer = chosenAnswer;
	}
	//check if the chosenAnswer matchs the correct answer
	public boolean checkAnswer() {
		return answer.equals(chosenAnswer);
	}
}
