package game;

/**
* 
* @author Cai & Lee
*create the escape card item, which player can escape each fight, only can use in power up den.
*/
public class escapeCard {
	private static int cost = 250;//the cost of escape card
	
	/**
	 * 
	 * @return 
	 * return string(name, attribute and cost) of item
	 */
	public String toString() {
		return "<html>Name: Escape Card<br/>Cost: 250<br/>Attribute: You can escape<html>";
	}
	
	/**
	 * 
	 * @return the cost of this item
	 */
	public int getCost() {
		return cost;
	}
}
