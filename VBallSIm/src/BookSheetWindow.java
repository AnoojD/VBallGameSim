import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BookSheetWindow extends JFrame {

	private JPanel contentPane;
	private JTextField txtVolleyball;
	private JTextField txtHome;
	private JTextField home;
	private JTextField txtVisitor;
	private JTextField away;
	private JTextField txtSite;
	private JTextField textField_4;
	private JTextField txtStart;
	private JTextField textField_6;
	private JTextField txtEnd;
	private JTextField textField_5;
	private JTextField txtLevel;
	private JButton btnNewButton;
	private JTextField txtEnterNameOf;
	private JTextField fileName;
	private String name;
	private String name2;
	private String name3;
	private JTextField firstServe;
	private String[] arr;
	private String[] levels;
	private String level;
	private JComboBox cB;
	private JComboBox comboBox;
	private ArrayList<Player> list1;
	private ArrayList<Player> list2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookSheetWindow frame = new BookSheetWindow();
					frame.setVisible(true);
					// frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BookSheetWindow() {
		level = " ";
		arr = new String[] { " ", "Home", "Away" };
		levels = new String[] { " ", "Varsity", "JV", "Frosh/Soph" };
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 952, 246);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtVolleyball = new JTextField();
		txtVolleyball.setForeground(new Color(210, 105, 30));
		txtVolleyball.setBackground(new Color(245, 245, 220));
		txtVolleyball.setEditable(false);
		txtVolleyball.setBounds(12, 12, 893, 44);
		txtVolleyball.setFont(new Font("Tahoma", Font.BOLD, 31));
		txtVolleyball.setHorizontalAlignment(SwingConstants.CENTER);
		txtVolleyball.setText("General Information to Fill Out");
		contentPane.add(txtVolleyball);
		txtVolleyball.setColumns(10);

		txtHome = new JTextField();
		txtHome.setBackground(new Color(224, 255, 255));
		txtHome.setBounds(70, 60, 66, 20);
		txtHome.setHorizontalAlignment(SwingConstants.CENTER);
		txtHome.setText("Home:");
		txtHome.setEditable(false);
		contentPane.add(txtHome);
		txtHome.setColumns(10);

		home = new JTextField();
		home.setFont(new Font("Tahoma", Font.BOLD, 11));
		home.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				home.setBackground(Color.WHITE);
				home.setForeground(new Color(210, 105, 30));
			}

			public void focusLost(FocusEvent arg0) {

				home.setBackground(new Color(250, 235, 215));
				home.setForeground(new Color(210, 105, 30));
			}
		});
		home.setBackground(new Color(250, 235, 215));
		home.setForeground(new Color(210, 105, 30));
		home.setBounds(140, 60, 65, 20);
		home.setColumns(10);
		contentPane.add(home);

		txtVisitor = new JTextField();
		txtVisitor.setBackground(new Color(224, 255, 255));
		txtVisitor.setBounds(209, 60, 66, 20);
		txtVisitor.setText("Visitor:");
		txtVisitor.setHorizontalAlignment(SwingConstants.CENTER);
		txtVisitor.setEditable(false);
		txtVisitor.setColumns(10);
		contentPane.add(txtVisitor);

		away = new JTextField();
		away.setFont(new Font("Tahoma", Font.BOLD, 11));
		away.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				away.setBackground(Color.WHITE);
				away.setForeground(new Color(210, 105, 30));
			}

			public void focusLost(FocusEvent arg0) {
				away.setBackground(new Color(250, 235, 215));
				away.setForeground(new Color(210, 105, 30));
			}
		});
		away.setBackground(new Color(250, 235, 215));
		away.setForeground(new Color(210, 105, 30));
		away.setBounds(279, 60, 65, 20);
		away.setColumns(10);
		contentPane.add(away);

		txtSite = new JTextField();
		txtSite.setBackground(new Color(224, 255, 255));
		txtSite.setBounds(348, 60, 66, 20);
		txtSite.setText("Site:");
		txtSite.setHorizontalAlignment(SwingConstants.CENTER);
		txtSite.setEditable(false);
		txtSite.setColumns(10);
		contentPane.add(txtSite);

		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				textField_4.setBackground(Color.WHITE);
				textField_4.setForeground(new Color(210, 105, 30));
			}

			public void focusLost(FocusEvent arg0) {
				textField_4.setBackground(new Color(250, 235, 215));
				textField_4.setForeground(new Color(210, 105, 30));
			}
		});
		textField_4.setBackground(new Color(250, 235, 215));
		textField_4.setForeground(new Color(210, 105, 30));
		textField_4.setBounds(418, 60, 65, 20);
		textField_4.setColumns(10);
		contentPane.add(textField_4);

		txtStart = new JTextField();
		txtStart.setBackground(new Color(224, 255, 255));
		txtStart.setBounds(487, 60, 66, 20);
		txtStart.setText("Start:");
		txtStart.setHorizontalAlignment(SwingConstants.CENTER);
		txtStart.setEditable(false);
		txtStart.setColumns(10);
		contentPane.add(txtStart);

		textField_6 = new JTextField();
		textField_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (textField_6.getText().length() >= 2) {
					e.consume();
				}
			}
		});
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_6.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				textField_6.setBackground(Color.WHITE);
				textField_6.setForeground(new Color(210, 105, 30));
			}

			public void focusLost(FocusEvent arg0) {
				textField_6.setBackground(new Color(250, 235, 215));
				textField_6.setForeground(new Color(210, 105, 30));
			}
		});
		textField_6.setBackground(new Color(250, 235, 215));
		textField_6.setForeground(new Color(210, 105, 30));
		textField_6.setBounds(557, 60, 40, 20);
		textField_6.setColumns(10);
		contentPane.add(textField_6);

		txtEnd = new JTextField();
		txtEnd.setBackground(new Color(224, 255, 255));
		txtEnd.setBounds(677, 60, 66, 20);
		txtEnd.setText("End:");
		txtEnd.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnd.setEditable(false);
		txtEnd.setColumns(10);
		contentPane.add(txtEnd);

		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (textField_5.getText().length() >= 2) {
					e.consume();
				}
			}
		});
		textField_5.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				textField_5.setBackground(Color.WHITE);
				textField_5.setForeground(new Color(210, 105, 30));
			}

			public void focusLost(FocusEvent arg0) {
				textField_5.setBackground(new Color(250, 235, 215));
				textField_5.setForeground(new Color(210, 105, 30));
			}
		});
		textField_5.setBackground(new Color(250, 235, 215));
		textField_5.setForeground(new Color(210, 105, 30));
		textField_5.setBounds(749, 60, 40, 20);
		textField_5.setColumns(10);
		contentPane.add(textField_5);

		txtLevel = new JTextField();
		txtLevel.setBackground(new Color(224, 255, 255));
		txtLevel.setBounds(296, 91, 66, 20);
		txtLevel.setText("Level:");
		txtLevel.setHorizontalAlignment(SwingConstants.CENTER);
		txtLevel.setEditable(false);
		txtLevel.setColumns(10);
		contentPane.add(txtLevel);

		cB = new JComboBox();
		cB.setFont(new Font("Tahoma", Font.BOLD, 11));
		cB.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				cB.setBackground(Color.WHITE);
				cB.setForeground(new Color(210, 105, 30));
			}

			public void focusLost(FocusEvent arg0) {
				cB.setBackground(new Color(250, 235, 215));
				cB.setForeground(new Color(210, 105, 30));
			}
		});
		cB.setBackground(new Color(250, 235, 215));
		cB.setForeground(new Color(210, 105, 30));
		cB.setModel(new DefaultComboBoxModel(arr));
		cB.setBounds(530, 91, 81, 20);
		contentPane.add(cB);

		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				comboBox.setBackground(Color.WHITE);
				comboBox.setForeground(new Color(210, 105, 30));
			}

			public void focusLost(FocusEvent arg0) {
				comboBox.setBackground(new Color(250, 235, 215));
				comboBox.setForeground(new Color(210, 105, 30));
			}
		});
		comboBox.setBackground(new Color(250, 235, 215));
		comboBox.setForeground(new Color(210, 105, 30));
		comboBox.setModel(new DefaultComboBoxModel(levels));
		comboBox.setBounds(368, 91, 81, 20);
		contentPane.add(comboBox);

		btnNewButton = new JButton("Finish");
		btnNewButton.setBackground(new Color(255, 248, 220));
		btnNewButton.setBounds(244, 161, 189, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (isInteger(home.getText())) {
					JOptionPane.showMessageDialog(null, "Home Team Name cannot be a number");
				} else if (isInteger(away.getText())) {
					JOptionPane.showMessageDialog(null, "Away Team Name cannot be a number");
				} else if (isInteger(textField_4.getText())) {
					JOptionPane.showMessageDialog(null, "Location cannot be a number");
				} else if (!isInteger(textField_6.getText())) {
					JOptionPane.showMessageDialog(null, "Start time must be a number in the format hours: minutes");
				} else if (!isInteger(textField_1.getText())) {
					JOptionPane.showMessageDialog(null, "Start time must be a number in the format hours: minutes");
				} else if (!isInteger(textField_5.getText())) {
					JOptionPane.showMessageDialog(null, "End time must be a number in the format hours: minutes");
				} else if (!isInteger(textField_3.getText())) {
					JOptionPane.showMessageDialog(null, "End time must be a number in the format hours: minutes");
				} else {
					Object[][] mat = new Object[6][2];
					Object[][] mat2 = new Object[6][2];
					for (int i = 0; i < 6; i++) {
						mat[i][0] = i + 1;
					}
					for (int i = 0; i < 6; i++) {
						mat2[i][0] = i + 1;
					}
					list1 = new ArrayList<Player>();
					list2 = new ArrayList<Player>();
					name = fileName.getText();
					name2 = home.getText();
					name3 = away.getText();
					Storage storage = new Storage(name, mat, mat2);
					Team1Storage s1 = new Team1Storage(name2, list1, storage);
					Team2Storage s2 = new Team2Storage(name3, list2, storage);
					storage.setTeam1(home.getText());
					storage.setTeam2(away.getText());
					if (cB.getSelectedItem().equals("Home")) {
						storage.setCase1("true");
						storage.setGame("true2");
					} else if (cB.getSelectedItem().equals("Away")) {
						storage.setCase1("false");
						storage.setGame("true");
					}
					updateGeneralInfoFile();
					BookSheet frame = new BookSheet(storage, s1, s2);
					frame.setVisible(true);
					setVisible(false);
//				BookSheet book = new BookSheet();
//				book.setVisible(true);
//              book.setExtendedState(JFrame.MAXIMIZED_BOTH);
				}
			}
		});
		contentPane.add(btnNewButton);

		txtEnterNameOf = new JTextField();
		txtEnterNameOf.setBackground(new Color(224, 255, 255));
		txtEnterNameOf.setText("Enter Name of New File:");
		txtEnterNameOf.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterNameOf.setEditable(false);
		txtEnterNameOf.setColumns(10);
		txtEnterNameOf.setBounds(219, 130, 220, 20);
		contentPane.add(txtEnterNameOf);

		fileName = new JTextField();
		fileName.setFont(new Font("Tahoma", Font.BOLD, 11));
		fileName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				fileName.setBackground(Color.WHITE);
				fileName.setForeground(new Color(210, 105, 30));
			}

			public void focusLost(FocusEvent arg0) {
				fileName.setBackground(new Color(250, 235, 215));
				fileName.setForeground(new Color(210, 105, 30));
			}
		});
		fileName.setBackground(new Color(250, 235, 215));
		fileName.setForeground(new Color(210, 105, 30));
		fileName.setColumns(10);
		fileName.setBounds(449, 130, 220, 20);
		contentPane.add(fileName);

		JButton existingFile = new JButton("Open Existing Files");
		existingFile.setBackground(new Color(255, 248, 220));
		existingFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Please select the files in the following order: " + "\n"
						+ "1) Main Menu File" + "\n" + "2) Team 1 File" + "\n" + "3) Team 2 File");
				JFileChooser jfc = new JFileChooser("C:\\Users\\mcdes\\Downloads\\IA Project-20181120T195228Z-001");
				int returnValue = jfc.showOpenDialog(null);
				// int returnValue = jfc.showSaveDialog(null);
				if (returnValue == JFileChooser.APPROVE_OPTION) {
					File selectedFile = jfc.getSelectedFile();
					name = selectedFile.getName();
				}
				JFileChooser jfc2 = new JFileChooser("C:\\Users\\mcdes\\Downloads\\IA Project-20181120T195228Z-001");
				int returnValue2 = jfc2.showOpenDialog(null);
				// int returnValue = jfc.showSaveDialog(null);
				if (returnValue2 == JFileChooser.APPROVE_OPTION) {
					File selectedFile = jfc2.getSelectedFile();
					name2 = selectedFile.getName();
				}
				// W:\\IB CS Y1\\IA Project
				JFileChooser jfc3 = new JFileChooser(
						"C:\\\\Users\\\\mcdes\\\\Downloads\\\\IA Project-20181120T195228Z-001");
				int returnValue3 = jfc3.showOpenDialog(null);
				// int returnValue = jfc.showSaveDialog(null);
				if (returnValue3 == JFileChooser.APPROVE_OPTION) {
					File selectedFile = jfc3.getSelectedFile();
					name3 = selectedFile.getName();
				}
				if (name == null || name2 == null || name3 == null) {
					
				} else {
					Object[][] mat = new Object[6][2];
					Object[][] mat2 = new Object[6][2];
					for (int i = 0; i < 6; i++) {
						mat[i][0] = i + 1;
					}
					for (int i = 0; i < 6; i++) {
						mat2[i][0] = i + 1;
					}
					list1 = new ArrayList<Player>();
					list2 = new ArrayList<Player>();
					Storage storage = new Storage(name, mat, mat2);
					Team1Storage s1 = new Team1Storage(name2, list1, storage);
					Team2Storage s2 = new Team2Storage(name3, list2, storage);
					BookSheet frame = new BookSheet(storage, s1, s2);
					frame.setVisible(true);
				}
			}
		});
		existingFile.setBounds(464, 161, 189, 23);
		contentPane.add(existingFile);

		firstServe = new JTextField();
		firstServe.setBackground(new Color(224, 255, 255));
		firstServe.setText("First Serve:");
		firstServe.setHorizontalAlignment(SwingConstants.CENTER);
		firstServe.setEditable(false);
		firstServe.setColumns(10);
		firstServe.setBounds(459, 91, 66, 20);
		contentPane.add(firstServe);

		textField = new JTextField();
		textField.setText(":");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(new Color(224, 255, 255));
		textField.setBounds(600, 60, 29, 20);
		contentPane.add(textField);

		textField_1 = new JTextField();
		textField_1.setForeground(new Color(210, 105, 30));
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(250, 235, 215));
		textField_1.setBounds(633, 60, 40, 20);
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (textField_1.getText().length() >= 2) {
					e.consume();
				}
			}
		});
		contentPane.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setText(":");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(224, 255, 255));
		textField_2.setBounds(792, 60, 29, 20);
		contentPane.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setForeground(new Color(210, 105, 30));
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(250, 235, 215));
		textField_3.setBounds(825, 60, 40, 20);
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (textField_3.getText().length() >= 2) {
					e.consume();
				}
			}
		});
		contentPane.add(textField_3);

	}

	public void updateGeneralInfoFile() {
		if (name.contains(".txt")) {
			FileWriter fileWriter = null;
			try {
				fileWriter = new FileWriter(name + " General Information");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			PrintWriter printWriter = new PrintWriter(fileWriter);
			printWriter.println("Home Team: ");
			printWriter.println(home.getText() + " \n");
			printWriter.println("Away Team: ");
			printWriter.println(away.getText() + " \n");
			printWriter.println("Site: ");
			printWriter.println(textField_4.getText() + " \n");
			printWriter.println("Start Time: ");
			printWriter.println(textField_6.getText() + ":" + textField_1.getText() + "\n");
			printWriter.println("End Time: ");
			printWriter.println(textField_5.getText() + ":" + textField_3.getText() + " \n");
			printWriter.println("Level: ");
			printWriter.println(comboBox.getSelectedItem() + " \n");
			printWriter.println("First Serve: ");
			printWriter.println(cB.getSelectedItem() + " \n");
			try {
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			printWriter.close();
		}
		// PrintWriter writer = new PrintWriter(null);
		else {
			FileWriter fileWriter = null;
			try {
				fileWriter = new FileWriter(name + " General Information" + ".txt");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			PrintWriter printWriter = new PrintWriter(fileWriter);
			printWriter.println("Home Team: ");
			printWriter.println(home.getText() + " \n");
			printWriter.println("Away Team: ");
			printWriter.println(away.getText() + " \n");
			printWriter.println("Site: ");
			printWriter.println(textField_4.getText() + " \n");
			printWriter.println("Start Time: ");
			printWriter.println(textField_6.getText() + ":" + textField_1.getText() + "\n");
			printWriter.println("End Time: ");
			printWriter.println(textField_5.getText() + ":" + textField_3.getText() + " \n");
			printWriter.println("Level: ");
			printWriter.println(comboBox.getSelectedItem() + " \n");
			printWriter.println("First Serve: ");
			printWriter.println(cB.getSelectedItem() + " \n");
			try {
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			printWriter.close();
		}
		// PrintWriter writer = new PrintWriter(null);
	}

	public boolean isInteger(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException nfe) {
		}
		return false;
	}
}