package game;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author Cai & Lee
 * this class create a new villains, this villains can exist
 * in any city and play paper, scissors and rock and guess number.
 */
public class vill4 extends allVills{
	static int hp;// the HP of this villain
	static int damage;// the damage of this villain
	static String taunt;// the taunt of this villain
	
	/**
	 * Constructor
	 * set the taunt of this villain
	 */
	vill4(){
		taunt = "<html>Zero:<br/>Just give up!<html>";
	}
	
	/**
	 * 
	 * @return get the HP of this villain.
	 */
	public int getHp() {
		return 100;
	}
	
	/**
	 * 
	 * @return get the damage of this villain.
	 */
	public int getDamage() {
		return 30;
	}
	
	/**
	 * 
	 * @return get the name of this villain.
	 */
	public String getVillName(){
		return "vill4";
	}
	

	/**
	 * @param container set the battle window of this container
	 * and get the  HP values, damage values and pictures of villain and hero. 
	 */
	public void villFight(Container container) {
		new chooseHero();
		new hpList();
		heroable hero = chooseHero.heroList.get(lair.heroIndex);
		
		@SuppressWarnings("serial")
		JPanel GImage = new JPanel() {  
			 protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(vill4.class.getResource("/res/battleBack.jpg"));  
				  Image img = icon.getImage();
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
             icon.getIconHeight(), icon.getImageObserver());  
			 }  
		};  
		
		@SuppressWarnings("serial")
		JPanel hpIcon1 = new JPanel() {
			 protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(vill4.class.getResource("/res/hpIcon.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
            icon.getIconHeight(), icon.getImageObserver());  
			 }  
		};
		hpIcon1.setBounds(50, 50, 50, 50);
		
		JPanel jpHeroHP = new JPanel();
		jpHeroHP.setBounds(100, 50, 100, 30);
		jpHeroHP.setOpaque(false);
		
		JLabel heroHp = new JLabel();
		heroHp.setText("HP: " + hpList.hp.get(lair.heroIndex));
		heroHp.setFont(new Font(null,Font.BOLD,20));
		heroHp.setForeground(Color.black);
		jpHeroHP.add(heroHp);
		
		@SuppressWarnings("serial")
		JPanel hpIcon2 = new JPanel() {
			protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(vill4.class.getResource("/res/hpIcon.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
          icon.getIconHeight(), icon.getImageObserver());  
			 }  
		};
		hpIcon2.setBounds(1100, 50, 50, 50);
		
		JPanel jpLairHP = new JPanel();
		jpLairHP.setBounds(980, 50, 100, 30);
		jpLairHP.setOpaque(false);
		
		JLabel villHp = new JLabel();
		villHp.setText("HP: 100");
		villHp.setFont(new Font(null,Font.BOLD,20));
		villHp.setForeground(Color.black);
		jpLairHP.add(villHp);
	
		@SuppressWarnings("serial")
		JPanel jpHero = new JPanel() {
			protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(vill4.class.getResource("/res/"+ hero.getName() +".png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
        icon.getIconHeight(), icon.getImageObserver()); 
			}
		};
		jpHero.setBounds(210, 630, 150, 250);
		
		@SuppressWarnings("serial")
		JPanel jpVill = new JPanel() {
			protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(vill4.class.getResource("/res/vill4.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
      icon.getIconHeight(), icon.getImageObserver()); 
			}
		};
		jpVill.setBounds(880, 370, 250, 500);
		
		JPanel GImage1 = new JPanel();
		ImageIcon icon = new ImageIcon(vill4.class.getResource("/res/blood.gif"));
		
		JLabel jlBack = new JLabel();
		GImage1.setOpaque(false);
		GImage1.setBounds(800, 500, 210, 210);
		GImage1.setVisible(false);
		jlBack.setIcon(icon);
		jlBack.setOpaque(false);
		GImage1.add(jlBack);
		container.add(GImage1);
		
		JPanel GImage2 = new JPanel();
		GImage2.setOpaque(false);
		GImage2.setBounds(280, 600, 210, 210);
		GImage2.setVisible(false);
		ImageIcon icon1 = new ImageIcon(vill4.class.getResource("/res/blood.gif"));
		
		JLabel jlBack1 = new JLabel();
		jlBack1.setIcon(icon1);
		jlBack1.setOpaque(false);
		GImage2.add(jlBack1);
		container.add(GImage2);
		
		@SuppressWarnings("serial")
		JPanel taunt = new JPanel() {
			protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(vill4.class.getResource("/res/taunt.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
           icon.getIconHeight(), icon.getImageObserver());  
			 }  
		};
		taunt.setBounds(600,300,200,200);
		taunt.setOpaque(false);
		container.add(taunt);
		
		JPanel jptalk = new JPanel();
		jptalk.setBounds(600,360,200,200);
		jptalk.setOpaque(false);
		JLabel talk = new JLabel();
		talk.setText(vill4.taunt);
        talk.setFont(new Font(null,Font.BOLD,18));
        talk.setForeground(Color.WHITE);
        jptalk.add(talk);
		container.add(jptalk);
		
		
		new fuctionPaperSiccorsRockVill4().addPaper(container, hero, villHp, heroHp, 
				jpVill, jpHero, jpLairHP, jpHeroHP, hpIcon1, hpIcon2, 
				lair.heroIndex,GImage1,GImage2,taunt,jptalk,lair.thisVill,lair.villIndex,GImage);
		
		container.add(jpHero);
		container.add(jpVill);
		container.add(jpLairHP);
		container.add(jpHeroHP);
		container.add(hpIcon1);
		container.add(hpIcon2);
		container.add(GImage);
	}
}
