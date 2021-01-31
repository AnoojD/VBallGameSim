import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class AddPlayer extends JFrame {

	private JPanel contentPane;
	private JTextField txtAddPlayer;
	private JTextField txtEnterPlayerNumber;
	private JTextField textField;
	private Player player;
	private JTextField txtEnterNumberFor;
	private JTextField numberText;
	private int num;
	private int count;
	private int count1;
	private Object[][] matrix;
	private Object[][] matrix2;
	private JTextField txtEnterPlayerName;
	private JTextField playerName;
	private ArrayList<Player> playerNames1;
	private ArrayList<Player> playerNames2;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public AddPlayer(Storage s, Team1Storage s1, Team2Storage s2, boolean check) {
		// s.loadFile();
		playerNames1 = s1.getList();
		playerNames2 = s2.getList();
		matrix = s.getMatrix();
		matrix2 = s.getMatrix2();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 248);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		txtAddPlayer = new JTextField();
		txtAddPlayer.setBackground(new Color(255, 250, 205));
		txtAddPlayer.setBounds(46, 5, 316, 44);
		txtAddPlayer.setFont(new Font("Tahoma", Font.PLAIN, 33));
		txtAddPlayer.setText("Add Player");
		txtAddPlayer.setHorizontalAlignment(SwingConstants.CENTER);
		txtAddPlayer.setEditable(false);
		txtAddPlayer.setColumns(10);

		txtEnterPlayerNumber = new JTextField();
		txtEnterPlayerNumber.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterPlayerNumber.setBackground(new Color(224, 255, 255));
		txtEnterPlayerNumber.setBounds(46, 126, 214, 20);
		txtEnterPlayerNumber.setEditable(false);
		txtEnterPlayerNumber.setText("Enter Player Number to Add to Roster:");
		txtEnterPlayerNumber.setColumns(10);

		textField = new JTextField();
		textField.setForeground(Color.BLUE);
		textField.setBounds(266, 126, 96, 20);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBackground(new Color(230, 230, 250));
		btnNewButton.setBounds(175, 157, 68, 33);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (textField.getText().equals("") && numberText.getText().equals("")
						&& playerName.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Nothing has been inputed...");
				} else if (textField.getText().equals("") && !numberText.getText().equals("")
						&& playerName.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Player Number has not been Entered");
				} else if (!textField.getText().equals("") && numberText.getText().equals("")
						&& playerName.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Position has not been Entered");
				} else if (textField.getText().equals("") && numberText.getText().equals("")
						&& !playerName.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Player Number has not been Entered");
				} else if (!isInteger(textField.getText())) {
					JOptionPane.showMessageDialog(null,
							"Player Number must not contain letters and must be a positive Integer value");
				} else if (!isInteger(numberText.getText())) {
					JOptionPane.showMessageDialog(null,
							"Position must not contain letters and must be a positive Integer value");
				} else if (isInteger(playerName.getText())) {
					JOptionPane.showMessageDialog(null, "Player Name cannot be a number");
				} else {
					Player player = new Player(textField.getText(), playerName.getText());
					num = Integer.parseInt(numberText.getText());
					if (check == true) {
						if (num == 1) {
							if (containsPlayer(matrix[0], matrix[1], matrix[2], matrix[3], matrix[4], matrix[5])) {
								JOptionPane.showMessageDialog(null, "Player has already been added to the roster");
							} else {
								if (matrix[0][1] == null || matrix[0][1].equals("")) {
									matrix[0][1] = Integer.parseInt(textField.getText());
									playerNames1.add(player);
									s1.setList(playerNames1);
									s1.mergeSort(s1.getList());
									s1.updateFile();
								} else {
									JOptionPane.showMessageDialog(null, "Player already exists in that position");
								}
							}
						} else if (num == 2) {
							if (containsPlayer(matrix[0], matrix[1], matrix[2], matrix[3], matrix[4], matrix[5])) {
								JOptionPane.showMessageDialog(null, "Player has already been added to the roster");
							} else {
								if (matrix[1][1] == null || matrix[1][1].equals("")) {
									matrix[1][1] = Integer.parseInt(textField.getText());
									playerNames1.add(player);
									s1.setList(playerNames1);
									s1.mergeSort(s1.getList());
									s1.updateFile();
								} else {
									JOptionPane.showMessageDialog(null, "Player already exists in that position");
								}
							}
						} else if (num == 3) {
							if (containsPlayer(matrix[0], matrix[1], matrix[2], matrix[3], matrix[4], matrix[5])) {
								JOptionPane.showMessageDialog(null, "Player has already been added to the roster");
							} else {
								if (matrix[2][1] == null || matrix[2][1].equals("")) {
									matrix[2][1] = Integer.parseInt(textField.getText());
									playerNames1.add(player);
									s1.setList(playerNames1);
									s1.mergeSort(s1.getList());
									s1.updateFile();
								} else {
									JOptionPane.showMessageDialog(null, "Player already exists in that position");
								}
							}
						} else if (num == 4) {
							if (containsPlayer(matrix[0], matrix[1], matrix[2], matrix[3], matrix[4], matrix[5])) {
								JOptionPane.showMessageDialog(null, "Player has already been added to the roster");
							} else {
								if (matrix[3][1] == null || matrix[3][1].equals("")) {
									matrix[3][1] = Integer.parseInt(textField.getText());
									playerNames1.add(player);
									s1.setList(playerNames1);
									s1.mergeSort(s1.getList());
									s1.updateFile();
								} else {
									JOptionPane.showMessageDialog(null, "Player already exists in that position");
								}
							}
						} else if (num == 5) {
							if (containsPlayer(matrix[0], matrix[1], matrix[2], matrix[3], matrix[4], matrix[5])) {
								JOptionPane.showMessageDialog(null, "Player has already been added to the roster");
							} else {
								if (matrix[4][1] == null || matrix[4][1].equals("")) {
									matrix[4][1] = Integer.parseInt(textField.getText());
									playerNames1.add(player);
									s1.setList(playerNames1);
									s1.mergeSort(s1.getList());
									s1.updateFile();
								} else {
									JOptionPane.showMessageDialog(null, "Player already exists in that position");
								}
							}
						} else {
							if (num == 6) {
								if (containsPlayer(matrix[0], matrix[1], matrix[2], matrix[3], matrix[4], matrix[5])) {
									JOptionPane.showMessageDialog(null, "Player has already been added to the roster");
								} else {
									if (matrix[5][1] == null || matrix[5][1].equals("")) {
										matrix[5][1] = Integer.parseInt(textField.getText());
										playerNames1.add(player);
										s1.setList(playerNames1);
										s1.mergeSort(s1.getList());
										s1.updateFile();
									} else {
										JOptionPane.showMessageDialog(null, "Player already exists in that position");
									}
								}
							}
						}
					} else {
						if (num == 1) {
							if (containsPlayer(matrix2[0], matrix2[1], matrix2[2], matrix2[3], matrix2[4], matrix2[5])) {
								JOptionPane.showMessageDialog(null, "Player has already been added to the roster");
							} else {
								if (matrix2[0][1] == null || matrix2[0][1].equals("")) {
									matrix2[0][1] = Integer.parseInt(textField.getText());
									playerNames2.add(player);
									s2.setList(playerNames2);
									s2.mergeSort(s2.getList());
									s2.updateFile();
								} else {
									JOptionPane.showMessageDialog(null, "Player already exists in that position");
								}
							}
						} else 	if (num == 2) {
							if (containsPlayer(matrix2[0], matrix2[1], matrix2[2], matrix2[3], matrix2[4], matrix2[5])) {
								JOptionPane.showMessageDialog(null, "Player has already been added to the roster");
							} else {
								if (matrix2[1][1] == null || matrix2[1][1].equals("")) {
									matrix2[1][1] = Integer.parseInt(textField.getText());
									playerNames2.add(player);
									s2.setList(playerNames2);
									s2.mergeSort(s2.getList());
									s2.updateFile();
								} else {
									JOptionPane.showMessageDialog(null, "Player already exists in that position");
								}
							}
						}else 	if (num == 3) {
							if (containsPlayer(matrix2[0], matrix2[1], matrix2[2], matrix2[3], matrix2[4], matrix2[5])) {
								JOptionPane.showMessageDialog(null, "Player has already been added to the roster");
							} else {
								if (matrix2[2][1] == null || matrix2[2][1].equals("")) {
									matrix2[2][1] = Integer.parseInt(textField.getText());
									playerNames2.add(player);
									s2.setList(playerNames1);
									s2.mergeSort(s2.getList());
									s2.updateFile();
								} else {
									JOptionPane.showMessageDialog(null, "Player already exists in that position");
								}
							}
						} else 	if (num == 4) {
							if (containsPlayer(matrix2[0], matrix2[1], matrix2[2], matrix2[3], matrix2[4], matrix2[5])) {
								JOptionPane.showMessageDialog(null, "Player has already been added to the roster");
							} else {
								if (matrix2[3][1] == null || matrix2[3][1].equals("")) {
									matrix2[3][1] = Integer.parseInt(textField.getText());
									playerNames2.add(player);
									s2.setList(playerNames2);
									s2.mergeSort(s2.getList());
									s2.updateFile();
								} else {
									JOptionPane.showMessageDialog(null, "Player already exists in that position");
								}
							}
						} else 	if (num == 5) {
							if (containsPlayer(matrix2[0], matrix2[1], matrix2[2], matrix2[3], matrix2[4], matrix2[5])) {
								JOptionPane.showMessageDialog(null, "Player has already been added to the roster");
							} else {
								if (matrix2[4][1] == null || matrix2[4][1].equals("")) {
									matrix2[4][1] = Integer.parseInt(textField.getText());
									playerNames2.add(player);
									s2.setList(playerNames2);
									s2.mergeSort(s2.getList());
									s2.updateFile();
								} else {
									JOptionPane.showMessageDialog(null, "Player already exists in that position");
								}
							}
						} else {
							if (num == 6) {
								if (containsPlayer(matrix2[0], matrix2[1], matrix2[2], matrix2[3], matrix2[4], matrix2[5])) {
									JOptionPane.showMessageDialog(null, "Player has already been added to the roster");
								} else {
									if (matrix2[5][1] == null || matrix2[5][1].equals("")) {
										matrix2[5][1] = Integer.parseInt(textField.getText());
										playerNames2.add(player);
										s2.setList(playerNames2);
										s2.mergeSort(s2.getList());
										s2.updateFile();
									} else {
										JOptionPane.showMessageDialog(null, "Player already exists in that position");
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
			}
		});

		txtEnterNumberFor = new JTextField();
		txtEnterNumberFor.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterNumberFor.setBackground(new Color(224, 255, 255));
		txtEnterNumberFor.setBounds(46, 99, 214, 20);
		txtEnterNumberFor.setText("Enter Number for Serve Order:");
		txtEnterNumberFor.setEditable(false);
		txtEnterNumberFor.setColumns(10);

		numberText = new JTextField();
		numberText.setForeground(Color.BLUE);
		numberText.setBounds(266, 99, 96, 20);
		numberText.setColumns(10);
		contentPane.setLayout(null);
		contentPane.add(txtAddPlayer);
		contentPane.add(txtEnterPlayerNumber);
		contentPane.add(textField);
		contentPane.add(txtEnterNumberFor);
		contentPane.add(numberText);
		contentPane.add(btnNewButton);

		txtEnterPlayerName = new JTextField();
		txtEnterPlayerName.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterPlayerName.setText("Enter Player Name:");
		txtEnterPlayerName.setEditable(false);
		txtEnterPlayerName.setColumns(10);
		txtEnterPlayerName.setBackground(new Color(224, 255, 255));
		txtEnterPlayerName.setBounds(46, 71, 214, 20);
		contentPane.add(txtEnterPlayerName);

		playerName = new JTextField();
		playerName.setForeground(Color.BLUE);
		playerName.setColumns(10);
		playerName.setBounds(266, 71, 96, 20);
		contentPane.add(playerName);

	}

	public boolean containsPlayer(Object[] arr1, Object[] arr2, Object[] arr3, Object[] arr4, Object[] arr5,
			Object[] arr6) {
		if (textField.getText().equals("")) {
			return false;
		} else {
			return Arrays.asList(arr1).contains(textField.getText())
					|| Arrays.asList(arr2).contains(textField.getText())
					|| Arrays.asList(arr3).contains(textField.getText())
					|| Arrays.asList(arr4).contains(textField.getText())
					|| Arrays.asList(arr5).contains(textField.getText())
					|| Arrays.asList(arr6).contains(textField.getText());
		}
	}

	public String getNum() {
		return textField.getText();
	}

	public Player getPlayer() {
		return player;
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