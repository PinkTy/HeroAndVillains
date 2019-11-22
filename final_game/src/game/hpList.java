package game;

import java.util.ArrayList;

/**
 * 
 * @author Cai & Lee
 * when player chooses each hero, add the HP value to a list.
 */
public class hpList {
	public static ArrayList<Integer> hp = new ArrayList<Integer>();//add HP value to hp list.
	
	/**
	 * Constructor
	 * read the value of HP of each hero,
	 * add HP value to hp list.
	 */
	public hpList(){
		new chooseHero();
		for(heroable hero: chooseHero.heroList) {
			if(hp.size() < chooseHero.heroList.size()) {
				hp.add(hero.getHP());
			}
		}
	}
}
