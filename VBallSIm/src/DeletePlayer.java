import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class DeletePlayer extends JFrame {

	private JPanel contentPane;
	private JTextField txtAddPlayer;
	private JTextField txtEnterPlayerNumber;
	private JTextField textField;
	private int num;
	private int count;
	private int count1;
	private Object[][] matrix;
	private Object[][] matrix2;
	private ArrayList<Player> playerNames1;
	private ArrayList<Player> playerNames2;


	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public DeletePlayer(Storage s, Team1Storage s1, Team2Storage s2, boolean check) {
		// s.loadFile();
		playerNames1 = s1.getList();
		playerNames2 = s2.getList();
		matrix = s.getMatrix();
		matrix2 = s.getMatrix2();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 436, 229);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		txtAddPlayer = new JTextField();
		txtAddPlayer.setBackground(new Color(255, 250, 205));
		txtAddPlayer.setBounds(46, 5, 316, 44);
		txtAddPlayer.setFont(new Font("Tahoma", Font.PLAIN, 33));
		txtAddPlayer.setText("Delete Player");
		txtAddPlayer.setHorizontalAlignment(SwingConstants.CENTER);
		txtAddPlayer.setEditable(false);
		txtAddPlayer.setColumns(10);

		txtEnterPlayerNumber = new JTextField();
		txtEnterPlayerNumber.setBackground(new Color(224, 255, 255));
		txtEnterPlayerNumber.setBounds(46, 84, 214, 20);
		txtEnterPlayerNumber.setEditable(false);
		txtEnterPlayerNumber.setText("Enter Position to Delete From Roster:");
		txtEnterPlayerNumber.setColumns(10);

		textField = new JTextField();
		textField.setForeground(Color.BLUE);
		textField.setBounds(266, 84, 96, 20);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("Delete");
		btnNewButton.setBackground(new Color(230, 230, 250));
		btnNewButton.setBounds(177, 157, 68, 33);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please input a position");
				} else if (!isInteger(textField.getText())) {
					JOptionPane.showMessageDialog(null, "Position must not contain letters and must be a positive Integer value");
				} else {
					num = Integer.parseInt(textField.getText());
					if (check == true) {
						if (num == 1) {
							int index = s1.binarySearch(playerNames1, Integer.toString((int) matrix[0][1]));
							playerNames1.remove(index);
							s1.setList(playerNames1);
							s1.mergeSort(playerNames1);
							s1.updateFile();
							matrix[0][1] = null;
						} else if (num == 2) {
							int index = s1.binarySearch(playerNames1, Integer.toString((int) matrix[1][1]));
							playerNames1.remove(index);
							s1.setList(playerNames1);
							s1.mergeSort(playerNames1);
							s1.updateFile();
							matrix[1][1] = null;
							

						} else if (num == 3) {
							int index = s1.binarySearch(playerNames1, Integer.toString((int) matrix[2][1]));
							playerNames1.remove(index);
							s1.setList(playerNames1);
							s1.mergeSort(playerNames1);
							s1.updateFile();
							matrix[2][1] = null;
						} else if (num == 4) {
							int index = s1.binarySearch(playerNames1, Integer.toString((int) matrix[3][1]));
							playerNames1.remove(index);
							s1.setList(playerNames1);
							s1.mergeSort(playerNames1);
							s1.updateFile();
							matrix[3][1] = null;
						} else if (num == 5) {
							int index = s1.binarySearch(playerNames1, Integer.toString((int) matrix[4][1]));
							playerNames1.remove(index);
							s1.setList(playerNames1);
							s1.mergeSort(playerNames1);
							s1.updateFile();
							matrix[4][1] = null;
						} else {
							if (num == 6) {
								int index = s1.binarySearch(playerNames1, Integer.toString((int) matrix[5][1]));
								playerNames1.remove(index);
								s1.setList(playerNames1);
								s1.mergeSort(playerNames1);
								s1.updateFile();
								matrix[5][1] = null;
							}
						}
					} else {
						if (num == 1) {
							int index = s2.binarySearch(playerNames2, Integer.toString((int) matrix2[0][1]));
							playerNames2.remove(index);
							s2.setList(playerNames2);
							s2.mergeSort(playerNames2);
							s2.updateFile();
							matrix2[0][1] = null;
						
						} else if (num == 2) {
							int index = s2.binarySearch(playerNames2,Integer.toString((int) matrix2[1][1]));
							playerNames2.remove(index);
							s2.setList(playerNames2);
							s2.mergeSort(playerNames2);
							s2.updateFile();
							matrix2[1][1] = null;
						} else if (num == 3) {
							int index = s2.binarySearch(playerNames2, Integer.toString((int) matrix2[2][1]));
							playerNames2.remove(index);
							s2.setList(playerNames2);
							s2.mergeSort(playerNames2);
							s2.updateFile();
							matrix2[2][1] = null;
						} else if (num == 4) {
							int index = s2.binarySearch(playerNames2, Integer.toString((int) matrix2[3][1]));
							playerNames2.remove(index);
							s2.setList(playerNames2);
							s2.mergeSort(playerNames2);
							s2.updateFile();
							matrix2[3][1] = null;
						} else if (num == 5) {
							int index = s2.binarySearch(playerNames2, Integer.toString((int) matrix2[4][1]));
							playerNames2.remove(index);
							s2.setList(playerNames2);
							s2.mergeSort(playerNames2);
							s2.updateFile();
							matrix2[4][1] = null;
						} else {
							if (num == 6) {
								int index = s2.binarySearch(playerNames2, Integer.toString((int) matrix2[5][1]));
								playerNames2.remove(index);
								s2.setList(playerNames2);
								s2.mergeSort(playerNames2);
								s2.updateFile();
								matrix2[5][1] = null;
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
		contentPane.setLayout(null);
		GroupLayout gl_contentPane1 = new GroupLayout(contentPane);
		gl_contentPane1.setHorizontalGroup(gl_contentPane1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane1.createSequentialGroup().addGroup(gl_contentPane1
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane1.createSequentialGroup().addGap(41).addGroup(gl_contentPane1
								.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtAddPlayer, GroupLayout.PREFERRED_SIZE, 316, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane1.createSequentialGroup()
										.addComponent(txtEnterPlayerNumber, GroupLayout.PREFERRED_SIZE, 214,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(textField))))
						.addGroup(gl_contentPane1.createSequentialGroup().addGap(153).addComponent(btnNewButton,
								GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(53, Short.MAX_VALUE)));
		gl_contentPane1.setVerticalGroup(gl_contentPane1.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane1
				.createSequentialGroup()
				.addComponent(txtAddPlayer, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE).addGap(35)
				.addGroup(gl_contentPane1.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtEnterPlayerNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGap(18).addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(25, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane1);
		contentPane.add(txtAddPlayer);
		contentPane.add(txtEnterPlayerNumber);
		contentPane.add(textField);
		contentPane.add(btnNewButton);
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

