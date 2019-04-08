// Author: Steven Soranno
public enum ItemType {
	AIRPLANE("northernharrier"),
	FOX("osprey"),
    FISH("fish"),
    RAT("rat"),
    STICK("stick"),
    EGG("egg");
	
	private String name = null;
	
	private BIRDTYPE(String s){
		name = s;
	}
	public String getName() {
		return name;
	}
}
