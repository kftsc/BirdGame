package main_package;
// Author: Steven Soranno
public enum ItemType {
	AIRPLANE("northernharrier"),
	FOX("osprey"),
    FISH("fish"),
    RAT("rat"),
    STICK("stick"),
    WINFLAG("win flag"),
    EGG("egg");
	
	private String name = null;
	
	private ItemType(String s){
		name = s;
	}
	public String getName() {
		return name;
	}
}
