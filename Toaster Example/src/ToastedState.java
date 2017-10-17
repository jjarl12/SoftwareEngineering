public class ToastedState implements State{
	/** Client who owns this state */
	private Client myClient;
	
	private static ToastedState uniqueInstance;
	
	/** 
	 * Constructor
	 * @param c Client who owns this state
	 */
	
	public ToastedState(Client c){
		myClient = c;
	}
	
	public ToastedState getUniqueInstance(Client c) {
		if(uniqueInstance == null) {
			uniqueInstance = new ToastedState(c);
		}
		return uniqueInstance;
	}
	
	@Override
	public void insert(){
		throw new UnsupportedOperationException("already have bread");
	}
	
	@Override
	public void remove(){
		System.out.println("I'm removing a slice of bread");
		myClient.changeState("empty");
	}
	
	@Override
	public void pushLever(){
		throw new UnsupportedOperationException("retoasting unsupported");
	}
	
	@Override
	public void pullLever(){
		throw new UnsupportedOperationException("lever is already up");
	}
	
	@Override
	public void timerPops(){
		throw new UnsupportedOperationException("timer shouldn't have been ticking");
	}
}