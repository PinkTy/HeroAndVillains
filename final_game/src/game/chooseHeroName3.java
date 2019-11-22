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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 
 * @author Cai & Lee
 *Player chooses his third hero name,
 *this class opens the window, which player can enter the name of first hero
 */
public class chooseHeroName3 {
	public static ArrayList<String> heroNameList3 = new ArrayList<String>();//this list contains all the names of heroes.
	private JPanel GImage;//the background of this window
	private String heroName;//the name of this hero.
	
	/**
	 *Constructor 
	 *Get the heroNameList
	 */
	chooseHeroName3(){
		new chooseHeroName2();
		heroNameList3 = chooseHeroName2.heroNameList2;
		}
	
	/**
	 * 
	 * @param con
	 * create the window, which player can enter the name of first hero 
	 */
	public void addName(final Container con) {
		GImage = new JPanel() {  
			  private static final long serialVersionUID = 1L;

			  protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(chooseHeroName3.class.getResource("/res/5.jpg"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
              icon.getIconHeight(), icon.getImageObserver());  
      }  
		};  
		GImage.setBounds(0, 0, 1280, 960);
		
		JPanel jpWarningLabel = new JPanel();
		jpWarningLabel.setBounds(65, 370, 1000,30);
		jpWarningLabel.setOpaque(false);

		JLabel warningLabel = new JLabel();
		warningLabel.setText("ERROR: No two heroes can share the same name. Pleas reenter the name of your Hero 3");
		warningLabel.setForeground(Color.red);
		warningLabel.setFont(new Font(null,Font.PLAIN,20));
		jpWarningLabel.add(warningLabel);
		jpWarningLabel.setVisible(false);
		con.add(jpWarningLabel);
		
		JPanel jpWarningLabel2 = new JPanel();
		jpWarningLabel2.setBounds(90, 370, 1000,30);
		jpWarningLabel2.setOpaque(false);
		
		JLabel warningLabel2 = new JLabel();
		warningLabel2.setText("ERROR: The team name needs to be between two and ten characters long. Pleas reenter the hero name.");
		warningLabel2.setForeground(Color.red);
		warningLabel2.setFont(new Font(null,Font.BOLD,15));
		jpWarningLabel2.add(warningLabel2);
		jpWarningLabel2.setVisible(false);
		con.add(jpWarningLabel2);
		
		JPanel jpLabel = new JPanel();
		jpLabel.setBounds(0, 310, 900,70);
		jpLabel.setOpaque(false);

		JLabel questionLabel = new JLabel();
		questionLabel.setText("Pleas enter the name of your Hero3: ");
		questionLabel.setForeground(Color.white);
		questionLabel.setFont(new Font(null,Font.BOLD,25));
					
		JPanel jpField = new JPanel();
		jpField.setBounds(630, 310, 600,70);
		jpField.setOpaque(false);
	
		JTextField textField = new JTextField(20);
		textField.setFont(new Font(null, Font.PLAIN, 20));
			        
		JPanel jpButton = new JPanel();
		jpButton.setBounds(260, 430, 600,80);
		jpButton.setOpaque(false);
		
		JButton nextButton = new JButton(">>NEXT");
		nextButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				heroName = textField.getText();
				heroName = heroName.replaceAll(" ", "");//replace all the spaces
				//test the length(2 to 10 characters) of name.
				if(heroName.length() < 2 || heroName.length() > 10)	{
					textField.setText("");
					jpWarningLabel2.setVisible(true);
					jpWarningLabel.setVisible(false);
					}
				//the hero name cannot be same, if this is same, shows the error.
				else if(heroNameList3.contains(heroName)){
					textField.setText("");
					jpWarningLabel.setVisible(true);
					jpWarningLabel2.setVisible(false);
					}
				
				else if(!heroNameList3.contains(heroName)){
					heroNameList3.add(heroName);
					jpLabel.setVisible(false);
					jpField.setVisible(false);
					jpButton.setVisible(false);	
					jpWarningLabel.setVisible(false);
					jpWarningLabel2.setVisible(false);
					GImage.setVisible(false);
					//open the choosing hero menu.
					new chooseHero().addHero(con);
						}
					}
				});
		
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				heroName = textField.getText();
				heroName = heroName.replaceAll(" ", "");
				//player can use ENTER button, which is same as next button.
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					if(heroName.length() < 2 || heroName.length() > 10)	{
						textField.setText("");
						jpWarningLabel2.setVisible(true);
						jpWarningLabel.setVisible(false);
						}
					else if(heroNameList3.contains(heroName)){
						textField.setText("");
						jpWarningLabel.setVisible(true);
						jpWarningLabel2.setVisible(false);
						}
					
					else if(!heroNameList3.contains(heroName)){
						heroNameList3.add(heroName);
						jpLabel.setVisible(false);
						jpField.setVisible(false);
						jpButton.setVisible(false);	
						jpWarningLabel.setVisible(false);
						jpWarningLabel2.setVisible(false);
						GImage.setVisible(false);
						new chooseHero().addHero(con);
					}
				}
			}
		});
		
		nextButton.setOpaque(false);			
		nextButton.setBackground(Color.black);
		nextButton.setForeground(Color.white);
		nextButton.setFont(new Font(null,Font.BOLD,50));
		nextButton.setFocusPainted(false);
		
		jpLabel.add(questionLabel);
		jpField.add(textField);
		jpButton.add(nextButton);
			        
		con.add(jpLabel);
		con.add(jpField);
		con.add(jpButton);
		con.add(GImage);
			
	}
}
