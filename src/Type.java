
public enum Type {
	NH("NGgame"),
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
