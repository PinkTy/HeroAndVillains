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
 * This class is the guess number game for villain 4.
 *
 */
public class functionGussNumberVill4 {
	int number1;
	int count;
	JPanel jpBack1;
	JPanel jpNext;
	JPanel jpFinish;
	JPanel jpReason;
	JPanel jpHint;
	JPanel gameTitle;
	JPanel jp1;
	JPanel jp2;
	JPanel jp3;
	JPanel jp4;
	JPanel jp5;
	JPanel jp6;
	JPanel jp7;
	JPanel jp8;
	JPanel jp9;
	JPanel jp10;
	JButton back1,finish,next;
	
	/**
	 * 
	 * @return 
	 * every time when player choose a button, return random number between 1 to 10.
	 * player has two chances to guess this number
	 */
	public void random() {
		ArrayList<Integer> randomList1 = new ArrayList<Integer>();
		Collections.addAll(randomList1, 1,2,3,4,5,6,7,8,9,10);
		Random num = new Random();
		number1 = randomList1.get(num.nextInt(randomList1.size()));
		System.out.println(number1);
		count = 0;
	
	}
	
	/**
	 * 
	 * @param container
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
	 * @param jptalk
	 * @param thisVill
	 * @param villIndex
	 * open the game window, every time player choose a button,
	 * compare the number with the random number.If HP of villain less 
	 * than or equal to 0, the has been defeated and show the next button.
	 * If the HP of hero less than or equal to 0, remove this hero.
	 */
	public void addGuss(Container container, heroable hero,JLabel villHp,JLabel heroHp, JPanel jpVill, JPanel jpHero,
			JPanel jpLairHP, JPanel jpHeroHP,JPanel hpIcon1,JPanel hpIcon2, int heroIndex,
			JPanel GImage1,JPanel GImage2,JPanel taunt, JPanel jptalk, allVills thisVill,int villIndex,JPanel GImage) {
		random();
		new powerUpDen();
		new bag();
		
		jpHint = new JPanel();
		jpHint.setBounds(380, 850, 500, 70);
		jpHint.setOpaque(false);
		
		JLabel hint = new JLabel();
		hint.setForeground(Color.white);
		hint.setFont(new Font(null,Font.BOLD,20));
		jpHint.add(hint);
		
		jpReason = new JPanel();
		jpReason.setBounds(480,430,150,50);
		jpReason.setOpaque(false);
		
		JLabel reason = new JLabel();
		reason.setForeground(Color.white);
		reason.setFont(new Font(null,Font.BOLD,20));
		jpReason.add(reason);
		
		gameTitle = new JPanel();
		gameTitle.setBounds(380, 220, 400, 70);
		gameTitle.setOpaque(false);
		JLabel title = new JLabel();
		title.setText("Guess Number");
		title.setFont(new Font(null,Font.BOLD,40));
		title.setForeground(Color.GRAY);
		gameTitle.add(title);
		
		jp1 = new JPanel();
		jp1.setBounds(550,550,40,40);
		
		JButton btn1 = new JButton("1");
		btn1.setOpaque(false);
		btn1.setBackground(Color.black);
		btn1.setForeground(Color.white);
		btn1.setFocusPainted(false);
		jp1.setOpaque(false);
		jp1.add(btn1);
		
		jp2 = new JPanel();
		jp2.setBounds(490,610,40,40);
		
		JButton btn2 = new JButton("2");
		
		btn2.setOpaque(false);
		btn2.setBackground(Color.black);
		btn2.setForeground(Color.white);
		btn2.setFocusPainted(false);
		jp2.setOpaque(false);
		jp2.add(btn2);
		
		jp3 = new JPanel();
		jp3.setBounds(550,610,40,40);
		
		JButton btn3 = new JButton("3");
		btn3.setOpaque(false);
		btn3.setBackground(Color.black);
		btn3.setForeground(Color.white);
		btn3.setFocusPainted(false);
		jp3.setOpaque(false);
		jp3.add(btn3);
		
		jp4 = new JPanel();
		jp4.setBounds(610,610,40,40);
		
		JButton btn4 = new JButton("4");
		
		btn4.setOpaque(false);
		btn4.setBackground(Color.black);
		btn4.setForeground(Color.white);
		btn4.setFocusPainted(false);
		jp4.setOpaque(false);
		
		jp4.add(btn4);
		
		jp5 = new JPanel();
		jp5.setBounds(490,670,40,40);
		
		JButton btn5 = new JButton("5");
		btn5.setOpaque(false);
		btn5.setBackground(Color.black);
		btn5.setForeground(Color.white);
		btn5.setFocusPainted(false);
		jp5.setOpaque(false);
		jp5.add(btn5);
		
		jp6 = new JPanel();
		
		jp6.setBounds(550,670,40,40);
		
		JButton btn6 = new JButton("6");
		btn6.setOpaque(false);
		btn6.setBackground(Color.black);
		btn6.setForeground(Color.white);
		btn6.setFocusPainted(false);
		jp6.setOpaque(false);
		jp6.add(btn6);
		
		jp7 = new JPanel();
		jp7.setBounds(610,670,40,40);
		
		JButton btn7 = new JButton("7");
		btn7.setOpaque(false);
		btn7.setBackground(Color.black);
		btn7.setForeground(Color.white);
		btn7.setFocusPainted(false);
		jp7.setOpaque(false);
		jp7.add(btn7);
		
		jp8 = new JPanel();
		jp8.setBounds(490,730,40,40);
		
		JButton btn8 = new JButton("8");
		btn8.setOpaque(false);
		btn8.setBackground(Color.black);
		btn8.setForeground(Color.white);
		btn8.setFocusPainted(false);
		jp8.setOpaque(false);
		jp8.add(btn8);
		
		jp9 = new JPanel();
		jp9.setBounds(550,730,40,40);
		
		JButton btn9 = new JButton("9");
		btn9.setOpaque(false);
		btn9.setBackground(Color.black);
		btn9.setForeground(Color.white);
		btn9.setFocusPainted(false);
		jp9.setOpaque(false);
		jp9.add(btn9);
		
		jp10 = new JPanel();
		
		jp10.setBounds(610,730,40,40);
		
		JButton btn10 = new JButton("10");
		btn10.setOpaque(false);
		btn10.setBackground(Color.black);
		btn10.setForeground(Color.white);
		btn10.setFocusPainted(false);
		jp10.setOpaque(false);
		jp10.add(btn10);
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fuctionPaperSiccorsRockVill4.heroReason.setVisible(false);
				fuctionPaperSiccorsRockVill4.villReason.setVisible(false);
				jptalk.setVisible(false);
				taunt.setVisible(false);
				if(count == 1 && number1 != 1) {
					reason.setText("YOU LOSE");
					hint.setText("The number is " + number1);
					hpList.hp.set(heroIndex, hpList.hp.get(heroIndex) - thisVill.damage);
					loose(container, hero,villHp,heroHp, jpVill, jpHero,
							jpLairHP, jpHeroHP,hpIcon1,hpIcon2, GImage, heroIndex,GImage1,GImage2,thisVill);
					random();
				}
				else if(number1 == 1) {
					reason.setText("YOU WIN");
					hint.setText("");
					thisVill.hp -= damageList.dam.get(heroIndex);
					win(container, hero,villHp,heroHp, jpVill, jpHero,
							jpLairHP, jpHeroHP,hpIcon1,hpIcon2, GImage, heroIndex,GImage1,GImage2,thisVill);
					random();
				}
				else if(number1 > 1) {
					hint.setText("1 " + lessString());
					count += 1;
				}
			
			}
		});
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fuctionPaperSiccorsRockVill4.heroReason.setVisible(false);
				fuctionPaperSiccorsRockVill4.villReason.setVisible(false);
				jptalk.setVisible(false);
				taunt.setVisible(false);
				if(count == 1 && number1 != 2) {
					reason.setText("YOU LOSE");
					hint.setText("The number is " + number1);
					hpList.hp.set(heroIndex, hpList.hp.get(heroIndex) - thisVill.damage);
					loose(container, hero,villHp,heroHp, jpVill, jpHero,
							jpLairHP, jpHeroHP,hpIcon1,hpIcon2, GImage, heroIndex,GImage1,GImage2,thisVill);
					random();
				}
				else if(number1 == 2) {
					reason.setText("YOU WIN");
					hint.setText("");
					thisVill.hp -= damageList.dam.get(heroIndex);
					win(container, hero,villHp,heroHp, jpVill, jpHero,
							jpLairHP, jpHeroHP,hpIcon1,hpIcon2, GImage, heroIndex,GImage1,GImage2,thisVill);
					random();
				}
				else if(number1 < 2) {
					hint.setText("2 " + greaterString());
					count += 1;
				}
				else if(number1 > 2) {
					hint.setText("2 " + lessString());
					count += 1;
				}
			
			}
		});
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fuctionPaperSiccorsRockVill4.heroReason.setVisible(false);
				fuctionPaperSiccorsRockVill4.villReason.setVisible(false);
				jptalk.setVisible(false);
				taunt.setVisible(false);
				if(count == 1 && number1 != 3) {
					reason.setText("YOU LOSE");
					hint.setText("The number is " + number1);
					hpList.hp.set(heroIndex, hpList.hp.get(heroIndex) - thisVill.damage);
					loose(container, hero,villHp,heroHp, jpVill, jpHero,
							jpLairHP, jpHeroHP,hpIcon1,hpIcon2, GImage, heroIndex,GImage1,GImage2,thisVill);
					random();
				}
				else if(number1 == 3) {
					reason.setText("YOU WIN");
					hint.setText("");
					thisVill.hp -= damageList.dam.get(heroIndex);
					win(container, hero,villHp,heroHp, jpVill, jpHero,
							jpLairHP, jpHeroHP,hpIcon1,hpIcon2, GImage, heroIndex,GImage1,GImage2,thisVill);
					random();
				}
				else if(number1 < 3) {
					hint.setText("3 " + greaterString());
					count += 1;
				}
				else if(number1 > 3) {
					hint.setText("3 " + lessString());
					count += 1;
				}
			
			}
		});
		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fuctionPaperSiccorsRockVill4.heroReason.setVisible(false);
				fuctionPaperSiccorsRockVill4.villReason.setVisible(false);
				jptalk.setVisible(false);
				taunt.setVisible(false);
				if(count == 1 && number1 != 4) {
					reason.setText("YOU LOSE");
					hint.setText("The number is " + number1);
					hpList.hp.set(heroIndex, hpList.hp.get(heroIndex) - thisVill.damage);
					loose(container, hero,villHp,heroHp, jpVill, jpHero,
							jpLairHP, jpHeroHP,hpIcon1,hpIcon2, GImage, heroIndex,GImage1,GImage2,thisVill);
					random();
				}
				else if(number1 == 4) {
					reason.setText("YOU WIN");
					hint.setText("");
					thisVill.hp -= damageList.dam.get(heroIndex);
					win(container, hero,villHp,heroHp, jpVill, jpHero,
							jpLairHP, jpHeroHP,hpIcon1,hpIcon2, GImage, heroIndex,GImage1,GImage2,thisVill);
					random();
				}
				else if(number1 < 4) {
					hint.setText("4 " + greaterString());
					count += 1;
				}
				else if(number1 > 4) {
					hint.setText("4 " + lessString());
					count += 1;
				}
			
			}
		});
		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fuctionPaperSiccorsRockVill4.heroReason.setVisible(false);
				fuctionPaperSiccorsRockVill4.villReason.setVisible(false);
				jptalk.setVisible(false);
				taunt.setVisible(false);
				if(count == 1 && number1 != 5) {
					reason.setText("YOU LOSE");
					hint.setText("The number is " + number1);
					hpList.hp.set(heroIndex, hpList.hp.get(heroIndex) - thisVill.damage);
					loose(container, hero,villHp,heroHp, jpVill, jpHero,
							jpLairHP, jpHeroHP,hpIcon1,hpIcon2, GImage, heroIndex,GImage1,GImage2,thisVill);
					random();
				}
				else if(number1 == 5) {
					reason.setText("YOU WIN");
					hint.setText("");
					thisVill.hp -= damageList.dam.get(heroIndex);
					win(container, hero,villHp,heroHp, jpVill, jpHero,
							jpLairHP, jpHeroHP,hpIcon1,hpIcon2, GImage, heroIndex,GImage1,GImage2,thisVill);
					random();
				}
				else if(number1 < 5) {
					hint.setText("5 " + greaterString());
					count += 1;
				}
				else if(number1 > 5) {
					hint.setText("5 " + lessString());
					count += 1;
				}
			
			}
		});
		btn6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fuctionPaperSiccorsRockVill4.heroReason.setVisible(false);
				fuctionPaperSiccorsRockVill4.villReason.setVisible(false);
				jptalk.setVisible(false);
				taunt.setVisible(false);
				if(count == 1 && number1 != 6) {
					reason.setText("YOU LOSE");
					hint.setText("The number is " + number1);
					hpList.hp.set(heroIndex, hpList.hp.get(heroIndex) - thisVill.damage);
					loose(container, hero,villHp,heroHp, jpVill, jpHero,
							jpLairHP, jpHeroHP,hpIcon1,hpIcon2, GImage, heroIndex,GImage1,GImage2,thisVill);
					random();
				}
				else if(number1 == 6) {
					reason.setText("YOU WIN");
					hint.setText("");
					thisVill.hp -= damageList.dam.get(heroIndex);
					win(container, hero,villHp,heroHp, jpVill, jpHero,
							jpLairHP, jpHeroHP,hpIcon1,hpIcon2, GImage, heroIndex,GImage1,GImage2,thisVill);
					random();
				}
				else if(number1 < 6) {
					hint.setText("6 " + greaterString());
					count += 1;
				}
				else if(number1 > 6) {
					hint.setText("6 " + lessString());
					count += 1;
				}
			
			}
		});
		btn7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fuctionPaperSiccorsRockVill4.heroReason.setVisible(false);
				fuctionPaperSiccorsRockVill4.villReason.setVisible(false);
				jptalk.setVisible(false);
				taunt.setVisible(false);
				if(count == 1 && number1 != 7) {
					reason.setText("YOU LOSE");
					hint.setText("The number is " + number1);
					hpList.hp.set(heroIndex, hpList.hp.get(heroIndex) - thisVill.damage);
					loose(container, hero,villHp,heroHp, jpVill, jpHero,
							jpLairHP, jpHeroHP,hpIcon1,hpIcon2, GImage, heroIndex,GImage1,GImage2,thisVill);
					random();
				}
				else if(number1 == 7) {
					reason.setText("YOU WIN");
					hint.setText("");
					thisVill.hp -= damageList.dam.get(heroIndex);
					win(container, hero,villHp,heroHp, jpVill, jpHero,
							jpLairHP, jpHeroHP,hpIcon1,hpIcon2, GImage, heroIndex,GImage1,GImage2,thisVill);
					random();
				}
				else if(number1 < 7) {
					hint.setText("7 " + greaterString());
					count += 1;
				}
				else if(number1 > 7) {
					hint.setText("7 " + lessString());
					count += 1;
				}
			
			}
		});
		btn8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fuctionPaperSiccorsRockVill4.heroReason.setVisible(false);
				fuctionPaperSiccorsRockVill4.villReason.setVisible(false);
				jptalk.setVisible(false);
				taunt.setVisible(false);
				if(count == 1 && number1 != 8) {
					reason.setText("YOU LOSE");
					hint.setText("The number is " + number1);
					hpList.hp.set(heroIndex, hpList.hp.get(heroIndex) - thisVill.damage);
					loose(container, hero,villHp,heroHp, jpVill, jpHero,
							jpLairHP, jpHeroHP,hpIcon1,hpIcon2, GImage, heroIndex,GImage1,GImage2,thisVill);
					random();
				}
				else if(number1 == 8) {
					reason.setText("YOU WIN");
					hint.setText("");
					thisVill.hp -= damageList.dam.get(heroIndex);
					win(container, hero,villHp,heroHp, jpVill, jpHero,
							jpLairHP, jpHeroHP,hpIcon1,hpIcon2, GImage, heroIndex,GImage1,GImage2,thisVill);
					random();
				}
				else if(number1 < 8) {
					hint.setText("8 " + greaterString());
					count += 1;
				}
				else if(number1 > 8) {
					hint.setText("8 " + lessString());
					count += 1;
				}
			
			}
		});
		btn9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fuctionPaperSiccorsRockVill4.heroReason.setVisible(false);
				fuctionPaperSiccorsRockVill4.villReason.setVisible(false);
				jptalk.setVisible(false);
				taunt.setVisible(false);
				if(count == 1 && number1 != 9) {
					reason.setText("YOU LOSE");
					hint.setText("The number is " + number1);
					hpList.hp.set(heroIndex, hpList.hp.get(heroIndex) - thisVill.damage);
					loose(container, hero,villHp,heroHp, jpVill, jpHero,
							jpLairHP, jpHeroHP,hpIcon1,hpIcon2, GImage, heroIndex,GImage1,GImage2,thisVill);
					random();
				}
				else if(number1 == 9) {
					reason.setText("YOU WIN");
					hint.setText("");
					thisVill.hp -= damageList.dam.get(heroIndex);
					win(container, hero,villHp,heroHp, jpVill, jpHero,
							jpLairHP, jpHeroHP,hpIcon1,hpIcon2, GImage, heroIndex,GImage1,GImage2,thisVill);
					random();
				}
				else if(number1 < 9) {
					hint.setText("9 " + greaterString());
					count += 1;
				}
				else if(number1 > 9) {
					hint.setText("9 " + lessString());
					count += 1;
				}
			
			}
		});
		btn10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fuctionPaperSiccorsRockVill4.heroReason.setVisible(false);
				fuctionPaperSiccorsRockVill4.villReason.setVisible(false);
				jptalk.setVisible(false);
				taunt.setVisible(false);
				if(count == 1 && number1 != 10) {
					reason.setText("YOU LOSE");
					hint.setText("The number is " + number1);
					hpList.hp.set(heroIndex, hpList.hp.get(heroIndex) - thisVill.damage);
					loose(container, hero,villHp,heroHp, jpVill, jpHero,
							jpLairHP, jpHeroHP,hpIcon1,hpIcon2, GImage, heroIndex,GImage1,GImage2,thisVill);
					random();
				}
				else if(number1 == 10) {
					reason.setText("YOU WIN");
					hint.setText("");
					thisVill.hp -= damageList.dam.get(heroIndex);
					win(container, hero,villHp,heroHp, jpVill, jpHero,
							jpLairHP, jpHeroHP,hpIcon1,hpIcon2, GImage, heroIndex,GImage1,GImage2,thisVill);
					random();
				}
				
				else if(number1 < 10) {
					hint.setText("10 " + greaterString());
					count += 1;
				}
			
			}
		});
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
		
		back1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new randomEvents();
				randomEvents.randomHappen();
				jpReason.setVisible(false);
				jpHint.setVisible(false);
				jpBack1.setVisible(false);
				jpFinish.setVisible(false);
				jpVill.setVisible(false);
				gameTitle.setVisible(false);
				GImage.setVisible(false);
				GImage2.setVisible(false);
				new homeBase().addHomeBase(container);
				}	
			});
		finish.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jpFinish.setVisible(false);
				jpVill.setVisible(false);
				gameTitle.setVisible(false);
				jpReason.setVisible(false);
				jpHint.setVisible(false);
				GImage.setVisible(false);
				GImage2.setVisible(false);
				new gameOver().addGameOver(container);
			}
		});
		//if villain has been defeated, next button shows in the window
		next.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jpHero.setVisible(false);
				gameTitle.setVisible(false);
				jpNext.setVisible(false);
				jpReason.setVisible(false);
				jpHint.setVisible(false);
				GImage.setVisible(false);
				GImage1.setVisible(false);
				cityNumber.numberOfCity -= 1;
				if(cityNumber.numberOfCity == 0) {
					new youWin().addWin(container);
					}
				else {
					lair.visitedLair = false;
					villList.villlist.remove(villIndex);
					//map of this city cannot be use in the next city.
					if(bag.map > 0) {
						bag.map -= 1;
					}
					new randomEvents();
					randomEvents.randomHappen();
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
					//the team is rewarded 1500 coins.
					totalMoney.money += 1500;
					new homeBase().addHomeBase(container);
				}
				}	
			});
		container.add(jpReason);
		container.add(jpHint);
		container.add(gameTitle);
		container.add(jp1);
		container.add(jp2);
		container.add(jp3);
		container.add(jp4);
		container.add(jp5);
		container.add(jp6);
		container.add(jp7);
		container.add(jp8);
		container.add(jp9);
		container.add(jp10);
		container.add(jpFinish);
		container.add(jpBack1);
		container.add(jpNext);
		container.add(GImage);
	}
	/**
	 * 
	 * @return the string, which tells the number player having chosen is less than the random number
	 */
	public String lessString() {
		String result = " is less then the mysterious number.";
		return result;
	}
	/**
	 * 
	 * @return the string, which tells the number player having chosen is greater than the random number
	 */
	public String greaterString() {
		String result = " is greater then the mysterious number.";
		return result;
	}
	/**
	 * 
	 * @param container
	 * @param hero
	 * @param villHp
	 * @param heroHp
	 * @param jpVill
	 * @param jpHero
	 * @param jpLairHP
	 * @param jpHeroHP
	 * @param hpIcon1
	 * @param hpIcon2
	 * @param GImage
	 * @param heroIndex
	 * @param GImage1
	 * @param GImage2
	 * @param thisVill
	 * player wins this fight, if HP of villain less than or equal to 0, the has been defeated
	 */
	public void win(Container container, heroable hero,JLabel villHp,JLabel heroHp, JPanel jpVill, JPanel jpHero,
			JPanel jpLairHP, JPanel jpHeroHP,JPanel hpIcon1,JPanel hpIcon2,JPanel GImage, int heroIndex,JPanel GImage1, JPanel GImage2,allVills thisVill) {
		if(thisVill.hp > 0) {
			villHp.setText("HP: " + thisVill.hp);
		}
		else {
			jpNext.setVisible(true);
			GImage1.setVisible(true);
			jp1.setVisible(false);
			jp2.setVisible(false);
			jp3.setVisible(false);
			jp4.setVisible(false);
			jp5.setVisible(false);
			jp6.setVisible(false);
			jp7.setVisible(false);
			jp8.setVisible(false);
			jp9.setVisible(false);
			jp10.setVisible(false);
			jpVill.setVisible(false);
			jpLairHP.setVisible(false);
			jpHeroHP.setVisible(false);
			hpIcon1.setVisible(false);
			hpIcon2.setVisible(false);
			}
		
	}
	
	/**
	 * 
	 * @param container
	 * @param hero
	 * @param villHp
	 * @param heroHp
	 * @param jpVill
	 * @param jpHero
	 * @param jpLairHP
	 * @param jpHeroHP
	 * @param hpIcon1
	 * @param hpIcon2
	 * @param GImage
	 * @param heroIndex
	 * @param GImage1
	 * @param GImage2
	 * @param thisVill
	 * player loose this fight and get the damage from villain
	 * if the HP of hero less than or equal to 0, remove this hero.
	 * if this hero is thief, remove a ability of this hero in the team.
	 * if this team does not have any other heroes, shows the game over window
	 */
	public void loose(Container container, heroable hero,JLabel villHp,JLabel heroHp, JPanel jpVill, JPanel jpHero,
			JPanel jpLairHP, JPanel jpHeroHP,JPanel hpIcon1,JPanel hpIcon2,JPanel GImage, int heroIndex,JPanel GImage1, JPanel GImage2,allVills thisVill) {
		new bag();
		if(hpList.hp.get(heroIndex) > 0) {
			heroHp.setText("HP: " + hpList.hp.get(heroIndex));
			
		}
		else {
			jpBack1.setVisible(true);
			GImage2.setVisible(true);
			jpHero.setVisible(false);
			jpLairHP.setVisible(false);
			jpHeroHP.setVisible(false);
			hpIcon1.setVisible(false);
			hpIcon2.setVisible(false);
			jp1.setVisible(false);
			jp2.setVisible(false);
			jp3.setVisible(false);
			jp4.setVisible(false);
			jp5.setVisible(false);
			jp6.setVisible(false);
			jp7.setVisible(false);
			jp8.setVisible(false);
			jp9.setVisible(false);
			jp10.setVisible(false);
			if(hospital.inHospital.contains(chooseHeroName.heroNameList.get(heroIndex))) {
				hospital.inHospital.remove(0);
				hospital.heroIndex = 0;
				hospital.count = 0;
				hospital.hpCount = 0;
			}
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
			if(chooseHero.heroList.size() == 0) {
				jpFinish.setVisible(true);
				jpBack1.setVisible(false);
			}						
		}
		
	}
}
