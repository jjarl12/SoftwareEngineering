
public class Games implements PartyGames{
	
	private String[] games = {"Smash Bros", "Monopoly", "BattelShip", "Checkers"};
	
	private int gameNumber = 0;

	@Override
	public void playGames() {
		if(gameNumber > 3)
			gameNumber = 0;
		System.out.println("Currently playing " + games[gameNumber]);
	}

}
