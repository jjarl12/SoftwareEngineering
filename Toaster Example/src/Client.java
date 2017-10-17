/**
 * The client class for the Toaster State Pattern demonstration
 * Note that it just farms the behaviors out to the various state classes
 * @author gosnat
 * @version Fall 2017
 */
public class Client {
	/** The toaster is empty */
	private EmptyState myEmptyState;
	
	/** The toaster has a slice of untoasted bread */
	private UntoastedState myUntoastedState;
	
	/** The toaster is currently toasting a slice of bread */
	private ToastingState myToastingState;
	
	/** The toaster has a slice of toasted bread */
	private ToastedState myToastedState;
	
	/** Which state is currently active? */
	private State activeState;
	
	private int numberToasted;
	
	/** Constructor */
	public Client() {
		//Make all the state objects, connecting them to this Client
		myEmptyState = new EmptyState(this);
		myUntoastedState = new UntoastedState(this);
		myToastingState = new ToastingState(this);
		myToastedState = new ToastedState(this);
		numberToasted = 0;
		//And start with one of the states being active
		activeState = myEmptyState;
	}
	
	/**
	 * Change to the requested state
	 * Note that we already have all the different state objects
	 * @param newState Which state to switch to
	 */
	protected void changeState(String newState) {
		if(newState.equals("empty")) {
			activeState = myEmptyState;
		}else if(newState.equals("untoasted")) {
			activeState = myUntoastedState;
		}else if(newState.equals("toasting")) {
			activeState = myToastingState;
		}else if(newState.equals("toasted")) {
			numberToasted++;
			activeState = myToastedState;
		}else {
			throw new IllegalArgumentException(newState + " is not a valid state");
		}
	}
	
	/** Put bread in the toaster */
	public void insert() {
		activeState.insert();
	}
	
	/** Remove bread from the toaster */
	public void remove() {
		activeState.remove();
	}
	
	/** Push down the lever of the toaster */
	public void pushLever() {
		activeState.pushLever();
	}
	
	/** Pull the lever back up */
	public void pullLever() {
		activeState.pullLever();
	}
	
	/** The timer goes off */
	public void timerPops() {
		activeState.timerPops();
	}
	
	public int getNumberToasted() {
		return numberToasted;
	}

}
