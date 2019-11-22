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
 *Every time when player start a new game with an empty,
 *this test case is to test the bag class is correct.
 */

class bagTest {

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
	}
	
	/**
	 * If play choose thief, which has 100 maps, test the ability
	 * of thief is correct.
	 */
	@Test
	void addThiefTest() {
		Collections.addAll(chooseHero.heroList, new thief() ,new soldier());
		assertEquals(100, new bag().getMap());
		assertEquals(0, new bag().getHpPlus25());
		assertEquals(0, new bag().getHpPlus50());
		assertEquals(0, new bag().getHpPlus100());
		assertEquals(0, new bag().getEscapeCard());
		assertEquals(0, new bag().getRecRate());
		assertEquals(0, new bag().getDamagePlus());
	}
	
	/**
	 * test the initial value of bag,if we add rich man, tinker & sailor in the hero list.
	 */
	@Test
	void addHeroesTestCase1() {
		Collections.addAll(chooseHero.heroList, new richMan(),new tinker(),new sailor());
		assertEquals(0, new bag().getMap());
		assertEquals(0, new bag().getHpPlus25());
		assertEquals(0, new bag().getHpPlus50());
		assertEquals(0, new bag().getHpPlus100());
		assertEquals(0, new bag().getEscapeCard());
		assertEquals(0, new bag().getRecRate());
		assertEquals(0, new bag().getDamagePlus());
		
	}
	
	/**
	 * test the initial value of bag,if we add tinker, tinker & tinker in the hero list.
	 */
	@Test
	void addHeroesTestCase2() {
		Collections.addAll(chooseHero.heroList, new tinker(),new tinker(),new tinker());
		assertEquals(0, new bag().getMap());
		assertEquals(0, new bag().getHpPlus25());
		assertEquals(0, new bag().getHpPlus50());
		assertEquals(0, new bag().getHpPlus100());
		assertEquals(0, new bag().getEscapeCard());
		assertEquals(0, new bag().getRecRate());
		assertEquals(0, new bag().getDamagePlus());
	}
	
	/**
	 * test the initial value of bag,if we add three thief in the hero list.
	 */
	@Test
	void addHeroesTestCase3() {
		Collections.addAll(chooseHero.heroList, new thief(),new thief(),new thief());
		assertEquals(100, new bag().getMap());
		assertEquals(0, new bag().getHpPlus25());
		assertEquals(0, new bag().getHpPlus50());
		assertEquals(0, new bag().getHpPlus100());
		assertEquals(0, new bag().getEscapeCard());
		assertEquals(0, new bag().getRecRate());
		assertEquals(0, new bag().getDamagePlus());
	}
	
	/**
	 * test the initial value of bag,if we do not add hero in the hero list.
	 */
	@Test
	void addHeroesTestCase4() {
		Collections.addAll(chooseHero.heroList);
		assertEquals(100, new bag().getMap());
		assertEquals(0, new bag().getHpPlus25());
		assertEquals(0, new bag().getHpPlus50());
		assertEquals(0, new bag().getHpPlus100());
		assertEquals(0, new bag().getEscapeCard());
		assertEquals(0, new bag().getRecRate());
		assertEquals(0, new bag().getDamagePlus());
	}
}
