import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BookSheet extends JFrame {
	private JPanel contentPane;
	private JTextField txtVolleyballScoringSheet;
	private JTextField counter2;
	private int points1;
	private int points2;
	private JTextField counter1;
	private JButton button;
	private DefaultTableModel model;
	private DefaultTableModel model2;
	private boolean case1;
	private JTextField firstTime;
	private JTextField secondTime;
	private JTextField firstTime1;
	private JTextField secondTime1;
	private JTextField subField1;
	private JTextField subField2;
	private TableColumn column;
	private TableColumn libero;
	private CellHighlighterRenderer cellRenderer;
	private TableCellRenderer defaultRenderer;
	private CellHighlighterRenderer2 cellRendererL;
	private TableCellRenderer defaultRendererL;
	private int cellCount;
	private int cellCountL;
	private TableColumn column2;
	private TableColumn libero2;
	private CellHighlighterRenderer cellRenderer2;
	private TableCellRenderer defaultRenderer2;
	private CellHighlighterRenderer2 cellRenderer2L;
	private TableCellRenderer defaultRenderer2L;
	private int cellCount2;
	private int cellCountL2;
	private Object[][] mat;
	private Object[][] mat2;
	private Storage storage;
	final JFileChooser fc = new JFileChooser();
	private JTextField name1;
	private JTextField name2;
	private int sub1;
	private int sub2;
	private String check1;
	private String game;
	private Team1Storage storage1;
	private Team2Storage storage2;
	private ArrayList<Player> playerNames1;
	private ArrayList<Player> playerNames2;
	private JTextField position;
	private JTextField position2;

	// In response to a button click:

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Object[] row1 = new Object[] { "1", null };
//					Object[] row2 = new Object[] { "2", null };
//					Object[] row3 = new Object[] { "3", null };
//					Object[] row4 = new Object[] { "4", null };
//					Object[] row5 = new Object[] { "5", null };
//					Object[] row6 = new Object[] { "6", null };
//					Object[] row7 = new Object[] { "1", null };
//					Object[] row8 = new Object[] { "2", null };
//					Object[] row9 = new Object[] { "3", null };
//					Object[] row10 = new Object[] { "4", null };
//					Object[] row11 = new Object[] { "5", null };
//					Object[] row12 = new Object[] { "6", null };
//					Player player = new Player();
//					int number = 0;
//					int number2 = 0;
//					BookSheet frame = new BookSheet(row1, row2, row3, row4, row5, row6, row7, row8, row9, row10, row11,
//							row12, player, number, number2);
//					frame.setVisible(true);
//					// frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public BookSheet(Storage s, Team1Storage s1, Team2Storage s2) {
		mat = new Object[6][2];
		mat2 = new Object[6][2];
		for (int i = 0; i < 6; i++) {
			mat[i][0] = i + 1;
		}
		for (int i = 0; i < 6; i++) {
			mat2[i][0] = i + 1;
		}
		playerNames1 = new ArrayList<Player>();
		playerNames2 = new ArrayList<Player>();
		storage = s;
		storage1 = s1;
		storage2 = s2;
		mat = s.getMatrix();
		mat2 = s.getMatrix2();
		points1 = s.getPoints1();
		points2 = s.getPoints2();
		cellCount = s.getCell1();
		cellCount2 = s.getCell2();
		cellCountL = s.getLibero();
		cellCountL2 = s.getLibero2();
		check1 = s.getCase1();
		game = s.getGame();
		sub1 = s.getSub1();
		sub2 = s.getSub2();
		playerNames1 = s1.getList();
		playerNames2 = s2.getList();
// 		row1 = new Object[] { "1", null };
//		row2 = new Object[] { "2", null };
//		row3 = new Object[] { "3", null };
//		row4 = new Object[] { "4", null };
//		row5 = new Object[] { "5", null };
//		row6 = new Object[] { "6", null };
//		row7 = new Object[] { "1", null };
//		row8 = new Object[] { "2", null };
//		row9 = new Object[] { "3", null };
//		row10 = new Object[] { "4", null };
//		row11 = new Object[] { "5", null };
//		row12 = new Object[] { "6", null }
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 997, 853);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		txtVolleyballScoringSheet = new JTextField();
		txtVolleyballScoringSheet.setBackground(new Color(255, 250, 205));
		txtVolleyballScoringSheet.setBounds(12, 12, 957, 49);
		txtVolleyballScoringSheet.setEditable(false);
		txtVolleyballScoringSheet.setFont(new Font("Tahoma", Font.PLAIN, 35));
		txtVolleyballScoringSheet.setHorizontalAlignment(SwingConstants.CENTER);
		txtVolleyballScoringSheet.setText("Volleyball Scoring Sheet");
		txtVolleyballScoringSheet.setColumns(10);

		counter2 = new JTextField();
		counter2.setBackground(new Color(224, 255, 255));
		counter2.setForeground(Color.BLUE);
		counter2.setBounds(704, 110, 139, 65);
		counter2.setEditable(false);
		counter2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		counter2.setHorizontalAlignment(SwingConstants.CENTER);
		counter2.setColumns(10);
		counter2.setText(Integer.toString(points2));

		JButton btnNewButton = new JButton("Switch");
		btnNewButton.setBackground(new Color(224, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Object[][] temp = mat;
				int temp2 = s.getCell1();
				String temp3 = s.getTeam1();
				int temp4 = s.getPoints1();
				int temp5 = s.getLibero();
				int temp6 = s.getSub1();
				s.setMatrix(mat2);
				s.setMatrix2(temp);
				s.setCell1(cellCount2);
				s.setCell2(temp2);
				s.setTeam1(s.getTeam2());
				s.setTeam2(temp3);
				s.setPoints1(s.getPoints2());
				s.setPoints2(temp4);
				s.setLibero(cellCountL2);
				s.setLibero2(temp5);
				s.setSub1(sub2);
				s.setSub2(temp6);
				if (check1.equals("false")) {
					storage.setCase1("true");
				} else if (check1.equals("true")) {
					storage.setGame("false");
				}
				s.updateFile();
				setVisible(false);
				BookSheet book = new BookSheet(s, s1, s2);
				book.setVisible(true);
			}
		});
		btnNewButton.setBounds(443, 135, 78, 23);

		JButton btnAddPoint_1 = new JButton("+");
		btnAddPoint_1.setBackground(new Color(204, 255, 204));
		btnAddPoint_1.setBounds(704, 181, 65, 38);
		btnAddPoint_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				points2++;
				s.setPoints2(points2);
				counter2.setText(Integer.toString(points2));
				s.updateFile();
			}
		});

		counter1 = new JTextField();
		counter1.setBackground(new Color(224, 255, 255));
		counter1.setForeground(Color.BLUE);
		counter1.setBounds(155, 110, 136, 65);
		counter1.setEditable(false);
		counter1.setText(Integer.toString(points1));
		counter1.setHorizontalAlignment(SwingConstants.CENTER);
		counter1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		counter1.setColumns(10);

		button = new JButton("+");
		button.setBackground(new Color(204, 255, 204));
		button.setBounds(155, 181, 59, 38);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				points1++;
				s.setPoints1(points1);
				counter1.setText(Integer.toString(points1));
				s.updateFile();
			}
		});

		JButton minus = new JButton("-");
		minus.setBackground(new Color(255, 102, 102));
		minus.setBounds(232, 181, 59, 38);
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (points1 == 0) {
					JOptionPane.showMessageDialog(null, "Can't have negative points");
				} else {
					points1--;
					s.setPoints1(points1);
					counter1.setText(Integer.toString(points1));
					s.updateFile();
				}

			}
		});
		JTextArea txtrFirstServe = new JTextArea();
		txtrFirstServe.setBackground(new Color(230, 230, 250));
		txtrFirstServe.setBounds(428, 258, 110, 36);
		txtrFirstServe.setEditable(false);
		txtrFirstServe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtrFirstServe.setText("     First Serve\r\n(Check Box Below)");

//		if (chckbxNewCheckBox.isSelected()) {
//			s.setCase1("true");
//			s.setCase2("false");
//			s.updateFile();
//		}
//
		JCheckBox chckbxB = new JCheckBox("B");
//		chckbxB.setBounds(507, 301, 41, 23);
//		if (chckbxB.isSelected()) {
//			chckbxB.setSelected(true);
//			s.setCase2("true");
//			s.setCase1("false");
//			s.updateFile();
//		}

		JButton btnAddPlayer = new JButton("Add Player");
		btnAddPlayer.setBackground(new Color(204, 255, 153));
		btnAddPlayer.setBounds(117, 547, 98, 39);
		btnAddPlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				case1 = true;
				AddPlayer frame = new AddPlayer(storage, storage1, storage2, case1);
				frame.setVisible(true);
				setVisible(false);

			}
		});

		JButton btnDeletePlayer = new JButton("Delete Player");
		btnDeletePlayer.setBackground(new Color(255, 102, 102));
		btnDeletePlayer.setBounds(219, 547, 124, 39);
		btnDeletePlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				case1 = true;
				DeletePlayer frame = new DeletePlayer(storage, storage1, storage2, case1);
				frame.setVisible(true);
				setVisible(false);
			}
		});
		model = new DefaultTableModel() {

			@Override
			public boolean isCellEditable(int row, int column) {
				// all cells false
				return false;
			}
		};
		JTable table = new JTable(model);
		model.addColumn("Serve Order");
		model.addColumn("Player Number");
		model.addRow(mat[0]);
		model.addRow(mat[1]);
		model.addRow(mat[2]);
		model.addRow(mat[3]);
		model.addRow(mat[4]);
		model.addRow(mat[5]);
		column = table.getColumnModel().getColumn(1);
		libero = table.getColumnModel().getColumn(0);
		cellRenderer = new CellHighlighterRenderer(cellCount);
		cellRendererL = new CellHighlighterRenderer2(cellCountL);
		defaultRenderer = column.getCellRenderer();
		defaultRendererL = libero.getCellRenderer();
		column.setCellRenderer(cellRenderer);
		libero.setCellRenderer(cellRendererL);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(117, 304, 226, 230);
		model2 = new DefaultTableModel() {

			@Override
			public boolean isCellEditable(int row, int column) {
				// all cells false
				return false;
			}
		};
		JTable table2 = new JTable(model2);
		model2.addColumn("Serve Order");
		model2.addColumn("Player Number");
		model2.addRow(mat2[0]);
		model2.addRow(mat2[1]);
		model2.addRow(mat2[2]);
		model2.addRow(mat2[3]);
		model2.addRow(mat2[4]);
		model2.addRow(mat2[5]);
		libero2 = table2.getColumnModel().getColumn(0);
		column2 = table2.getColumnModel().getColumn(1);
		cellRenderer2L = new CellHighlighterRenderer2(cellCountL2);
		cellRenderer2 = new CellHighlighterRenderer(cellCount2);
		defaultRenderer2 = column2.getCellRenderer();
		defaultRenderer2L = libero2.getCellRenderer();
		column2.setCellRenderer(cellRenderer2);
		libero2.setCellRenderer(cellRenderer2L);
		JScrollPane scrollPane_1 = new JScrollPane(table2);
		scrollPane_1.setBounds(666, 304, 226, 230);

		storage.updateFile();

		JButton button_1 = new JButton("-");
		button_1.setBackground(new Color(255, 102, 102));
		button_1.setBounds(784, 181, 59, 38);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (points2 == 0) {
					JOptionPane.showMessageDialog(null, "Can't have negative points");
				} else {
					points2--;
					s.setPoints2(points2);
					counter2.setText(Integer.toString(points2));
					s.updateFile();
				}
			}
		});

		JButton button_2 = new JButton("Add Player");
		button_2.setBackground(new Color(204, 255, 153));
		button_2.setBounds(665, 547, 104, 39);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				case1 = false;
				AddPlayer frame = new AddPlayer(storage, storage1, storage2, case1);
				frame.setVisible(true);
				setVisible(false);
			}
		});

		JButton btnDeletePlayer_1 = new JButton("Delete Player");
		btnDeletePlayer_1.setBackground(new Color(255, 102, 102));
		btnDeletePlayer_1.setBounds(774, 547, 118, 39);
		btnDeletePlayer_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeletePlayer frame = new DeletePlayer(storage, storage1, storage2, case1);
				frame.setVisible(true);
				setVisible(false);
			}
		});

		contentPane.setLayout(null);
		contentPane.add(txtVolleyballScoringSheet);
		contentPane.add(button);
		contentPane.add(minus);
		contentPane.add(counter1);
		contentPane.add(btnNewButton);
		contentPane.add(btnAddPlayer);
		contentPane.add(btnDeletePlayer);
		contentPane.add(scrollPane);
		contentPane.add(btnAddPoint_1);
		contentPane.add(button_1);
		contentPane.add(counter2);
		contentPane.add(scrollPane_1);
		contentPane.add(button_2);
		contentPane.add(btnDeletePlayer_1);

		contentPane.add(chckbxB);
		contentPane.add(txtrFirstServe);

		JButton btnCallTimeout = new JButton("Call Time-Out");
		btnCallTimeout.setBackground(new Color(240, 255, 240));
		btnCallTimeout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!secondTime.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Time-Out Limit Reached!");
				} else {
					if (firstTime.getText().equals("")) {
						firstTime.setText(counter1.getText() + " - " + counter2.getText());
					} else {
						secondTime.setText(counter1.getText() + " - " + counter2.getText());
					}
				}
			}
		});
		btnCallTimeout.setBounds(342, 597, 119, 23);
		contentPane.add(btnCallTimeout);

		JButton button_3 = new JButton("Call Time-Out");
		button_3.setBackground(new Color(240, 255, 240));

		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!secondTime1.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Time-Out Limit Reached!");
				}
				if (firstTime1.getText().equals("")) {
					firstTime1.setText(counter1.getText() + " - " + counter2.getText());
				} else {
					secondTime1.setText(counter1.getText() + " - " + counter2.getText());
				}
			}
		});
		button_3.setBounds(537, 597, 110, 23);
		contentPane.add(button_3);

		firstTime = new JTextField();
		firstTime.setBackground(new Color(238, 232, 170));
		firstTime.setForeground(Color.BLUE);
		firstTime.setEditable(false);
		firstTime.setBounds(342, 626, 57, 20);
		contentPane.add(firstTime);
		firstTime.setColumns(10);

		secondTime = new JTextField();
		secondTime.setBackground(new Color(238, 232, 170));
		secondTime.setForeground(Color.BLUE);
		secondTime.setEditable(false);
		secondTime.setColumns(10);
		secondTime.setBounds(402, 626, 59, 20);
		contentPane.add(secondTime);

		firstTime1 = new JTextField();
		firstTime1.setBackground(new Color(238, 232, 170));
		firstTime1.setForeground(Color.BLUE);
		firstTime1.setEditable(false);
		firstTime1.setColumns(10);
		firstTime1.setBounds(537, 626, 52, 20);
		contentPane.add(firstTime1);

		secondTime1 = new JTextField();
		secondTime1.setBackground(new Color(238, 232, 170));
		secondTime1.setForeground(Color.BLUE);
		secondTime1.setEditable(false);
		secondTime1.setColumns(10);
		secondTime1.setBounds(595, 626, 52, 20);
		contentPane.add(secondTime1);

		JButton btnNewButton_1 = new JButton("Substitution");
		btnNewButton_1.setBackground(new Color(240, 255, 240));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (sub1 >= 12) {
					JOptionPane.showMessageDialog(null, "Maximum Subs Reached for Team!");
				} else {
					case1 = true;
					s.setSub1((sub1 + 1));
					s.updateFile();
					SubstitutionFrame frame = new SubstitutionFrame(s, s1, s2, case1);
					frame.setVisible(true);
					setVisible(false);
				}
			}
		});
		btnNewButton_1.setBounds(155, 597, 136, 23);
		contentPane.add(btnNewButton_1);

		JButton btnSubstitution = new JButton("Substitution");
		btnSubstitution.setBackground(new Color(240, 255, 240));
		btnSubstitution.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (sub2 >= 12) {
					JOptionPane.showMessageDialog(null, "Maximum Subs Reached for Team!");
				} else {
					s.setSub2((sub2 + 1));
					s.updateFile();
					SubstitutionFrame frame = new SubstitutionFrame(s, s1, s2, case1);
					frame.setVisible(true);
					setVisible(false);
				}
			}
		});
		btnSubstitution.setBounds(704, 597, 139, 23);
		contentPane.add(btnSubstitution);

		subField1 = new JTextField();
		subField1.setBackground(new Color(238, 232, 170));
		subField1.setEditable(false);
		subField1.setHorizontalAlignment(SwingConstants.CENTER);
		subField1.setBounds(202, 626, 33, 20);
		contentPane.add(subField1);
		subField1.setColumns(10);
		subField1.setText(Integer.toString(sub1));

		subField2 = new JTextField();
		subField2.setBackground(new Color(238, 232, 170));
		subField2.setEditable(false);
		subField2.setHorizontalAlignment(SwingConstants.CENTER);
		subField2.setColumns(10);
		subField2.setBounds(758, 626, 33, 20);
		contentPane.add(subField2);
		subField2.setText(Integer.toString(sub2));

		JButton btnNewButton_2 = new JButton("Next Rotation");
		btnNewButton_2.setBackground(new Color(255, 235, 205));
		btnNewButton_2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (cellCount == 5) {
					cellCount = 0;
					s.setCell1(cellCount);
					changeCellColor(cellCount);
					s.updateFile();
				} else {
					cellCount++;
					s.setCell1(cellCount);
					changeCellColor(cellCount);
					s.updateFile();
				}
				repaint();
			}
		});
		btnNewButton_2.setBounds(117, 703, 226, 49);
		contentPane.add(btnNewButton_2);

		JButton btnNextRotation = new JButton("Next Rotation");
		btnNextRotation.setBackground(new Color(255, 235, 205));
		btnNextRotation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cellCount2 == 5) {
					cellCount2 = 0;
					s.setCell2(cellCount2);
					changeCellColor2(cellCount2);
					s.updateFile();
				} else {
					cellCount2++;
					s.setCell2(cellCount2);
					changeCellColor2(cellCount2);
					s.updateFile();
				}
				repaint();

			}
		});
		btnNextRotation.setBounds(666, 703, 226, 49);
		contentPane.add(btnNextRotation);

		name1 = new JTextField();
		name1.setBackground(new Color(224, 255, 255));
		name1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		name1.setHorizontalAlignment(SwingConstants.CENTER);
		name1.setEditable(false);
		name1.setBounds(155, 72, 136, 27);
		contentPane.add(name1);
		name1.setColumns(10);
		name1.setText(s.getTeam1());
		s.setTeam1(name1.getText());

		name2 = new JTextField();
		name2.setBackground(new Color(224, 255, 255));
		name2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		name2.setHorizontalAlignment(SwingConstants.CENTER);
		name2.setEditable(false);
		name2.setColumns(10);
		name2.setBounds(704, 72, 139, 27);
		contentPane.add(name2);
		name2.setText(s.getTeam2());

		JCheckBox chckbxB_1 = new JCheckBox("B");
		chckbxB_1.setBounds(505, 301, 33, 23);
		contentPane.add(chckbxB_1);
		if (check1.equals("false") && game.equals("true")) {
			chckbxB_1.setSelected(true);
			cellCount++;
			changeCellColor(cellCount);
			storage.setCell1(cellCount);
			storage.setGame("false");
		} else {
			changeCellColor(cellCount);
		}
		s.setTeam2(name2.getText());
		JCheckBox chckbxNewCheckBox = new JCheckBox("A");
		chckbxNewCheckBox.setBounds(428, 301, 33, 23);
		contentPane.add(chckbxNewCheckBox);

		JButton btnNewButton_3 = new JButton("Finish");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				setVisible(false);
			}
		});
		btnNewButton_3.setBounds(428, 738, 110, 38);
		btnNewButton_3.setBackground(new Color(255, 235, 205));
		contentPane.add(btnNewButton_3);

		JButton btnLibero = new JButton("Libero Position:");
		btnLibero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isInteger(position.getText())) {
					JOptionPane.showMessageDialog(null,
							"Position must not contain letters and must be a positive Integer value");
				} else if (Integer.parseInt(position.getText()) > 6) {
					JOptionPane.showMessageDialog(null, "Position must not be greater than 6");
				} else {
					int num = Integer.parseInt(position.getText());
					cellCountL = num - 1;
					s.setLibero(cellCountL);
					changeCellColorLibero(cellCountL);
					s.updateFile();
				}
			}
		});
		btnLibero.setBounds(85, 662, 192, 29);
		contentPane.add(btnLibero);

		JButton btnLibero_1 = new JButton("Libero Position:");
		btnLibero_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isInteger(position2.getText())) {
					JOptionPane.showMessageDialog(null,
							"Position must not contain letters and must be a positive Integer value");
				} else if (Integer.parseInt(position2.getText()) > 6) {
					JOptionPane.showMessageDialog(null, "Position must not be greater than 6");
				} else {
					int num = Integer.parseInt(position2.getText());
					cellCountL2 = num - 1;
					s.setLibero2(cellCountL2);
					changeCellColorLibero2(cellCountL2);
					s.updateFile();
				}
			}
		});
		btnLibero_1.setBounds(666, 662, 166, 29);
		contentPane.add(btnLibero_1);

		position = new JTextField();
		position.setForeground(Color.BLUE);
		position.setColumns(10);
		position.setBackground(new Color(238, 232, 170));
		position.setBounds(286, 662, 57, 29);
		contentPane.add(position);

		position2 = new JTextField();
		position2.setForeground(Color.BLUE);
		position2.setColumns(10);
		position2.setBackground(new Color(238, 232, 170));
		position2.setBounds(835, 662, 57, 29);
		contentPane.add(position2);
		if (check1.equals("true") && game.equals("true2")) {
			chckbxNewCheckBox.setSelected(true);
			cellCount2++;
			changeCellColor2(cellCount2);
			storage.setCell2(cellCount2);
			storage.setGame("false");
		} else {
			changeCellColor2(cellCount2);
		}
	}

	public void changeCellColorLibero2(int i) {
		libero2.setCellRenderer(new CellHighlighterRenderer2(i));
		repaint();
	}

	public void changeCellColorLibero(int i) {
		libero.setCellRenderer(new CellHighlighterRenderer2(i));
		repaint();
	}

	public void changeCellColor(int i) {
		column.setCellRenderer(new CellHighlighterRenderer(i));
	}

	public void changeCellColor2(int i) {
		column2.setCellRenderer(new CellHighlighterRenderer(i));
	}

	public DefaultTableModel getModel() {
		return model;
	}

	public DefaultTableModel getModel2() {
		return model2;
	}

	public boolean getCase() {
		return case1;
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
