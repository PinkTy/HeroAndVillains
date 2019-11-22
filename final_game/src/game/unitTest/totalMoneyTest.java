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
 *Every time when player choose heroes, some coins will add to 
 *totalMoney class, this test case is to test totalMoney class 
 *is correct.
 */
class totalMoneyTest {

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
		totalMoney.money = 0;
	}

	/**
	 * Add different heroes, test the number of money
	 * is correct. 
	 */
	@Test
	void testInitalMoney() {
		Collections.addAll(chooseHero.heroList);
		new totalMoney().setMoney();
		assertEquals(0, totalMoney.money);
		Collections.addAll(chooseHero.heroList, new richMan());
		new totalMoney().setMoney();
		assertEquals(2000, totalMoney.money);
		Collections.addAll(chooseHero.heroList, new richMan(),new thief());
		new totalMoney().setMoney();
		assertEquals(4800, totalMoney.money);
	}
	
	@Test
	void testInitalMoneyCase1() {
		Collections.addAll(chooseHero.heroList,new thief(),new thief());
		new totalMoney().setMoney();
		assertEquals(1600, totalMoney.money);
		Collections.addAll(chooseHero.heroList, new richMan(),new richMan(),new richMan() );
		new totalMoney().setMoney();
		assertEquals(7600, totalMoney.money);
		
	}
	
	@Test
	void testInitalMoneyCase2() {
		Collections.addAll(chooseHero.heroList, new richMan());
		new totalMoney().setMoney();
		assertEquals(2000, totalMoney.money);
		chooseHero.heroList.removeAll(chooseHero.heroList);
		Collections.addAll(chooseHero.heroList, new sailor());
		new totalMoney().setMoney();
		assertEquals(1000, totalMoney.money);
		chooseHero.heroList.removeAll(chooseHero.heroList);
		Collections.addAll(chooseHero.heroList, new soldier());
		new totalMoney().setMoney();
		assertEquals(1000, totalMoney.money);
		chooseHero.heroList.removeAll(chooseHero.heroList);
		Collections.addAll(chooseHero.heroList, new tailer());
		new totalMoney().setMoney();
		assertEquals(1000, totalMoney.money);
		chooseHero.heroList.removeAll(chooseHero.heroList);
		Collections.addAll(chooseHero.heroList, new thief());
		new totalMoney().setMoney();
		assertEquals(800, totalMoney.money);
		chooseHero.heroList.removeAll(chooseHero.heroList);
		Collections.addAll(chooseHero.heroList, new tinker());
		new totalMoney().setMoney();
		assertEquals(1000, totalMoney.money);
	}

}
