package game;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author Cai & Lee
 * This class is the paper scissors and rock game for villain 4,
 * this villain will play guess number after playing this game.
 *
 */
public class fuctionPaperSiccorsRockVill4 {
	public JPanel gameTitle,jpBtn1,jpBtn2,jpBtn3,pic1,pic2,pic3;
	public static JPanel heroReason,villReason;
	public Integer number1;
	public JPanel jpEscape;
	public JPanel jpBack1;
	public JPanel jpNext;
	public JPanel jpFinish;
	public static int playCount = 0;
	public static boolean isFinished = false;
	
	/**
	 * 
	 * @return 
	 * every time when player choose a button, return random number between 0 to 2.
	 * 0 represents paper, 1 represents scissors, 2 represents rock.
	 */
	public Integer random() {
		ArrayList<Integer> randomList1 = new ArrayList<Integer>();
		Collections.addAll(randomList1, 0,1,2);
		Random num = new Random();
		number1 = randomList1.get(num.nextInt(randomList1.size()));
		System.out.println(number1);
		return number1;
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
	 * @param taunt
	 * @param jptalk
	 * @param thisVill
	 * @param villIndex
	 * @param GImage
	 * open the game window, every time player choose a button,
	 * compare the outcome of villain and outcome of hero.If HP of villain less 
	 * than or equal to 0, the has been defeated and show the next button.
	 * If the HP of hero less than or equal to 0, remove this hero.
	 */
	@SuppressWarnings("serial")
	public void addPaper(Container container, heroable hero,JLabel villHp,JLabel heroHp, JPanel jpVill, JPanel jpHero,
			JPanel jpLairHP, JPanel jpHeroHP,JPanel hpIcon1,JPanel hpIcon2, int heroIndex,
			JPanel GImage1,JPanel GImage2,JPanel taunt, JPanel jptalk, allVills thisVill,int villIndex,JPanel GImage) {
		random();
		new chooseHeroName();
		new powerUpDen();
		new hpList();
		new damageList();
		new recList();
		new bag();
		
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
		jpFinish.setBounds(530, 700, 100, 50);
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
		
		pic1 = new JPanel() {
			 protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(fuctionPaperSiccorsRockVill4.class.getResource("/res/pa.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
            icon.getIconHeight(), icon.getImageObserver());  
			 }  
		};
		pic1.setBounds(415, 480, 90, 90);
		
		pic2 = new JPanel() {
			 protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(fuctionPaperSiccorsRockVill4.class.getResource("/res/si.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
           icon.getIconHeight(), icon.getImageObserver());  
			 }  
		};
		pic2.setBounds(535, 480, 90, 90);
		
		pic3 = new JPanel() {
			 protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(fuctionPaperSiccorsRockVill4.class.getResource("/res/ro.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
           icon.getIconHeight(), icon.getImageObserver());  
			 }  
		};
		pic3.setBounds(655, 480, 90, 90);
		
		villReason = new JPanel();
		villReason.setBounds(300,800,600,60);
		villReason.setOpaque(false);
		
		JLabel reason1 = new JLabel();
		reason1.setForeground(Color.WHITE);
		reason1.setFont(new Font(null,Font.BOLD,20));
		villReason.add(reason1);
		
		heroReason = new JPanel();
		heroReason.setBounds(480,400,150,50);
		heroReason.setOpaque(false);
		
		JLabel reason2 = new JLabel();
		reason2.setForeground(Color.WHITE);
		reason2.setFont(new Font(null,Font.BOLD,20));
		heroReason.add(reason2);
		
		gameTitle = new JPanel();
		gameTitle.setBounds(380, 220, 400, 70);
		gameTitle.setOpaque(false);
		JLabel title = new JLabel();
		title.setText("Paper Scissors Rock");
		title.setFont(new Font(null,Font.BOLD,30));
		title.setForeground(Color.GRAY);
		gameTitle.add(title);
		
		jpBtn1 = new JPanel();
		jpBtn1.setBounds(410, 600, 100, 50);
		jpBtn1.setOpaque(false);
		
		JButton paper = new JButton();
		paper.setText("Paper");
		paper.setForeground(Color.WHITE);
		paper.setOpaque(false);
		paper.setBackground(Color.black);
		paper.setFont(new Font(null,Font.BOLD,16));
		paper.setFocusPainted(false);
		jpBtn1.add(paper);
		
		jpBtn2 = new JPanel();
		jpBtn2.setBounds(530, 600, 100, 50);
		jpBtn2.setOpaque(false);
		
		JButton scissors = new JButton();
		scissors.setText("Scissors");
		scissors.setForeground(Color.WHITE);
		scissors.setOpaque(false);
		scissors.setBackground(Color.black);
		scissors.setFont(new Font(null,Font.BOLD,16));
		scissors.setFocusPainted(false);
		jpBtn2.add(scissors);
		

		jpBtn3 = new JPanel();
		jpBtn3.setBounds(650, 600, 100, 50);
		jpBtn3.setOpaque(false);
		
		JButton rock = new JButton();
		rock.setText("Rock");
		rock.setForeground(Color.WHITE);
		rock.setOpaque(false);
		rock.setBackground(Color.black);
		rock.setFont(new Font(null,Font.BOLD,16));
		rock.setFocusPainted(false);
		jpBtn3.add(rock);
		//if hero choose use escape card during this fight,escape button shows in this window.
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
				jpVill.setVisible(false);
				jpEscape.setVisible(false);
				jpFinish.setVisible(false);
				gameTitle.setVisible(false);
				GImage.setVisible(false);
				jpLairHP.setVisible(false);
				jpHeroHP.setVisible(false);
				hpIcon1.setVisible(false);
				hpIcon2.setVisible(false);
				pic1.setVisible(false);
				pic2.setVisible(false);
				pic3.setVisible(false);
				jpBtn1.setVisible(false);
				jpBtn2.setVisible(false);
				jpBtn3.setVisible(false);
				villReason.setVisible(false);
				heroReason.setVisible(false);
				new homeBase().addHomeBase(container);
			}
		});
		
		paper.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				playCount += 1;
				//after playing this game, this villain will play guess number
				jptalk.setVisible(false);
				taunt.setVisible(false);
				if(number1 == 0) {
					reason1.setText("Villain is paper");
					reason2.setText("TRY AGAIN");
					random();
				}
				else if(number1 == 1) {
					reason1.setText("Villain is scissors");
					reason2.setText("YOU LOSE");
					random();
					//hero get the damage from villain
					hpList.hp.set(heroIndex, hpList.hp.get(heroIndex) - thisVill.damage);
					if(hpList.hp.get(heroIndex) > 0) {
						heroHp.setText("HP: " + hpList.hp.get(heroIndex));
						
					}
					//if the HP of hero less than or equal to 0, remove this hero.
					else {
						isFinished = true;
						GImage2.setVisible(true);
						jpBack1.setVisible(true);
						jpEscape.setVisible(false);
						jpHero.setVisible(false);
						jpLairHP.setVisible(false);
						jpHeroHP.setVisible(false);
						hpIcon1.setVisible(false);
						hpIcon2.setVisible(false);
						pic1.setVisible(false);
						pic2.setVisible(false);
						pic3.setVisible(false);
						jpBtn1.setVisible(false);
						jpBtn2.setVisible(false);
						jpBtn3.setVisible(false);
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
									villReason.setVisible(false);;
									heroReason.setVisible(false);
									gameTitle.setVisible(false);
									GImage.setVisible(false);
									new gameOver().addGameOver(container);
								}
							});	
						}						
					}
				}
				else {
					reason1.setText("Villain is rock");
					reason2.setText("YOU WIN");
					random();
					thisVill.hp -= damageList.dam.get(heroIndex);
					//if HP of villain less than or equal to 0, the has been defeated
					if(thisVill.hp > 0) {
						villHp.setText("HP: " + thisVill.hp);
					}
					else {
						isFinished = true;
						GImage1.setVisible(true);
						jpNext.setVisible(true);
						jpEscape.setVisible(false);
						jpVill.setVisible(false);
						jpLairHP.setVisible(false);
						jpHeroHP.setVisible(false);
						hpIcon1.setVisible(false);
						hpIcon2.setVisible(false);
						pic1.setVisible(false);
						pic2.setVisible(false);
						pic3.setVisible(false);
						jpBtn1.setVisible(false);
						jpBtn2.setVisible(false);
						jpBtn3.setVisible(false);
					}
				}
				if(playCount == 2 && isFinished == false) {
					playCount = 0;
					jpEscape.setVisible(false);
					gameTitle.setVisible(false);
					pic1.setVisible(false);
					pic2.setVisible(false);
					pic3.setVisible(false);
					jpBtn1.setVisible(false);
					jpBtn2.setVisible(false);
					jpBtn3.setVisible(false);
					new functionGussNumberVill4().addGuss(container, hero, villHp,
							heroHp, jpVill, jpHero, jpLairHP, jpHeroHP, hpIcon1, hpIcon2, heroIndex, 
							GImage1, GImage2, taunt, jptalk, thisVill, villIndex, GImage);
				}
			}
		});
		
		scissors.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				playCount += 1;
				jptalk.setVisible(false);
				taunt.setVisible(false);
				if(number1 == 0) {
					reason1.setText("Villain is paper");
					reason2.setText("YOU WIN");
					random();
					thisVill.hp -= damageList.dam.get(heroIndex);
					if(thisVill.hp > 0) {
						villHp.setText("HP: " + thisVill.hp);
					}
					else {
						isFinished = true;
						GImage1.setVisible(true);
						jpNext.setVisible(true);
						jpEscape.setVisible(false);
						jpVill.setVisible(false);
						jpLairHP.setVisible(false);
						jpHeroHP.setVisible(false);
						hpIcon1.setVisible(false);
						hpIcon2.setVisible(false);
						pic1.setVisible(false);
						pic2.setVisible(false);
						pic3.setVisible(false);
						jpBtn1.setVisible(false);
						jpBtn2.setVisible(false);
						jpBtn3.setVisible(false);
					}
				}
				else if(number1 == 1) {
					reason1.setText("Villain is scissors");
					reason2.setText("TRY AGAIN");
					random();
				}
				else {
					reason1.setText("Villain is rock");
					reason2.setText("YOU LOSE");
					random();
					hpList.hp.set(heroIndex, hpList.hp.get(heroIndex) - thisVill.damage);
					if(hpList.hp.get(heroIndex) > 0) {
						heroHp.setText("HP: " + hpList.hp.get(heroIndex));
						
					}
					else {
						isFinished = true;
						GImage2.setVisible(true);
						jpBack1.setVisible(true);
						jpEscape.setVisible(false);
						jpHero.setVisible(false);
						jpLairHP.setVisible(false);
						jpHeroHP.setVisible(false);
						hpIcon1.setVisible(false);
						hpIcon2.setVisible(false);
						pic1.setVisible(false);
						pic2.setVisible(false);
						pic3.setVisible(false);
						jpBtn1.setVisible(false);
						jpBtn2.setVisible(false);
						jpBtn3.setVisible(false);
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
							finish.addActionListener(new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									GImage2.setVisible(false);
									jpFinish.setVisible(false);
									jpVill.setVisible(false);
									villReason.setVisible(false);;
									heroReason.setVisible(false);
									gameTitle.setVisible(false);
									GImage.setVisible(false);
									new gameOver().addGameOver(container);
								}
							});	
						}						
					}
				}
				if(playCount == 2 && isFinished == false) {
					playCount = 0;
					jpEscape.setVisible(false);
					gameTitle.setVisible(false);
					pic1.setVisible(false);
					pic2.setVisible(false);
					pic3.setVisible(false);
					jpBtn1.setVisible(false);
					jpBtn2.setVisible(false);
					jpBtn3.setVisible(false);
					new functionGussNumberVill4().addGuss(container, hero, villHp,
							heroHp, jpVill, jpHero, jpLairHP, jpHeroHP, hpIcon1, hpIcon2, heroIndex, 
							GImage1, GImage2, taunt, jptalk, thisVill, villIndex, GImage);
				}
			}
		});
		
		rock.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				playCount += 1;
				jptalk.setVisible(false);
				taunt.setVisible(false);
				if(number1 == 0) {
					reason1.setText("Villain is paper");
					reason2.setText("YOU LOSE");
					random();
					hpList.hp.set(heroIndex, hpList.hp.get(heroIndex) - thisVill.damage);
					if(hpList.hp.get(heroIndex) > 0) {
						heroHp.setText("HP: " + hpList.hp.get(heroIndex));
						
					}
					else {
						isFinished = true;
						GImage2.setVisible(false);
						jpBack1.setVisible(true);
						jpEscape.setVisible(false);
						jpHero.setVisible(false);
						jpLairHP.setVisible(false);
						jpHeroHP.setVisible(false);
						hpIcon1.setVisible(false);
						hpIcon2.setVisible(false);
						pic1.setVisible(false);
						pic2.setVisible(false);
						pic3.setVisible(false);
						jpBtn1.setVisible(false);
						jpBtn2.setVisible(false);
						jpBtn3.setVisible(false);
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
							finish.addActionListener(new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									GImage2.setVisible(false);
									jpFinish.setVisible(false);
									jpVill.setVisible(false);
									villReason.setVisible(false);;
									heroReason.setVisible(false);
									gameTitle.setVisible(false);
									GImage.setVisible(false);
									new gameOver().addGameOver(container);
								}
							});	
						}						
					}
				}
				else if(number1 == 1) {
					reason1.setText("Villain is scissors");
					reason2.setText("YOU WIN");
					random();
					thisVill.hp -= damageList.dam.get(heroIndex);
					if(thisVill.hp > 0) {
						villHp.setText("HP: " + thisVill.hp);
					}
					else {
						isFinished = true;
						GImage1.setVisible(true);
						jpNext.setVisible(true);
						jpEscape.setVisible(false);
						jpVill.setVisible(false);
						jpLairHP.setVisible(false);
						jpHeroHP.setVisible(false);
						hpIcon1.setVisible(false);
						hpIcon2.setVisible(false);
						pic1.setVisible(false);
						pic2.setVisible(false);
						pic3.setVisible(false);
						jpBtn1.setVisible(false);
						jpBtn2.setVisible(false);
						jpBtn3.setVisible(false);
					}
				}
				else {
					reason1.setText("Villain is rock");
					reason2.setText("TRY AGAIN");
					random();
				}
				if(playCount == 2 && isFinished == false) {
					playCount = 0;
					jpEscape.setVisible(false);
					gameTitle.setVisible(false);
					pic1.setVisible(false);
					pic2.setVisible(false);
					pic3.setVisible(false);
					jpBtn1.setVisible(false);
					jpBtn2.setVisible(false);
					jpBtn3.setVisible(false);
					new functionGussNumberVill4().addGuss(container, hero, villHp,
							heroHp, jpVill, jpHero, jpLairHP, jpHeroHP, hpIcon1, hpIcon2, heroIndex, 
							GImage1, GImage2, taunt, jptalk, thisVill, villIndex, GImage);
				}
			}
		});
		back1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new randomEvents();
				randomEvents.randomHappen();
				heroReason.setVisible(false);
				villReason.setVisible(false);
				jpBack1.setVisible(false);
				jpFinish.setVisible(false);
				jpVill.setVisible(false);
				gameTitle.setVisible(false);
				GImage.setVisible(false);
				GImage2.setVisible(false);
				new homeBase().addHomeBase(container);
				}	
			});
		//if villain has been defeated, next button shows in the window
		next.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jpHero.setVisible(false);
				GImage1.setVisible(false);
				gameTitle.setVisible(false);
				jpNext.setVisible(false);
				villReason.setVisible(false);
				heroReason.setVisible(false);
				GImage.setVisible(false);
				cityNumber.numberOfCity -= 1;
				//if last villain has defeated, shows the wining window
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
		container.add(pic1);
		container.add(pic2);
		container.add(pic3);
		container.add(gameTitle);
		container.add(jpBtn1);
		container.add(jpBtn2);
		container.add(jpBtn3);
		container.add(villReason);
		container.add(heroReason);
		container.add(jpEscape);
		container.add(jpFinish);
		container.add(jpBack1);
		container.add(jpNext);
		}
}
