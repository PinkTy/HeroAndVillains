package game;

/**
 * 
 * @author Cai & Lee
 * This class get the name and status details of each hero,
 * and will show in the home base window.
 */
public class heroStatus {
	
	/**
	 * @return print the status details of each hero
	 */
	public String toString() {
		String result = "<html>";
		int i = 0;
		new chooseHero();
		new chooseHeroName();
		new hpList();
		new damageList();
		new recList();
		for(heroable hero: chooseHero.heroList) {
			result += "Name: " + chooseHeroName.heroNameList.get(i) +" ";
			result += "HP: " + hpList.hp.get(i) + " " + "Damage: " + damageList.dam.get(i) +" " + "Recovering Rate: "
						+ String.format("%.2f", recList.rec.get(i)).toString()+ " "
						+ "Lucky: " + hero.getlucky() + "<br/>" + "<br/>";
			i++;
		}
		result += "<html>";
		return result;
	}
}
