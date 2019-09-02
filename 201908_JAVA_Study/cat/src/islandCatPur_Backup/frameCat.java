package islandCatPur_Backup;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class frameCat extends JFrame {
	/*Background Image*/
	private Image screenImage;
	private Graphics screenGraphic;
	
	private Image background = new ImageIcon(Main.class.getResource("../Images/background.png")).getImage();
	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../Images/menuBar.png")));
	
	
	private Font titleFont = new Font("Times New Roman", Font.PLAIN, 60);
	/*Text Panel*/
	private JPanel feedTitlePanel = new JPanel();
	private JLabel feedTitleLabel = new JLabel();
	
	/*Menu Text*/
	private JLabel returnMenuLabel = new JLabel();
	private JLabel feedMenuLabel = new JLabel();
	private JLabel shopMenuLabel = new JLabel();
	
	//private JPanel textMenuButtonPanel = new JPanel();
	
	/*Change Cat*/
	private boolean isCatScreen = false;
	private Image whiteCat = new ImageIcon(Main.class.getResource("../Images/whiteCat.png")).getImage();
	
	/*Icon Image*/
	private ImageIcon exitButton_nomal = new ImageIcon(Main.class.getResource("../Images/exit_nomal.png"));
	private ImageIcon exitButton_touch = new ImageIcon(Main.class.getResource("../Images/exit_touch.png"));
	//private ImageIcon exitButton_click = new ImageIcon(FrameMain.class.getResource("../Images/exit_click.png"));
	
	private ImageIcon leftButton_nomal = new ImageIcon(Main.class.getResource("../Images/leftIcon_nomal.png"));
	private ImageIcon leftButton_touch = new ImageIcon(Main.class.getResource("../Images/leftIcon_touch.png"));
	private ImageIcon rightButton_nomal = new ImageIcon(Main.class.getResource("../Images/rightIcon_nomal.png"));
	private ImageIcon rightButton_touch = new ImageIcon(Main.class.getResource("../Images/rightIcon_touch.png"));
		
	private ImageIcon menuButton_nomal = new ImageIcon(Main.class.getResource("../Images/menuIcon_nomal.png"));
	private ImageIcon menuButton_touch = new ImageIcon(Main.class.getResource("../Images/menuIcon_touch.png"));
	private ImageIcon menuButton_click = new ImageIcon(Main.class.getResource("../Images/menuIcon_click.png"));
	
	/*Cat Item Icon*/
	private ImageIcon feedButton_nomal = new ImageIcon(Main.class.getResource("../Images/feedIcon_nomal.png"));
	private ImageIcon feedButton_touch = new ImageIcon(Main.class.getResource("../Images/feedIcon_touch.png"));
	private ImageIcon furButton_nomal = new ImageIcon(Main.class.getResource("../Images/furIcon_nomal.png"));
	private ImageIcon furButton_touch = new ImageIcon(Main.class.getResource("../Images/furIcon_touch.gif"));
	
	
	
	/*Button*/
	private JButton exitButton = new JButton(exitButton_nomal);
	private JButton feedMenuButton = new JButton(menuButton_nomal);
	private JButton shopMenuButton = new JButton(menuButton_nomal);
	private JButton returnMenuButton = new JButton(menuButton_nomal);
	private JButton leftButton = new JButton(leftButton_nomal);
	private JButton rightButton = new JButton(rightButton_nomal);
	private JButton feedButton = new JButton(feedButton_nomal);
	private JButton feedItemButton = new JButton(feedButton_nomal);
	private JButton textButton = new JButton("TEXT BUTTON");
	private JButton furButton = new JButton(furButton_nomal);
	
	/*Mouse Var Make*/
	private int mouseX, mouseY;

	
	
	
	
	/**************************Window Set**************************/
	/**************************Window Set**************************/
	/**************************Window Set**************************/
	public frameCat() {
		setUndecorated(true);
		setTitle("Cat Island");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBackground(new Color(0,0,0,0));
		setLayout(null);
		
		
		
		
		/**************************ICON Button**************************/
		/**************************ICON Button**************************/
		/**************************ICON Button**************************/
		
		exitButton.setBounds(670,5,50,50);
		exitButton.setBorderPainted(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setFocusPainted(false);
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				exitButton.setIcon(exitButton_touch);
				exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				exitButton.setIcon(exitButton_nomal);
				exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				//exitButton.setIcon(exitButton_click);
				musicCat buttonClickedMusic = new musicCat("buttonClickedMusic.mp3",false);
				buttonClickedMusic.start();
				try {
					Thread.sleep(1000);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				System.exit(0);
			}
		});
		add(exitButton);
		
		
		
		/*Left Button Set*/
		leftButton.setVisible(false);
		leftButton.setBounds(0,482,56,56);
		leftButton.setBorderPainted(false);
		leftButton.setContentAreaFilled(false);
		leftButton.setFocusPainted(false);
		leftButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				leftButton.setIcon(leftButton_touch);
				leftButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				leftButton.setIcon(leftButton_nomal);
				leftButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				//leftButton.setIcon(returnButton_click);
				musicCat buttonClickedMusic = new musicCat("buttonClickedMusic.mp3",false);
				buttonClickedMusic.start();
				/*left button Event*/
			}
		});
		add(leftButton);
		
		
		
		/*Right Button Set*/
		rightButton.setVisible(false);
		rightButton.setBounds(664,482,56,56);
		rightButton.setBorderPainted(false);
		rightButton.setContentAreaFilled(false);
		rightButton.setFocusPainted(false);
		rightButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				rightButton.setIcon(rightButton_touch);
				rightButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				rightButton.setIcon(rightButton_nomal);
				rightButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				//leftButton.setIcon(returnButton_click);
				musicCat buttonClickedMusic = new musicCat("buttonClickedMusic.mp3",false);
				buttonClickedMusic.start();
				/*right button Event*/
			}
		});
		add(rightButton);
		
		
		
		/*feed Button Set*/
		int feedW = 80;
		int feedH = 80;
		int feedX = ((Main.SCREEN_WIDTH - feedW)*1/4);
		int feedY= ((Main.SCREEN_HEIGHT - feedH)*3/4);
		feedButton.setVisible(false);
		feedButton.setBounds(feedX,feedY,feedW,feedH);
		feedButton.setBorderPainted(false);
		feedButton.setContentAreaFilled(false);
		feedButton.setFocusPainted(false);
		feedButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				//feedButton.setIcon(feedButton_touch);
				feedButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				feedButton.setIcon(feedButton_nomal);
				feedButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				feedButton.setIcon(feedButton_touch);
				feedButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				//feedButton.setIcon(returnButton_click.gif);
				musicCat buttonClickedMusic = new musicCat("buttonClickedMusic.mp3",false);
				buttonClickedMusic.start();
				
				/*feed button Event*/
				feedCat buttonClickedFeed = new feedCat();
				buttonClickedFeed.propCat();
			}
		});
		add(feedButton);
		
		
		
		/*fur Button Set*/
		int furW = 80;
		int furH = 80;
		int furX = ((Main.SCREEN_WIDTH - furW)*3/4);
		int furY= ((Main.SCREEN_HEIGHT - furH)*3/4);
		furButton.setVisible(false);
		furButton.setBounds(furX,furY,furW,furH);
		furButton.setBorderPainted(false);
		furButton.setContentAreaFilled(false);
		furButton.setFocusPainted(false);
		furButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				//feedButton.setIcon(feedButton_touch);
				furButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				furButton.setIcon(furButton_nomal);
				furButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				furButton.setIcon(furButton_touch);
				furButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				musicCat buttonClickedMusic = new musicCat("buttonClickedMusic.mp3",false);
				buttonClickedMusic.start();
				
				/*feed button Event*/
				furCat buttonClickedFur = new furCat();
				buttonClickedFur.propCat();
			}
		});
		add(furButton);

		
		
		/*feedItem Button Set*/
		int feedItemW = 80;
		int feedItemH = 80;
		int feedItemX = ((Main.SCREEN_WIDTH - feedItemW)/2);
		int feedItemY= ((Main.SCREEN_HEIGHT - feedItemH)*3/4);
		feedItemButton.setVisible(false);
		feedItemButton.setBounds(feedItemX,feedItemY,feedItemW,feedItemH);
		feedItemButton.setBorderPainted(false);
		feedItemButton.setContentAreaFilled(false);
		feedItemButton.setFocusPainted(false);
		feedItemButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				//feedButton.setIcon(feedButton_touch);
				feedButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				feedItemButton.setIcon(feedButton_nomal);
				feedItemButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				feedItemButton.setIcon(feedButton_touch);
				feedItemButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				//feedButton.setIcon(returnButton_click.gif);
				musicCat buttonClickedMusic = new musicCat("buttonClickedMusic.mp3",false);
				buttonClickedMusic.start();
				
				/*feed button Event*/
				furExchangeCat buttonClickedFE = new furExchangeCat();
				buttonClickedFE.propCat();
			}
		});
		add(feedItemButton);
		
		
		
		
		
		/**************************MENU Button**************************/
		/**************************MENU Button**************************/
		/**************************MENU Button**************************/
		
		
		/*Return Button Set*/
		returnMenuButton.setBounds(20,100,100,100);
		returnMenuButton.setBorderPainted(false);
		returnMenuButton.setContentAreaFilled(false);
		returnMenuButton.setFocusPainted(false);
		returnMenuLabel = new JLabel("Go home");
		returnMenuLabel.setForeground(Color.WHITE);
		returnMenuButton.add(returnMenuLabel);
		returnMenuButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				returnMenuButton.setIcon(menuButton_touch);
				returnMenuButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				returnMenuButton.setIcon(menuButton_nomal);
				returnMenuButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				//returnButton.setIcon(returnButton_click);
				musicCat buttonClickedMusic = new musicCat("buttonClickedMusic.mp3",false);
				buttonClickedMusic.start();
				try {
					Thread.sleep(1000);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				//menuButton.setIcon(menuButton_click);
				//buttonClickedMusic.start();
				//textMenuButtonPanel.setVisible(false);
				
				returnMenuButton.setVisible(true);
				leftButton.setVisible(false);
				rightButton.setVisible(false);
				
				feedMenuButton.setVisible(true);
				feedTitlePanel.setVisible(false);
				feedButton.setVisible(false);
				furButton.setVisible(false);
				
				shopMenuButton.setVisible(true);
				feedItemButton.setVisible(false);
				
				background = new ImageIcon(Main.class.getResource("../Images/background.png")).getImage();
				isCatScreen = false;
			}
		});
		add(returnMenuButton);
		
		
		/*Feed Set*/
		/*Title Panel (EnterScen)*/
		int titleW = 200;
		int titleH = 100;
		int titleX = ((Main.SCREEN_WIDTH - titleW)/2);
		int titleY= ((Main.SCREEN_HEIGHT - titleH)/4);
		feedTitlePanel.setBounds(titleX, titleY, titleW, titleH);
		feedTitlePanel.setBackground(new Color(0,0,0,0));
		feedTitlePanel.setVisible(false);
		feedTitleLabel = new JLabel("Feeding! Feeding!");
		feedTitleLabel.setForeground(Color.WHITE);
		feedTitlePanel.add(feedTitleLabel);
		add(feedTitlePanel);
		
		/*Feed Button Set*/
		feedMenuButton.setBounds(20,200,100,100);
		feedMenuButton.setBorderPainted(false);
		feedMenuButton.setContentAreaFilled(false);
		feedMenuButton.setFocusPainted(false);
		feedMenuLabel = new JLabel("FeedingCat");
		feedMenuLabel.setForeground(Color.WHITE);
		feedMenuButton.add(feedMenuLabel);
		feedMenuButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				feedMenuButton.setIcon(menuButton_touch);
				feedMenuButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				feedMenuButton.setIcon(menuButton_nomal);
				feedMenuButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				//menuButton.setIcon(menuButton_click);
				//musicCat buttonClickedMusic = new musicCat("buttonClickedMusic.mp3",false);
				//buttonClickedMusic.start();
				//textMenuButtonPanel.setVisible(true);
				
				returnMenuButton.setVisible(true);
				leftButton.setVisible(true);
				rightButton.setVisible(true);
				
				feedMenuButton.setVisible(false);
				feedTitlePanel.setVisible(true);
				feedButton.setVisible(true);
				furButton.setVisible(true);
				
				shopMenuButton.setVisible(false);
				feedItemButton.setVisible(false);
				
				background = new ImageIcon(Main.class.getResource("../Images/mainBackground.png")).getImage();
				/*Start Game Event () {}*/
				isCatScreen = true;
			}
		});
		add(feedMenuButton);
		
		
		/*Menu Button Set*/
		shopMenuButton.setBounds(20,300,100,100);
		shopMenuButton.setBorderPainted(false);
		shopMenuButton.setContentAreaFilled(false);
		shopMenuButton.setFocusPainted(false);
		shopMenuLabel = new JLabel("Item");
		shopMenuLabel.setForeground(Color.WHITE);
		shopMenuButton.add(shopMenuLabel);
		shopMenuButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				shopMenuButton.setIcon(menuButton_touch);
				shopMenuButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				shopMenuButton.setIcon(menuButton_nomal);
				shopMenuButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				shopMenuButton.setIcon(menuButton_click);
				//musicCat buttonClickedMusic = new musicCat("buttonClickedMusic.mp3",false);
				//buttonClickedMusic.start();
				//textMenuButtonPanel.setVisible(true);
				
				try {
					Thread.sleep(1000);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				
				returnMenuButton.setVisible(true);
				leftButton.setVisible(true);
				rightButton.setVisible(true);
				
				feedMenuButton.setVisible(false);
				feedTitlePanel.setVisible(false);
				feedButton.setVisible(false);
				furButton.setVisible(false);
				
				shopMenuButton.setVisible(false);
				feedItemButton.setVisible(true);
				
				background = new ImageIcon(Main.class.getResource("../Images/mainBackground.png")).getImage();
				/*Start Game Event () {}*/
				isCatScreen = false;
			}
		});
		add(shopMenuButton);
		
		
		/****************************************************
		*Text Menu*
		textMenuButtonPanel.setVisible(false);
		textMenuButtonPanel.setBounds(20,100,340,800);
		textMenuButtonPanel.setBackground(Color.black);
		textButton.setBackground(Color.black);
		textButton.setForeground(Color.WHITE);
		textButton.setFont(titleFont);
		textMenuButtonPanel.add(textButton);
		add(textMenuButtonPanel);
		****************************************************/
		


		
		/*MenuBar Set*/
		menuBar.setBounds(0, 0, 720, 60);
		menuBar.addMouseListener(new MouseAdapter () {
			public void mousePressed (MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
			}
		});
		menuBar.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x-mouseX, y-mouseY);
			}
		});
		add(menuBar);
		
		/*Music Set*/
		musicCat introMusic = new musicCat("introMain.mp3",true);
		introMusic.start();
	}
	
	public void paint (Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(background, 0, 0, null);
		
		int catW = 154;
		int catH = 171;
		int catX = ((Main.SCREEN_WIDTH - catW)/2);
		int catY= ((Main.SCREEN_HEIGHT - catH)/2);
		if (isCatScreen) {
			g.drawImage(whiteCat,catX,catY,null);
		}
		paintComponents(g);
		this.repaint();
	}
}
