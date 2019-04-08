// author Sicheng Tian
public class HitItem extends Element{
	//represents which kind of item it is
	ItemType it;
	
	public HitItem( int x, int y, ItemType i) {
		super(x,y);
		it = i;
	}
	
	// move the item, change x and y by adding or subtracting incX and incY on x and y.
	public void move(int incX, int incY) {
		
	}
}
