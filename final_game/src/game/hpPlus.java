package game;

/**
* 
* @author Cai & Lee
*create the HP plus 25 item, which will increase 25 HP each time, only can use in the hospital
*/
public class hpPlus {
	static int cost = 300;//the cost of map
	
	/**
	 * 
	 * @return 
	 * return string(name, attribute and cost) of item
	 */
	public String toString() {
		return "<html>Name: NO1.HP+<br/>Cost:300<br/>Attribute: +25% HP<html>";
	}
	
	/**
	 * 
	 * @return the cost of this item
	 */
	public int getCost() {
		return cost;
	}

}
