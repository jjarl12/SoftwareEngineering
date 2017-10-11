
public class PrintCommand implements Command{
	
	private List list;

	@Override
	public void Execute() {
		String output = list.PrintList();
	}

	public PrintCommand(List list) {
		this.list = list;
	}
}
