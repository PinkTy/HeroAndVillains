package game;

/**
 * 
 * @author Cai & Lee
 * this class create a new hero, the ability of this hero 
 * has more recovering rate.
 */
public class tailer implements heroable{
	private static int HP;// the HP of this hero
	private static int damage;// the damage of this hero
	private static int coin;// the coins of this hero
	private boolean map;// the initial value of this hero
	private static double recoveringRate;// the recovering rate of this hero 
	private int lucky;// the lucky of this hero

	/**
	 * Constructor
	 * set the initial value of tailer
	 */
	public tailer() {
		HP = 100;
		damage = 40;
		coin = 1000;
		map = false;
		recoveringRate = 0.2;
		lucky = 1;
	}
	
	/**
	 * @return print the name and attribute of tailer
	 */
	public String toString() {
		return "<html>Name: Tailer<br/>HP: 100<br/>Damage: 40<br/>Coin: 1000<br/>Recovering rate: 0.2<br/>Map: NO<br/>Lucky: 1<html>";
	}
	
	/**
	 * @return The name of this hero.
	 */
	public String getName() {
		return "tailer";
	}
	
	/**
	 * @return The value of HP of tailer.
	 */
	public int getHP() {
		return HP;
	};
	
	/**
	 * @return The value of damage of tailer.
	 */
	public int getdamage() {
		return damage;
	};
	
	/**
	 * @return The value of coins of tailer.
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
	 * @return The value of recovering rage of tailer.
	 */
	public double getrecoveringRate() {
		return recoveringRate;
	};
	
	/**
	 * @return The value of lucky of tailer.
	 */
	public int getlucky() {
		return lucky;
	};
}
