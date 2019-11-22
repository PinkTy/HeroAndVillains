package game;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * 
 * @author Cai & Lee
 * This class shows the picture of heros, which player has chosen
 */
public class heroShow {
	static JPanel jpIcon1,jpIcon2,jpIcon3,jpHero1,jpHero2,jpHero3;
	
	/**
	 * 
	 * @param con create window to show all the heroes, which player has chosen.
	 */
	@SuppressWarnings("serial")
	public static void addHeroShow(Container con) {
		new chooseHero();
		int heroSize = chooseHero.heroList.size();
		
		if(heroSize == 1) {
			jpIcon2 = new JPanel() {
				protected void paintComponent(Graphics g) {  
					  ImageIcon icon = new ImageIcon(heroShow.class.getResource("/res/lairicon2.png"));
					  Image img = icon.getImage();  
					  g.drawImage(img, 0, 0, icon.getIconWidth(),  
	          icon.getIconHeight(), icon.getImageObserver());  
				 }  
			};
			jpIcon2.setBounds(520,260,34,34);
			
			jpHero2 = new JPanel() {
				protected void paintComponent(Graphics g) {  
					  ImageIcon icon = new ImageIcon(heroShow.class.getResource("/res/"+chooseHero.heroList.get(0).getName()+".png"));
					  Image img = icon.getImage();  
					  g.drawImage(img, 0, 0, icon.getIconWidth(),  
	          icon.getIconHeight(), icon.getImageObserver());  
				 }  
			};
			jpHero2.setBounds(470, 320, 150, 250);
			con.add(jpHero2);
			con.add(jpIcon2);
		}
		else if(heroSize == 2) {
			jpIcon1 = new JPanel() {
				protected void paintComponent(Graphics g) {  
					  ImageIcon icon = new ImageIcon(heroShow.class.getResource("/res/lairicon1.png"));
					  Image img = icon.getImage();  
					  g.drawImage(img, 0, 0, icon.getIconWidth(),  
	            icon.getIconHeight(), icon.getImageObserver());  
				 }  
			};
			jpIcon1.setBounds(340,260,34,34);
			
			jpHero1 = new JPanel() {
				protected void paintComponent(Graphics g) {  
					  ImageIcon icon = new ImageIcon(heroShow.class.getResource("/res/"+chooseHero.heroList.get(1).getName()+".png"));
					  Image img = icon.getImage();  
					  g.drawImage(img, 0, 0, icon.getIconWidth(),  
	          icon.getIconHeight(), icon.getImageObserver());  
				 }  
			};
			jpHero1.setBounds(290, 320, 150, 250);
			
			jpIcon2 = new JPanel() {
				protected void paintComponent(Graphics g) {  
					  ImageIcon icon = new ImageIcon(heroShow.class.getResource("/res/lairicon2.png"));
					  Image img = icon.getImage();  
					  g.drawImage(img, 0, 0, icon.getIconWidth(),  
	          icon.getIconHeight(), icon.getImageObserver());  
				 }  
			};
			jpIcon2.setBounds(520,260,34,34);
			
			jpHero2 = new JPanel() {
				protected void paintComponent(Graphics g) {  
					  ImageIcon icon = new ImageIcon(heroShow.class.getResource("/res/"+chooseHero.heroList.get(0).getName()+".png"));
					  Image img = icon.getImage();  
					  g.drawImage(img, 0, 0, icon.getIconWidth(),  
	          icon.getIconHeight(), icon.getImageObserver());  
				 }  
			};
			jpHero2.setBounds(470, 320, 150, 250);
			con.add(jpHero1);
			con.add(jpIcon1);
			con.add(jpHero2);
			con.add(jpIcon2);
		}
		
		else {
			jpIcon1 = new JPanel() {
				protected void paintComponent(Graphics g) {  
					  ImageIcon icon = new ImageIcon(heroShow.class.getResource("/res/lairicon1.png"));
					  Image img = icon.getImage();  
					  g.drawImage(img, 0, 0, icon.getIconWidth(),  
	            icon.getIconHeight(), icon.getImageObserver());  
				 }  
			};
			jpIcon1.setBounds(340,260,34,34);
			
			jpHero1 = new JPanel() {
				protected void paintComponent(Graphics g) {  
					  ImageIcon icon = new ImageIcon(heroShow.class.getResource("/res/"+chooseHero.heroList.get(1).getName()+".png"));
					  Image img = icon.getImage();  
					  g.drawImage(img, 0, 0, icon.getIconWidth(),  
	          icon.getIconHeight(), icon.getImageObserver());  
				 }  
			};
			jpHero1.setBounds(290, 320, 150, 250);
			
			jpIcon2 = new JPanel() {
				protected void paintComponent(Graphics g) {  
					  ImageIcon icon = new ImageIcon(heroShow.class.getResource("/res/lairicon2.png"));
					  Image img = icon.getImage();  
					  g.drawImage(img, 0, 0, icon.getIconWidth(),  
	          icon.getIconHeight(), icon.getImageObserver());  
				 }  
			};
			jpIcon2.setBounds(520,260,34,34);
			
			jpHero2 = new JPanel() {
				protected void paintComponent(Graphics g) {  
					  ImageIcon icon = new ImageIcon(heroShow.class.getResource("/res/"+chooseHero.heroList.get(0).getName()+".png"));
					  Image img = icon.getImage();  
					  g.drawImage(img, 0, 0, icon.getIconWidth(),  
	          icon.getIconHeight(), icon.getImageObserver());  
				 }  
			};
			jpHero2.setBounds(470, 320, 150, 250);
			
			jpIcon3 = new JPanel() {
				protected void paintComponent(Graphics g) {  
					  ImageIcon icon = new ImageIcon(heroShow.class.getResource("/res/lairicon3.png"));
					  Image img = icon.getImage();  
					  g.drawImage(img, 0, 0, icon.getIconWidth(),  
	          icon.getIconHeight(), icon.getImageObserver());  
				 }  
			};
			jpIcon3.setBounds(700,260,34,34);
			
			jpHero3 = new JPanel() {
				protected void paintComponent(Graphics g) {  
					  ImageIcon icon = new ImageIcon(heroShow.class.getResource("/res/"+chooseHero.heroList.get(2).getName()+".png"));
					  Image img = icon.getImage();  
					  g.drawImage(img, 0, 0, icon.getIconWidth(),  
	          icon.getIconHeight(), icon.getImageObserver());  
				 }  
			};
			jpHero3.setBounds(650, 320, 150, 250);
			con.add(jpHero1);
			con.add(jpIcon1);
			con.add(jpHero2);
			con.add(jpIcon2);
			con.add(jpHero3);
			con.add(jpIcon3);
		}
	}
}
