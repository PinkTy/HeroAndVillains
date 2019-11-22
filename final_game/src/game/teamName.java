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

import javax.swing.*;

/**
 * 
 * @author Cai & Lee
 *Player enter the team name,
 *this class opens the window, which player can enter the name of team
 */
public class teamName{
	public static String chooseTeamName;//the name of this team
	JPanel GImage;//background of this window.
	
	/**
	 * 
	 * @param con
	 * create the window, which player can enter the name of team.
	 */
	@SuppressWarnings("serial")
	public void addTeamName(final Container con){
		GImage = new JPanel() {  
			protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(teamName.class.getResource("/res/5.jpg"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
                        icon.getIconHeight(), icon.getImageObserver());  
                }  
		};  
		GImage.setBounds(0, 0, 1280, 960);
		
		JPanel jpWarningLabel = new JPanel();
		jpWarningLabel.setBounds(70, 370, 1000,30);
		jpWarningLabel.setOpaque(false);
		
		JLabel warningLabel = new JLabel();
		warningLabel.setText("ERROR: The team name needs to be between two and ten characters long. Pleas reenter the team name.");
		warningLabel.setForeground(Color.red);
		warningLabel.setFont(new Font(null,Font.BOLD,15));
		jpWarningLabel.add(warningLabel);
		jpWarningLabel.setVisible(false);
		con.add(jpWarningLabel);
		
		JPanel jpLabel = new JPanel();
		jpLabel.setBounds(112, 320, 600,70);
		jpLabel.setOpaque(false);
		
		JLabel questionLabel = new JLabel();
		questionLabel.setText("Please enter the name of your team: ");
		questionLabel.setForeground(Color.white);
		questionLabel.setFont(new Font(null,Font.BOLD,22));
		
		JPanel jpField = new JPanel();
		jpField.setBounds(532, 318, 600,70);
		jpField.setOpaque(false);
		
		JTextField textField = new JTextField(18);
		textField.setFont(new Font(null, Font.PLAIN, 20));
        
		JPanel jpButton = new JPanel();
		jpButton.setBounds(260, 430, 600,80);
		jpButton.setOpaque(false);
		
		JButton nextButton = new JButton(">>NEXT");
		nextButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				chooseTeamName = textField.getText();
				chooseTeamName = chooseTeamName.replaceAll(" ", "");//replace all the spaces
				//test the length(2 to 10 characters) of name.
				if(2 <= chooseTeamName.length() && chooseTeamName.length() <= 10) {
					jpLabel.setVisible(false);
					jpField.setVisible(false);
					jpButton.setVisible(false);
					GImage.setVisible(false);
					jpWarningLabel.setVisible(false);
					new cityNumber().chooseCityNumber(con);
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
				chooseTeamName = textField.getText();
				chooseTeamName = chooseTeamName.replaceAll(" ", "");
				//player can use ENTER button, which is same as next button.
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					if(2 <= chooseTeamName.length() && chooseTeamName.length() <= 10) {
						jpLabel.setVisible(false);
						jpField.setVisible(false);
						jpButton.setVisible(false);
						GImage.setVisible(false);
						jpWarningLabel.setVisible(false);
						new cityNumber().chooseCityNumber(con);
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