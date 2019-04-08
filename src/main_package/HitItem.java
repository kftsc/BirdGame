package main_package;

// author Sicheng Tian
public class HitItem extends Element{
	//represents which kind of item it is
	ItemType it;
	
	public HitItem(int x, int y, ItemType i) {
		super(x,y);
		it = i;
	}
	
	// getter for x
	public int getX() {
		return this.x;
	}
	
	//getter for y
	public int getY() {
		return this.y;
	}
	
	
	// move the item, change x and y by adding or subtracting incX and incY on x and y.
	public void move(int incX, int incY) {
		
	}
}
