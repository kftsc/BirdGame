
public class HitItem extends Element{
	ItemType it;
	
	public HitItem(Direction d, int x, int y, ItemType i) {
		super(d,x,y);
		it = i;
	}
	
	// move the item, change x and y by adding incX and incY on x and y.
	public void move(int incX, int incY) {
		
	}
}
