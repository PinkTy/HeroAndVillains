package game;

import java.util.ArrayList;

/**
 * 
 * @author Cai & Lee
 *when player chooses each hero, add the damage to a list.
 */
public class damageList {
	public static ArrayList<Integer> dam = new ArrayList<Integer>();//add damage to dam list.
	
	/**
	 * Constructor
	 * read the value of damage of each hero,
	 * add damage to dam list.
	 */
	public damageList(){
		new chooseHero();
		for(heroable hero: chooseHero.heroList) {
			if(dam.size() < chooseHero.heroList.size()) {
				dam.add(hero.getdamage());
			}
		}
	}	
}
