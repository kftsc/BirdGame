// author:¡¡Sicheng Tian
public class CollectedItem extends Element{
	//represents which kind of item it is
	ItemType it;
	
	//represents whether the item is collected or not, every item is initialized with a false value
	boolean collected;
	
	public CollectedItem(Direction d, int x, int y, ItemType i) {
		super(d,x,y);
		it = i;
		collected = false;
	}
	
	// call when the item is collected, change boolean collected  to true
	public void isCollected() {
		
	}
}
