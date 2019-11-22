package game;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author Cai & Lee
 *	This class is the home base in each city and shows the status of each hero, player can press M button to 
 * open map, player can only go to other places form home base.
 */
public class homeBase {
	
	/**
	 * 
	 * @param con 
	 * crate the home base window, player can use right left button to move the character.
	 */
	public void addHomeBase(Container con) {
		@SuppressWarnings("serial")
		JPanel GImage = new JPanel() {  
			 protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(homeBase.class.getResource("/res/motherBase.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
              icon.getIconHeight(), icon.getImageObserver());  
			 }  
		};  
		GImage.setBounds(0, 0, 1280, 960);
		
		@SuppressWarnings("serial")
		JPanel jpPerson = new JPanel() {
			protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(homeBase.class.getResource("/res/homeperson.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
            icon.getIconHeight(), icon.getImageObserver());  
			 }  
		};
		jpPerson.setBounds(100, 570,200,200);
		
		JPanel mapNotice = new JPanel();
		mapNotice.setBounds(380,300,500,60);
		mapNotice.setOpaque(false);
		
		JLabel notice = new JLabel();
		if(randomEvents.notice == null) {
			notice.setText("Press M to open Map.");
		}
		else {
			notice.setText(randomEvents.notice);
		}
		notice.setForeground(Color.white);
		notice.setFont(new Font(null,Font.BOLD,20));
		mapNotice.add(notice);
		
		JPanel jpHiddenbtn = new JPanel();
		jpHiddenbtn.setBounds(50,50,0,0);
		JButton hiddenbtn = new JButton();
		hiddenbtn.setFocusable(true);
		
		JPanel heroStatus = new JPanel();
		heroStatus.setBounds(70,718,1020,200);
		heroStatus.setOpaque(false);
		
		JLabel statusLine = new JLabel();
		statusLine.setText(new heroStatus().toString());
		statusLine.setForeground(Color.white);
		statusLine.setFont(new Font(null,Font.BOLD,25));
		heroStatus.add(statusLine);
		
		@SuppressWarnings("serial")
		JPanel icon1 = new JPanel() {
			protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(homeBase.class.getResource("/res/icon_71.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
           icon.getIconHeight(), icon.getImageObserver());  
			 }  
		};
		icon1.setBounds(45,725,35,35);
		
		@SuppressWarnings("serial")
		JPanel icon2 = new JPanel() {
			protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(homeBase.class.getResource("/res/icon_72.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
         icon.getIconHeight(), icon.getImageObserver());  
			 }  
		};
		icon2.setBounds(45,795,35,35);
		
		@SuppressWarnings("serial")
		JPanel icon3 = new JPanel() {
			protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(homeBase.class.getResource("/res/icon_73.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
         icon.getIconHeight(), icon.getImageObserver());  
			 }  
		};
		icon3.setBounds(45,865,35,35);
		
		hiddenbtn.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				 if (e.getKeyCode() == KeyEvent.VK_RIGHT && jpPerson.getLocation().x < 450) {
					 jpPerson.setLocation(jpPerson.getLocation().x + 10,jpPerson.getLocation().y);
		           	}
				 if (e.getKeyCode() == KeyEvent.VK_LEFT && jpPerson.getLocation().x > 50) {
					 jpPerson.setLocation(jpPerson.getLocation().x-10,jpPerson.getLocation().y);
		           	}
				 if(e.getKeyCode() == KeyEvent.VK_M) {
					 	jpPerson.setVisible(false);
					 	mapNotice.setVisible(false);
						GImage.setVisible(false);
						jpHiddenbtn.setVisible(false);
						icon1.setVisible(false);
						icon2.setVisible(false);
						icon3.setVisible(false);
						heroStatus.setVisible(false);
						new mapOpen().addMap(con);
					}
				}
			});
		jpHiddenbtn.add(hiddenbtn);
		
		con.add(icon1);
		con.add(icon2);
		con.add(icon3);
		con.add(heroStatus);
		con.add(mapNotice);
		con.add(jpHiddenbtn);
		con.add(jpPerson);
		con.add(GImage);
		hiddenbtn.requestFocus();
		
	}
}	
