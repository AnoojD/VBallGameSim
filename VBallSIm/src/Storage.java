import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Storage {
	private Object[][] mat;
	private Object[][] mat2;
	private String name;
	private int points1;
	private int points2;
	private int libero;
	private int libero2;
	private int cell1;
	private int cell2;
	private int subCount1;
	private int subCount2;
	private String teamName1;
	private String teamName2;
	private String case1;
	private String gameStarted;

	public Storage(String str, Object[][] matrix, Object matrix2[][]) {
		name = str;
		mat = matrix;
		mat2 = matrix2;
		subCount1 = 0;
		subCount2 = 0;
		libero = 0;
		libero2 = 0;
		cell1 = 0;
		cell2 = 0;
		points1 = 0;
		points2 = 0;
//		teamName1 = "";
//		teamName2 = "";
//		case1 = "";
		gameStarted = "false";
		loadFile();

	}

	public Object[][] getMatrix() {
		return mat;
	}

	public Object[][] getMatrix2() {
		return mat2;
	}

	public void setMatrix(Object[][] matrix) {
		mat = matrix;
	}

	public void setMatrix2(Object[][] matrix) {
		mat2 = matrix;
	}

	public void loadFile() {
		Scanner s;
		if (name.contains(".txt")) {
			File file = new File(name);
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				s = new Scanner(file);
				//s.useDelimiter("\\n");
				while (s.hasNextLine()) {
					teamName1 = s.nextLine();
					teamName2 = s.nextLine();
					case1 = s.nextLine();
					gameStarted = s.nextLine();
					cell1 = Integer.parseInt(s.nextLine());
					cell2 = Integer.parseInt(s.nextLine());
					libero = Integer.parseInt(s.nextLine());
					libero2 = Integer.parseInt(s.nextLine());
					points1 = Integer.parseInt(s.nextLine());
					points2 = Integer.parseInt(s.nextLine());
					subCount1 = Integer.parseInt(s.nextLine());
					subCount2 = Integer.parseInt(s.nextLine());
					mat[0][1] = s.nextLine();
					mat[1][1] = s.nextLine();
					mat[2][1] = s.nextLine();
					mat[3][1] = s.nextLine();
					mat[4][1] = s.nextLine();
					mat[5][1] = s.nextLine();
					mat2[0][1] = s.nextLine();
					mat2[1][1] = s.nextLine();
					mat2[2][1] = s.nextLine();
					mat2[3][1] = s.nextLine();
					mat2[4][1] = s.nextLine();
					mat2[5][1] = s.nextLine();

				}

				s.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {

			File file = new File(name + ".txt");
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				s = new Scanner(file);
				while (s.hasNextLine()) {
					teamName1 = s.nextLine();
					teamName2 = s.nextLine();
					case1 = s.nextLine();
					gameStarted = s.nextLine();
					cell1 = Integer.parseInt(s.nextLine());
					cell2 = Integer.parseInt(s.nextLine());
					libero = Integer.parseInt(s.nextLine());
					libero2 = Integer.parseInt(s.nextLine());
					points1 = Integer.parseInt(s.nextLine());
					points2 = Integer.parseInt(s.nextLine());
					subCount1 = Integer.parseInt(s.nextLine());
					subCount2 = Integer.parseInt(s.nextLine());
					mat[0][1] = s.nextLine();
					mat[1][1] = s.nextLine();
					mat[2][1] = s.nextLine();
					mat[3][1] = s.nextLine();
					mat[4][1] = s.nextLine();
					mat[5][1] = s.nextLine();
					mat2[0][1] = s.nextLine();
					mat2[1][1] = s.nextLine();
					mat2[2][1] = s.nextLine();
					mat2[3][1] = s.nextLine();
					mat2[4][1] = s.nextLine();
					mat2[5][1] = s.nextLine();
				}

				s.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void updateFile() {
		if (name.contains(".txt")) {
			FileWriter fileWriter = null;
			try {
				fileWriter = new FileWriter(name);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			PrintWriter printWriter = new PrintWriter(fileWriter);

			printWriter.println(teamName1);

			printWriter.println(teamName2);

			printWriter.println(case1);

			printWriter.println(gameStarted);

			printWriter.println(Integer.toString(cell1));

			printWriter.println(Integer.toString(cell2));

			printWriter.println(Integer.toString(libero));

			printWriter.println(Integer.toString(libero2));

			printWriter.println(Integer.toString(points1));

			printWriter.println(Integer.toString(points2));

			printWriter.println(Integer.toString(subCount1));

			printWriter.println(Integer.toString(subCount2));

			printWriter.println(value(0) );
			printWriter.println(value(1) );
			printWriter.println(value(2) );
			printWriter.println(value(3) );
			printWriter.println(value(4) );
			printWriter.println(value(5));
			printWriter.println(value2(0) );
			printWriter.println(value2(1) );
			printWriter.println(value2(2));
			printWriter.println(value2(3) );
			printWriter.println(value2(4));
			printWriter.println(value2(5));

			try {
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			printWriter.close();
		}
		// PrintWriter writer = new PrintWriter(ull);
		else {
			FileWriter fileWriter = null;
			try {
				fileWriter = new FileWriter(name + ".txt");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			PrintWriter printWriter = new PrintWriter(fileWriter);

			printWriter.println(teamName1);

			printWriter.println(teamName2);

			printWriter.println(case1);

			printWriter.println(gameStarted);

			printWriter.println(Integer.toString(cell1));

			printWriter.println(Integer.toString(cell2));

			printWriter.println(Integer.toString(libero));

			printWriter.println(Integer.toString(libero2));

			printWriter.println(Integer.toString(points1));

			printWriter.println(Integer.toString(points2));

			printWriter.println(Integer.toString(subCount1));

			printWriter.println(Integer.toString(subCount2));

			printWriter.println(value(0) );
			printWriter.println(value(1) );
			printWriter.println(value(2) );
			printWriter.println(value(3) );
			printWriter.println(value(4) );
			printWriter.println(value(5));
			printWriter.println(value2(0) );
			printWriter.println(value2(1) );
			printWriter.println(value2(2));
			printWriter.println(value2(3) );
			printWriter.println(value2(4));
			printWriter.println(value2(5));

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

	public Object value(int i) {
		if (mat[i][1] == null) {
			return "";
		} else {
			return mat[i][1];
		}
	}

	public Object value2(int i) {
		if (mat2[i][1] == null) {
			return "";
		} else {
			return mat2[i][1];
		}
	}

	public int getCell1() {
		return cell1;
	}

	public int getCell2() {
		return cell2;
	}

	public int getLibero() {
		return libero;
	}

	public int getLibero2() {
		return libero2;
	}

	public void setLibero(int newCell) {
		libero = newCell;
	}

	public void setLibero2(int newCell) {
		libero2 = newCell;
	}

	public String getTeam1() {
		return teamName1;
	}

	public String getTeam2() {
		return teamName2;
	}

	public String getCase1() {
		return case1;
	}

	public String getGame() {
		return gameStarted;
	}

	public int getPoints1() {
		return points1;
	}

	public void setPoints1(int newPoints) {
		points1 = newPoints;
	}

	public void setPoints2(int newPoints) {
		points2 = newPoints;
	}

	public void setTeam1(String newPoints) {
		teamName1 = newPoints;
		updateFile();
	}

	public void setGame(String newPoints) {
		gameStarted = newPoints;
		updateFile();
	}

	public void setTeam2(String newPoints) {
		teamName2 = newPoints;
		updateFile();
	}

	public void setCase1(String newPoints) {
		case1 = newPoints;
		updateFile();
	}

	public void setCell1(int newCell) {
		cell1 = newCell;
	}

	public void setCell2(int newCell) {
		cell2 = newCell;
	}

	public int getPoints2() {
		return points2;
	}

	public int getSub1() {
		return subCount1;
	}

	public int getSub2() {
		return subCount2;
	}

	public void setSub1(int newCell) {
		subCount1 = newCell;
	}

	public void setSub2(int newCell) {
		subCount2 = newCell;
	}

}
