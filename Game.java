package DungeonCrawler;

public class Game {
	public void runGame(){
		Hero knight = new Hero();
		System.out.println("Welcome to this basic Dungeon Crawler! Good Luck!");
		System.out.println("Before we start, here are your character's stats. If you wish, you may change them:");
		System.out.println("");
		System.out.println("");
		System.out.println("Health: " + knight.getCurHP());
		System.out.println("Attack: " + knight.getAtck());
		System.out.println("Defense: " + knight.getDefn());
		System.out.println("Speed: " + knight.getSpeed());
		System.out.println("Cash: " + knight.getMoney());
		System.out.println("");
		System.out.println("Game is now starting....");
		System.out.println("");
		System.out.println("");
		
		Items HealthPotion = new Items();
		DungeonRooms rooms = new DungeonRooms(knight);
		Monster orc = new Monster("Orc", 200, 20, 10, 10, 10, 10);
		Monster gargoyle = new Monster("Gargoyle", 300, 40, 10, 10, 10, 10);
		Monster demon = new Monster("Demon", 500, 100, 10, 10, 10, 10);
		Monster orc2 = new Monster("Stronger Orc!", 250, 50, 10, 10, 10, 10);
		Monster dragon = new Monster("Dragon!!", 1000, 200, 20, 10, 10, 10);
		Traps spikes = new Traps(10, "Spikes");
		Traps tar = new Traps(1, "Spikes");
		Traps fire = new Traps(5, "Fire");
		Items NewSword = new Items();
		Items coins = new Items();
		rooms.addToBeginning(orc, HealthPotion, spikes);
		rooms.addToBeginning(gargoyle, coins , tar);
		rooms.addToBeginning(demon, NewSword , tar);
		rooms.addToBeginning(orc, coins, tar);
		rooms.addToBeginning(orc2, coins, spikes);
		rooms.addToBeginning(demon, HealthPotion, tar);
		rooms.addToBeginning(dragon, coins, fire);
		
		rooms.travelThroughRooms();		
		System.out.println("Congrats on winning! Here are your final stats: ");
		System.out.println("Health: " + knight.getCurHP());
		System.out.println("Attack: " + knight.getAtck());
		System.out.println("Defense: " + knight.getDefn());
		System.out.println("Speed: " + knight.getSpeed());
		System.out.println("Cash: " + knight.getMoney());
		
	}

}
