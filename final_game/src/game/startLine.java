package game;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * 
 * @author Cai & Lee
 * this class shows all the name of heroes and team name,
 * press GO, player can enter main game.
 */
public class startLine {
	
	/**
	 * 
	 * @param container
	 * create the window, which shows the current team name and hero names
	 */
	public void addStratLine(Container con) {
		JPanel GImage = new JPanel();
		GImage.setOpaque(false);
		
		ImageIcon icon = new ImageIcon(startLine.class.getResource("/res/2.gif"));
		
		JLabel jlBack = new JLabel();
		jlBack.setIcon(icon);
		jlBack.setOpaque(false);
		GImage.add(jlBack);
		
		JPanel jplines = new JPanel();
		jplines.setBounds(50,300,1200,900);
		
		String result = "";
		new teamName();
		result += "<html>The team " + teamName.chooseTeamName + " with:<br/>";
		new chooseHeroName();
		for(String name:chooseHeroName.heroNameList) {
			result += name + " ";
		}
		result += "start their great advanture to defend the city.<br/>City must survive.<html>";
		
		JLabel lines = new JLabel();
		lines.setText(result);
		lines.setForeground(Color.white);
		lines.setFont(new Font(null,Font.BOLD,25));
		jplines.add(lines);
		jplines.setOpaque(false);
		con.add(jplines);
		
		JPanel jpLabel = new JPanel();
		jpLabel.setBounds(800, 800, 300, 80);
		jpLabel.setOpaque(false);
		
		JButton enter = new JButton();
		enter.setForeground(Color.white);
		enter.setText("GO...");
		enter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//Initialize the villList
				new villList();
				new totalMoney().setMoney();
				jplines.setVisible(false);
				jpLabel.setVisible(false);
				GImage.setVisible(false);
				new homeBase().addHomeBase(con);
				}	
			});
		
		enter.setOpaque(false);
		enter.setBackground(Color.black);
		enter.setForeground(Color.white);
		enter.setFont(new Font(null,Font.BOLD,25));
		enter.setFocusPainted(false);
		
		jpLabel.add(enter);
		
		con.add(jpLabel);
		con.add(GImage);
	}

}
