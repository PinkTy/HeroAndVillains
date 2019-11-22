package game;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author Cai & Lee
 *Player can choose the number of heroes.
 *This class opens the window, which player can choose 1 to 3 different hero numbers
 */
public class heroNumber{
	public static int numberOfHero = 0;//the initial value of number is 0.
	JPanel GImage;//the background of this window
	
	/**
	 * 
	 * @param con
	 * create the window, which player can choose different number of heroes.
	 */
	public void chooseHeroNumber(final Container con) {
		GImage = new JPanel() {  
			  private static final long serialVersionUID = 1L;

			  protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(heroNumber.class.getResource("/res/5.jpg"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
                    icon.getIconHeight(), icon.getImageObserver());  
            }  
		};  
		GImage.setBounds(0, 0, 1280, 960);
		
		JPanel jpLabel = new JPanel();
		jpLabel.setBounds(10, 310, 1200,70);
		jpLabel.setOpaque(false);
		
		JLabel questionLabel = new JLabel();
		new teamName();
		questionLabel.setText("Please choose the number of Heroes(1~3) for your " + teamName.chooseTeamName+": ");
		questionLabel.setForeground(Color.white);
		questionLabel.setFont(new Font(null,Font.BOLD,25));
		
		JPanel jpButton1 = new JPanel();
		jpButton1.setBounds(428, 410, 70,100);
		jpButton1.setOpaque(false);
		
		JPanel jpButton2 = new JPanel();
		jpButton2.setBounds(528, 410, 70,100);
		jpButton2.setOpaque(false);
		
		JPanel jpButton3 = new JPanel();
		jpButton3.setBounds(628, 410, 70,100);
		jpButton3.setOpaque(false);
		
		JButton heroButton1 = new JButton("1");
		heroButton1.setOpaque(false);
		heroButton1.setBackground(Color.black);
		heroButton1.setForeground(Color.white);
		heroButton1.setFont(new Font("Mistral",Font.BOLD,50));
		heroButton1.setFocusPainted(false);
		
		JButton heroButton2 = new JButton("2");
		heroButton2.setOpaque(false);
		heroButton2.setBackground(Color.black);
		heroButton2.setForeground(Color.white);
		heroButton2.setFont(new Font("Mistral",Font.BOLD,50));
		heroButton2.setFocusPainted(false);
		
		JButton heroButton3 = new JButton("3");
		heroButton3.setOpaque(false);
		heroButton3.setBackground(Color.black);
		heroButton3.setForeground(Color.white);
		heroButton3.setFont(new Font("Mistral",Font.BOLD,50));
		heroButton3.setFocusPainted(false);
		
		heroButton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numberOfHero = 1;//set number of hero to be 1
				jpLabel.setVisible(false);
				jpButton1.setVisible(false);
				jpButton2.setVisible(false);
				jpButton3.setVisible(false);
				GImage.setVisible(false);
				new chooseHeroName().addName(con);
				
			}
		});
		
		heroButton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numberOfHero = 2;//set number of hero to be 2
				jpLabel.setVisible(false);
				jpButton1.setVisible(false);
				jpButton2.setVisible(false);
				jpButton3.setVisible(false);
				GImage.setVisible(false);
				new chooseHeroName().addName(con);
				
			}
		});
		
		heroButton3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				numberOfHero = 3;//set number of hero to be 3
				jpLabel.setVisible(false);
				jpButton1.setVisible(false);
				jpButton2.setVisible(false);
				jpButton3.setVisible(false);
				GImage.setVisible(false);
				new chooseHeroName().addName(con);
				
			}
		});
			
		
		jpLabel.add(questionLabel);
		jpButton1.add(heroButton1);
		jpButton2.add(heroButton2);
		jpButton3.add(heroButton3);
		
		con.add(jpLabel);
		con.add(jpButton1);
		con.add(jpButton2);
		con.add(jpButton3);
		con.add(GImage);
		
	}
	
	public int getHeroNumber() {
		return numberOfHero;
	}
}
