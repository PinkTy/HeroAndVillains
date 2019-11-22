package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * 
 * @author Cai & Lee
 *	this class shows the random events each time, when hero back to home base.
 */
public class randomEvents {
	static String notice;//the string which shows the random events on window.
	static ArrayList<String> randomeList;//list contains all the random events
	static ArrayList<Integer> bagList;//choose which items will be gifted or robbed.
	
	/**
	 * this method choose a random events and increase or decrease
	 * one of the items or nothing happen, if the hero is sailor,
	 * the team will not be robbed.
	 */
	public static void randomHappen(){
		new chooseHero();
		new bag();
		randomeList = new ArrayList<String>();
		bagList = new ArrayList<Integer>();
		//add all random events to randomList.
		Collections.addAll(randomeList, "gifted","robbed","nothing");
		//0 represents map, 1 represents HP plus 25, 2 represents HP plus 50,
		//3 represents HP plus 100, 4 represents escape cards, 5 represents recovering rate plus,
		//6 represents damage plus.
		Collections.addAll(bagList, 0,1,2,3,4,5,6);
		//if player has chosen sailor, player will not be robbed.
		for(heroable hero: chooseHero.heroList) {
			if(hero.getName() == "sailor") {
				randomeList.removeAll(randomeList);
				Collections.addAll(randomeList, "gifted","nothing");
			}
		}
		
		Random num = new Random();
		String event = randomeList.get(num.nextInt(randomeList.size()));
		
		Random num1 = new Random();
		Integer item = bagList.get(num1.nextInt(bagList.size()));
		if(event.equals("gifted")) {
			if(item == 0) {
				bag.map += 1;
				notice = "Your team be gifted a map.";
			}
			if(item == 1) {
				bag.hpPlus25 += 1;
				notice = "Your team be gifted a hp plus 25.";
			}
			if(item == 2) {
				bag.hpPlus50 += 1;
				notice = "Your team be gifted a hp plus 50.";
			}
			if(item == 3) {
				bag.hpPlus100 += 1;
				notice = "Your team be gifted a hp plus 100.";
			}
			if(item == 4) {
				bag.escapeCard += 1;
				notice = "Your team be gifted an escape card.";
			}
			if(item == 5) {
				bag.recRate += 1;
				notice = "Your team be gifted a recovering plus.";
			}
			if(item == 6) {
				bag.damagePlus += 1;
				notice = "Your team be gifted a damage plus.";
			}

		}
		else if(event.equals("robbed")) {
			if(item == 0) {
				//if player does not have this item, this item will be robbed
				if(bag.map == 0) {
					notice = "Your team be robbed, but nothing lose.";
				}
				else {
					bag.map -= 1;
					notice = "Your team be robbed a map.";
				}
			}
			if(item == 1) {
				//if player does not have this item, this item will be robbed
				if(bag.hpPlus25 == 0) {
					notice = "Your team be robbed, but nothing lose.";
				}
				else {
					bag.hpPlus25 -= 1;
					notice = "Your team be robbed a hp plus 25.";
				}
			}
			if(item == 2) {
				//if player does not have this item, this item will be robbed
				if(bag.hpPlus50 == 0) {
					notice = "Your team be robbed, but nothing lose.";
				}
				else {
					bag.hpPlus50 -= 1;
					notice = "Your team be robbed a hp plus 50.";
				}
			}
			if(item == 3) {
				//if player does not have this item, this item will be robbed
				if(bag.hpPlus100 == 0) {
					notice = "Your team be robbed, but nothing lose.";
				}
				else {
					bag.hpPlus100 -= 1;
					notice = "Your team be robbed a hp plus 100.";
				}
			}
			if(item == 4) {
				//if player does not have this item, this item will be robbed
				if(bag.escapeCard == 0) {
					notice = "Your team be robbed, but nothing lose.";
				}
				else {
					bag.escapeCard -= 1;
					notice = "Your team be robbed an escapse card.";
				}
			}
			if(item == 5) {
				//if player does not have this item, this item will be robbed
				if(bag.recRate == 0) {
					notice = "Your team be robbed, but nothing lose.";
				}
				else {
					bag.recRate -= 1;
					notice = "Your team be robbed a recovering plus.";
				}
			}
			if(item == 6) {
				//if player does not have this item, this item will be robbed
				if(bag.damagePlus == 0) {
					notice = "Your team be robbed, but nothing lose.";
				}
				else {
					bag.damagePlus -= 1;
					notice = "Your team be robbed a damage plus.";
				}
			}
		}
		else {
			notice = "Press M to open Map.";
		}
	}
}
