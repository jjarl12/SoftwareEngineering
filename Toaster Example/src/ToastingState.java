public class ToastingState implements State{
	/** Client who owns this state */
	private Client myClient;
	
	/** 
	 * Constructor
	 * @param c Client who owns this state
	 */
	
	public ToastingState(Client c){
		myClient = c;
	}

	@Override
	public void insert(){
		throw new UnsupportedOperationException("already have bread");
	}
	
	@Override
	public void remove(){
		throw new UnsupportedOperationException("ouch!  you burned yourself");
	}
	
	@Override
	public void pushLever(){
		throw new UnsupportedOperationException("lever is already down");
	}
	
	@Override
	public void pullLever(){
		System.out.println("I changed my mind and pulled the lever up");
		myClient.changeState("untoasted");
	}
	
	@Override
	public void timerPops(){
		System.out.println("Time's up! POP! Toast is ready");
		myClient.changeState("toasted");
	}
}