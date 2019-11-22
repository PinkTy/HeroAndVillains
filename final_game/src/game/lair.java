package game;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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
 *	This class is the lair in each city, player can choose fight or go back to 
 *	home base, if player chose to fight, the battle window open.
 */
public class lair {
	static boolean visitedLair = false;// false if player has not visited lair in this city.
	static int heroIndex;// a integer represents which hero player want to choose.
	static allVills thisVill;// thisVill is the villains in this city.
	static int villIndex;// a integer represents the villain in this city.
	static int i;// a integer if this is the last city.
	
	/**
	 * 
	 * @return a random number, which represents 6 different villains
	 */
	public Integer random() {
		ArrayList<Integer> randomList1 = new ArrayList<Integer>();
		Collections.addAll(randomList1, 1,2,3,4,5,6);
		Random num = new Random();
		Integer number1 = randomList1.get(num.nextInt(randomList1.size()));
		return number1;
	}
	
	/**
	 * 
	 * @param con
	 * open the hero choosing window, and random a villain in this city,
	 * if this is the first city, the villain only play roll the dice,
	 * if this is the last city, the villain only play guess number.
	 */
	public void addLair(Container con) {
		//if this is the last city, vill6 is the villain in this city.
		if(cityNumber.numberOfCity == 1) {
			thisVill = new vill6();
			thisVill.hp = thisVill.getHp();
			thisVill.damage = thisVill.getDamage();
		}
		//if this is the last city, vill1 is the villain in this city.
		else if(villList.villlist.get(0).getVillName().equals("vill1")) {
			thisVill = villList.villlist.get(0);
			thisVill.hp = thisVill.getHp();
			thisVill.damage = thisVill.getDamage();
			villIndex = 0;
		}
		//else, any villain can exist in this city.
		else {
			Random num = new Random();
			if(visitedLair == false) {
				i = num.nextInt(villList.villlist.size());
			}
			thisVill = villList.villlist.get(i);
			thisVill.hp = thisVill.getHp();
			thisVill.damage = thisVill.getDamage();
			villIndex = i;
		}
		
		JPanel jpBack = new JPanel();
		jpBack.setBounds(10,5,120,100);
		jpBack.setOpaque(false);
		
		JButton back = new JButton("<<BACK");
		back.setOpaque(false);
		back.setBackground(Color.black);
		back.setForeground(Color.white);
		back.setFont(new Font(null,Font.BOLD,15));
		back.setFocusPainted(false);
		jpBack.add(back);
		
		@SuppressWarnings("serial")
		JPanel GImage = new JPanel() {  
			 protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(lair.class.getResource("/res/battleBack.jpg"));
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
             icon.getIconHeight(), icon.getImageObserver());  
			 }  
		};  
		GImage.setBounds(0, 0, 1280, 960);
		
		JPanel jpLine = new JPanel();
		jpLine.setBounds(100, 170, 600, 50);
		jpLine.setOpaque(false);
		
		JLabel line = new JLabel();
		line.setText("Please choose the hero you want to fight:");
		line.setFont(new Font(null,Font.BOLD,25));
		line.setForeground(Color.black);
		jpLine.add(line);
		
		JPanel jpFight1 = new JPanel();
		jpFight1.setBounds(300, 560, 100, 50);
		jpFight1.setOpaque(false);
		
		JButton fight1 = new JButton("FIGHT");
		fight1.setOpaque(false);
		fight1.setBackground(Color.black);
		fight1.setForeground(Color.white);
		fight1.setFont(new Font(null,Font.BOLD,25));
		fight1.setFocusPainted(false);
		jpFight1.add(fight1);
		
		JPanel jpFight2 = new JPanel();
		jpFight2.setBounds(480, 560, 100, 50);
		jpFight2.setOpaque(false);
		JButton fight2 = new JButton("FIGHT");
		fight2.setOpaque(false);
		fight2.setBackground(Color.black);
		fight2.setForeground(Color.white);
		fight2.setFont(new Font(null,Font.BOLD,25));
		fight2.setFocusPainted(false);
		jpFight2.add(fight2);
		
		JPanel jpFight3 = new JPanel();
		jpFight3.setBounds(660, 560, 100, 50);
		jpFight3.setOpaque(false);
		JButton fight3 = new JButton("FIGHT");
		fight3.setOpaque(false);
		fight3.setBackground(Color.black);
		fight3.setForeground(Color.white);
		fight3.setFont(new Font(null,Font.BOLD,25));
		fight3.setFocusPainted(false);
		jpFight3.add(fight3);
		
		new chooseHero();
		int heroSize = chooseHero.heroList.size();
		
		if(heroSize == 1) {
			new heroShow();
			heroShow.addHeroShow(con);
			fight2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					heroIndex = 0;
					heroShow.jpHero2.setVisible(false);
					heroShow.jpIcon2.setVisible(false);
					jpBack.setVisible(false);
					jpFight2.setVisible(false);
					jpLine.setVisible(false);
					GImage.setVisible(false);
					thisVill.villFight(con);
				}
			});
			
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					heroShow.jpHero2.setVisible(false);
					heroShow.jpIcon2.setVisible(false);
					jpBack.setVisible(false);
					jpFight2.setVisible(false);
					jpLine.setVisible(false);
					GImage.setVisible(false);
					new homeBase().addHomeBase(con);
					}	
				});
			back.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
						heroShow.jpHero2.setVisible(false);
						heroShow.jpIcon2.setVisible(false);
						jpBack.setVisible(false);
						jpFight2.setVisible(false);
						jpLine.setVisible(false);
						GImage.setVisible(false);
						new homeBase().addHomeBase(con);
					}
				}
			});
			jpFight1.setVisible(false);
			jpFight3.setVisible(false);
		}
		else if(heroSize == 2) {
			new heroShow();
			heroShow.addHeroShow(con);
			fight1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					heroIndex = 1;
					heroShow.jpHero1.setVisible(false);
					heroShow.jpIcon1.setVisible(false);
					heroShow.jpHero2.setVisible(false);
					heroShow.jpIcon2.setVisible(false);
					jpBack.setVisible(false);
					jpFight1.setVisible(false);
					jpFight2.setVisible(false);
					jpLine.setVisible(false);
					GImage.setVisible(false);
					thisVill.villFight(con);
				}
			});
			
			fight2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					heroIndex = 0;
					heroShow.jpHero1.setVisible(false);
					heroShow.jpIcon1.setVisible(false);
					heroShow.jpHero2.setVisible(false);
					heroShow.jpIcon2.setVisible(false);
					jpBack.setVisible(false);
					jpFight1.setVisible(false);
					jpFight2.setVisible(false);
					jpLine.setVisible(false);
					GImage.setVisible(false);
					thisVill.villFight(con);
				}
			});
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new randomEvents();
					randomEvents.randomHappen();
					heroShow.jpHero1.setVisible(false);
					heroShow.jpIcon1.setVisible(false);
					heroShow.jpHero2.setVisible(false);
					heroShow.jpIcon2.setVisible(false);
					jpBack.setVisible(false);
					jpFight1.setVisible(false);
					jpFight2.setVisible(false);
					jpLine.setVisible(false);
					GImage.setVisible(false);
					new homeBase().addHomeBase(con);
					}	
				});
			back.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
						new randomEvents();
						randomEvents.randomHappen();
						heroShow.jpHero1.setVisible(false);
						heroShow.jpIcon1.setVisible(false);
						heroShow.jpHero2.setVisible(false);
						heroShow.jpIcon2.setVisible(false);
						jpBack.setVisible(false);
						jpFight1.setVisible(false);
						jpFight2.setVisible(false);
						jpLine.setVisible(false);
						GImage.setVisible(false);
						new homeBase().addHomeBase(con);
					}
				}
			});
			
			jpFight3.setVisible(false);
		}
		
		else {
			new heroShow();
			heroShow.addHeroShow(con);
			
			fight1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					heroIndex = 1;
					jpBack.setVisible(false);
					heroShow.jpHero1.setVisible(false);
					heroShow.jpIcon1.setVisible(false);
					heroShow.jpHero2.setVisible(false);
					heroShow.jpIcon2.setVisible(false);
					heroShow.jpHero3.setVisible(false);
					heroShow.jpIcon3.setVisible(false);
					jpFight1.setVisible(false);
					jpFight2.setVisible(false);
					jpFight3.setVisible(false);
					jpLine.setVisible(false);
					GImage.setVisible(false);
					thisVill.villFight(con);
				}
			});
			
			fight2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					heroIndex = 0;
					jpBack.setVisible(false);
					heroShow.jpHero1.setVisible(false);
					heroShow.jpIcon1.setVisible(false);
					heroShow.jpHero2.setVisible(false);
					heroShow.jpIcon2.setVisible(false);
					heroShow.jpHero3.setVisible(false);
					heroShow.jpIcon3.setVisible(false);
					jpFight1.setVisible(false);
					jpFight2.setVisible(false);
					jpFight3.setVisible(false);
					jpLine.setVisible(false);
					GImage.setVisible(false);
					thisVill.villFight(con);
				}
			});
			
			fight3.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					heroIndex = 2;
					jpBack.setVisible(false);
					heroShow.jpHero1.setVisible(false);
					heroShow.jpIcon1.setVisible(false);
					heroShow.jpHero2.setVisible(false);
					heroShow.jpIcon2.setVisible(false);
					heroShow.jpHero3.setVisible(false);
					heroShow.jpIcon3.setVisible(false);
					jpFight1.setVisible(false);
					jpFight2.setVisible(false);
					jpFight3.setVisible(false);
					jpLine.setVisible(false);
					GImage.setVisible(false);
					thisVill.villFight(con);
				}
			});
			back.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					jpBack.setVisible(false);
					heroShow.jpHero1.setVisible(false);
					heroShow.jpIcon1.setVisible(false);
					heroShow.jpHero2.setVisible(false);
					heroShow.jpIcon2.setVisible(false);
					heroShow.jpHero3.setVisible(false);
					heroShow.jpIcon3.setVisible(false);
					jpFight1.setVisible(false);
					jpFight2.setVisible(false);
					jpFight3.setVisible(false);
					jpLine.setVisible(false);
					GImage.setVisible(false);
					new homeBase().addHomeBase(con);
					}	
				});
			back.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					//player can use ESC to return home base, it is same as back button.
					if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
						jpBack.setVisible(false);
						heroShow.jpHero1.setVisible(false);
						heroShow.jpIcon1.setVisible(false);
						heroShow.jpHero2.setVisible(false);
						heroShow.jpIcon2.setVisible(false);
						heroShow.jpHero3.setVisible(false);
						heroShow.jpIcon3.setVisible(false);
						jpFight1.setVisible(false);
						jpFight2.setVisible(false);
						jpFight3.setVisible(false);
						jpLine.setVisible(false);
						GImage.setVisible(false);
						new homeBase().addHomeBase(con);
					}
				}
			});
		}
		
		con.add(jpFight1);
		con.add(jpFight2);
		con.add(jpFight3);
		con.add(jpLine);
		con.add(jpBack);
		con.add(GImage);
		back.requestFocus();
		visitedLair = true;
	}
}
