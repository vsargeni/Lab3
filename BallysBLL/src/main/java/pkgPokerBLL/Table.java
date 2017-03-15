package pkgPokerBLL;

import java.util.ArrayList;
import java.util.UUID;

public class Table {

	private UUID TableID;
	
	//	Change this from ArrayList to HashMap.
	private ArrayList<Player> TablePlayers = new ArrayList<Player>();
	
	public Table() {
		super();
		TableID = UUID.randomUUID();
	}
	
	public Table AddPlayerToTable(Player p)
	{
		//TODO: Add a player to the table (should be pretty easy)		
		return this;
	}
	
	public Table RemovePlayerFromTable(Player p)
	{
		//TODO: Remove a player from the table
		return this;
	}
}
