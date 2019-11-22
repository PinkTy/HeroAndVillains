package game;

/**
* 
* @author Cai & Lee
*create the HP plus 100 item, which will increase 100 HP each time, only can use in the hospital
*/
public class hpPlus3 {
	static int cost = 600;//the cost of map
	
	/**
	 * 
	 * @return 
	 * return string(name, attribute and cost) of item
	 */
	public String toString() {
		return "<html>Name: NO3.HP+<br/>Cost:600<br/>Attribute: +100% HP<html>";
	}
	
	/**
	 * 
	 * @return the cost of this item
	 */
	public int getCost() {
		return cost;
	}
}
