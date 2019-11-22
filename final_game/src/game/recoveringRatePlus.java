package game;

/**
* 
* @author Cai & Lee
*create the recovering rate plus item, which will increase 0.05 recovering rate each time, only can use in power up den
*/
public class recoveringRatePlus {
	static int cost = 400;//the cost of recovering rate plus
	
	/**
	 * 
	 * @return 
	 * return string(name, attribute and cost) of item
	 */
	public String toString() {
		return "<html>Name:Recovering Rate+<br/>Cost: 400<br/>Attribute: +5% Recovering Rate<html>";
	}
	
	/**
	 * 
	 * @return the cost of this item
	 */
	public int getCost() {
		return cost;
	}
}
