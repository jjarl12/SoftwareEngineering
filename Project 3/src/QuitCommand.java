/**
 * The Quit Command
 * @author Jonathan Jarl
 *
 */
public class QuitCommand implements Command{
	
	/**
	 * System main printout string
	 */
	private String printOut = "Quit";

	/**
	 * Quit Execute command
	 */
	@Override
	public String Execute() {
		System.exit(0);
		return null;
	}

	/**
	 * Getter for printOut
	 */
	@Override
	public String GetPrintOut() {
		return printOut;
	}

}
