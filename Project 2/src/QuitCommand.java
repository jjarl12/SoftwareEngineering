
public class QuitCommand implements Command{

	@Override
	public String Execute() {
		System.exit(0);
		return null;
	}

}
