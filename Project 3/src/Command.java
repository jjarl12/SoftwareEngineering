
/**
 * Command interface
 * @author Jonathan Jarl
 *
 */
public interface Command {
	
	/**
	 * Execute Command
	 * @return
	 */
	public String Execute();
	
	/**
	 * Getter for Command PrintOut
	 * @return
	 */
	public String GetPrintOut();
}
