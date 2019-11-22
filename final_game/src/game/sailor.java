package game;

/**
 * 
 * @author Cai & Lee
 *this class create a new hero, the ability of this hero 
 *is more lucky, and will never been robbed.
 */
public class sailor implements heroable{
	private static int HP;// the HP of this hero
	private static int damage;// the damage of this hero
	private static int coin;// the coins of this hero
	private boolean map;// the initial value of this hero
	private static double recoveringRate;// the recovering rate of this hero 
	private int lucky;// the lucky of this hero
	
	/**
	 * Constructor
	 * set the initial value of sailor
	 */
	public sailor() {
		HP = 100;
		damage = 35;
		coin = 1000;
		map = false;
		recoveringRate = 0.1;
		lucky = 2;
	}
	

	/**
	 * @return print the name and attribute of sailor
	 */
	public String toString() {
		return "<html>Name: Sailor<br/>HP: 100<br/>Damage: 35<br/>Coin: 1000<br/>Recovering rate: 0.1<br/>Map: NO<br/>Lucky: 2<html>";
	}
	
	/**
	 * @return The name of this hero.
	 */
	public String getName() {
		return "sailor";
	}
	
	/**
	 * @return The value of HP of sailor.
	 */
	public int getHP() {
		return HP;
	};
	
	/**
	 * @return The value of damage of sailor.
	 */
	public int getdamage() {
		return damage;
	};
	
	/**
	 * @return The value of coins of sailor.
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
	 * @return The value of recovering rage of sailor.
	 */
	public double getrecoveringRate() {
		return recoveringRate;
	};
	

	/**
	 * @return The value of lucky of sailor.
	 */
	public int getlucky() {
		return lucky;
	};
}
