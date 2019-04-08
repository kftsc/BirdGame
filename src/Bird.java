
public class Bird extends Element implements Move{
	// represent how many lifes left
	int life;
	// represent the type of bird
	BirdType bt;
	
	public Bird (Direction d, int x, int y, int l, BirdType b) {
		super(d,x,y);
		life = l;
		bt = b;
	}
	
	// move the bird, change x and y by adding incX and incY on x and y
	public void move(int incX, int incY) {
		
	}
	
	// subtract one from the int life.
	public void collisiion() {
		
	}
	
	// 
	public void eat() {
		
	}
}
