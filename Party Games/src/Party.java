import java.util.ArrayList;
import java.util.Random;

public class Party {
	/** An object in charge of supplying the music playlist */
	private PartyMusic myMusic;
	
	/** An object in charge of serving food for the party */
	private PartyFood myFood;
	
	/** An object in charge of playing party games */
	private PartyGames myGames;
	
	/** 
	 * Constructor injection
	 * @param music A concrete object that matches the PartyMusic interface
	 * @param food A concrete object that matches the PartyFood interface
	 * @param games A concrete object that matches the PartyGame interface
	 */
	public Party(PartyMusic music, PartyFood food, PartyGames games) {
		setMyMusic(music);
		setMyFood(food);
		setMyGames(games);
	}
	
	/**
	 * The music, food, and games are being handled by the injected objects, 
	 * but the Party class knows how to throw a party
	 */
	public void throwParty() {
		Random r = new Random();
		//We can use our myMusic object to fetch a playlist for this party
		ArrayList<String> playlist = myMusic.getSongs();
		//Keep going as long as the myFood object says we still have food
		while(myFood.isFoodRemaining()) {
			//Pick a random song from the playlist supplied by myMusic
			System.out.println("Playing song: " + playlist.get(r.nextInt(playlist.size())));
			//The myFood object knows how to serve food
			myFood.serveFood();
			//The myGames object knows how to play games
			myGames.playGames();
		}
	}



	/**
	 * @param myMusic A collection of party music
	 * @throws RuntimeException if input is null
	 */
	public void setMyMusic(PartyMusic myMusic) throws RuntimeException{
		if(myMusic == null) {
			throw new RuntimeException("The party is awkwardly silent");
		}
		this.myMusic = myMusic;
	}



	/**
	 * @param myFood the food you plan to serve
	 * @throws RuntimeException if input is null
	 */
	public void setMyFood(PartyFood myFood) throws RuntimeException{
		if(myFood == null) {
			throw new RuntimeException("The party guests are hungry");
		}
		this.myFood = myFood;
	}



	/**
	 * @param myGames the games you will play
	 * @throws RuntimeException if input is null
	 */
	public void setMyGames(PartyGames myGames) throws RuntimeException{
		if(myGames == null) {
			throw new RuntimeException("Everyone is bored");
		}
		this.myGames = myGames;
	}

}
