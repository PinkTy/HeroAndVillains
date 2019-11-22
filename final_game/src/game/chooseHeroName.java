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
import javax.swing.*;

/**
 * 
 * @author Cai & Lee
 *Player chooses his first hero name,
 *this class opens the window, which player can enter the name of first hero
 */
public class chooseHeroName {
	private int heroNumber;//get the number of heroes which player has chosen before.
	private String heroName;//the name of this hero.
	public static ArrayList<String> heroNameList = new ArrayList<String>();//this list contains all the names of heroes.
	private JPanel GImage;//the background of this 
	
	/**
	 * Constructor 
	 * the initial value of heroNumber is the number of heroes.
	 */
	public chooseHeroName(){
		new heroNumber();
		this.heroNumber = game.heroNumber.numberOfHero;
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
				  ImageIcon icon = new ImageIcon(chooseHeroName.class.getResource("/res/5.jpg"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
                  icon.getIconHeight(), icon.getImageObserver());  
          }  
		};  
		GImage.setBounds(0, 0, 1280, 960);
		
		JPanel jpWarningLabel = new JPanel();
		jpWarningLabel.setBounds(90, 370, 1000,30);
		jpWarningLabel.setOpaque(false);
		
		JLabel warningLabel = new JLabel();
		warningLabel.setText("ERROR: The team name needs to be between two and ten characters long. Pleas reenter the hero name.");
		warningLabel.setForeground(Color.red);
		warningLabel.setFont(new Font(null,Font.BOLD,15));
		jpWarningLabel.add(warningLabel);
		jpWarningLabel.setVisible(false);
		con.add(jpWarningLabel);
		
		JPanel jpLabel = new JPanel();
		jpLabel.setBounds(0, 310, 900,70);
		jpLabel.setOpaque(false);
					
		JLabel questionLabel = new JLabel();
		questionLabel.setText("Pleas enter the name of your Hero1: ");
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
				if(2 <= heroName.length() && heroName.length() <= 10) {
					heroNameList.add(heroName);
					jpLabel.setVisible(false);
					jpField.setVisible(false);
					jpButton.setVisible(false);
					jpWarningLabel.setVisible(false);
					GImage.setVisible(false);
					//if the number of the heroes is not 1, open the second choosing menu.
					if(heroNumber != 1) {
						new chooseHeroName2().addName(con);
							}
					else {
						new chooseHero().addHero(con);
					}
					}
				else {
					textField.setText("");
					jpWarningLabel.setVisible(true);
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
					if(2 <= heroName.length() && heroName.length() <= 10) {			
						heroNameList.add(heroName);
						jpLabel.setVisible(false);
						jpField.setVisible(false);
						jpButton.setVisible(false);
						jpWarningLabel.setVisible(false);
						GImage.setVisible(false);
						if(heroNumber != 1) {
							new chooseHeroName2().addName(con);
								}
						else {
							new chooseHero().addHero(con);
						}
						}
					else {
						textField.setText("");
						jpWarningLabel.setVisible(true);
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
