import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.text.MaskFormatter;
import javax.imageio.ImageIO;

import java.text.ParseException;
import java.util.Properties;

public class FairPlay extends JFrame { 
		private static final long serialVersionUID = 1L;
		private JTextField rez;
		private JFormattedTextField nn;
		private JFormattedTextField aa;
		private JFormattedTextField ss;
		private JRadioButton abstract1;
		private JRadioButton abstract2;
		
		private static String FILE_MENU;
		private static String RULES_ITEM;
		private static String LABEL_R;
		private static String EXAMPLE_ITEM;
		private static String LABEL_E;
		private static String BUTTON_Z;
		private static String EXIT_ITEM;
		private static String FILE_MENU2;
		private static String LOCAL_MENU;
		private static String FILE_MENU3;
		private static String INFO_MENU;
		private static String LABEL_A;
		private static String LABEL_1;
		private static String LABEL_2;
		private static String LABEL_3;
		private static String LABEL_4;
		private static String LABEL_5;
		private static String BUTTON;
		private static String BORDER;
		private static String ABSTRACT1;
		private static String ABSTRACT2;
		
		private String leng;
		
		FairPlay() throws IOException{
			super ("Fair Play");
			setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setSize(500, 500);
	        setLocationRelativeTo(null);
	        setLayout(null);
	        
	        BufferedReader reader = new BufferedReader(new FileReader("leng.txt"));
	        leng = reader.readLine();
	        reader.close();

	        final Properties props = new Properties();
	        FileInputStream in = null;
	        InputStreamReader inR = null;
	        try {
	            in = new FileInputStream("lang"+leng+".properties");
	            inR = new InputStreamReader(in, "UTF-8");
	        } catch (UnsupportedEncodingException ex) {
	        } catch (FileNotFoundException ex) {
	        }
	        try {
	        	props.load(inR);
	        } catch (IOException ex) {
	        }
	        
	        FILE_MENU = props.getProperty("FILE_MENU");
	        RULES_ITEM = props.getProperty("RULES_ITEM");
	        LABEL_R = props.getProperty("LABEL_R");
	        EXAMPLE_ITEM = props.getProperty("EXAMPLE_ITEM");
	        LABEL_E = props.getProperty("LABEL_E");
	        BUTTON_Z = props.getProperty("BUTTON_Z");
	        EXIT_ITEM = props.getProperty("EXIT_ITEM");
	        FILE_MENU2 = props.getProperty("FILE_MENU2");
	        LOCAL_MENU = props.getProperty("LOCAL_MENU");
	        FILE_MENU3 = props.getProperty("FILE_MENU3");
	        INFO_MENU = props.getProperty("INFO_MENU");
	        LABEL_A = props.getProperty("LABEL_A");
	        LABEL_1 = props.getProperty("LABEL_1");
	        LABEL_2 = props.getProperty("LABEL_2");
	        LABEL_3 = props.getProperty("LABEL_3");
	        LABEL_4 = props.getProperty("LABEL_4");
	        LABEL_5 = props.getProperty("LABEL_5");
	        BUTTON = props.getProperty("BUTTON");
	        BORDER = props.getProperty("BORDER");
	        ABSTRACT1 = props.getProperty("ABSTRACT1");
	        ABSTRACT2 = props.getProperty("ABSTRACT2");
	        
	        JMenuBar menuBar = new JMenuBar();
	        
	        JMenu fileMenu = new JMenu(FILE_MENU);
	        fileMenu.setFont(getFont());
	        
	        JMenuItem rulesItem = new JMenuItem(RULES_ITEM);
	        rulesItem.setFont(getFont());
	        fileMenu.add(rulesItem);
	        
	        rulesItem.addActionListener(new ActionListener() {           
	            public void actionPerformed(ActionEvent e) {

	            	JFrame rulesWindow = new JFrame(RULES_ITEM);
	            	rulesWindow.setSize(550, 800);
	            	rulesWindow.setLocationRelativeTo(null);
	            	rulesWindow.setLayout(null);
	            	rulesWindow.setVisible(true);
	            	JLabel labelR = new JLabel(LABEL_R);
	            	labelR.setSize(500, 750);
	        	    labelR.setLocation(25, 5);
	        	    rulesWindow.add(labelR);
	            
	            }           
	        });
	         
	        JMenuItem exampleItem = new JMenuItem(EXAMPLE_ITEM);
	        exampleItem.setFont(getFont());
	        fileMenu.add(exampleItem);
	        
	        exampleItem.addActionListener(new ActionListener() {           
	            public void actionPerformed(ActionEvent e) {

	            	final JFrame exampleWindow = new JFrame(EXAMPLE_ITEM);
	            	exampleWindow.setSize(550, 300);
	            	exampleWindow.setLocationRelativeTo(null);
	            	exampleWindow.setLayout(null);
	            	exampleWindow.setVisible(true);
	            	JLabel labelE = new JLabel(LABEL_E);
	            	labelE.setSize(500, 200);
	        	    labelE.setLocation(25, 5);
	        	    exampleWindow.add(labelE);
	        	    
	        	    JButton buttonz = new JButton(BUTTON_Z);
	        	    buttonz.addActionListener(new ActionListener() {           
	                    public void actionPerformed(ActionEvent e) {
	                    	nn.setText(String.valueOf("20"));
	                    	aa.setText(String.valueOf("10"));
	                    	ss.setText(String.valueOf("10"));
	                    	exampleWindow.setVisible(false);
	                    }           
	                });
	        	    buttonz.setSize(120, 20);
	        	    buttonz.setLocation(220, 200);
	        	    exampleWindow.add(buttonz);
	            
	            }           
	        });

	        fileMenu.addSeparator();
	         
	        JMenuItem exitItem = new JMenuItem(EXIT_ITEM);
	        exitItem.setFont(getFont());
	        fileMenu.add(exitItem);
	        
	        exitItem.addActionListener(new ActionListener() {           
	            public void actionPerformed(ActionEvent e) {
	                System.exit(0);             
	            }           
	        });
	        
	        menuBar.add(fileMenu);
	        
	        
	        JMenu fileMenu2 = new JMenu(FILE_MENU2);
	        fileMenu.setFont(getFont());
	        
	        JMenu localMenu = new JMenu(LOCAL_MENU);
	        localMenu.setFont(getFont());
	        fileMenu2.add(localMenu);
	         
	        JMenuItem ukraineItem = new JMenuItem("Українською мовою");
	        ukraineItem.setFont(getFont());
	        localMenu.add(ukraineItem);
	        ukraineItem.addActionListener(new ActionListener() {           
	            public void actionPerformed(ActionEvent e) {
	            	BufferedWriter out = null;
					try {
						out = new BufferedWriter(new FileWriter("leng.txt"));
					} catch (IOException e1) {
						e1.printStackTrace();
					}
	    	        try {
						out.write("ukr");
					} catch (IOException e1) {
						e1.printStackTrace();
					}
	    	        try {
						out.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
	            }
	        });
	         
	        JMenuItem englishItem = new JMenuItem("English language");
	        englishItem.setFont(getFont());
	        localMenu.add(englishItem);
	        englishItem.addActionListener(new ActionListener() {           
	            public void actionPerformed(ActionEvent e) {
	            	BufferedWriter out = null;
					try {
						out = new BufferedWriter(new FileWriter("leng.txt"));
					} catch (IOException e1) {
						e1.printStackTrace();
					}
	    	        try {
						out.write("eng");
					} catch (IOException e1) {
						e1.printStackTrace();
					}
	    	        try {
						out.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
	            }
	        });
	        
	        menuBar.add(fileMenu2);

	        JMenu fileMenu3 = new JMenu(FILE_MENU3);
	        fileMenu.setFont(getFont());
	        
	        JMenuItem infoMenu = new JMenuItem(INFO_MENU);
	        infoMenu.setFont(getFont());
	        fileMenu3.add(infoMenu);
	        
	        infoMenu.addActionListener(new ActionListener() {           
	            public void actionPerformed(ActionEvent e) {

	            	JFrame aboutWindow = new JFrame(INFO_MENU);
	            	aboutWindow.setSize(500, 150);
	            	aboutWindow.setLocationRelativeTo(null);
	            	aboutWindow.setLayout(null);
	            	aboutWindow.setVisible(true);
	            	JLabel labelA = new JLabel(LABEL_A);
	            	labelA.setSize(450, 100);
	        	    labelA.setLocation(25, 5);
	        	    aboutWindow.add(labelA);
	            
	            }           
	        });
	        
	        menuBar.add(fileMenu3);
	        setJMenuBar(menuBar);
	        

		    JLabel label1 = new JLabel(LABEL_1);
		    label1.setSize(450, 40);
		    label1.setLocation(25, 25);
		    try {label1.setIcon(new ImageIcon(ImageIO.read(new File("logo.png"))));
			} catch (IOException e) {e.printStackTrace();}
		    add(label1);
		    
		    JLabel label2 = new JLabel(LABEL_2);
		    label2.setSize(120, 20);
		    label2.setLocation(25, 100);
		    add(label2);
		    try
		      {
		         MaskFormatter formatter = new MaskFormatter("**");
		         formatter.setValidCharacters("0123456789 ,");
		         nn = new JFormattedTextField(formatter);             
		         nn.setSize(120, 20);
		         nn.setLocation(25, 120);
		         add(nn);      
		      }
		      catch (ParseException exception){exception.printStackTrace();}
		    
		    
		    JLabel label3 = new JLabel(LABEL_3);
		    label3.setSize(120, 20);
		    label3.setLocation(150, 100);
		    add(label3);
		    try
		      {
		         MaskFormatter formatter = new MaskFormatter("**");
		         formatter.setValidCharacters("0123456789 ,");
		         aa = new JFormattedTextField(formatter);             
		         aa.setSize(120, 20);
		         aa.setLocation(150, 120);
		         add(aa);      
		      }
		      catch (ParseException exception){exception.printStackTrace();}
		    
		    JLabel label4 = new JLabel(LABEL_4);
		    label4.setSize(120, 20);
		    label4.setLocation(275, 100);
		    add(label4);
		    try
		      {
		         MaskFormatter formatter = new MaskFormatter("**");
		         formatter.setValidCharacters("0123456789 ,");
		         ss = new JFormattedTextField(formatter);             
		         ss.setSize(120, 20);
		         ss.setLocation(275, 120);
		         add(ss);      
		      }
		      catch (ParseException exception){exception.printStackTrace();}
		    
		    
		    JLabel label5 = new JLabel(LABEL_5);
		    label5.setSize(120, 20);
		    label5.setLocation(150, 300);
		    add(label5);
		    rez = new JTextField();
		    rez.setSize(145, 20);
		    rez.setLocation(150, 320);
		    add(rez);
		    
		    JButton button = new JButton(BUTTON);
		    ActionListener actionListener = new TestActionListener();
		    button.addActionListener(actionListener);
		    button.setSize(145, 20);
		    button.setLocation(150, 350);
		    add(button);

		    JPanel panel = new JPanel();
	        Border border = BorderFactory.createTitledBorder(BORDER);
	        panel.setBorder(border);
	        panel.setSize(300,80);
	        panel.setLocation(50, 160);
	        ButtonGroup group = new ButtonGroup();
	        abstract1 = new JRadioButton(ABSTRACT1);
	        abstract1.setSelected(true);
	        panel.add(abstract1);
	        group.add(abstract1);
	        abstract2 = new JRadioButton(ABSTRACT2);
	        panel.add(abstract2);
	        group.add(abstract2);
	        add(panel);
	        
	        
			}

	public double fact(double num) {
		return (num == 0) ? 1 : num * fact(num - 1);
		}
	
	public double rezzz(double n, double a, int s) {
		return (fact(n-a)*fact(s))/(fact(s-a)*fact(n));
		}

	public class TestActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int s;
			double n,a;
			String string1, string2,string3;
			string1 = nn.getText().replaceAll(" ", "");
			string2 = aa.getText().replaceAll(" ", "");
			string3 = ss.getText().replaceAll(" ", "");
			
			if (string1 == null || "".equals(string1) || string1.trim().length() == 0){
				JOptionPane.showMessageDialog(null, "Шановний! \n Ви не ввели значення Кількості клітинок. \n Будьте такі ласкаві та введіть Кількость клітинок для продовження підрахунку. \n Дякую!");
				}
			else if (string2 == null || "".equals(string2) || string2.trim().length() == 0){
				JOptionPane.showMessageDialog(null, "Шановний! \n Ви не ввели значення Кількості зірочок. \n Будьте такі ласкаві та введіть Кількость зірочок для продовження підрахунку. \n Дякую!");
				}
			else if (string3 == null || "".equals(string3) || string3.trim().length() == 0){
				JOptionPane.showMessageDialog(null, "Шановний! \n Ви не ввели значення Кількості спроб. \n Будьте такі ласкаві та введіть Кількость спроб для продовження підрахунку. \n Дякую!");
				}
			else {
			n = Double.parseDouble(string1);
			a = Double.parseDouble(string2);
			s = Integer.parseInt(string3);
			
			if (n<a){
				JOptionPane.showMessageDialog(null, "Шановний! А що це Ви тут робите? \n Кількість зірочок не може бути більшою ніж кількість клітинок! \n Спрбуйте ще раз.");
				}
			else if (n<s){
				JOptionPane.showMessageDialog(null, "Шановний! А що це Ви тут робите? \n Кількість спроб не може бути більшою ніж кількість клітинок! \n Спрбуйте ще раз.");
				}
			else if (s<a){
				JOptionPane.showMessageDialog(null, "Шановний! А що це Ви тут робите? \n Кількість спроб не може бути меншою ніж кількість зірочок! \n Спрбуйте ще раз.");
				}
			else {
			double rezult=0;

				if (abstract1.isSelected()){	// proverka na tochnoe sootvetstvie
					byte c=1;
					byte k=0;
					for( ;s>=a;s--){
						rezult+=(c*rezzz(n, a, s));
						c=-1;
						k+=1;
						if (k==2){break;}
						}
					}

				else{	// proverka na sovokupnoe sootvetstvie
					rezult=rezzz(n, a, s);
					}
				
			rez.setText(String.valueOf(rezult));
	}
	}}
	}

	
	public static void main (String [] args) throws IOException {
	JFrame myWindow = new FairPlay();
	myWindow.setVisible(true);
	}
	}

