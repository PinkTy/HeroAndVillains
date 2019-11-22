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
 * This class is the map of each city, if the number of maps greater then zero,
 * the directions of each city is random.And player can use ENTER button to enter
 * different places. 
 */
public class mapOpen {
	static boolean isOpenedMap = false;
	static boolean isVisitedEast = false;
	static boolean isVisitedWest = false;
	static boolean isVisitedNorth = false;
	static boolean isVisitedSouth = false;
	
	static String east;
	static String west;
	static String north;
	static String south;
	JPanel GImage,jpHiddenbtn,character,jpBack,jpLine,place1,place2,place3,place4,place5,notice,image1,image2,image3,image4,
			image5,image6,backColor;
	
	/**
	 * 
	 * @param con
	 * create the map window, player can use right, left, up and down to 
	 * control the frame and use ENTER button to enter the city. 
	 */
	@SuppressWarnings("serial")
	public void addMap(Container con) {
		backColor = new JPanel();
		backColor.setBounds(0, 0, 1205, 960);
		backColor.setBackground(Color.BLACK);
		
		GImage = new JPanel() {  
			 protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(mapOpen.class.getResource("/res/mapBack.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
             icon.getIconHeight(), icon.getImageObserver());  
			 }  
		};  
		GImage.setBounds(0, 0, 1205, 960);
		
		if(isOpenedMap == false) {
			setDirection();
		}
		
		notice = new JPanel();
		notice.setBounds(970,600,200,300);
		notice.setOpaque(false);
		
		JLabel jlNotice = new JLabel();
		jlNotice.setText("<html>Unkown<br/><br/>Home base<br/><br/>Shop<br/><br/>Power up den<br/><br/>Hospital<br/><br/>Lair<html>");
		jlNotice.setForeground(Color.WHITE);
		jlNotice.setFont(new Font(null,Font.BOLD,20));
		notice.add(jlNotice);
		
		image1 = new JPanel() {
			protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(mapOpen.class.getResource("/res/unknown.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
           icon.getIconHeight(), icon.getImageObserver());  
			 }  
		};
		image1.setBounds(930,590,50,50);
		
		image2 = new JPanel() {
			protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(mapOpen.class.getResource("/res/home.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
         icon.getIconHeight(), icon.getImageObserver());  
			 }  
		};
		image2.setBounds(930,640,50,50);
		
		image3 = new JPanel() {
			protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(mapOpen.class.getResource("/res/shop.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
       icon.getIconHeight(), icon.getImageObserver());  
			 }  
		};
		image3.setBounds(930,690,50,50);
		
		image4 = new JPanel() {
			protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(mapOpen.class.getResource("/res/powerUp.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
       icon.getIconHeight(), icon.getImageObserver());  
			 }  
		};
		image4.setBounds(930,740,50,50);
		
		image5 = new JPanel() {
			protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(mapOpen.class.getResource("/res/hospital.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
     icon.getIconHeight(), icon.getImageObserver());
			}
		};
		image5.setBounds(930,790,50,50);
		
		image6 = new JPanel() {
			protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(mapOpen.class.getResource("/res/lair.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
     icon.getIconHeight(), icon.getImageObserver());
			}
		};
		image6.setBounds(930,840,50,50);
		
		jpLine = new JPanel();
		jpLine.setBounds(400, 830, 400, 200);
		jpLine.setOpaque(false);
		
		JLabel jlLine = new JLabel();
		jlLine.setText("<html>Use right,left,up,down to control.<br/>Press Enter to choose.<html>");
		jlLine.setForeground(Color.BLACK);
		jlLine.setFont(new Font(null,Font.BOLD,20));
		jpLine.add(jlLine);
		
		place1 = new JPanel() {
			protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(mapOpen.class.getResource("/res/home.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
       icon.getIconHeight(), icon.getImageObserver());  
			 }  
		};
		place1.setBounds(595,445,50,50);
		 new bag();
		place2 = new JPanel() {
			protected void paintComponent(Graphics g) {  
				if(isVisitedEast == true || bag.map > 0) {
					ImageIcon icon = new ImageIcon(mapOpen.class.getResource("/res/"+east+".png"));
					Image img = icon.getImage();  
					g.drawImage(img, 0, 0, icon.getIconWidth(),  
							icon.getIconHeight(), icon.getImageObserver());  
				}
				else {
					ImageIcon icon = new ImageIcon(mapOpen.class.getResource("/res/unknown.png"));
					Image img = icon.getImage();  
					g.drawImage(img, 0, 0, icon.getIconWidth(),  
							icon.getIconHeight(), icon.getImageObserver());  
				}
				
			 }  
		};
		place2.setBounds(765,445,50,50);
		
		place3 = new JPanel() {
			protected void paintComponent(Graphics g) {  
				if(isVisitedWest == true || bag.map > 0) {
					ImageIcon icon = new ImageIcon(mapOpen.class.getResource("/res/"+west+".png"));
					Image img = icon.getImage();  
					g.drawImage(img, 0, 0, icon.getIconWidth(),  
							icon.getIconHeight(), icon.getImageObserver());  
				}
				else {
					ImageIcon icon = new ImageIcon(mapOpen.class.getResource("/res/unknown.png"));
					Image img = icon.getImage();  
					g.drawImage(img, 0, 0, icon.getIconWidth(),  
							icon.getIconHeight(), icon.getImageObserver());  
				}  
			 }  
		};
		place3.setBounds(365,445,50,50);
		
		place4 = new JPanel() {
			protected void paintComponent(Graphics g) {  
				if(isVisitedNorth == true || bag.map > 0) {
					ImageIcon icon = new ImageIcon(mapOpen.class.getResource("/res/"+north+".png"));
					Image img = icon.getImage();  
					g.drawImage(img, 0, 0, icon.getIconWidth(),  
							icon.getIconHeight(), icon.getImageObserver());  
				}
				else {
					ImageIcon icon = new ImageIcon(mapOpen.class.getResource("/res/unknown.png"));
					Image img = icon.getImage();  
					g.drawImage(img, 0, 0, icon.getIconWidth(),  
							icon.getIconHeight(), icon.getImageObserver());  
				}
			 }  
		};
		place4.setBounds(595,215,50,50);
		
		place5 = new JPanel() {
			protected void paintComponent(Graphics g) {  
				if(isVisitedSouth == true || bag.map > 0) {
					ImageIcon icon = new ImageIcon(mapOpen.class.getResource("/res/"+south+".png"));
					Image img = icon.getImage();  
					g.drawImage(img, 0, 0, icon.getIconWidth(),  
							icon.getIconHeight(), icon.getImageObserver());  
				}
				else {
					ImageIcon icon = new ImageIcon(mapOpen.class.getResource("/res/unknown.png"));
					Image img = icon.getImage();  
					g.drawImage(img, 0, 0, icon.getIconWidth(),  
							icon.getIconHeight(), icon.getImageObserver());  
				} 
			 }  
		};
		place5.setBounds(595,685,50,50);
		
		jpBack = new JPanel();
		jpBack.setBounds(100,60,120,100);
		jpBack.setOpaque(false);
		
		JButton back = new JButton("<<BACK");
		back.setOpaque(false);
		back.setBackground(Color.black);
		back.setForeground(Color.black);
		back.setFont(new Font(null,Font.BOLD,17));
		back.setFocusPainted(false);
		jpBack.add(back);
		
		character = new JPanel() {
			protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(mapOpen.class.getResource("/res/frame.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
         icon.getIconHeight(), icon.getImageObserver());  
			 }  
		};
		character.setBounds(590,440,60,60);
		
		jpHiddenbtn = new JPanel();
		jpHiddenbtn.setBounds(50,50,0,0);
		JButton hiddenbtn = new JButton();
		jpHiddenbtn.add(hiddenbtn);
		
		hiddenbtn.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				 if (e.getKeyCode() == KeyEvent.VK_RIGHT && character.getLocation().x <= 760 && character.getLocation().y == 440) {
					 character.setLocation(character.getLocation().x + 10,character.getLocation().y);
		           	}
				 if (e.getKeyCode() == KeyEvent.VK_LEFT && 370 <= character.getLocation().x && character.getLocation().y == 440) {
					 character.setLocation(character.getLocation().x-10,character.getLocation().y);
		           	}
				 if (e.getKeyCode() == KeyEvent.VK_UP && character.getLocation().y >= 220 && character.getLocation().x == 590) {
					 character.setLocation(character.getLocation().x,character.getLocation().y - 10);
		           	}
				 if (e.getKeyCode() == KeyEvent.VK_DOWN && character.getLocation().y <= 680 && character.getLocation().x == 590) {
					 character.setLocation(character.getLocation().x,character.getLocation().y + 10);
		           	}
				 if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					 if((760 <= character.getLocation().x && character.getLocation().x <= 770) && character.getLocation().y == 440) {
						 isVisitedEast = true;
						 if(east == "shop") {
							 visible(con);
							 new store().instore(con);
						 }
						 else if(east == "hospital") {
							 visible(con);
							 new hospital().addHospital(con);
						 }
						 else if(east == "lair") {
							 visible(con);
							 new lair().addLair(con);
						 }
						 else if(east == "powerUp") {
							 visible(con);
							 new powerUpDen().addPowerUP(con);
						 }
					 }
					 if((360 <= character.getLocation().x && character.getLocation().x <= 370) && character.getLocation().y == 440) {
						 isVisitedWest = true;
						 if(west == "shop") {
							 visible(con);
							 new store().instore(con);
						 }
						 else if(west == "hospital") {
							 visible(con);
							 new hospital().addHospital(con);
						 }
						 else if(west == "lair") {
							 visible(con);
							 new lair().addLair(con);
						 }
						 else if(west == "powerUp") {
							 visible(con);
							 new powerUpDen().addPowerUP(con);
						 }
					 }
					 if(character.getLocation().x == 590 && (210 <= character.getLocation().y && character.getLocation().y <= 220)) {
						 isVisitedNorth = true;
						 if(north == "shop") {
							 visible(con);
							 new store().instore(con);
						 }
						 else if(north == "hospital") {
							 visible(con);
							 new hospital().addHospital(con);
						 }
						 else if(north == "lair") {
							 visible(con);
							 new lair().addLair(con);
						 }
						 else if(north == "powerUp") {
							 visible(con);
							 new powerUpDen().addPowerUP(con);
						 }
					 }
					 if(character.getLocation().x == 590 && (680 <= character.getLocation().y && character.getLocation().y <= 690)) {
						 isVisitedSouth = true;
						 if(south == "shop") {
							 visible(con);
							 new store().instore(con);
						 }
						 else if(south == "hospital") {
							 visible(con);
							 new hospital().addHospital(con);
						 }
						 else if(south == "lair") {
							 visible(con);
							 new lair().addLair(con);
						 }
						 else if(south == "powerUp") {
							 visible(con);
							 new powerUpDen().addPowerUP(con);
						 }
					 }
					}
				}
			});
		
		character.setFocusable(true);
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				visible(con);
				new homeBase().addHomeBase(con);
				}	
			});
		
		con.add(image1);
		con.add(image2);
		con.add(image3);
		con.add(image4);
		con.add(image5);
		con.add(image6);
		con.add(notice);
		con.add(jpLine);
		con.add(jpBack);
		con.add(character);
		con.add(jpHiddenbtn);
		con.add(place1);
		con.add(place2);
		con.add(place3);
		con.add(place4);
		con.add(place5);
		con.add(GImage);
		con.add(backColor);
		hiddenbtn.requestFocus();
		isOpenedMap = true;
	}
	
	/**
	 * this method random different directions in each city
	 */
	public void setDirection() {
		ArrayList<String> direction = new ArrayList<String>();
		Collections.addAll(direction, "shop","hospital","powerUp","lair");
		
		Random num = new Random();
		east = direction.get(num.nextInt(direction.size()));
		direction.remove(direction.indexOf(east));
		west = direction.get(num.nextInt(direction.size()));
		direction.remove(direction.indexOf(west));
		north = direction.get(num.nextInt(direction.size()));
		direction.remove(direction.indexOf(north));
		south = direction.get(num.nextInt(direction.size()));
		direction.remove(direction.indexOf(south));
	}
	
	public void visible(Container con) {
		GImage.setVisible(false);
		jpHiddenbtn.setVisible(false);
		character.setVisible(false);
		jpBack.setVisible(false);
		jpLine.setVisible(false);
		place1.setVisible(false);
		place2.setVisible(false);
		place3.setVisible(false);
		place4.setVisible(false);
		place5.setVisible(false);
		notice.setVisible(false);
		image1.setVisible(false);
		image2.setVisible(false);
		image3.setVisible(false);
		image4.setVisible(false);
		image5.setVisible(false);
		image6.setVisible(false);
		backColor.setVisible(false);
		 
	}

}
