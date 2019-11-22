package game;

/**
 * 
 * @author Cai & Lee
 * after player has chosen heroes, calculate the total coins.
 */
public class totalMoney {
	int count;// read the coins of each heroes
	public static int money;// total value of coins
	
	/**
	 * Constructor
	 * read the value of coins of each hero,
	 *  calculate the total coins.
	 */
	public totalMoney(){
		new chooseHero();
		for(heroable hero: chooseHero.heroList) {
			count += hero.getcoin();
		}
		
	}
	
	/**
	 * set the total coins to money.
	 */
	public void setMoney() {
		money = count;
	}
	


}
