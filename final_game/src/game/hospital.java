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
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author Cai & Lee
 * This class is the power up den in each city, player can use healing items
 * in hospital. And HP plus 25 should wait 10 seconds to apply, HP plus 50 should 
 * wait 20 seconds to apply, HP plus 100 should wait 40 seconds to apply
 * 
 */
public class hospital {
	String chooseItems;
	public static int count;
	public static int hpCount = 0;
	static int heroIndex = 0;
	static ArrayList<String> inHospital = new ArrayList<String>();
	private Timer timer = new Timer();
	
	/**
	 * 
	 * @param con 
	 * crate the hospital window, player can choose different items if the number of 
	 * items is greater than 0, if player chooses one of the healing items, player
	 * should choose which hero he/she want to use.
	 */
	@SuppressWarnings("serial")
	public void addHospital(Container container) {
		new bag();
		
		JPanel jpGImage = new JPanel();
		jpGImage.setBounds(0, 0, 1205, 960);
		jpGImage.setBackground(Color.black);
		
		JPanel timeCount = new JPanel();
		timeCount.setBounds(200, 100, 700, 80);
		timeCount.setOpaque(false);
		
		JLabel time = new JLabel();
		time.setForeground(Color.WHITE);
		time.setFont(new Font(null,Font.BOLD,25));
		timeCount.add(time);
		if(inHospital.size() == 0) {
			time.setText("No one is in the hospital");
		}
		else {
			timer.scheduleAtFixedRate(new TimerTask() {
				@Override
		        public void run() {
					if(count == 0) {
		            	count = 0;
		        		inHospital.remove(0);
		            	hpCount = 0;
		            	heroIndex = 0;
		        		timer.cancel();
		        		timer.purge();
		        		time.setText("No one is in the hospital");
		            }
					count--;
		        	time.setText(count+"s remain to heal the " + chooseHeroName.heroNameList.get(heroIndex));
		        	hpCount++;
		        	if(hpCount == 2) {
		        		hpCount = 0;
		        		hpList.hp.set(heroIndex, hpList.hp.get(heroIndex) + 5);
		        		if(chooseHero.heroList.get(heroIndex).getName() == "tinker") {
		        			if(hpList.hp.get(heroIndex) > 120) {
			        			hpList.hp.set(heroIndex, 120);
			        		}
		        		}
		        		else if(hpList.hp.get(heroIndex) > 100) {
		        			hpList.hp.set(heroIndex, 100);
		        		}
		        	}
		        	
		        }
		    }, 0, 1000);
		}
		
		
		JPanel jpLine = new JPanel();
		jpLine.setBounds(400, 850, 400, 100);
		jpLine.setOpaque(false);
		jpLine.setVisible(false);
		JLabel jlLine = new JLabel();
		jlLine.setText("No more items, plz buy in the store.");
		jlLine.setForeground(Color.red);
		jlLine.setFont(new Font(null,Font.BOLD,19));
		jpLine.add(jlLine);
		
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
		
		JPanel jpName1 = new JPanel();
		jpName1.setBounds(290,250,150,70);
		jpName1.setOpaque(false);
		
		JLabel jlName1 = new JLabel();
		jlName1.setForeground(Color.white);
		jlName1.setFont(new Font(null,Font.BOLD,16));
		jlName1.setText("HP plus 25% X" + bag.hpPlus25);
		
		jpName1.add(jlName1);
		
		JPanel jpName2 = new JPanel();
		jpName2.setBounds(470,250,150,70);
		jpName2.setOpaque(false);
		
		JLabel jlName2 = new JLabel();
		jlName2.setForeground(Color.white);
		jlName2.setFont(new Font(null,Font.BOLD,16));
		jlName2.setText("HP plus 50% X" + bag.hpPlus50);
		jpName2.add(jlName2);
		
		JPanel jpName3 = new JPanel();
		jpName3.setBounds(650,250,150,70);
		jpName3.setOpaque(false);
		
		JLabel jlName3 = new JLabel();
		jlName3.setForeground(Color.white);
		jlName3.setFont(new Font(null,Font.BOLD,15));
		jlName3.setText("HP plus 100% X" + bag.hpPlus100);
		jpName3.add(jlName3);
		
		JPanel jpItems1 = new JPanel() {
			 protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(hospital.class.getResource("/res/hpPlus1.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
	            icon.getIconHeight(), icon.getImageObserver());  
	    }  
		};
		jpItems1.setBounds(290, 320, 160, 250);
		
		JPanel jpItems2 = new JPanel() {
			 protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(hospital.class.getResource("/res/hpPlus2.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
	            icon.getIconHeight(), icon.getImageObserver());  
	    }  
		};
		jpItems2.setBounds(470, 320, 160, 250);
		
		JPanel jpItems3 = new JPanel() {
			 protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(hospital.class.getResource("/res/hpPlus3.png"));  
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
		choose1.setFont(new Font(null,Font.BOLD,21));
		choose1.setFocusPainted(false);
		jpChoose1.add(choose1);
		
		JPanel jpChoose2 = new JPanel();
		jpChoose2.setBounds(480, 560, 100, 50);
		jpChoose2.setOpaque(false);
		
		JButton choose2 = new JButton("CHOOSE");
		choose2.setOpaque(false);
		choose2.setBackground(Color.black);
		choose2.setForeground(Color.white);
		choose2.setFont(new Font(null,Font.BOLD,21));
		choose2.setFocusPainted(false);
		jpChoose2.add(choose2);
		
		JPanel jpChoose3 = new JPanel();
		jpChoose3.setBounds(660, 560, 100, 50);
		jpChoose3.setOpaque(false);
		
		JButton choose3 = new JButton("CHOOSE");
		choose3.setOpaque(false);
		choose3.setBackground(Color.black);
		choose3.setForeground(Color.white);
		choose3.setFont(new Font(null,Font.BOLD,21));
		choose3.setFocusPainted(false);
		jpChoose3.add(choose3);
		
		choose1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					if(bag.hpPlus25 > 0) {
						bag.hpPlus25 -= 1;
						chooseItems = "HP plus 25%";
						jlName1.setText("HP plus 25% X" + bag.hpPlus25);
						timeCount.setVisible(false);
						jpLine.setVisible(false);
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
						chooseHero(container);
					}
					else {
						jpLine.setVisible(true);
					}
				}	
			});
		
		choose2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(bag.hpPlus50 > 0) {
					bag.hpPlus50 -= 1;
					chooseItems = "HP plus 50%";
					jlName1.setText("HP plus 50% X" + bag.hpPlus50);
					timeCount.setVisible(false);
					jpLine.setVisible(false);
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
				if(bag.hpPlus100 > 0) {
					bag.hpPlus100 -= 1;
					chooseItems = "HP plus 100%";
					jlName1.setText("HP plus 100% X" + bag.hpPlus100);
					timeCount.setVisible(false);
					jpLine.setVisible(false);
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
				timeCount.setVisible(false);
				jpLine.setVisible(false);
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
					timeCount.setVisible(false);
					jpLine.setVisible(false);	
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
		
		container.add(timeCount);
		container.add(jpLine);
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
	}
	
	/**
	 * 
	 * @param con
	 * if player chooses one of the healing items, player
	 * should choose which hero he/she want to use.
	 */
	public void chooseHero(Container con) {
		new heroShow();
		new chooseHero();
		new hpList();
		
		JPanel jpNotice = new JPanel();
		jpNotice.setBounds(250, 850, 700, 100);
		jpNotice.setOpaque(false);
		jpNotice.setVisible(false);
		
		JLabel notice = new JLabel();
		notice.setText("This hero is being treated");
		notice.setForeground(Color.red);
		notice.setFont(new Font(null,Font.BOLD,20));
		jpNotice.add(notice);
		
		JPanel jpLine = new JPanel();
		jpLine.setBounds(100, 170, 600, 50);
		jpLine.setOpaque(false);
		
		JLabel line = new JLabel();
		line.setText("Please choose the hero you want to use " + chooseItems + " :");
		line.setFont(new Font(null,Font.BOLD,18));
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
		choose1.setFont(new Font(null,Font.BOLD,21));
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
		choose2.setFont(new Font(null,Font.BOLD,21));
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
		choose3.setFont(new Font(null,Font.BOLD,21));
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
				if(chooseItems.equals("HP plus 25%")) {
					if(inHospital.contains(chooseHeroName.heroNameList.get(1))) {
						jpNotice.setVisible(true);
						bag.hpPlus25 += 1;
					}
					else {
						inHospital.add(chooseHeroName.heroNameList.get(1));
						if(inHospital.size() > 1) {
							jpNotice.setVisible(true);
							notice.setText("Already have hero in the hospital, please wait");
							bag.hpPlus25 += 1;
							inHospital.remove(1);
						}
						else {
							heroIndex = 1;
							count = 10;
						}
						
					}
				}
				else if(chooseItems.equals("HP plus 50%")) {
					if(inHospital.contains(chooseHeroName.heroNameList.get(1))) {
						jpNotice.setVisible(true);
						bag.hpPlus50 += 1;
					}
					else {
						inHospital.add(chooseHeroName.heroNameList.get(1));
						if(inHospital.size() > 1) {
							bag.hpPlus50 += 1;
							jpNotice.setVisible(true);
							notice.setText("Already have hero in the hospital, please wait");
							inHospital.remove(1);
						}
						else {
							heroIndex = 1;
							count = 20;
						}
					}
				}		
				else {
					if(inHospital.contains(chooseHeroName.heroNameList.get(1))) {
						jpNotice.setVisible(true);
						bag.hpPlus100 += 1;
					}
					else {
						inHospital.add(chooseHeroName.heroNameList.get(1));
						if(inHospital.size() > 1) {
							bag.hpPlus100 += 1;
							jpNotice.setVisible(true);
							notice.setText("Already have hero in the hospital, please wait");
							inHospital.remove(1);
						}
						else {
							heroIndex = 1;
							count = 40;
						}
						
					}
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
				if(chooseItems.equals("HP plus 25%")) {
					if(inHospital.contains(chooseHeroName.heroNameList.get(0))) {
						jpNotice.setVisible(true);
						bag.hpPlus25 += 1;
					}
					else {
						inHospital.add(chooseHeroName.heroNameList.get(0));
						if(inHospital.size() > 1) {
							bag.hpPlus25 += 1;
							jpNotice.setVisible(true);
							notice.setText("Already have hero in the hospital, please wait");
							inHospital.remove(1);
						}
						else {
							heroIndex = 0;
							count = 10;
						}
						
					}

				}
				else if(chooseItems.equals("HP plus 50%")) {
					if(inHospital.contains(chooseHeroName.heroNameList.get(0))) {
						jpNotice.setVisible(true);
						bag.hpPlus50 += 1;
					}
					else {
						inHospital.add(chooseHeroName.heroNameList.get(0));
						if(inHospital.size() > 1) {
							bag.hpPlus50 += 1;
							jpNotice.setVisible(true);
							notice.setText("Already have hero in the hospital, please wait");
							inHospital.remove(1);
						}
						else {
							heroIndex = 0;
							count = 20;
						}
						
					}
				}
				else {
					if(inHospital.contains(chooseHeroName.heroNameList.get(0))) {
						jpNotice.setVisible(true);
						bag.hpPlus100 += 1;
					}
					else {
						inHospital.add(chooseHeroName.heroNameList.get(0));
						if(inHospital.size() > 1) {
							bag.hpPlus100 += 1;
							jpNotice.setVisible(true);
							notice.setText("Already have hero in the hospital, please wait");
							inHospital.remove(1);
						}
						else {
							heroIndex = 0;
							count = 40;
						}
						
					}
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
				if(chooseItems.equals("HP plus 25%")) {
					if(inHospital.contains(chooseHeroName.heroNameList.get(2))) {
						jpNotice.setVisible(true);
						bag.hpPlus25 += 1;
					}
					else {
						inHospital.add(chooseHeroName.heroNameList.get(2));
						if(inHospital.size() > 1) {
							bag.hpPlus25 += 1;
							jpNotice.setVisible(true);
							notice.setText("Already have hero in the hospital, please wait");
							inHospital.remove(1);
						}
						else {
							heroIndex = 2;
							count = 10;
						}
						
					}
				}
				else if(chooseItems.equals("HP plus 50%")) {
					if(inHospital.contains(chooseHeroName.heroNameList.get(2))) {
						jpNotice.setVisible(true);
						bag.hpPlus50 += 1;
					}
					else {
						inHospital.add(chooseHeroName.heroNameList.get(2));
						if(inHospital.size() > 1) {
							bag.hpPlus50 += 1;
							jpNotice.setVisible(true);
							notice.setText("Already have hero in the hospital, please wait");
							inHospital.remove(1);
						}
						else {
							heroIndex = 2;
							count = 20;
						}
						
					}
				}
				else {
					if(inHospital.contains(chooseHeroName.heroNameList.get(2))) {
						jpNotice.setVisible(true);
						bag.hpPlus100 += 1;
					}
					else {
						inHospital.add(chooseHeroName.heroNameList.get(2));
						if(inHospital.size() > 1) {
							bag.hpPlus100 += 1;
							jpNotice.setVisible(true);
							notice.setText("Already have hero in the hospital, please wait");
							inHospital.remove(1);
						}
						else {
							heroIndex = 2;
							count = 40;
						}
						
					}
					}
				}	
			});
		
		if(heroSize == 1) {
			back1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
						heroShow.jpHero2.setVisible(false);
						heroShow.jpIcon2.setVisible(false);
						jpNotice.setVisible(false);
						jpBack1.setVisible(false);;
						jpGImage.setVisible(false);;
						addHospital(con);
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
						jpNotice.setVisible(false);
						jpBack1.setVisible(false);;
						jpGImage.setVisible(false);;
						addHospital(con);
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
						jpNotice.setVisible(false);
						jpBack1.setVisible(false);;
						jpGImage.setVisible(false);;
						addHospital(con);
					}	
				});
			
		}
		
		con.add(jpNotice);
		con.add(jpLine);
		con.add(jpChoose1);
		con.add(jpChoose2);
		con.add(jpChoose3);
		con.add(jpBack1);
		con.add(jpGImage);
		back1.requestFocus();
	}
}
