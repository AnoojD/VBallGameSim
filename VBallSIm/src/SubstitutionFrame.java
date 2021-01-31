import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class SubstitutionFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtAddPlayer;
	private JTextField txtEnterPlayerNumber;
	private JTextField textField;
	private int num;
	private int numcount;
	private JTextField txtEnterNumberOf;
	private JTextField textField_2;
	private int count1;
	private int count2;
	private Object[][] matrix;
	private Object[][] matrix2;
	private JTextField playertxt;
	private JTextField newPlayer;
	private ArrayList<Player> playerNames1;
	private ArrayList<Player> playerNames2;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public SubstitutionFrame(Storage s, Team1Storage s1, Team2Storage s2, boolean check) {
		// s.loadFile();
		matrix = s.getMatrix();
		matrix2 = s.getMatrix2();
		playerNames1 = s1.getList();
		playerNames2 = s2.getList();
		count1 = s.getSub1();
		count2 = s.getSub2();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 268);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		txtAddPlayer = new JTextField();
		txtAddPlayer.setBackground(new Color(255, 250, 205));
		txtAddPlayer.setBounds(46, 5, 316, 44);
		txtAddPlayer.setFont(new Font("Tahoma", Font.PLAIN, 33));
		txtAddPlayer.setText("Substitute Player");
		txtAddPlayer.setHorizontalAlignment(SwingConstants.CENTER);
		txtAddPlayer.setEditable(false);
		txtAddPlayer.setColumns(10);

		txtEnterPlayerNumber = new JTextField();
		txtEnterPlayerNumber.setBackground(new Color(224, 255, 255));
		txtEnterPlayerNumber.setBounds(27, 84, 246, 20);
		txtEnterPlayerNumber.setEditable(false);
		txtEnterPlayerNumber.setText("Enter Position of Player to Be Substituted:");
		txtEnterPlayerNumber.setColumns(10);

		textField = new JTextField();
		textField.setForeground(Color.BLUE);
		textField.setBounds(279, 84, 86, 20);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("Substitute");
		btnNewButton.setBackground(new Color(230, 230, 250));
		btnNewButton.setBounds(156, 155, 107, 33);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (textField.getText().equals("") && textField_2.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Nothing has been inputed...");
				} else if (textField.getText().equals("") && !textField_2.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Position has not been Entered");
				} else if (!textField.getText().equals("") && textField_2.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Player Number has not been Entered");
				} else if (!isInteger(textField.getText())) {
					JOptionPane.showMessageDialog(null,
							"Position must not contain letters and must be a positive Integer value");
				} else if (!isInteger(textField_2.getText())) {
					JOptionPane.showMessageDialog(null,
							"Player Number must not contain letters and must be a positive Integer value");
				} else {
					String name = newPlayer.getText();
					int playernum = Integer.parseInt(textField_2.getText());
					num = Integer.parseInt(textField.getText());

					if (check == true) {
					
						if (num == 1) {
							matrix[0][1] = playernum;
							String number = Integer.toString((int) matrix[0][1]);
							if (playerNames1.size() == 0) {
								JOptionPane.showMessageDialog(null, "There no players to sub out");
								
							} else {
								int index = s1.binarySearch(playerNames1, number);
								playerNames1.set(index, new Player(textField_2.getText(), name));
								s1.setList(playerNames1);
								s1.mergeSort(playerNames1);
								s1.updateFile();
							}
						} else if (num == 2) {
							matrix[1][1] = playernum;
							String number = Integer.toString((int) matrix[1][1]);
							if (playerNames1.size() == 0) {
								JOptionPane.showMessageDialog(null, "There no players to sub out");
							} else {
								int index = s1.binarySearch(playerNames1, number);
								playerNames1.set(index, new Player(textField_2.getText(), name));
								s1.setList(playerNames1);
								s1.mergeSort(playerNames1);
								s1.updateFile();
							}
						} else if (num == 3) {
							matrix[2][1] = playernum;
							String number = Integer.toString((int) matrix[2][1]);
							if (playerNames1.size() == 0) {
								JOptionPane.showMessageDialog(null, "There no players to sub out");
							} else {
								int index = s1.binarySearch(playerNames1, number);
								playerNames1.set(index, new Player(textField_2.getText(), name));
								s1.setList(playerNames1);
								s1.mergeSort(playerNames1);
								s1.updateFile();
							}

						} else if (num == 4) {
							matrix[3][1] = playernum;
							String number = Integer.toString((int) matrix[3][1]);
							if (playerNames1.size() == 0) {
								JOptionPane.showMessageDialog(null, "There no players to sub out");
							} else {
								int index = s1.binarySearch(playerNames1, number);
								playerNames1.set(index, new Player(textField_2.getText(), name));
								s1.setList(playerNames1);
								s1.mergeSort(playerNames1);
								s1.updateFile();
							}
						} else if (num == 5) {
							matrix[4][1] = playernum;
							String number = Integer.toString((int) matrix[4][1]);
							if (playerNames1.size() == 0) {
								JOptionPane.showMessageDialog(null, "There no players to sub out");
							} else {
								int index = s1.binarySearch(playerNames1, number);
								playerNames1.set(index, new Player(textField_2.getText(), name));
								s1.setList(playerNames1);
								s1.mergeSort(playerNames1);
								s1.updateFile();
							}
						} else {
							if (num == 6) {
								matrix[5][1] = playernum;
								String number = Integer.toString((int) matrix[5][1]);
								if (playerNames1.size() == 0) {
									JOptionPane.showMessageDialog(null, "There no players to sub out");
								} else {
									int index = s1.binarySearch(playerNames1, number);
									playerNames1.set(index, new Player(textField_2.getText(), name));
									s1.setList(playerNames1);
									s1.mergeSort(playerNames1);
									s1.updateFile();
								}
							}
						}
					} else {
					
						if (num == 1) {
							matrix2[0][1] = playernum;
							String number = Integer.toString((int) matrix2[0][1]);
							if (playerNames2.size() == 0) {
								JOptionPane.showMessageDialog(null, "There no players to sub out");
							} else {
								int index = s2.binarySearch(playerNames1, number);
								playerNames2.set(index, new Player(textField_2.getText(), name));
								s2.setList(playerNames2);
								s2.mergeSort(playerNames2);
								s2.updateFile();
							}
						} else if (num == 2) {
							matrix2[1][1] = playernum;
							String number = Integer.toString((int) matrix2[1][1]);
							if (playerNames2.size() == 0) {
								JOptionPane.showMessageDialog(null, "There no players to sub out");
							} else {
								int index = s2.binarySearch(playerNames1, number);
								playerNames2.set(index, new Player(textField_2.getText(), name));
								s2.setList(playerNames2);
								s2.mergeSort(playerNames2);
								s2.updateFile();
							}

						} else if (num == 3) {
							matrix2[2][1] = playernum;
							String number = Integer.toString((int) matrix2[2][1]);
							if (playerNames2.size() == 0) {
								JOptionPane.showMessageDialog(null, "There no players to sub out");
							} else {
								int index = s2.binarySearch(playerNames1, number);
								playerNames2.set(index, new Player(textField_2.getText(), name));
								s2.setList(playerNames2);
								s2.mergeSort(playerNames2);
								s2.updateFile();
							}
						} else if (num == 4) {
							matrix[3][1] = playernum;
							String number = Integer.toString((int) matrix2[3][1]);
							if (playerNames2.size() == 0) {
								JOptionPane.showMessageDialog(null, "There no players to sub out");
							} else {
								int index = s2.binarySearch(playerNames1, number);
								playerNames2.set(index, new Player(textField_2.getText(), name));
								s2.setList(playerNames2);
								s2.mergeSort(playerNames2);
								s2.updateFile();
							}
						} else if (num == 5) {
							matrix[4][1] = playernum;
							String number = Integer.toString((int) matrix2[4][1]);
							if (playerNames2.size() == 0) {
								JOptionPane.showMessageDialog(null, "There no players to sub out");
							} else {
								int index = s2.binarySearch(playerNames1, number);
								playerNames2.set(index, new Player(textField_2.getText(), name));
								s2.setList(playerNames2);
								s2.mergeSort(playerNames2);
								s2.updateFile();
							}
						} else {
							if (num == 6) {
								matrix[5][1] = playernum;
								String number = Integer.toString((int) matrix2[5][1]);
								if (playerNames2.size() == 0) {
									JOptionPane.showMessageDialog(null, "There no players to sub out");
								} else {
									int index = s2.binarySearch(playerNames1, number);
									playerNames2.set(index, new Player(textField_2.getText(), name));
									s2.setList(playerNames2);
									s2.mergeSort(playerNames2);
									s2.updateFile();
								}
							}
						}
					}
				}
				BookSheet book = new BookSheet(s, s1, s2);
				if (check == true) {
					DefaultTableModel m = book.getModel();
					m.setRowCount(0);
					m.addRow(matrix[0]);
					m.addRow(matrix[1]);
					m.addRow(matrix[2]);
					m.addRow(matrix[3]);
					m.addRow(matrix[4]);
					m.addRow(matrix[5]);
				} else {
					if (check == false) {
						DefaultTableModel m2 = book.getModel2();
						m2.setRowCount(0);
						m2.addRow(matrix2[0]);
						m2.addRow(matrix2[1]);
						m2.addRow(matrix2[2]);
						m2.addRow(matrix2[3]);
						m2.addRow(matrix2[4]);
						m2.addRow(matrix2[5]);
					}
				}
				s.updateFile();
				book.setVisible(true);
				setVisible(false);
			}
		});
		contentPane.setLayout(null);

		txtEnterNumberOf = new JTextField();
		txtEnterNumberOf.setBackground(new Color(224, 255, 255));
		txtEnterNumberOf.setBounds(27, 110, 246, 20);
		txtEnterNumberOf.setText("Enter Number of the New Player");
		txtEnterNumberOf.setEditable(false);
		txtEnterNumberOf.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setForeground(Color.BLUE);
		textField_2.setBounds(279, 110, 86, 20);
		textField_2.setColumns(10);
		contentPane.add(txtAddPlayer);
		contentPane.add(txtEnterPlayerNumber);
		contentPane.add(textField);
		contentPane.add(btnNewButton);
		contentPane.setLayout(null);
		contentPane.add(txtAddPlayer);
		contentPane.add(txtEnterPlayerNumber);
		contentPane.add(textField);
		contentPane.add(btnNewButton);
		contentPane.add(txtEnterNumberOf);
		contentPane.add(textField_2);

		playertxt = new JTextField();
		playertxt.setText("Enter Name of New Player");
		playertxt.setEditable(false);
		playertxt.setColumns(10);
		playertxt.setBackground(new Color(224, 255, 255));
		playertxt.setBounds(27, 58, 246, 20);
		contentPane.add(playertxt);

		newPlayer = new JTextField();
		newPlayer.setForeground(Color.BLUE);
		newPlayer.setColumns(10);
		newPlayer.setBounds(279, 58, 86, 20);
		contentPane.add(newPlayer);
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
