package main_package;
// author:¡¡Sicheng Tian, Yixiong Wu
public class CollectedItem extends Element{
	//represents which kind of item it is
	ItemType it;
	
	//represents whether the item is collected or not, every item is initialized with a false value
	boolean collected;
	
	public CollectedItem(int x, int y, ItemType i) {
		super(x,y);
		it = i;
		collected = false;
	}
	
	// call when the item is collected, change boolean collected to true
	public void isCollected() {
		
	}
}
