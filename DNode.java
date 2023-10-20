package DungeonCrawler;

public class DNode  {
	private Monster monster;
	private Items items;
	private Traps traps;
	public DNode next;
	public DNode prev;

	
	public DNode(Monster m, Items i, Traps t) {
		monster = m;
		items = i;
		traps = t;
		next = null;
		prev = null;
	}
	
	public Monster getMonster() {
		return monster;
	}

	public void setMonster (Monster m) {
		monster = m;
		
	}
	public void setItems(Items i) {
		items = i;
	}
	public Items getItems() {
		return items;
	}
	
	public void setTraps(Traps t) {
		traps = t;		
	}
	public Traps getTraps() {
		return traps;
	}

}
