public class UntoastedState implements State{
	/** Client who owns this state */
	private Client myClient;
	
	/** 
	 * Constructor
	 * @param c Client who owns this state
	 */	
	public UntoastedState(Client c){
		myClient = c;
	}
	
	@Override
	public void insert(){
		throw new UnsupportedOperationException("already have bread");
	}
	
	@Override
	public void remove(){
		System.out.println("I'm taking an untoasted slice of bread out of the toaster");
		myClient.changeState("empty");
	}
	
	@Override
	public void pushLever(){
		System.out.println("I'm pushing down the lever to start toasting");
		myClient.changeState("toasting");
	}
	
	@Override
	public void pullLever(){
		throw new UnsupportedOperationException("not toasting yet");
	}
	
	@Override
	public void timerPops(){
		throw new UnsupportedOperationException("not toasting yet");
	}
}