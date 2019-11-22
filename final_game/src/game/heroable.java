package game;

/**
 * 
 * @author Cai & Lee
 * Specify all initial value used by all heroes.
 */
public interface heroable {
	public String getName();//get the name of this hero.
	public int getHP();//get the name of this hero.
	public int getdamage();//get the value of damage of this hero
	public int getcoin();//get the value of coins of this hero.
	public boolean getmap();//get the boolean if the hero knows the direction.
	public double getrecoveringRate();//get the value of recovering rate of this hero.
	public int getlucky();//get the value of lucky of this hero.
}