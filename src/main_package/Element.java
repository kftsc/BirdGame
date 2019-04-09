package main_package;
// author Sicheng Tian, Yixiong Wu
public class Element {
	// everything exists in the game besides the background is an element
	
	// x-axis location
	int x;
	// y-axis location
	int y;

	public Element(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	
}
