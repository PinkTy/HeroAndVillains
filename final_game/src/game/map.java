package game;

/**
* 
* @author Cai & Lee
*create the map item, which shows the directions of each city.
*/
public class map {
	static int cost = 200;//the cost of map
	
	/**
	 * 
	 * @return 
	 * return string(name, attribute and cost) of item
	 */
	public String toString() {
		return "<html>Name: MAP<br/>Cost:200<html>";
	}
	
	/**
	 * 
	 * @return the cost of this item
	 */
	public int getCost() {
		return cost;
	}
}
