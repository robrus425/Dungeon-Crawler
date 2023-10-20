package DungeonCrawler;

public class Hero {
	private double maxHP;
	private int curHP;
	private int atck;
	private int defn;
	private int speed;
	private double money;
	
	public Hero() {
		maxHP = 200;
		curHP = 150;
		atck = 50;
		defn = 50;
		speed = 20;
		money = 100;	
	}

	public double getMaxHP() {
		return maxHP;
	}

	public void setMaxHP(double userInputmaxHP) {
		maxHP = userInputmaxHP;
	}

	public int getCurHP() {
		return curHP;
	}

	public void setCurHP(int userInputcurHP) {
		curHP = userInputcurHP;
	}

	public int getAtck() {
		return atck;
	}

	public void setAtck(int userInputatck) {
		atck = userInputatck;
	}

	public int getDefn() {
		return defn;
	}

	public void setDefn(int userInputdefn) {
		defn = userInputdefn;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int userInputspeed) {
		speed = userInputspeed;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double userInputmoney) {
		money = userInputmoney;
	}


	public Hero(double userInputmaxHP, int userInputcurHP, int userInputatck, int userInputdefn, int userInputspeed, double userInputmoney) {
		maxHP = userInputmaxHP;
		curHP = userInputcurHP;
		atck = userInputatck;
		defn = userInputdefn;
		speed = userInputspeed;
		money = userInputmoney;	
	}

	
	

	
}