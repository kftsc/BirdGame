// Author: Steven Soranno
public enum BirdType {
    NH("northernharrier"),
	OSPREY("osprey");
	
	private String name = null;
	
	private BIRDTYPE(String s){
		name = s;
	}
	public String getName() {
		return name;
	}
}
