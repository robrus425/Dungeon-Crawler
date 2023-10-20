package DungeonCrawler;

public class Traps {
	private String name;
	private int Trap;
	
	public Traps() {
		Trap = -20;
		name = "";
	}
	
	public Traps(int userInputTrap, String userInputName) {
		Trap = userInputTrap;
		name = userInputName;
		
	}
	public void setTrap(int userInputTrap) {
		Trap = userInputTrap;
	}
	
	public int getTrap() {
		return Trap;
	}
	
	public void setName(String userInputName) {
		name = userInputName;
	}
	
	public String getName() {
		return name;
	}

}
