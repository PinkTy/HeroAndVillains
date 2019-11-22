package game;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;

/**
 * 
 * @author Cai & Lee
 * This class is the store in each city, player can buy maps, power up items and
 * healing items in store, if player has enough coins.
 */
public class store {
	static int num1 = 0;//the number of maps
	static int num2 = 0;//the number of HP plus 25
	static int num3 = 0;//the number of HP plus 50
	static int num4 = 0;//the number of HP plus 100
	static int num5 = 0;//the number of escape cards
	static int num6 = 0;//the number of recovering rate plus
	static int num7 = 0;//the number of damage plus
	static boolean visitedStore = false;
	
	/**
	 * 
	 * @param con
	 * create the store window, player can but multiple items each time,
	 * and player can use calculate button to calculate the price of total items,
	 * and player can use purchase button to buy these items(if player has enough coins) 
	 * and these items will put in the bag.
	 */
	public void instore(final Container con) {
		new randomEvents();
		new homeBase();
		ArrayList<String> randomList = new ArrayList<String>();
		randomList.add("inkeeper1.png");
		randomList.add("inkeeper2.png");
		randomList.add("inkeeper3.png");
		Random num = new Random();
		String picName = randomList.get(num.nextInt(randomList.size()));
		new bag();
		Integer mapMoney = new Integer(new map().getCost());
		Integer hpPlusMoney = new Integer(new hpPlus().getCost());
		Integer hpPlus2Money = new Integer(new hpPlus2().getCost());
		Integer hpPlus3Money = new Integer(new hpPlus3().getCost());
		Integer escapeCardMoney = new Integer(new escapeCard().getCost());
		Integer recoveringRatePlusMoney = new Integer(new recoveringRatePlus().getCost());
		Integer damagePlusMoney = new Integer(new damagePlus().getCost());
		
		JPanel jpBox = new JPanel();
		jpBox.setBounds(400, 630, 400, 210);
		jpBox.setOpaque(false);
		
		JLabel aBox = new JLabel();
		aBox.setOpaque(false);
		jpBox.add(aBox);
		
		JPanel jpLine = new JPanel();
		jpLine.setBounds(400, 850, 400, 100);
		jpLine.setOpaque(false);
		
		JLabel jlLine = new JLabel();
		jlLine.setText("Welcome. What you want to buy?");
		jlLine.setForeground(Color.WHITE);
		jlLine.setFont(new Font(null,Font.BOLD,20));
		jpLine.add(jlLine);
		
		JPanel jpError = new JPanel();
		jpError.setBounds(400, 850, 400, 100);
		jpError.setOpaque(false);
		jpError.setVisible(false);
		JLabel jlError = new JLabel();
		jlError.setText("SOZ, you don not have much money!!!");
		jlError.setForeground(Color.RED);
		jlError.setFont(new Font(null,Font.BOLD,18));
		jpError.add(jlError);
		
		JPanel jpBackGround = new JPanel();
		jpBackGround.setBounds(0, 0, 1205, 960);
		jpBackGround.setBackground(Color.BLACK);
		
		@SuppressWarnings("serial")
		JPanel jpimage = new JPanel() {
			 protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(store.class.getResource("/res/storeMap.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
	            icon.getIconHeight(), icon.getImageObserver());  
	    }  
		};
		jpimage.setBounds(80,50,170,170);
		jpimage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				aBox.setText(new map().toString());
				aBox.setForeground(Color.white);
				aBox.setFont(new Font(null,Font.BOLD,21));
			}
		});
		
		JPanel jpMap = new JPanel();
		jpMap.setBounds(130, 250, 30, 30);
		jpMap.setOpaque(false);
		JLabel jlMap = new JLabel();
		jlMap.setText(Integer.toString(num1));
		jpMap.add(jlMap);
		
		JPanel jpsub = new JPanel();
		jpsub.setBounds(50, 250, 50, 50);
		jpsub.setOpaque(false);
		JButton jbsub = new JButton("-");
		
		jbsub.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(num1 > 0) {
					num1 -= 1;
					jlMap.setText(Integer.toString(num1));
				}
			}
		});
		jbsub.setOpaque(false);
		jbsub.setBackground(Color.black);
		jbsub.setForeground(Color.white);
		jbsub.setFocusPainted(false);
		jpsub.add(jbsub);
		
		JPanel jpplus = new JPanel() ;
		jpplus.setBounds(210, 250, 50, 50);
		jpplus.setOpaque(false);
		JButton jbplus = new JButton("+");
		jbplus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				num1 += 1;
				jlMap.setText(Integer.toString(num1));
			}
		});
		jbplus.setOpaque(false);
		jbplus.setBackground(Color.black);
		jbplus.setForeground(Color.white);
		jbplus.setFocusPainted(false);
		jpplus.add(jbplus);
		
		//jpHpPlus
		@SuppressWarnings("serial")
		JPanel jpimage2 = new JPanel() {
			 protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(store.class.getResource("/res/hpPlus1.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
	            icon.getIconHeight(), icon.getImageObserver());  
	    }  
		};  
		jpimage2.setBounds(320,50,170,170);
		jpimage2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				aBox.setText(new hpPlus().toString());
				aBox.setForeground(Color.white);
				aBox.setFont(new Font(null,Font.BOLD,21));
			}
		});
		JPanel jpHpPlus = new JPanel();
		jpHpPlus.setBounds(390, 250, 30, 30);
		jpHpPlus.setOpaque(false);
		JLabel jlHpPlus = new JLabel();
		jlHpPlus.setText(Integer.toString(num2));
		jpHpPlus.add(jlHpPlus);
		
		JPanel jpsub1 = new JPanel();
		jpsub1.setBounds(310, 250, 50, 50);
		jpsub1.setOpaque(false);
		JButton jbsub1 = new JButton("-");
		jbsub1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(num2 > 0) {
					num2 -= 1;
					jlHpPlus.setText(Integer.toString(num2));
				}
			}
		});
		jbsub1.setOpaque(false);
		jbsub1.setBackground(Color.black);
		jbsub1.setForeground(Color.white);
		jbsub1.setFocusPainted(false);
		jpsub1.add(jbsub1);
		
		JPanel jpplus1 = new JPanel();
		jpplus1.setBounds(470, 250, 50, 50);
		jpplus1.setOpaque(false);
		JButton jbplus1 = new JButton("+");
		jbplus1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				num2 += 1;
				jlHpPlus.setText(Integer.toString(num2));
			}
		});
		jbplus1.setOpaque(false);
		jbplus1.setBackground(Color.black);
		jbplus1.setForeground(Color.white);
		jbplus1.setFocusPainted(false);
		jpplus1.add(jbplus1);
		
		//hpPlus2
		@SuppressWarnings("serial")
		JPanel jpimage3 = new JPanel() {
			protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(store.class.getResource("/res/hpPlus2.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
	            icon.getIconHeight(), icon.getImageObserver());  
	    }  
		};
		jpimage3.setBounds(590,50,170,170);
		jpimage3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				aBox.setText(new hpPlus2().toString());
				aBox.setForeground(Color.white);
				aBox.setFont(new Font(null,Font.BOLD,21));
			}
		});
		JPanel jpHpPlus2 = new JPanel();
		jpHpPlus2.setBounds(650, 250, 30, 30);
		jpHpPlus2.setOpaque(false);
		JLabel jlHpPlus2 = new JLabel();
		jlHpPlus2.setText(Integer.toString(num3));
		
		jpHpPlus2.add(jlHpPlus2);
		
		JPanel jpsub2 = new JPanel();
		jpsub2.setBounds(570, 250, 50, 50);
		jpsub2.setOpaque(false);
		JButton jbsub2 = new JButton("-");
		jbsub2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(num3 > 0) {
					num3 -= 1;
					jlHpPlus2.setText(Integer.toString(num3));
				}
			}
		});
		jbsub2.setOpaque(false);
		jbsub2.setBackground(Color.black);
		jbsub2.setForeground(Color.white);
		jbsub2.setFocusPainted(false);
		jpsub2.add(jbsub2);
		
		JPanel jpplus2 = new JPanel();
		jpplus2.setBounds(730, 250, 50, 50);
		jpplus2.setOpaque(false);
		JButton jbplus2 = new JButton("+");
		jbplus2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				num3 += 1;
				jlHpPlus2.setText(Integer.toString(num3));
			}
		});
		jbplus2.setOpaque(false);
		jbplus2.setBackground(Color.black);
		jbplus2.setForeground(Color.white);
		jbplus2.setFocusPainted(false);
		jpplus2.add(jbplus2);
		
		//jpPlus3
		@SuppressWarnings("serial")
		JPanel jpimage4 = new JPanel() {
			protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(store.class.getResource("/res/hpPlus3.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
	            icon.getIconHeight(), icon.getImageObserver());  
	    }  
		};
		jpimage4.setBounds(860,50,170,170);
		jpimage4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				aBox.setText(new hpPlus3().toString());
				aBox.setForeground(Color.white);
				aBox.setFont(new Font(null,Font.BOLD,21));
			}
		});
		JPanel jpHpPlus3 = new JPanel();
		jpHpPlus3.setBounds(910, 250, 30, 30);
		jpHpPlus3.setOpaque(false);
		JLabel jlHpPlus3 = new JLabel();
		jlHpPlus3.setText(Integer.toString(num4));
		
		jpHpPlus3.add(jlHpPlus3);
		
		JPanel jpsub3 = new JPanel();
		jpsub3.setBounds(830, 250, 50, 50);
		jpsub3.setOpaque(false);
		JButton jbsub3 = new JButton("-");
		jbsub3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(num4 > 0) {
					num4 -= 1;
					jlHpPlus3.setText(Integer.toString(num4));
				}
			}
		});
		jbsub3.setOpaque(false);
		jbsub3.setBackground(Color.black);
		jbsub3.setForeground(Color.white);
		jbsub3.setFocusPainted(false);
		jpsub3.add(jbsub3);
		
		JPanel jpplus3 = new JPanel();
		jpplus3.setBounds(990, 250, 50, 50);
		jpplus3.setOpaque(false);
		JButton jbplus3 = new JButton("+");
		jbplus3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				num4 += 1;
				jlHpPlus3.setText(Integer.toString(num4));
			}
		});
		jbplus3.setOpaque(false);
		jbplus3.setBackground(Color.black);
		jbplus3.setForeground(Color.white);
		jbplus3.setFocusPainted(false);
		jpplus3.add(jbplus3);
		
		//seeFuture
		@SuppressWarnings("serial")
		JPanel jpimage5 = new JPanel() {
			 protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(store.class.getResource("/res/escape.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
	            icon.getIconHeight(), icon.getImageObserver());  
	    }  
		};
		jpimage5.setBounds(320,400,170,170);
		jpimage5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				aBox.setText(new escapeCard().toString());
				aBox.setForeground(Color.white);
				aBox.setFont(new Font(null,Font.BOLD,23));
			}
		});
		JPanel jpSeeFuture = new JPanel();
		jpSeeFuture.setBounds(390, 580, 30, 30);
		jpSeeFuture.setOpaque(false);
		JLabel jlSeeFuture = new JLabel();
		jlSeeFuture.setText(Integer.toString(num5));
		
		jpSeeFuture.add(jlSeeFuture);
		
		JPanel jpsub4 = new JPanel();
		jpsub4.setBounds(310, 580, 50, 50);
		jpsub4.setOpaque(false);
		JButton jbsub4 = new JButton("-");
		jbsub4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(num5 > 0) {
					num5 -= 1;
					jlSeeFuture.setText(Integer.toString(num5));
				}
			}
		});
		jbsub4.setOpaque(false);
		jbsub4.setBackground(Color.black);
		jbsub4.setForeground(Color.white);
		jbsub4.setFocusPainted(false);
		jpsub4.add(jbsub4);
		
		JPanel jpplus4 = new JPanel();
		jpplus4.setBounds(470, 580, 50, 50);
		jpplus4.setOpaque(false);
		JButton jbplus4 = new JButton("+");
		jbplus4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				num5 += 1;
				jlSeeFuture.setText(Integer.toString(num5));
			}
		});
		jbplus4.setOpaque(false);
		jbplus4.setBackground(Color.black);
		jbplus4.setForeground(Color.white);
		jbplus4.setFocusPainted(false);
		jpplus4.add(jbplus4);
		
		//recoveringRate
		@SuppressWarnings("serial")
		JPanel jpimage6 = new JPanel(){
			protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(store.class.getResource("/res/recPlus.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
	            icon.getIconHeight(), icon.getImageObserver());  
	    }  
		};
		jpimage6.setBounds(590,400,170,170);
		jpimage6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				aBox.setText(new recoveringRatePlus().toString());
				aBox.setForeground(Color.white);
				aBox.setFont(new Font(null,Font.BOLD,21));
			}
		});
		JPanel jpRecoverPlus = new JPanel();
		jpRecoverPlus.setBounds(650, 580, 30, 30);
		jpRecoverPlus.setOpaque(false);
		JLabel jlRecoverPlus = new JLabel();
		jlRecoverPlus.setText(Integer.toString(num6));
		
		jpRecoverPlus.add(jlRecoverPlus);
		
		JPanel jpsub5 = new JPanel();
		jpsub5.setBounds(570, 580, 50, 50);
		jpsub5.setOpaque(false);
		JButton jbsub5 = new JButton("-");
		jbsub5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(num6 > 0) {
					num6 -= 1;
					jlRecoverPlus.setText(Integer.toString(num6));
				}
			}
		});
		jbsub5.setOpaque(false);
		jbsub5.setBackground(Color.black);
		jbsub5.setForeground(Color.white);
		jbsub5.setFocusPainted(false);
		jpsub5.add(jbsub5);
		
		JPanel jpplus5 = new JPanel();
		jpplus5.setBounds(730, 580, 50, 50);
		jpplus5.setOpaque(false);
		JButton jbplus5 = new JButton("+");
		jbplus5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				num6 += 1;
				jlRecoverPlus.setText(Integer.toString(num6));
			}
		});
		jbplus5.setOpaque(false);
		jbplus5.setBackground(Color.black);
		jbplus5.setForeground(Color.white);
		jbplus5.setFocusPainted(false);
		jpplus5.add(jbplus5);
		
		//damagePlus
		@SuppressWarnings("serial")
		JPanel jpimage7 = new JPanel() {
			protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon(store.class.getResource("/res/damPlus.png"));  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
	            icon.getIconHeight(), icon.getImageObserver());  
	    }  
		};
		jpimage7.setBounds(860,400,170,170);
		jpimage7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				aBox.setText(new damagePlus().toString());
				aBox.setForeground(Color.white);
				aBox.setFont(new Font(null,Font.BOLD,21));
			}
		});
		JPanel jpdamagePlus = new JPanel();
		jpdamagePlus.setBounds(910, 580, 30, 30);
		jpdamagePlus.setOpaque(false);
		JLabel jldamagePlus = new JLabel();
		jldamagePlus.setText(Integer.toString(num7));
		
		jpdamagePlus.add(jldamagePlus);
		
		JPanel jpsub6 = new JPanel();
		jpsub6.setBounds(830, 580, 50, 50);
		jpsub6.setOpaque(false);
		JButton jbsub6 = new JButton("-");
		jbsub6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(num7 > 0) {
					num7 -= 1;
					jldamagePlus.setText(Integer.toString(num7));
				}
			}
		});
		jbsub6.setOpaque(false);
		jbsub6.setBackground(Color.black);
		jbsub6.setForeground(Color.white);
		jbsub6.setFocusPainted(false);
		jpsub6.add(jbsub6);
		
		JPanel jpplus6 = new JPanel();
		jpplus6.setBounds(990, 580, 50, 50);
		jpplus6.setOpaque(false);
		JButton jbplus6 = new JButton("+");
		jbplus6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				num7 += 1;
				jldamagePlus.setText(Integer.toString(num7));
			}
		});
		jbplus6.setOpaque(false);
		jbplus6.setBackground(Color.black);
		jbplus6.setForeground(Color.white);
		jbplus6.setFocusPainted(false);
		jpplus6.add(jbplus6);
		
		JPanel jpBag = new JPanel();
		jpBag.setBounds(120,10, 1000, 100);
		jpBag.setOpaque(false);
		
		JLabel jlBag = new JLabel();
		jlBag.setText(new bag().toString());
		jlBag.setForeground(Color.white);
		jlBag.setFont(new Font(null,Font.BOLD,15));
		jpBag.add(jlBag);
		
		//total
		JPanel jpTotalMoney = new JPanel();
		jpTotalMoney.setBounds(800, 800, 100,30);
		jpTotalMoney.setOpaque(false);
		JLabel allMoney = new JLabel();
		
		allMoney.setText(Integer.toString(totalMoney.money));
		
		jpTotalMoney.add(allMoney);
		
		JPanel jpTotalCost = new JPanel();
		jpTotalCost.setBounds(800, 700, 50, 50);
		jpTotalCost.setOpaque(false);
		JLabel jlcaculate = new JLabel("0");
		jpTotalCost.add(jlcaculate);
		
		
		JPanel jpcaculate = new JPanel();
		jpcaculate.setBounds(900, 700, 100, 50);
		jpcaculate.setOpaque(false);
		JButton jbcaculate = new JButton("Caculate");
		jbcaculate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jlcaculate.setText(Integer.toString(num1 * mapMoney + num2 * hpPlusMoney + num3 * hpPlus2Money
													+ num4 * hpPlus3Money + num5 * escapeCardMoney + num6 * recoveringRatePlusMoney
													+ num7 * damagePlusMoney));
			}
		});
		jbcaculate.setOpaque(false);
		jbcaculate.setBackground(Color.black);
		jbcaculate.setForeground(Color.white);
		jbcaculate.setFocusPainted(false);
		jpcaculate.add(jbcaculate);
		
		
		JPanel jppurchase = new JPanel();
		jppurchase.setBounds(900, 800, 100, 50);
		jppurchase.setOpaque(false);
		JButton purchase = new JButton("Purchase");
		purchase.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if((num1 * mapMoney + num2 * hpPlusMoney + num3 * hpPlus2Money
					+ num4 * hpPlus3Money + num5 * escapeCardMoney + num6 * recoveringRatePlusMoney
					+ num7 * damagePlusMoney) <= totalMoney.money) {
					
					totalMoney.money -= num1 * mapMoney + num2 * hpPlusMoney + num3 * hpPlus2Money
							+ num4 * hpPlus3Money + num5 * escapeCardMoney + num6 * recoveringRatePlusMoney
							+ num7 * damagePlusMoney;
					jpError.setVisible(false);
					jpLine.setVisible(false);
					
					bag.map += num1;
					bag.hpPlus25 += num2;
					bag.hpPlus50 += num3;
					bag.hpPlus100 += num4;
					bag.escapeCard += num5;
					bag.recRate += num6;
					bag.damagePlus += num7;
					
					jlBag.setText(new bag().toString());
					
					num1 = 0;
					num2 = 0;
					num3 = 0;
					num4 = 0;
					num5 = 0;
					num6 = 0;
					num7 = 0;
					allMoney.setText(Integer.toString(totalMoney.money));
					jlMap.setText(Integer.toString(num1));
					jlHpPlus.setText(Integer.toString(num2));
					jlHpPlus2.setText(Integer.toString(num3));
					jlHpPlus3.setText(Integer.toString(num4));
					jlSeeFuture.setText(Integer.toString(num5));
					jlRecoverPlus.setText(Integer.toString(num6));
					jldamagePlus.setText(Integer.toString(num7));
				}
				else {
					num1 = 0;
					num2 = 0;
					num3 = 0;
					num4 = 0;
					num5 = 0;
					num6 = 0;
					num7 = 0;
					jlMap.setText(Integer.toString(num1));
					jlHpPlus.setText(Integer.toString(num2));
					jlHpPlus2.setText(Integer.toString(num3));
					jlHpPlus3.setText(Integer.toString(num4));
					jlSeeFuture.setText(Integer.toString(num5));
					jlRecoverPlus.setText(Integer.toString(num6));
					jldamagePlus.setText(Integer.toString(num7));
					jpError.setVisible(true);
					jpLine.setVisible(false);
				}
			}
		});
		purchase.setOpaque(false);
		purchase.setBackground(Color.black);
		purchase.setForeground(Color.white);
		purchase.setFocusPainted(false);
		jppurchase.add(purchase);
		
		JPanel jpinkeeper = new JPanel() {
			private static final long serialVersionUID = 1L;

			  protected void paintComponent(Graphics g) {  
				  ImageIcon icon = new ImageIcon("res/img/" + picName);  
				  Image img = icon.getImage();  
				  g.drawImage(img, 0, 0, icon.getIconWidth(),  
	            icon.getIconHeight(), icon.getImageObserver());  
	    }  
		};
		jpinkeeper.setBounds(10, 400 , 300, 1000);
		jpinkeeper.setOpaque(false);
		
		
		
		JPanel jpBack = new JPanel();
		jpBack.setBounds(10,5,120,100);
		jpBack.setOpaque(false);
		
		JButton back = new JButton("<<BACK");
		back.setOpaque(false);
		back.setBackground(Color.black);
		back.setForeground(Color.white);
		back.setFont(new Font(null,Font.BOLD,15));
		back.setFocusPainted(false);
		
		jpBack.add(back);
		
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				randomEvents.randomHappen();
				jpMap.setVisible(false);
				jpsub.setVisible(false);
				jpplus.setVisible(false);
				jpimage.setVisible(false);
				
				jpHpPlus.setVisible(false);
				jpsub1.setVisible(false);
				jpplus1.setVisible(false);
				jpimage2.setVisible(false);
				
				jpHpPlus2.setVisible(false);
				jpsub2.setVisible(false);
				jpplus2.setVisible(false);
				jpimage3.setVisible(false);
				
				jpHpPlus3.setVisible(false);
				jpsub3.setVisible(false);
				jpplus3.setVisible(false);
				jpimage4.setVisible(false);
				
				jpSeeFuture.setVisible(false);
				jpsub4.setVisible(false);
				jpplus4.setVisible(false);
				jpimage5.setVisible(false);
				
				jpRecoverPlus.setVisible(false);
				jpsub5.setVisible(false);
				jpplus5.setVisible(false);
				jpimage6.setVisible(false);
				
				jpdamagePlus.setVisible(false);
				jpsub6.setVisible(false);
				jpplus6.setVisible(false);
				jpimage7.setVisible(false);
				
				jpTotalMoney.setVisible(false);
				jpcaculate.setVisible(false);
				jpTotalCost.setVisible(false);
				jppurchase.setVisible(false);
				jpLine.setVisible(false);
				jpError.setVisible(false);
				jpinkeeper.setVisible(false);
				jpBackGround.setVisible(false);
				jpBack.setVisible(false);
				jpBag.setVisible(false);
				jpBox.setVisible(false);
				new homeBase().addHomeBase(con);
				}	
			});
		
		con.add(jpBack);
		con.add(jpBag);
		
		con.add(jpMap);
		con.add(jpsub);
		con.add(jpplus);
		con.add(jpimage);
		
		con.add(jpHpPlus);
		con.add(jpsub1);
		con.add(jpplus1);
		con.add(jpimage2);
		
		con.add(jpHpPlus2);
		con.add(jpsub2);
		con.add(jpplus2);
		con.add(jpimage3);
		
		con.add(jpHpPlus3);
		con.add(jpsub3);
		con.add(jpplus3);
		con.add(jpimage4);
		
		con.add(jpSeeFuture);
		con.add(jpsub4);
		con.add(jpplus4);
		con.add(jpimage5);
		
		con.add(jpRecoverPlus);
		con.add(jpsub5);
		con.add(jpplus5);
		con.add(jpimage6);
		
		con.add(jpdamagePlus);
		con.add(jpsub6);
		con.add(jpplus6);
		con.add(jpimage7);
		
		con.add(jpTotalMoney);
		con.add(jpcaculate);
		con.add(jpTotalCost);
		con.add(jppurchase);
		con.add(jpLine);
		con.add(jpError);
		con.add(jpBox);
		con.add(jpinkeeper);
		con.add(jpBackGround);
		visitedStore = true;
	}
}
