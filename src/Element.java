// author Sicheng Tian, Yixiong Wu
public class Element {
	// everything exists in the game besides the background is an element
	
	// x-axis location
	int x;
	// y-axis location
	int y;

	public Element(Direction d, int x, int y) {
		direction = d;
		this.x = x;
		this.y = y;
	}
}
