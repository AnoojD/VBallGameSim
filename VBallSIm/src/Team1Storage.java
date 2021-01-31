import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Team1Storage {
	private ArrayList<Player> playerNames;
	private Storage storage;
	private String name;

	public Team1Storage(String str, ArrayList<Player> arr, Storage s)

	{
		name = str;
		storage = s;
		playerNames = arr;
		loadFile();
	}

	public void loadFile() {

		Scanner s;
		// name = storage.getTeam1();
		if (name.contains(".txt")) {
		File file = new File(name);
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			s = new Scanner(file);
			while (s.hasNext()) {
				String number = s.next();
				String name = s.next();
				playerNames.add(new Player(number,name));
				
			}
			s.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		else
		{
			File file = new File(name + ".txt");
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				s = new Scanner(file);
				while (s.hasNext()) {
					String number = s.next();		
					String name = s.next();
					playerNames.add(new Player(number,name));
					
				}
				s.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void updateFile() {
		if(name.contains(".txt"))
		{
		FileWriter fileWriter = null;
		// name = storage.getTeam1();
		
		try {
			fileWriter = new FileWriter(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintWriter printWriter = new PrintWriter(fileWriter);
		for (Player str : playerNames) {
			printWriter.println(str.toString());

		}
		try {
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		printWriter.close();

	}
		else
		{
			FileWriter fileWriter = null;
			// name = storage.getTeam1();
			
			try {
				fileWriter = new FileWriter(name + ".txt");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			PrintWriter printWriter = new PrintWriter(fileWriter);
			for (Player str : playerNames) {
				printWriter.println(str.toString());

			}
			try {
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			printWriter.close();
			
		}
	}

	public ArrayList<Player> getList() {
		return playerNames;
	}

	public void setList(ArrayList<Player> list) {
		playerNames = list;
		updateFile();
	}

	public void mergeSort(ArrayList<Player> a) {
		if (a.size() <= 1)
			return; // small list don't need to be merged

		// SEPARATE

		int mid = a.size() / 2; // estimate half the size

		ArrayList<Player> left = new ArrayList<Player>();
		ArrayList<Player> right = new ArrayList<Player>();

		for (int i = 0; i < mid; i++)
			left.add(a.remove(0)); // put first half part in left
		while (a.size() != 0)
			right.add(a.remove(0)); // put the remainings in right
		// Here a is now empty

		// MERGE PARTS INDEPENDANTLY

		mergeSort(left); // merge the left part
		mergeSort(right); // merge the right part

		// MERGE PARTS

		// while there is something in the two lists
		while (left.size() != 0 && right.size() != 0) {
			// compare both heads, add the lesser into the result and remove it from its
			// list
			if (left.get(0).compareTo(right.get(0)) < 0)
				a.add(left.remove(0));
			else
				a.add(right.remove(0));
		}

		// fill the result with what remains in left OR right (both can't contains
		// elements)
		while (left.size() != 0)
			a.add(left.remove(0));
		while (right.size() != 0)
			a.add(right.remove(0));
	}

	public static int binarySearch(ArrayList<Player> player, String search) {
		int first = 0;
		int last = player.size() - 1;
		int mid;
		while (first <= last) {
			mid = (first + last) / 2;
			if (search == player.get(mid).getNumber()) {
				return mid;
			} else if (search.compareTo(player.get(mid).getNumber()) > 0) {
				last = mid - 1;
			} else {
				first = mid + 1;
			}
		}

		return 0;
	}
}
