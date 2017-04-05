package pkgPokerBLL;

import java.util.ArrayList;
import java.util.UUID;

public class Game {
private UUID GameID;
private UUID TableID;
private ArrayList<Player> GamePlayers= new ArrayList();


public Game(){
	
}
public Game(UUID GameID,UUID TableID, ArrayList<Player> GamePlayers){
	this.GameID = GameID;
	this.TableID= TableID;
	this.GamePlayers= GamePlayers;
}


public static void AddPlayerToGame(Table t, Player p){
	t.AddPlayerToTable(p); //is this what you need?
}
public UUID getGameID() {
	return GameID;
}
public void setGameID(UUID gameID) {
	GameID = gameID;
}
public UUID getTableID() {
	return TableID;
}
public void setTableID(UUID tableID) {
	TableID = tableID;
}
public ArrayList<Player> getGamePlayers() {
	return GamePlayers;
}
public void setGamePlayers(ArrayList<Player> gamePlayers) {
	GamePlayers = gamePlayers;
}



}
