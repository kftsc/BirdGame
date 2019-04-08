package main_package;

//author: Sicheng Tian
public class Bird extends Element{
	// represent how many lifes left
	int life;
	// represent the type of bird
	BirdType bt;
	
	public Bird (int x, int y, int l, BirdType b) {
		super(x,y);
		life = l;
		bt = b;
	}
	
	//getter for x
	public int getX() {	return this.x;}
	// getter for y
	public int getY() {	return this.y;}
	
	//getter for life;
	public int getLife() {return this.life;};
	
	
	
	// move the bird, change x and y by adding incX and incY on x and y
	public void move(int incX, int incY) {
	
	}
	
	/// losing life after collision with planes, fox
	public void collision() {
		
	}
	
	// add one to the life
	public void eat() {
		
	}
}
