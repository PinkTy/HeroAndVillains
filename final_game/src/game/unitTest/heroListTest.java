package game.unitTest;

import static org.junit.Assert.assertEquals;

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
 *In the main game, every time when player add a new hero to hero list, the class
 *damageList, hpList and recList will add the damage, health and recovering rate
 *to their lists. This test case is to test these three classes are correct.
 */


class heroListTest {
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
		
	}

	/**
	 * Give an empty hero list, test damageList.dam, hpList.hp and 
	 * recList.rec are empty.
	 */
	@Test
	public void addEmptyHeroes() {
		Collections.addAll(chooseHero.heroList);
		new damageList();
		new hpList();
		new recList();
		assertEquals(0,damageList.dam.size());
		assertEquals(0,hpList.hp.size());
		assertEquals(0,recList.rec.size());
	}
	
	/**
	 * Add three heroes, test size of damageList.dam, hpList.hp and 
	 * recList.rec are three.
	 */
	@Test
	public void addThreeHeroes() {
		Collections.addAll(chooseHero.heroList, new thief(),new tinker(),new thief());
		new damageList();
		new hpList();
		new recList();
		assertEquals(3,damageList.dam.size());
		assertEquals(3,hpList.hp.size());
		assertEquals(3,recList.rec.size());
	}
	
	/**
	 * Add one hero, test size of damageList.dam, hpList.hp and 
	 * recList.rec are one.
	 */
	@Test
	public void addHeroTestCase() {
		Collections.addAll(chooseHero.heroList, new sailor());
		new damageList();
		new hpList();
		new recList();
		assertEquals(1,damageList.dam.size());
		assertEquals(1,hpList.hp.size());
		assertEquals(1,recList.rec.size());
	}
	
	/**
	 * Add two heroes, test size of damageList.dam, hpList.hp and 
	 * recList.rec are two.
	 */
	@Test
	public void addHeroTestCase2() {
		Collections.addAll(chooseHero.heroList, new tinker(), new tinker());
		new damageList();
		new hpList();
		new recList();
		assertEquals(2,damageList.dam.size());
		assertEquals(2,hpList.hp.size());
		assertEquals(2,recList.rec.size());
	}
}
