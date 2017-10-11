
public class PrintCommand implements Command{
	
	private List list;

	@Override
	public String Execute() {
		return list.PrintList();
	}

	public PrintCommand(List list) {
		this.list = list;
	}
}
