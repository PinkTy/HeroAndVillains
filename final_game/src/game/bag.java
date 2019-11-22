package game;

/**
 * 
 * @author Cai & Lee
 * this class create the bag when player starts the game,
 * and the initial value of each items in the bag is 0.
 */
public class bag {
	public static int map = 0; //number of maps in bag
	public static int hpPlus25 = 0; //number of HP 25+ in bag
	public static int hpPlus50 = 0; //number of HP 50+ in bag
	public static int hpPlus100 = 0; //number of HP 50+ in bag
	public static int escapeCard = 0; //number of escape cards in bag
	public static int recRate = 0; //number of recovering rate plus in bag
	public static int damagePlus = 0; //number of damage plus in bag
	
	/**
	 * Constructor 
	 * Create a bag, if one of the heroes are thief, the number of maps will be 100 in the bag,
	 * which is the special ability of thief.
	 */
	
	public bag(){
		new chooseHero();
		for(heroable hero: chooseHero.heroList) {
			if(hero.getName() == "thief") {
				map = 100;
			}
		}
	}
	
	/**
	 * 
	 * @return the string of items in the bags.
	 */
	public String toString() {
		String result = new String();
		if(map >= 100) {
			result = "Map: inf " + "Hp plus 25%: " + hpPlus25 + " "
					+ "Hp plus 50%: " + hpPlus50 + " " + "Hp plus 100%: " + hpPlus100 + " "
					+ "Escape card: " + escapeCard + " " + "Recovering rate plus: " + recRate + " "
					+ "Damage plus: " + damagePlus;
		}
		else {
			result  = "Map: " + map + " " + "Hp plus 25%: " + hpPlus25 + " "
								+ "Hp plus 50%: " + hpPlus50 + " " + "Hp plus 100%: " + hpPlus100 + " "
								+ "Escape card: " + escapeCard + " " + "Recovering rate plus: " + recRate + " "
								+ "Damage plus: " + damagePlus;
		}
		return result;
	}
	/**
	 * 
	 * @return the number of maps. 
	 * Hero will get the map and know the destination of one of 5 places(home base, shop,, power up den, hospital and villains lair )
	 */
	public int getMap() {
		return map;
	}
	
	/**
	 * 
	 * @return the number of hero HP plus 25,which is a type of healing items and increase 25 HP. 
	 * However HP must still less than or equal the initial number of HP.
	 */
	public int getHpPlus25() {
		return hpPlus25;
	}
	
	/**
	 * 
	 * @return the number of hero HP plus 50,which is a type of healing items and increase 50 HP. 
	 * However HP must still less than or equal the initial number of HP.
	 */
	public int getHpPlus50() {
		return hpPlus50;
	}

	/**
	 * 
	 * @return the number of hero HP plus 100,which is a type of healing items and increase 100 HP. 
	 * However HP must still less than or equal the initial number of HP.
	 */
	public int getHpPlus100() {
		return hpPlus100;
	}
	

	/**
	 * 
	 * @return the number of escape cards, which is a type of 
	 * power up items and hero can escape for each fight.
	 */
	public int getEscapeCard() {
		return escapeCard;
	}
	

	/**
	 * 
	 * @return the number of recovering rate plus, which is a type of 
	 * power up items and will increase the recovering of heroes.
	 */
	public int getRecRate() {
		return recRate;
	}
	
	
	/**
	 * 
	 * @return the number of damage plus, which is a type of 
	 * power up items and will increase the damage of heroes.
	 */
	public int getDamagePlus() {
		return damagePlus;
	}


}
