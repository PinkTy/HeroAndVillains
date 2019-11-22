package game;

import javax.swing.*;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.*;

/**
 * 
 * @author Cai & Lee
 *Player can choose the number of city.
 *This class opens the window, which player can choose 3 to 6 different cities.
 */
public class cityNumber {
	public static int numberOfCity = 0;//the initial value of number is 0.
	private JPanel GImage;//the background of this window
	
	/**
	 * 
	 * @param con
	 * create the window, which player can choose different number of cities.
	 */
	public void chooseCityNumber(final Container con) {
		GImage = new JPanel() {  
			  private static final long serialVersionUID = 1L;

			  protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(cityNumber.class.getResource("/res/5.jpg"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
                      icon.getIconHeight(), icon.getImageObserver());  
              }  
		};  
		GImage.setBounds(0, 0, 1280, 960);
		
		JPanel jpLabel = new JPanel();
		jpLabel.setBounds(125, 310, 900,70);
		jpLabel.setOpaque(false);
		
		JLabel questionLabel = new JLabel();
		questionLabel.setText("Please choose the number of Cities(3~6): ");
		questionLabel.setForeground(Color.white);
		questionLabel.setFont(new Font(null,Font.BOLD,30));
		
		JPanel jpButton3 = new JPanel();
		jpButton3.setBounds(375, 410, 70,100);
		jpButton3.setOpaque(false);
		
		JPanel jpButton4 = new JPanel();
		jpButton4.setBounds(475, 410, 70,100);
		jpButton4.setOpaque(false);
		
		JPanel jpButton5 = new JPanel();
		jpButton5.setBounds(575, 410, 70,100);
		jpButton5.setOpaque(false);

		JPanel jpButton6 = new JPanel();
		jpButton6.setBounds(675, 410, 70,100);
		jpButton6.setOpaque(false);

		JButton cityButton3 = new JButton("3");
		cityButton3.setOpaque(false);
		cityButton3.setBackground(Color.black);
		cityButton3.setForeground(Color.white);
		cityButton3.setFont(new Font(null,Font.BOLD,50));
		cityButton3.setFocusPainted(false);
		
		JButton cityButton4 = new JButton("4");
		cityButton4.setOpaque(false);
		cityButton4.setBackground(Color.black);
		cityButton4.setForeground(Color.white);
		cityButton4.setFont(new Font(null,Font.BOLD,50));
		cityButton4.setFocusPainted(false);
		
		JButton cityButton5 = new JButton("5");
		cityButton5.setOpaque(false);
		cityButton5.setBackground(Color.black);
		cityButton5.setForeground(Color.white);
		cityButton5.setFont(new Font(null,Font.BOLD,50));
		cityButton5.setFocusPainted(false);
		
		JButton cityButton6 = new JButton("6");
		cityButton6.setOpaque(false);
		cityButton6.setBackground(Color.black);
		cityButton6.setForeground(Color.white);
		cityButton6.setFont(new Font(null,Font.BOLD,50));
		cityButton6.setFocusPainted(false);
		
		cityButton3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numberOfCity = 3;
				jpLabel.setVisible(false);
				jpButton3.setVisible(false);
				jpButton4.setVisible(false);
				jpButton5.setVisible(false);
				jpButton6.setVisible(false);
				GImage.setVisible(false);
				new heroNumber().chooseHeroNumber(con);
			}
		});
		
		cityButton4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numberOfCity = 4;
				jpLabel.setVisible(false);
				jpButton3.setVisible(false);
				jpButton4.setVisible(false);
				jpButton5.setVisible(false);
				jpButton6.setVisible(false);
				GImage.setVisible(false);
				new heroNumber().chooseHeroNumber(con);
			}
		});
		
		cityButton5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numberOfCity = 5;
				jpLabel.setVisible(false);
				jpButton3.setVisible(false);
				jpButton4.setVisible(false);
				jpButton5.setVisible(false);
				jpButton6.setVisible(false);
				GImage.setVisible(false);
				new heroNumber().chooseHeroNumber(con);
			}
		});
		
		cityButton6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numberOfCity = 6;
				jpLabel.setVisible(false);
				jpButton3.setVisible(false);
				jpButton4.setVisible(false);
				jpButton5.setVisible(false);
				jpButton6.setVisible(false);
				GImage.setVisible(false);
				new heroNumber().chooseHeroNumber(con);
			}
		});
		
		jpLabel.add(questionLabel);
		jpButton3.add(cityButton3);
		jpButton4.add(cityButton4);
		jpButton5.add(cityButton5);
		jpButton6.add(cityButton6);
		
		con.add(jpLabel);
		con.add(jpButton3);
		con.add(jpButton4);
		con.add(jpButton5);
		con.add(jpButton6);
		con.add(GImage);
	}
	
	/**
	 * 
	 * @return the number of city, which hero has chosen.
	 */
	public int getCityNumber() {
		return numberOfCity;
	}
}	
