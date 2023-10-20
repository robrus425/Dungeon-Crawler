package DungeonCrawler;

public class Monster {
	private int life;
	private int Matck;
	private int Mdefn;
	private int Mspeed;
	private int Mcash;
	private int lvl;
	private String Name;
	
	public Monster() {
		life = 100;
		Matck = 30;
		Mdefn = 20;
		Mspeed = 10;
		Mcash  = 0;
		lvl = 0;
		Name = "";
	}
	public Monster(String n, int userInputlife, int userInputmatck, int userInputmdefn, int userInputmspeed, int userInputmcash, int userInputlvl) {
		life = userInputlife;
		Matck = userInputmatck;
		Mdefn = userInputmdefn;
		Mspeed = userInputmspeed;
		Mcash = userInputmcash;
		lvl = userInputlvl;
		Name = n;
		
		
	}
	public int getLife() {
		return life;
	}
	public void setLife(int userInputlife) {
		life = userInputlife;
	}
	public int getMatck() {
		return Matck;
	}
	public void setMatck(int userInputmatck) {
		Matck = userInputmatck;
	}
	public int getMdefn() {
		return Mdefn;
	}
	public void setMdefn(int userInputmdefn) {
		Mdefn = userInputmdefn;
	}
	public int getMspeed() {
		return Mspeed;
	}
	public void setMspeed(int userInputmspeed) {
		Mspeed = userInputmspeed;
	}
	public int getMcash() {
		return Mcash;
	}
	public void setMcash(int userInputmcash) {
		Mcash = userInputmcash;
	}
	public int getLvl() {
		return lvl;
	}
	public void setLvl(int userInputlvl) {
		lvl = userInputlvl;
	}
	public void setName() {
		Name = "Orc";
	}
	public String getName() {
		return Name;
	}

	
	
	
	

}
