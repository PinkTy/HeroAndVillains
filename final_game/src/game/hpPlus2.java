package game;

/**
* 
* @author Cai & Lee
*create the HP plus 50 item, which will increase 50 HP each time, only can use in the hospital
*/
public class hpPlus2 {
	static int cost = 400;//the cost of map
	

	/**
	 * 
	 * @return 
	 * return string(name, attribute and cost) of item
	 */
	public String toString() {
		return "<html>Name: NO2.HP+<br/>Cost:400<br/>Attribute: +50% HP<html>";
	}
	
	/**
	 * 
	 * @return the cost of this item
	 */
	public int getCost() {
		return cost;
	}
}
