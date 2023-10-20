package DungeonCrawler;

public class Items {
	private int HealthPotion; //increases health ITEM
	private int NewSword; // increases attack ITEM
	private int SpeedPotion; //increases speed ITEM
	private int Coins; //increases money ITEM
	private int ArmorUpgrade; // increases defense ITEM
	private String iName;
	private int ToughLuck;

	public Items() {
		HealthPotion = 50;
		NewSword = 30;
		SpeedPotion = 15;
		Coins = 10;
		ArmorUpgrade = 30;
		iName = "";
	}
	
	public Items(String n, int userInputHPP, int userInputNS, int userInputSP, int userInputCoins, int userInputAU, int userInputTL) {
		HealthPotion = userInputHPP;
		NewSword = userInputNS;
		SpeedPotion = userInputSP;
		Coins = userInputCoins;
		ArmorUpgrade = userInputAU;
		iName = n;
		ToughLuck = userInputTL;
	}
	
	public int getHealthPotion() {
		return HealthPotion;
	}

	public void setHealthPotion(int userInputHealthPotion) {
		HealthPotion = userInputHealthPotion;
	}
	
	public int getNewSword() {
		return NewSword;
	}

	public void setNewSword(int userInputNewSword) {
		NewSword = userInputNewSword;
	}
	
	public int getSpeedPotion() {
		return SpeedPotion;
	}

	public void setSpeedPotion(int userInputSpeedPotion) {
		SpeedPotion = userInputSpeedPotion;
	}
	
	public int getCoins() {
		return Coins;
	}

	public void setCoins(int userInputCoins) {
		Coins = userInputCoins;
	}

	public int getArmorUpgrade() {
		return ArmorUpgrade;
	}

	public void setArmorUpgrade(int userInputArmorUpgrade) {
		ArmorUpgrade = userInputArmorUpgrade;
	}
	
	public void setIname(String n) {
		iName = n;
	}
	
	public String getName() {
		return iName;
	}
	
	public void setToughLuck(int userInputTL) {
		ToughLuck = userInputTL;
	}
	public int getToughLuck() {
		return ToughLuck;
	}

	
	
	
}
