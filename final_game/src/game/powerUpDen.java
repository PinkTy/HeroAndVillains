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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author Cai & Lee
 * This class is the power up den in each city, player can use power up items
 * in power up den.
 */
public class powerUpDen {
	static boolean visitedPower = false;
	static boolean usedEscapeCard = false;
	String chooseItems;
	
	/**
	 * 
	 * @param con 
	 * crate the power up den window, player can choose different items if the number of 
	 * items is greater than 0, if player chooses recovering rate plus or damage plus, player
	 * should choose which hero he/she want to use.
	 */
	@SuppressWarnings("serial")
	public void addPowerUP(Container container) {
		new bag();
		JPanel jpGImage = new JPanel();
		jpGImage.setBounds(0, 0, 1205, 960);
		jpGImage.setBackground(Color.black);
		
		JPanel jpLine = new JPanel();
		jpLine.setBounds(400, 850, 400, 100);
		jpLine.setOpaque(false);
		jpLine.setVisible(false);
		JLabel jlLine = new JLabel();
		jlLine.setText("No more items, plz buy in the store.");
		jlLine.setForeground(Color.red);
		jlLine.setFont(new Font(null,Font.BOLD,18));
		jpLine.add(jlLine);
		
		JPanel jpLine1 = new JPanel();
		jpLine1.setBounds(400, 850, 400, 100);
		jpLine1.setOpaque(false);
		jpLine1.setVisible(false);
		JLabel jlLine1 = new JLabel();
		jlLine1.setText("You can escape next fight");
		jlLine1.setForeground(Color.WHITE);
		jlLine1.setFont(new Font(null,Font.BOLD,18));
		jpLine1.add(jlLine1);
		
		JPanel jpBack = new JPanel();
		jpBack.setBounds(10,5,120,100);
		jpBack.setOpaque(false);
		
		JButton back = new JButton("<<BACK");
		back.setOpaque(false);
		back.setBackground(Color.black);
		back.setForeground(Color.white);
		back.setFont(new Font(null,Font.BOLD,13));
		back.setFocusPainted(false);
		jpBack.add(back);
		
		JPanel jpName1 = new JPanel();
		jpName1.setBounds(290,250,150,70);
		jpName1.setOpaque(false);
		
		JLabel jlName1 = new JLabel();
		jlName1.setForeground(Color.white);
		jlName1.setFont(new Font(null,Font.BOLD,17));
		jlName1.setText("Escape Card X" + bag.escapeCard);
		jpName1.add(jlName1);
		
		JPanel jpName2 = new JPanel();
		jpName2.setBounds(470,250,150,70);
		jpName2.setOpaque(false);
		
		JLabel jlName2 = new JLabel();
		jlName2.setForeground(Color.white);
		jlName2.setFont(new Font(null,Font.BOLD,13));
		jlName2.setText("Recovering plus X" + bag.recRate);
		jpName2.add(jlName2);
		
		JPanel jpName3 = new JPanel();
		jpName3.setBounds(650,250,150,70);
		jpName3.setOpaque(false);
		
		JLabel jlName3 = new JLabel();
		jlName3.setForeground(Color.white);
		jlName3.setFont(new Font(null,Font.BOLD,17));
		jlName3.setText("Damage plus X" + bag.damagePlus);
		jpName3.add(jlName3);
		
		JPanel jpItems1 = new JPanel() {
			protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(powerUpDen.class.getResource("/res/escape.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
	            icon.getIconHeight(), icon.getImageObserver());
			}
		};
		jpItems1.setBounds(290, 320, 160, 250);
		
		JPanel jpItems2 = new JPanel() {
			 protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(powerUpDen.class.getResource("/res/recPlus.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
	            icon.getIconHeight(), icon.getImageObserver());  
	    }  
		};
		jpItems2.setBounds(470, 320, 160, 250);
		
		JPanel jpItems3 = new JPanel() {
			 protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(powerUpDen.class.getResource("/res/damPlus.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
	            icon.getIconHeight(), icon.getImageObserver());  
	    }  
		};
		jpItems3.setBounds(650, 320, 160, 250);
		
		JPanel jpChoose1 = new JPanel();
		jpChoose1.setBounds(300, 560, 100, 50);
		jpChoose1.setOpaque(false);
		
		JButton choose1 = new JButton("CHOOSE");
		choose1.setOpaque(false);
		choose1.setBackground(Color.black);
		choose1.setForeground(Color.white);
		choose1.setFont(new Font(null,Font.BOLD,22));
		choose1.setFocusPainted(false);
		jpChoose1.add(choose1);
		
		JPanel jpChoose2 = new JPanel();
		jpChoose2.setBounds(480, 560, 100, 50);
		jpChoose2.setOpaque(false);
		
		JButton choose2 = new JButton("CHOOSE");
		choose2.setOpaque(false);
		choose2.setBackground(Color.black);
		choose2.setForeground(Color.white);
		choose2.setFont(new Font(null,Font.BOLD,22));
		choose2.setFocusPainted(false);
		jpChoose2.add(choose2);
		
		JPanel jpChoose3 = new JPanel();
		jpChoose3.setBounds(660, 560, 100, 50);
		jpChoose3.setOpaque(false);
		
		JButton choose3 = new JButton("CHOOSE");
		choose3.setOpaque(false);
		choose3.setBackground(Color.black);
		choose3.setForeground(Color.white);
		choose3.setFont(new Font(null,Font.BOLD,22));
		choose3.setFocusPainted(false);
		jpChoose3.add(choose3);
		
		choose1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					if(bag.escapeCard > 0) {
						bag.escapeCard -= 1;
						jlName1.setText("Escape Card X" + bag.escapeCard);
						usedEscapeCard = true;
						jpLine.setVisible(false);
						jpLine1.setVisible(true);
					}
					else {
						jpLine1.setVisible(false);
						jpLine.setVisible(true);
					}
				}	
			});
		
		choose2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(bag.recRate > 0) {
					bag.recRate -= 1;
					chooseItems = "Recovering Plus";
					jlName2.setText("Recovering plus X" + bag.recRate);
					jpLine.setVisible(false);
					jpLine1.setVisible(false);
					jpName1.setVisible(false);
					jpName2.setVisible(false);
					jpName3.setVisible(false);
					jpChoose1.setVisible(false);
					jpChoose2.setVisible(false);
					jpChoose3.setVisible(false);
					jpItems1.setVisible(false);
					jpItems2.setVisible(false);
					jpItems3.setVisible(false);
					jpBack.setVisible(false);
					jpGImage.setVisible(false);
					chooseHero(container);
					}
				else {
					jpLine.setVisible(true);
					}
				}	
			});
		
		choose3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(bag.damagePlus > 0) {
					bag.damagePlus -= 1;
					jlName2.setText("Damage plus X" + bag.damagePlus);
					chooseItems = "Damage Plus";
					jpLine.setVisible(false);
					jpLine1.setVisible(false);
					jpName1.setVisible(false);
					jpName2.setVisible(false);
					jpName3.setVisible(false);
					jpChoose1.setVisible(false);
					jpChoose2.setVisible(false);
					jpChoose3.setVisible(false);
					jpItems1.setVisible(false);
					jpItems2.setVisible(false);
					jpItems3.setVisible(false);
					jpBack.setVisible(false);
					jpGImage.setVisible(false);
					chooseHero(container);
				}
			else {
				jpLine.setVisible(true);
				}
				}	
			});
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new randomEvents();
				randomEvents.randomHappen();
				jpLine.setVisible(false);
				jpLine1.setVisible(false);	
				jpLine.setVisible(false);
				jpName1.setVisible(false);
				jpName2.setVisible(false);
				jpName3.setVisible(false);
				jpChoose1.setVisible(false);
				jpChoose2.setVisible(false);
				jpChoose3.setVisible(false);
				jpItems1.setVisible(false);
				jpItems2.setVisible(false);
				jpItems3.setVisible(false);
				jpBack.setVisible(false);
				jpGImage.setVisible(false);
				new homeBase().addHomeBase(container);
				}	
			});
		back.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
					new randomEvents();
					randomEvents.randomHappen();
					jpLine.setVisible(false);
					jpLine1.setVisible(false);	
					jpLine.setVisible(false);
					jpName1.setVisible(false);
					jpName2.setVisible(false);
					jpName3.setVisible(false);
					jpChoose1.setVisible(false);
					jpChoose2.setVisible(false);
					jpChoose3.setVisible(false);
					jpItems1.setVisible(false);
					jpItems2.setVisible(false);
					jpItems3.setVisible(false);
					jpBack.setVisible(false);
					jpGImage.setVisible(false);
					new homeBase().addHomeBase(container);	
					
				}
			}
		});
		
		container.add(jpLine);
		container.add(jpLine1);
		container.add(jpName1);
		container.add(jpName2);
		container.add(jpName3);
		container.add(jpChoose1);
		container.add(jpChoose2);
		container.add(jpChoose3);
		container.add(jpItems1);
		container.add(jpItems2);
		container.add(jpItems3);
		container.add(jpBack);
		container.add(jpGImage);
		back.requestFocus();
		
		visitedPower = true;
	}
	
	/**
	 * 
	 * @param con
	 * if player chooses recovering rate plus or damage plus, player
	 * should choose which hero he/she want to use.
	 */
	public void chooseHero(Container con) {
		new heroShow();
		new chooseHero();
		new damageList();
		new recList();
		
		JPanel jpLine = new JPanel();
		jpLine.setBounds(100, 170, 600, 50);
		jpLine.setOpaque(false);
		
		JLabel line = new JLabel();
		line.setText("Please choose the hero you want to use " + chooseItems + " :");
		line.setFont(new Font(null,Font.BOLD,17));
		line.setForeground(Color.white);
		jpLine.add(line);
		
		JPanel jpGImage = new JPanel();
		jpGImage.setBounds(0, 0, 1205, 960);
		jpGImage.setBackground(Color.black);
		
		JPanel jpBack1 = new JPanel();
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
		
		JPanel jpChoose1 = new JPanel();
		jpChoose1.setBounds(300, 560, 100, 50);
		jpChoose1.setOpaque(false);
		jpChoose1.setVisible(false);
		
		JButton choose1 = new JButton("CHOOSE");
		choose1.setOpaque(false);
		choose1.setBackground(Color.black);
		choose1.setForeground(Color.white);
		choose1.setFont(new Font(null,Font.BOLD,22));
		choose1.setFocusPainted(false);
		jpChoose1.add(choose1);
		
		JPanel jpChoose2 = new JPanel();
		jpChoose2.setBounds(480, 560, 100, 50);
		jpChoose2.setOpaque(false);
		jpChoose2.setVisible(false);
		JButton choose2 = new JButton("CHOOSE");
		choose2.setOpaque(false);
		choose2.setBackground(Color.black);
		choose2.setForeground(Color.white);
		choose2.setFont(new Font(null,Font.BOLD,24));
		choose2.setFocusPainted(false);
		jpChoose2.add(choose2);
		
		JPanel jpChoose3 = new JPanel();
		jpChoose3.setBounds(660, 560, 100, 50);
		jpChoose3.setOpaque(false);
		jpChoose3.setVisible(false);
		JButton choose3 = new JButton("CHOOSE");
		choose3.setOpaque(false);
		choose3.setBackground(Color.black);
		choose3.setForeground(Color.white);
		choose3.setFont(new Font(null,Font.BOLD,24));
		choose3.setFocusPainted(false);
		jpChoose3.add(choose3);
		new chooseHero();
		int heroSize = chooseHero.heroList.size();
		
		if(heroSize == 1) {
			new heroShow();
			heroShow.addHeroShow(con);
			jpChoose2.setVisible(true);
		}
		else if(heroSize == 2) {
			new heroShow();
			heroShow.addHeroShow(con);
			jpChoose1.setVisible(true);
			jpChoose2.setVisible(true);
		}
		
		else {
			new heroShow();
			heroShow.addHeroShow(con);
			jpChoose1.setVisible(true);
			jpChoose2.setVisible(true);
			jpChoose3.setVisible(true);
		}
		
		
		
		choose1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jpLine.setVisible(false);
				jpChoose1.setVisible(false);
				jpChoose2.setVisible(false);
				jpChoose3.setVisible(false);
				jpBack1.setVisible(true);
				if(chooseItems.equals("Recovering Plus")) {
					recList.rec.set(1, recList.rec.get(1) + 0.05);
				}
				else {
					damageList.dam.set(1, damageList.dam.get(1)+5);
					}
				}	
			});
		
		choose2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jpLine.setVisible(false);
				jpChoose1.setVisible(false);
				jpChoose2.setVisible(false);
				jpChoose3.setVisible(false);	
				jpBack1.setVisible(true);
				if(chooseItems.equals("Recovering Plus")) {
					recList.rec.set(0, recList.rec.get(0) + 0.05);
				}
				else {
					damageList.dam.set(0, damageList.dam.get(0)+5);
					}
				}	
			});
		
		choose3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jpLine.setVisible(false);
				jpChoose1.setVisible(false);
				jpChoose2.setVisible(false);
				jpChoose3.setVisible(false);	
				jpBack1.setVisible(true);
				if(chooseItems.equals("Recovering Plus")) {
					recList.rec.set(2, recList.rec.get(2) + 0.05);
				}
				else {
					damageList.dam.set(2, damageList.dam.get(2)+5);
					}
				}	
			});
		
		if(heroSize == 1) {
			back1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
						heroShow.jpHero2.setVisible(false);
						heroShow.jpIcon2.setVisible(false);
						jpBack1.setVisible(false);;
						jpGImage.setVisible(false);;
						addPowerUP(con);
					}	
				});
			
			back1.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
						heroShow.jpHero1.setVisible(false);
						heroShow.jpHero2.setVisible(false);
						heroShow.jpHero3.setVisible(false);
						heroShow.jpIcon1.setVisible(false);
						heroShow.jpIcon2.setVisible(false);
						heroShow.jpIcon3.setVisible(false);
						jpBack1.setVisible(false);;
						jpGImage.setVisible(false);;
						addPowerUP(con);
					}
				}
				
			});
		}
		else if(heroSize == 2) {
			back1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
						heroShow.jpHero1.setVisible(false);
						heroShow.jpHero2.setVisible(false);
						heroShow.jpIcon1.setVisible(false);
						heroShow.jpIcon2.setVisible(false);
						jpBack1.setVisible(false);;
						jpGImage.setVisible(false);;
						addPowerUP(con);
					}	
				});
			
			back1.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
						heroShow.jpHero1.setVisible(false);
						heroShow.jpHero2.setVisible(false);
						heroShow.jpIcon1.setVisible(false);
						heroShow.jpIcon2.setVisible(false);
						jpBack1.setVisible(false);;
						jpGImage.setVisible(false);;
						addPowerUP(con);
					}
				}
				
			});
		}
		
		else {
			back1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
						heroShow.jpHero1.setVisible(false);
						heroShow.jpHero2.setVisible(false);
						heroShow.jpHero3.setVisible(false);
						heroShow.jpIcon1.setVisible(false);
						heroShow.jpIcon2.setVisible(false);
						heroShow.jpIcon3.setVisible(false);
						jpBack1.setVisible(false);;
						jpGImage.setVisible(false);;
						addPowerUP(con);
					}	
				});
			
			back1.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
						heroShow.jpHero1.setVisible(false);
						heroShow.jpHero2.setVisible(false);
						heroShow.jpHero3.setVisible(false);
						heroShow.jpIcon1.setVisible(false);
						heroShow.jpIcon2.setVisible(false);
						heroShow.jpIcon3.setVisible(false);
						jpBack1.setVisible(false);;
						jpGImage.setVisible(false);;
						addPowerUP(con);
					}
				}
				
			});
		}
		
		con.add(jpLine);
		con.add(jpChoose1);
		con.add(jpChoose2);
		con.add(jpChoose3);
		con.add(jpBack1);
		con.add(jpGImage);
		back1.requestFocus();
	}
}
