package game;

/**
 * 
 * @author Cai & Lee
 *this class create a new hero, the ability of this hero 
 *is having more coins.
 */
public class richMan implements heroable{
	private static int HP;// the HP of this hero
	private static int damage;// the damage of this hero
	private static int coin;// the coins of this hero
	private boolean map;// the initial value of this hero
	private static double recoveringRate;// the recovering rate of this hero 
	private int lucky;// the lucky of this hero
	
	/**
	 * Constructor
	 * set the initial value of rich man
	 */
	public richMan() {
		HP = 100;
		damage = 40;
		coin = 2000;
		map = false;
		recoveringRate = 0.1;
		lucky = 1;
	}
	
	/**
	 * @return print the name and attribute of rich man
	 */
	public String toString() {
		return "<html>Name: Rich man<br/>HP: 100<br/>Damage: 40<br/>Coin: 2000<br/>Recovering rate: 0.1<br/>Map: NO<br/>Lucky: 1<html>";
	}
	
	/**
	 * @return The name of this hero.
	 */
	public String getName() {
		return "richman";
	}
	
	/**
	 * @return The value of HP of rich man.
	 */
	public int getHP() {
		return HP;
	};
	
	/**
	 * @return The value of damage of rich man.
	 */
	public int getdamage() {
		return damage;
	};
	
	/**
	 * @return The value of coins of rich man.
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
	 * @return The value of recovering rage of rich man.
	 */
	public double getrecoveringRate() {
		return recoveringRate;
	};
	
	/**
	 * @return The value of lucky of rich man.
	 */
	public int getlucky() {
		return lucky;
	};
	
	
	
}	
