package DungeonCrawler;
import java.util.Scanner;

public class DungeonRooms { //linked list 
		private DNode head;
		private DNode tail;
		private int size;
		private Hero TheHero;
		private Monster monster;
		
		
		
		public DungeonRooms(Hero h) {
			TheHero = h;
			head = null;
			tail = null;
			size = 0;
			
			// let theHero interact with theCurrentRoom.getMonster()
			// and theCurrentRoom.getItems()
			// and theCurrentRoom.getTraps()
		}
		
		public void travelThroughRooms() {
			DNode theCurrentRoom = head;
			while (theCurrentRoom != null) {
				
				int yourHP = TheHero.getCurHP();
				int yourAttack = TheHero.getAtck();
				double yourWallet = TheHero.getMoney();
				Items itms = theCurrentRoom.getItems();
				
				int healthpotion = itms.getHealthPotion();
				yourHP += healthpotion;
				
				int toughluck = itms.getToughLuck();
				
				if(itms == null) {
					System.out.println ("Sorry, no items");
				}
				
				int NewSword = itms.getNewSword();
				yourAttack += NewSword;
				 
				int Coins = itms.getCoins();
				yourWallet += Coins;
				
				Traps t = theCurrentRoom.getTraps();
				int spikes = t.getTrap();
				yourHP += spikes;
				
				int fire = t.getTrap();
				yourHP += fire;
				
				
				System.out.println("You found something!");
				
				System.out.println("Your health is now " + yourHP);
				System.out.println("Your attack is now " + yourAttack);
				
				System.out.println("Oh no! You ran into a trap! ");
				System.out.println("Your health: " + yourHP);
								
				System.out.println("The hero is fighting the " + theCurrentRoom.getMonster().getName());
				
				int battle = TheHero.getAtck();		
				Monster roomMonster = theCurrentRoom.getMonster();
				int CurrentHP = roomMonster.getLife();
		
				int result = CurrentHP - battle;
		
				roomMonster.setLife(result);
								
				int hit = roomMonster.getMatck();				
				int damage = yourHP - hit;
				
				TheHero.setCurHP(damage);
				
				System.out.println("Monster Health " + result);	
				System.out.println("Your health " + yourHP);
				
				
				if (TheHero.getCurHP() == 0) {
					break;
				}
				
				System.out.println("You Won! Next Room.");
				theCurrentRoom = theCurrentRoom.next;
				}
				}
		
		
		public boolean isEmpty() {
			return head == null; // size == 0
		}
		
		public void addToBeginning(Monster m, Items i, Traps t) {
			DNode toAdd = new DNode(m, i, t);

			if (isEmpty()) {
				// list was empty
				head = toAdd;
				tail = toAdd;
			} else {
				// list was not empty
				toAdd.next = head;
				head.prev = toAdd;
				head = toAdd;
			}

			size++;
		}
		
		public void addToEnd(Monster m, Items i, Traps t) {
			DNode toAdd = new DNode(m, i, t);
			if (isEmpty()) {
				// list was empty
				head = toAdd;
				tail = toAdd;
			} else {
				// list was not empty
				toAdd.prev = tail;
				tail.next = toAdd;
				tail = toAdd;
			}
			size++;
		}

		
		// removes the first occurrence of toFind
		public boolean remove(String toFind) {
			
			if (isEmpty()) {
				return false;
			}
			
			// we know the list is not empty here
			if (head.getMonster().equals(toFind)) {
				// we know we need to remove head
				if (head == tail) { // there was only 1 node and we want to remove it
					head = null;
					tail = null;
					size--;
					return true;
				} else {
					// we know it's at the head, and there's more than 1 node in the list
					head = head.next;
					head.prev = null;
					size--;
					return true;
				}
			} else {
				// size > 0 and not at the head
				if (tail.getMonster().equals(toFind)) {
					tail = tail.prev;
					tail.next = null;
					size--;
					return true;
				} else {
					// we know toFind is not at head or tail
					if (head == tail) {
						return false;
					} else {
						DNode temp = head;
						
						// *look here next time
						while (temp != null && !temp.getMonster().equals(toFind)) {
							temp = temp.next;
						}
						
						if (temp == null) {
							// we know we didn't find it
							return false;
						} else {
							// found it "in the middle" and we remove it
							temp.prev.next = temp.next;
							temp.next.prev = temp.prev;
							size--;
							return true;
						}
					}
				}
			}
			
		}
		
		public String toString() {
			String toReturn = "";
			DNode temp = head;

			while (temp != null) {
				toReturn = toReturn + temp.getMonster() + "\n";
				temp = temp.next;
			}
			
			return toReturn;
		}

		public String toStringBackwards() {
			String toReturn = "";
			DNode temp = tail;

			while (temp != null) {
				toReturn = toReturn + temp.getMonster() + "\n";
				temp = temp.prev;
			}
			
			return toReturn;
		}

		public int length() {
			return size;
		}

		

		
}


