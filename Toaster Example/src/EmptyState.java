/**
 * State pattern demonstration
 * @author gosnat
 * @version Fall 2017
 */
public class EmptyState implements State{
	/** Client who owns this state */
	private Client myClient;
	
	/** 
	 * Constructor
	 * @param c Client who owns this state
	 */
	public EmptyState(Client c){
		myClient = c;
	}

	@Override
	public void insert(){
		System.out.println("I'm inserting a slide of bread");
		myClient.changeState("untoasted");
	}
	
	@Override
	public void remove(){
		throw new UnsupportedOperationException("no bread to remove");
	}
	
	@Override
	public void pushLever(){
		throw new UnsupportedOperationException("no bread to toast");
	}
	
	@Override
	public void pullLever(){
		throw new UnsupportedOperationException("lever isn't down");
	}
	
	@Override
	public void timerPops(){
		throw new UnsupportedOperationException("timer shouldn't have been ticking");
	}
}