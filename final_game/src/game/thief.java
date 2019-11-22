package game;

/**
 * 
 * @author Cai & Lee
 * this class create a new hero, the ability of this hero 
 * knows the directions of each city.
 */
public class thief implements heroable{
	private static int HP;// the HP of this hero
	private static int damage;// the damage of this hero
	private static int coin;// the coins of this hero
	private boolean map;// the initial value of this hero
	private static double recoveringRate;// the recovering rate of this hero 
	private int lucky;// the lucky of this hero
	
	/**
	 * Constructor
	 * set the initial value of thief
	 */
	public thief() {
		HP = 100;
		damage = 35;
		coin = 800;
		map = true;
		recoveringRate = 0.1;
		lucky = 1;
	}
	
	/**
	 * @return print the name and attribute of thief
	 */
	public String toString() {
		return "<html>Name: Thief<br/>HP: 100<br/>Damage: 35<br/>Coin: 800<br/>Recovering rate: 0.1<br/>Map: YES<br/>Lucky: 1<html>";
	}
	
	/**
	 * @return The name of this hero.
	 */
	public String getName() {
		return "thief";
	}
	
	/**
	 * @return The value of HP of thief.
	 */
	public int getHP() {
		return HP;
	};
	
	/**
	 * @return The value of damage of thief.
	 */
	public int getdamage() {
		return damage;
	};
	
	/**
	 * @return The value of coins of thief.
	 */
	public int getcoin() {
		return coin;
	}
	
	/**
	 * @return the true if the hero knows the direction
	 */
	public boolean getmap() {
		return map;
	};
	
	/**
	 * 
	 * @return The value of recovering rage of thief.
	 */
	public double getrecoveringRate() {
		return recoveringRate;
	};
	
	/**
	 * @return The value of lucky of thief.
	 */
	public int getlucky() {
		return lucky;
	};
}
