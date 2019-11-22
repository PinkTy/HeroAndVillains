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
 * this class shows the wining window, all the 
 * team member and playing time.
 */
public class youWin {
	
	/**
	 * 
	 * @param con
	 * create the wining window
	 */
	public void addWin(Container container) {
		new chooseHeroName();
		JPanel GImage = new JPanel();
		GImage.setBackground(Color.black);
		GImage.setBounds(0, 0, 1280, 960);
			
		@SuppressWarnings("serial")
		JPanel win = new JPanel() {
			protected void paintComponent(Graphics g) {  
				ImageIcon icon = new ImageIcon(youWin.class.getResource("/res/youWin.jpg"));  
				Image img = icon.getImage();  
					  g.drawImage(img, 0, 0, icon.getIconWidth(),  
	            icon.getIconHeight(), icon.getImageObserver());  
				}  
			};
		win.setBounds(280,200,606,208);
			
		JPanel teamName = new JPanel();
		teamName.setBounds(270, 500, 600, 80); 
		teamName.setOpaque(false);
		
		String result = "";
			
		JLabel name = new JLabel();
		for(String i:chooseHeroName.heroNameList) {
				result += i + ", ";
		}
		result += "overcame the Villians.";
		name.setText(result);
		name.setFont(new Font(null,Font.BOLD,30));
		teamName.add(name);
			
		JPanel totalTime = new JPanel();
		totalTime.setBounds(270, 600, 600, 80); 
		totalTime.setOpaque(false);
		//Get the current time and calculate the playing time.	
		long totalUse = (System.currentTimeMillis() - window.time)/1000;
			
		JLabel time = new JLabel();
		time.setText("Total use " + totalUse + "s");
		time.setFont(new Font(null,Font.BOLD,40));
		totalTime.add(time);
			
		container.add(teamName);
		container.add(totalTime);
		container.add(win);
		container.add(GImage);
	}
}
