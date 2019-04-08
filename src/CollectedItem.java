
public class CollectedItem extends Element{
	ItemType it;
	boolean collected;
	
	public CollectedItem(Direction d, int x, int y, ItemType i) {
		super(d,x,y);
		it = i;
		collected = false;
	}
	
	// call when the item is collected, change collected boolean to true
	public void isCollected() {
		
	}
}
