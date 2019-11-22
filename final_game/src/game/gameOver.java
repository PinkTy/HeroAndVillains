package game;

import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author Cai & Lee
 * this class shows the game over window, if player looses all the heroes
 */
public class gameOver {
	
	/**
	 * 
	 * @param container
	 * create the game over window
	 */
	public void addGameOver(Container container) {
		JPanel jp = new JPanel();
		jp.setBounds(0, 0, 1280, 960);
		jp.setBackground(Color.black);
		
		JPanel GImage = new JPanel();
		GImage.setOpaque(false);
		GImage.setBounds(250, 150, 700, 700);
		
		ImageIcon icon = new ImageIcon(gameOver.class.getResource("/res/gameover.gif"));
		
		JLabel jlBack = new JLabel();
		jlBack.setIcon(icon);
		jlBack.setOpaque(false);
		GImage.add(jlBack);
		
		container.add(GImage);
		container.add(jp);
		
	}
	
}
