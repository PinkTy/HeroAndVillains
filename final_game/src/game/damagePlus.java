package game;

/**
 * 
 * @author Cai & Lee
 *create the damage plus item, which can increase 5 damage each time,only can use in power up den.
 */
public class damagePlus {
	private static int cost = 300;//the cost of damage plus
	
	/**
	 * 
	 * @return 
	 * return string(name, attribute and cost) of item
	 */
	public String toString() {
		return "<html>Name:Damage+<br/>Cost: 300<br/>Attribute: +5 Damage<html>";
	}
	
	/**
	 * 
	 * @return the cost of this item
	 */
	public int getCost() {
		return cost;
	}
}
