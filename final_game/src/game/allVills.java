package game;

import java.awt.Container;

/**
 * 
 * @author Cai & Lee
 *This abstract class is the superclass of six villains(
 *vill1 to vill6), set all the initial values of villains.
 */
public abstract class allVills {
	public int hp; //initial number of HP of Villain.
	public int damage; //If Villain win the game, hero will decrease the same number of HP.
	public  abstract void villFight(Container container);//set the games of each of villains.
	public abstract String getVillName();//get the name of the villains
	public abstract int getHp();//get the health of each villains, initial value is 100.
	public abstract int getDamage();//get the damage of villains
}
