
/**
 * State Pattern demonstration
 * These are the states of a toaster
 * @author gosnat
 * @version Fall 2017
 */
public interface State{
	/** Put bread in the toaster */
	public void insert();
	
	/** Remove bread from the toaster */
	public void remove();
	
	/** Push down the lever of the toaster */
	public void pushLever();
	
	/** Pull the lever back up */
	public void pullLever();
	
	/** The timer goes off */
	public void timerPops();
}