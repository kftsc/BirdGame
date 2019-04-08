package main_package;

public enum Type {
	NH1("NHGgame"),
	NH2("NHGame"),
	OP("OPgame"),
	MAINMENU("MainMenu"),
	GAMEOVER("GameOver"),
	WIN("Win");
	
	private String name = null;
	
	private Type(String s){
		name = s;
	}
	public String getName() {
		return name;
	}
	
}