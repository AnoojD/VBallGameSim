public class Player {

	private String playernumber;
	private String name;

	public Player(String number, String playername) {
		playernumber = number;
		name = playername;
		
	}

	public Player() {
		// TODO Auto-generated constructor stub
	}

	public String getNumber() {
		return playernumber;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int compareTo(Player p)
	{
		return (this.getName()).compareTo(p.getName());
	}
	
	public String toString()
	{
		return playernumber + "  " + name;
	}

}
