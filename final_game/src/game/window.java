package game;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * 
 * @author Cai & Lee
 * This class is the start window of whole game, after
 * player press START button, it starts to count the 
 * time.
 *
 */
public class window{
	JFrame jf;
	JPanel titlePanel, starterPanel;
	JLabel titleLabel, jlBack;
	JButton startButton;
	Container container;
	JPanel GImage;
	JPanel jpBack;
	JPanel GImage2;
	static Long time;
	
	/**
	 * Constructor
	 * create the initial window.
	 */
	window() {
		time = System.currentTimeMillis();
		
		jf = new JFrame("Demo Window");          
		jf.setSize(1205, 960);                       
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		container = jf.getContentPane();
		
		GImage = new JPanel();
		GImage.setOpaque(false);
		GImage.setBounds(0, 0, 1280, 960);
		
		ImageIcon icon = new ImageIcon(window.class.getResource("/res/2.gif"));
		
		jlBack = new JLabel();
		jlBack.setIcon(icon);
		jlBack.setOpaque(false);
		GImage.add(jlBack);

		titlePanel = new JPanel();
		titlePanel.setBounds(240, 270, 650, 120);
		titlePanel.setOpaque(false);

		titleLabel = new JLabel();
		titleLabel.setText("Heroes and Villains");
		titleLabel.setForeground(Color.white);
		titleLabel.setFont(new Font(null,Font.BOLD,45));
		
		starterPanel = new JPanel();
		starterPanel.setBounds(465, 450, 200, 80);
		starterPanel.setOpaque(false);
		
		startButton = new JButton("START");
		startButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				chooseCityNumber();
			}
		});
		startButton.setOpaque(false);
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		startButton.setFont(new Font(null,Font.BOLD,50));
		startButton.setFocusPainted(false);
		titlePanel.add(titleLabel);
		starterPanel.add(startButton);
		container.add(titlePanel);
		container.add(starterPanel);
		container.add(GImage);
		jf.setResizable(false);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
	
	}
	
	public void chooseCityNumber() {
		titlePanel.setVisible(false);
		starterPanel.setVisible(false);
		GImage.setVisible(false);
		new teamName().addTeamName(container);
	}
}
