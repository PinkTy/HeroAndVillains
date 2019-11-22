package game.unitTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import game.*;

/**
 * 
 * @author Cai
 *This test case is test the heroStatus class
 *shows correct values of each hero.
 */
class heroStatusTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		new chooseHero();
	}

	@AfterEach
	void tearDown() throws Exception {
		chooseHero.heroList.removeAll(chooseHero.heroList);
		damageList.dam.removeAll(damageList.dam);
		hpList.hp.removeAll(hpList.hp);
		recList.rec.removeAll(recList.rec);
		chooseHeroName.heroNameList.removeAll(chooseHeroName.heroNameList);
	}
	
	/**
	 * test if the hero list is empty, hero status will be empty.
	 */
	@Test
	void testEmptyList() {
		Collections.addAll(chooseHero.heroList);
		new damageList();
		new hpList();
		new recList();
		assertEquals("<html><html>",new heroStatus().toString());
	}
	
	/**
	 * test if add heroes to hero list,the heroStatus class shows the correct
	 * status of heroes.
	 */
	@Test
	void testAddHeroes() {
		Collections.addAll(chooseHero.heroList,new tailer());
		Collections.addAll(chooseHeroName.heroNameList,"test");
		new damageList();
		new hpList();
		new recList();
		assertEquals("<html>Name: test HP: 100 Damage: 40 "
				+ "Recovering Rate: 0.20 Lucky: 1<br/><br/><html>",new heroStatus().toString());
	}
	
	/**
	 * test if add heroes to hero list,the heroStatus class shows the correct
	 * status of heroes.
	 */
	@Test
	void testAddHeroesTestCase2() {
		Collections.addAll(chooseHero.heroList,new richMan());
		Collections.addAll(chooseHeroName.heroNameList,"test");
		new damageList();
		new hpList();
		new recList();
		assertEquals("<html>Name: test HP: 100 Damage: 40 "
				+ "Recovering Rate: 0.10 Lucky: 1<br/><br/><html>",new heroStatus().toString());
	}
	/**
	 * test if add heroes to hero list,the heroStatus class shows the correct
	 * status of heroes.
	 */
	@Test
	void testAddHeroesTestCase3() {
		Collections.addAll(chooseHero.heroList,new sailor());
		Collections.addAll(chooseHeroName.heroNameList,"test");
		new damageList();
		new hpList();
		new recList();
		assertEquals("<html>Name: test HP: 100 Damage: 35 "
				+ "Recovering Rate: 0.10 Lucky: 2<br/><br/><html>",new heroStatus().toString());
	}
	
	/**
	 * test if add heroes to hero list,the heroStatus class shows the correct
	 * status of heroes.
	 */
	@Test
	void testAddHeroesTestCase4() {
		Collections.addAll(chooseHero.heroList,new tinker());
		Collections.addAll(chooseHeroName.heroNameList,"test");
		new damageList();
		new hpList();
		new recList();
		assertEquals("<html>Name: test HP: 120 Damage: 40 "
				+ "Recovering Rate: 0.10 Lucky: 1<br/><br/><html>",new heroStatus().toString());
	}
	
	/**
	 * test if add heroes to hero list,the heroStatus class shows the correct
	 * status of heroes.
	 */
	@Test
	void testAddHeroesTestCase5() {
		Collections.addAll(chooseHero.heroList,new soldier());
		Collections.addAll(chooseHeroName.heroNameList,"test");
		new damageList();
		new hpList();
		new recList();
		assertEquals("<html>Name: test HP: 100 Damage: 48 "
				+ "Recovering Rate: 0.10 Lucky: 1<br/><br/><html>",new heroStatus().toString());
	}
	
	/**
	 * test if add heroes to hero list,the heroStatus class shows the correct
	 * status of heroes.
	 */
	@Test
	void testAddHeroesTestCase6() {
		Collections.addAll(chooseHero.heroList,new thief());
		Collections.addAll(chooseHeroName.heroNameList,"test");
		new damageList();
		new hpList();
		new recList();
		assertEquals("<html>Name: test HP: 100 Damage: 35 "
				+ "Recovering Rate: 0.10 Lucky: 1<br/><br/><html>",new heroStatus().toString());
	}
}
