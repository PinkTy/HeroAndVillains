package game;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author Cai & Lee
 * This class is the roll the dice game for villain 3, it will
 * paper scissors and rock after play roll the dice.
 *
 */
public class functionRollDiceVill3 {
	static JPanel jpEscape;
	static JPanel jpBack1;
	static JPanel jpNext;
	static JPanel jpBtn;
	static JPanel jpFinish;
	static JPanel gameTitle;
	static JPanel jpHeroNumber;
	static JPanel jpVillNumber;
	static boolean isFinished = false;
	static int rollClick;//an integer to count the how many time player has clicked the roll button
	
	/**
	 * 
	 * @return 
	 * every time when player press ROLL button, return random number between 1 to 6.
	 */
	public static Integer random() {
		ArrayList<Integer> randomList1 = new ArrayList<Integer>();
		Collections.addAll(randomList1, 1,2,3,4,5,6);
		Random num = new Random();
		Integer number1 = randomList1.get(num.nextInt(randomList1.size()));
		return number1;
	}
	
	/**
	 * 
	 * @param con
	 * @param hero
	 * @param villHp
	 * @param heroHp
	 * @param jpVill
	 * @param jpHero
	 * @param jpLairHP
	 * @param jpHeroHP
	 * @param hpIcon1
	 * @param hpIcon2
	 * @param heroIndex
	 * @param GImage1
	 * @param GImage2
	 * @param taunt
	 * @param jptalk
	 * @param thisVill
	 * @param villIndex
	 * @param GImage
	 * open the roll the dice window, every time player press ROLL button,
	 * compare the number of villain and number of hero.If HP of villain less 
	 * than or equal to 0, the has been defeated and show the next button.
	 * If the HP of hero less than or equal to 0, remove this hero.
	 */
	public static void addRoll(Container con, heroable hero,JLabel villHp,JLabel heroHp, JPanel jpVill, JPanel jpHero,
						JPanel jpLairHP, JPanel jpHeroHP,JPanel hpIcon1,JPanel hpIcon2, int heroIndex,
						JPanel GImage1,JPanel GImage2,JPanel taunt, JPanel jptalk, allVills thisVill,int villIndex,JPanel GImage) {
		
		new chooseHeroName();
		new powerUpDen();
		new hpList();
		new damageList();
		new recList();
		new cityNumber();
		new mapOpen();
		new bag();
		
		jpBack1 = new JPanel();
		jpBack1.setBounds(10,5,120,100);
		jpBack1.setOpaque(false);
		jpBack1.setVisible(false);
		
		JButton back1 = new JButton("<<BACK");
		back1.setOpaque(false);
		back1.setBackground(Color.black);
		back1.setForeground(Color.white);
		back1.setFont(new Font(null,Font.BOLD,15));
		back1.setFocusPainted(false);
		jpBack1.add(back1);
		
		jpEscape = new JPanel();
		jpEscape.setBounds(10,5,120,100);
		jpEscape.setOpaque(false);
		jpEscape.setVisible(false);
		
		JButton escape = new JButton("ESCAPE");
		escape.setOpaque(false);
		escape.setBackground(Color.black);
		escape.setForeground(Color.white);
		escape.setFont(new Font(null,Font.BOLD,15));
		escape.setFocusPainted(false);
		jpEscape.add(escape);
		
		jpNext = new JPanel();
		jpNext.setBounds(910,5,120,100);
		jpNext.setOpaque(false);
		jpNext.setVisible(false);
		jpNext.setVisible(false);
		
		JButton next = new JButton(">>NEXT");
		next.setOpaque(false);
		next.setBackground(Color.black);
		next.setForeground(Color.white);
		next.setFont(new Font(null,Font.BOLD,15));
		next.setFocusPainted(false);
		jpNext.add(next);
		
		jpBtn = new JPanel();
		jpBtn.setBounds(530, 600, 100, 50);
		jpBtn.setOpaque(false);
		
		JButton roll = new JButton();
		roll.setText("ROLL!");
		roll.setForeground(Color.WHITE);
		roll.setOpaque(false);
		roll.setBackground(Color.black);
		roll.setFont(new Font(null,Font.BOLD,20));
		roll.setFocusPainted(false);
		jpBtn.add(roll);
		
		jpFinish = new JPanel();
		jpFinish.setBounds(530, 800, 100, 50);
		jpFinish.setOpaque(false);
		jpFinish.setVisible(false);
		
		JButton finish = new JButton();
		finish.setText("Finish");
		finish.setForeground(Color.WHITE);
		finish.setOpaque(false);
		finish.setBackground(Color.black);
		finish.setFont(new Font(null,Font.BOLD,20));
		finish.setFocusPainted(false);
		jpFinish.add(finish);
		
		gameTitle = new JPanel();
		gameTitle.setBounds(380, 220, 400, 70);
		gameTitle.setOpaque(false);
		JLabel title = new JLabel();
		title.setText("Dice Rolls");
		title.setFont(new Font(null,Font.BOLD,40));
		title.setForeground(Color.GRAY);
		gameTitle.add(title);
		
		jpHeroNumber = new JPanel();
		jpHeroNumber.setBounds(270,580,40,40);
		jpHeroNumber.setOpaque(false);
		
		JLabel heroNumber = new JLabel();
		heroNumber.setFont(new Font(null,Font.BOLD,25));
		heroNumber.setForeground(Color.black);
		jpHeroNumber.add(heroNumber);
		
		jpVillNumber = new JPanel();
		jpVillNumber.setBounds(990,320,40,40);
		jpVillNumber.setOpaque(false);
		
		JLabel villNumber = new JLabel();
		villNumber.setFont(new Font(null,Font.BOLD,25));
		villNumber.setForeground(Color.black);
		jpVillNumber.add(villNumber);
		
		if(powerUpDen.usedEscapeCard == true) {
			jpEscape.setVisible(true);
			powerUpDen.usedEscapeCard = false;
			
		}
		
		escape.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new randomEvents();
				randomEvents.randomHappen();
				jptalk.setVisible(false);
				taunt.setVisible(false);
				jpHero.setVisible(false);
				jpEscape.setVisible(false);
				jpFinish.setVisible(false);
				jpVill.setVisible(false);
				jpVillNumber.setVisible(false);;
				jpHeroNumber.setVisible(false);
				gameTitle.setVisible(false);
				GImage.setVisible(false);
				jpLairHP.setVisible(false);
				jpHeroHP.setVisible(false);
				hpIcon1.setVisible(false);
				hpIcon2.setVisible(false);
				jpBtn.setVisible(false);
				new homeBase().addHomeBase(con);
			}
		});
		
		back1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new randomEvents();
				randomEvents.randomHappen();
				jpBack1.setVisible(false);
				jpFinish.setVisible(false);
				jpVill.setVisible(false);
				jpVillNumber.setVisible(false);;
				jpHeroNumber.setVisible(false);
				gameTitle.setVisible(false);
				GImage.setVisible(false);
				GImage2.setVisible(false);
				new homeBase().addHomeBase(con);
				}	
			});

		rollClick = 0;
		roll.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				rollClick += 1;
				jptalk.setVisible(false);
				taunt.setVisible(false);
				Integer num1 = random();
				Integer num2 = random();
				heroNumber.setText(Integer.toString(num1));
				villNumber.setText(Integer.toString(num2));
				//if HP of villain less than or equal to 0, the has been defeated
				if( num1 > num2 ) {
					thisVill.hp -= damageList.dam.get(heroIndex);
					if(thisVill.hp > 0) {
						villHp.setText("HP: " + thisVill.hp);
					}
					else {
						isFinished = true;
						jpNext.setVisible(true);
						jpEscape.setVisible(false);
						title.setText("You Win");
						GImage1.setVisible(true);
						jpVill.setVisible(false);
						jpLairHP.setVisible(false);
						jpHeroHP.setVisible(false);
						hpIcon1.setVisible(false);
						hpIcon2.setVisible(false);
						jpBtn.setVisible(false);
						}
				}
				if(num1 < num2) {
					//hero get the damage from villain
					hpList.hp.set(heroIndex, hpList.hp.get(heroIndex) - thisVill.damage);
					if(hpList.hp.get(heroIndex) > 0) {
						heroHp.setText("HP: " + hpList.hp.get(heroIndex));
					}
					//if the HP of hero less than or equal to 0, remove this hero.
					else {
						jpBack1.setVisible(true);
						jpEscape.setVisible(false);
						title.setText("You Loose");
						GImage2.setVisible(true);
						jpHero.setVisible(false);
						jpLairHP.setVisible(false);
						jpHeroHP.setVisible(false);
						hpIcon1.setVisible(false);
						hpIcon2.setVisible(false);
						jpBtn.setVisible(false);
						isFinished = true;
						if(hospital.inHospital.contains(chooseHeroName.heroNameList.get(heroIndex))) {
							hospital.inHospital.remove(0);
							hospital.heroIndex = 0;
							hospital.count = 0;
							hospital.hpCount = 0;
						}
						//if this hero is thief, remove a ability of this hero in the team.
						if(chooseHero.heroList.get(heroIndex).getName() == "thief") {
							if(bag.map - 100 >= 0) {
								bag.map -= 100;
							}
							else {
								bag.map = 0; 
							}
						}
						chooseHero.heroList.remove(heroIndex);
						chooseHeroName.heroNameList.remove(heroIndex);
						hpList.hp.remove(heroIndex);
						damageList.dam.remove(heroIndex);
						recList.rec.remove(heroIndex);
						//if this team does not have any other heroes, shows the game over window
						if(chooseHero.heroList.size() == 0) {
							jpFinish.setVisible(true);
							jpBack1.setVisible(false);
							finish.addActionListener(new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									GImage2.setVisible(false);
									jpFinish.setVisible(false);
									jpVill.setVisible(false);
									jpVillNumber.setVisible(false);;
									jpHeroNumber.setVisible(false);
									gameTitle.setVisible(false);
									GImage.setVisible(false);
									new gameOver().addGameOver(con);
								}
							});	
						}						
					}
				}	
				if(rollClick == 1 && isFinished == false) {
					isFinished = false;
					rollClick = 0;
					setVisible();
					GImage.setVisible(false);
					new functionPaperScissorsRockVill3().addPaper(con, hero, villHp, heroHp, 
							jpVill, jpHero, jpLairHP, jpHeroHP, hpIcon1, hpIcon2, 
							lair.heroIndex,GImage1,GImage2,jptalk,lair.thisVill,lair.villIndex);
				}
			}
		});
		
		//if villain has been defeated, next button shows in the window
		next.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jpHero.setVisible(false);
				gameTitle.setVisible(false);
				jpNext.setVisible(false);
				jpHeroNumber.setVisible(false);
				jpVillNumber.setVisible(false);
				GImage1.setVisible(false);
				GImage.setVisible(false);
				cityNumber.numberOfCity -= 1;
				//if last villain has defeated, shows the wining window
				if(cityNumber.numberOfCity == 0) {
					new youWin().addWin(con);
					}
				else {
					lair.visitedLair = false;
					villList.villlist.remove(villIndex);
					new randomEvents();
					randomEvents.randomHappen();
					//map of this city cannot be use in the next city.
					if(bag.map > 0) {
						bag.map -= 1;
					}
					mapOpen.isOpenedMap = false;
					mapOpen.isVisitedEast = false;
					mapOpen.isVisitedNorth = false;
					mapOpen.isVisitedSouth = false;
					mapOpen.isVisitedWest = false;
					int count = 0;
					//every hero recover some HP 
					for(heroable hero: chooseHero.heroList) {
						if(hero.getName().equals("tinker")) {
							if((int) (hpList.hp.get(count) * (1 + recList.rec.get(count))) > 120){
								hpList.hp.set(count, 120);
							}
							else{
								hpList.hp.set(count, (int) (hpList.hp.get(count) * (1 + recList.rec.get(count))));
							}
						}
						else if((int) (hpList.hp.get(count) * (1 + recList.rec.get(count))) > 100){
							hpList.hp.set(count, 100);
						}
						else{
							hpList.hp.set(count, (int) (hpList.hp.get(count) * (1 + recList.rec.get(count))));
						}
						count ++;
					}
					//the team is rewarded 1200 coins.
					totalMoney.money += 1200;
					new homeBase().addHomeBase(con);
				}
				}	
			});
		
		con.add(jpEscape);
		con.add(jpBack1);
		con.add(jpNext);
		con.add(jpBtn);
		con.add(jpFinish);
		con.add(gameTitle);
		con.add(jpHeroNumber);
		con.add(jpVillNumber);
		back1.requestFocus();
	}
	
	public static void setVisible() {
		jpBtn.setVisible(false);
		gameTitle.setVisible(false);
		jpEscape.setVisible(false);
		
	}
}
