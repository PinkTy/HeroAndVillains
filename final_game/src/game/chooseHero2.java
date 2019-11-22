package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * 
 * @author Cai & Lee
 *Player chooses his second hero with one specific ability,
 *this class opens the window, which contains every heroes.
 */
public class chooseHero2{
	private JPanel GImage;//the background of window
	
	/**
	 * 
	 * @param con, create the window, which contains every heroes. 
	 */
	@SuppressWarnings("serial")
	public void addHero(final Container con) {
		
		JPanel jpBox = new JPanel();
		jpBox.setBounds(554, 220, 350, 220);
		jpBox.setOpaque(false);
		
		JLabel aBox = new JLabel();
		aBox.setOpaque(false);
		
		jpBox.add(aBox);
		con.add(jpBox);
		
		JPanel jpLabel = new JPanel();
		jpLabel.setBounds(100, 195, 600,70);
		jpLabel.setOpaque(false);
		
		JLabel questionLabel = new JLabel();
		new chooseHeroName();
		questionLabel.setText("Which hero you want for " + chooseHeroName.heroNameList.get(1) + ": ");
		questionLabel.setForeground(Color.white);
		questionLabel.setFont(new Font(null,Font.BOLD,22));
		jpLabel.add(questionLabel);
		con.add(jpLabel);
		
		GImage = new JPanel() {  
			 protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(chooseHero2.class.getResource("/res/18.jpg"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
                icon.getIconHeight(), icon.getImageObserver());  
			 }  
		};  
		GImage.setBounds(0, 0, 1280, 960);
		
		JPanel hero1 = new JPanel() {
			protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(chooseHero2.class.getResource("/res/13.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
              icon.getIconHeight(), icon.getImageObserver());  
			  }  
		};
		
		hero1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				aBox.setText(new thief().toString());
				aBox.setForeground(Color.white);
				aBox.setFont(new Font(null,Font.BOLD,20));
			}
		});
		hero1.setBounds(171, 308, 149, 165);
		
		JPanel jpchoose = new JPanel();
		jpchoose.setBounds(110, 430, 200,40);
		jpchoose.setOpaque(false);
		
		JButton choose = new JButton("choose");
		
		
		choose.setOpaque(false);
		choose.setBackground(Color.black);
		choose.setForeground(Color.white);
		choose.setFont(new Font(null,Font.BOLD,15));
		choose.setFocusPainted(false);
		
		jpchoose.add(choose);
		con.add(jpchoose);
		con.add(hero1);
		
		JPanel hero2 = new JPanel() {
			 protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(chooseHero2.class.getResource("/res/10.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
             icon.getIconHeight(), icon.getImageObserver());  
			  }  
		};
		hero2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				aBox.setText(new richMan().toString());
				aBox.setForeground(Color.white);
				aBox.setFont(new Font(null,Font.BOLD,20));
			}
		});
		hero2.setBounds(384, 268, 149, 165);
		
		JPanel jpchoose2 = new JPanel();
		jpchoose2.setBounds(360, 425, 200,40);
		jpchoose2.setOpaque(false);
		
		JButton choose2 = new JButton("choose");
		choose2.setOpaque(false);
		choose2.setBackground(Color.black);
		choose2.setForeground(Color.white);
		choose2.setFont(new Font(null,Font.BOLD,15));
		choose2.setFocusPainted(false);
		
		jpchoose2.add(choose2);
		con.add(jpchoose2);
		con.add(hero2);
		
		JPanel hero3 = new JPanel() {
			 protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(chooseHero2.class.getResource("/res/14.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
            icon.getIconHeight(), icon.getImageObserver());  
			  }  
		};
		hero3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				aBox.setText(new sailor().toString());
				aBox.setForeground(Color.white);
				aBox.setFont(new Font(null,Font.BOLD,20));
			}
		});
		hero3.setBounds(151, 457, 149, 165);
		
		JPanel jpchoose3 = new JPanel();
		jpchoose3.setBounds(110, 615, 200,40);
		jpchoose3.setOpaque(false);
		JButton choose3 = new JButton("choose");
		choose3.setOpaque(false);
		choose3.setBackground(Color.black);
		choose3.setForeground(Color.white);
		choose3.setFont(new Font(null,Font.BOLD,15));
		choose3.setFocusPainted(false);
		
		jpchoose3.add(choose3);
		con.add(jpchoose3);
		con.add(hero3);
		
		JPanel hero4 = new JPanel() {
			protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(chooseHero2.class.getResource("/res/16.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
          icon.getIconHeight(), icon.getImageObserver());  
			  }  
		};
		hero4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				aBox.setText(new soldier().toString());
				aBox.setForeground(Color.white);
				aBox.setFont(new Font(null,Font.BOLD,20));
			}
		});
		hero4.setBounds(414, 462, 149, 165);
		
		JPanel jpchoose4 = new JPanel();
		jpchoose4.setBounds(360, 615, 200,40);
		jpchoose4.setOpaque(false);
		JButton choose4 = new JButton("choose");
		choose4.setOpaque(false);
		choose4.setBackground(Color.black);
		choose4.setForeground(Color.white);
		choose4.setFont(new Font(null,Font.BOLD,15));
		choose4.setFocusPainted(false);
		
		jpchoose4.add(choose4);
		con.add(jpchoose4);
		con.add(hero4);
		
		JPanel hero5 = new JPanel() {
			protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(chooseHero2.class.getResource("/res/15.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
        icon.getIconHeight(), icon.getImageObserver());  
			  }  
		};
		hero5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				aBox.setText(new tailer().toString());
				aBox.setForeground(Color.white);
				aBox.setFont(new Font(null,Font.BOLD,20));
			}
		});
		hero5.setBounds(602, 462, 149, 165);
		
		JPanel jpchoose5 = new JPanel();
		jpchoose5.setBounds(580, 615, 200,40);
		jpchoose5.setOpaque(false);
		JButton choose5 = new JButton("choose");
		choose5.setOpaque(false);
		choose5.setBackground(Color.black);
		choose5.setForeground(Color.white);
		choose5.setFont(new Font(null,Font.BOLD,15));
		choose5.setFocusPainted(false);
		
		jpchoose5.add(choose5);
		con.add(jpchoose5);
		con.add(hero5);
		
		JPanel hero6 = new JPanel() {
			protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(chooseHero2.class.getResource("/res/17.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
        icon.getIconHeight(), icon.getImageObserver());  
			  }  
		};
		hero6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				aBox.setText(new tinker().toString());
				aBox.setForeground(Color.white);
				aBox.setFont(new Font(null,Font.BOLD,20));
			}
		});
		hero6.setBounds(820, 457, 149, 165);
		
		JPanel jpchoose6 = new JPanel();
		jpchoose6.setBounds(810, 615, 200,40);
		jpchoose6.setOpaque(false);
		JButton choose6 = new JButton("choose");
		choose6.setOpaque(false);
		choose6.setBackground(Color.black);
		choose6.setForeground(Color.white);
		choose6.setFont(new Font(null,Font.BOLD,15));
		choose6.setFocusPainted(false);
		
		jpchoose6.add(choose6);
		con.add(jpchoose6);
		con.add(hero6);
		
		
		choose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new chooseHero();
				game.chooseHero.heroList.add(new thief());//when player choose thief, add this hero to hero list.
				jpBox.setVisible(false);
				jpLabel.setVisible(false);
				GImage.setVisible(false);
				hero1.setVisible(false);
				hero2.setVisible(false);
				hero3.setVisible(false);
				hero4.setVisible(false);
				hero5.setVisible(false);
				hero6.setVisible(false);
				jpchoose.setVisible(false);
				jpchoose2.setVisible(false);
				jpchoose3.setVisible(false);
				jpchoose4.setVisible(false);
				jpchoose5.setVisible(false);
				jpchoose6.setVisible(false);
				//if number of heroes is not 1, open third choosing menu
				if(game.heroNumber.numberOfHero != 2) {
					new chooseHero3().addHero(con);
					}
				else {
					new startLine().addStratLine(con);
				};
				}
			});
		
		choose2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new chooseHero();
				game.chooseHero.heroList.add(new richMan());//when player choose rich man, add this hero to hero list.
				jpBox.setVisible(false);
				jpLabel.setVisible(false);
				GImage.setVisible(false);
				hero1.setVisible(false);
				hero2.setVisible(false);
				hero3.setVisible(false);
				hero4.setVisible(false);
				hero5.setVisible(false);
				hero6.setVisible(false);
				jpchoose.setVisible(false);
				jpchoose2.setVisible(false);
				jpchoose3.setVisible(false);
				jpchoose4.setVisible(false);
				jpchoose5.setVisible(false);
				jpchoose6.setVisible(false);
				new heroNumber();
				//if number of heroes is not 1, open third choosing menu
				if(game.heroNumber.numberOfHero != 2) {
					new chooseHero3().addHero(con);
				}
				else {
					new startLine().addStratLine(con);
				};
				}
			});
		choose3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new chooseHero();
				game.chooseHero.heroList.add(new sailor());//when player choose sailor, add this hero to hero list.
				jpBox.setVisible(false);
				jpLabel.setVisible(false);
				GImage.setVisible(false);
				hero1.setVisible(false);
				hero2.setVisible(false);
				hero3.setVisible(false);
				hero4.setVisible(false);
				hero5.setVisible(false);
				hero6.setVisible(false);
				jpchoose.setVisible(false);
				jpchoose2.setVisible(false);
				jpchoose3.setVisible(false);
				jpchoose4.setVisible(false);
				jpchoose5.setVisible(false);
				jpchoose6.setVisible(false);
				new heroNumber();
				//if number of heroes is not 1, open third choosing menu
				if(game.heroNumber.numberOfHero != 2) {
					new chooseHero3().addHero(con);
					}
				else {
					new startLine().addStratLine(con);
				};
				}
			});
		choose4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new chooseHero();
				game.chooseHero.heroList.add(new soldier());//when player choose soldier, add this hero to hero list.
				jpBox.setVisible(false);
				jpLabel.setVisible(false);
				GImage.setVisible(false);
				hero1.setVisible(false);
				hero2.setVisible(false);
				hero3.setVisible(false);
				hero4.setVisible(false);
				hero5.setVisible(false);
				hero6.setVisible(false);
				jpchoose.setVisible(false);
				jpchoose2.setVisible(false);
				jpchoose3.setVisible(false);
				jpchoose4.setVisible(false);
				jpchoose5.setVisible(false);
				jpchoose6.setVisible(false);
				//if number of heroes is not 1, open third choosing menu
				if(game.heroNumber.numberOfHero != 2) {
					new chooseHero3().addHero(con);
					}
				else {
					new startLine().addStratLine(con);
				};
			}
			});
		choose5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new chooseHero();
				game.chooseHero.heroList.add(new tailer());//when player choose tailer, add this hero to hero list.
				jpBox.setVisible(false);
				jpLabel.setVisible(false);
				GImage.setVisible(false);
				hero1.setVisible(false);
				hero2.setVisible(false);
				hero3.setVisible(false);
				hero4.setVisible(false);
				hero5.setVisible(false);
				hero6.setVisible(false);
				jpchoose.setVisible(false);
				jpchoose2.setVisible(false);
				jpchoose3.setVisible(false);
				jpchoose4.setVisible(false);
				jpchoose5.setVisible(false);
				jpchoose6.setVisible(false);
				//if number of heroes is not 1, open third choosing menu
				if(game.heroNumber.numberOfHero != 2) {
					new chooseHero3().addHero(con);
					}
				else {
					new startLine().addStratLine(con);
				};
			}
			});
		choose6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new chooseHero();
				game.chooseHero.heroList.add(new tinker());//when player choose tinker, add this hero to hero list.
				jpBox.setVisible(false);
				jpLabel.setVisible(false);
				GImage.setVisible(false);
				hero1.setVisible(false);
				hero2.setVisible(false);
				hero3.setVisible(false);
				hero4.setVisible(false);
				hero5.setVisible(false);
				hero6.setVisible(false);
				jpchoose.setVisible(false);
				jpchoose2.setVisible(false);
				jpchoose3.setVisible(false);
				jpchoose4.setVisible(false);
				jpchoose5.setVisible(false);
				jpchoose6.setVisible(false);
				//if number of heroes is not 1, open third choosing menu
				if(game.heroNumber.numberOfHero != 2) {
					new chooseHero3().addHero(con);
					}
				else {
					new startLine().addStratLine(con);
				};
			}
			});
		con.add(GImage);
	}
}
