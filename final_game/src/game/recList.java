package game;

import java.util.ArrayList;

/**
 * 
 * @author Cai & Lee
 * when player chooses each hero, add the recovering rate to a list.
 */
public class recList {
	public static ArrayList<Double> rec = new ArrayList<Double>(); //add recovering rate to rec list.

	/**
	 * Constructor
	 * read the value of recovering rate of each hero,
	 * add recovering rate to rec list.
	 */
	public recList(){
		new chooseHero();
		for(heroable hero: chooseHero.heroList) {
			if(rec.size() < chooseHero.heroList.size()) {	
				rec.add(hero.getrecoveringRate());
			}
		}
	}	
	
}
