package game;

import java.util.ArrayList;

/**
 * 
 * @author Cai & Lee
 * create a list contains all six different villains.
 */
public class villList {
	static ArrayList<allVills> villlist = new ArrayList<allVills>();//this list contains all the 
	
	/**
	 * Constructor
	 * add all six villains to villlist.
	 */
	villList(){
		villlist.add(new vill1());
		villlist.add(new vill2());
		villlist.add(new vill3());
		villlist.add(new vill4());
		villlist.add(new vill5());
	}
}
