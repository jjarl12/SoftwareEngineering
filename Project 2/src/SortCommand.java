
public class SortCommand implements Command{
	
	private List list;

	@Override
	public String Execute() {
		list.Sort();
		return "List " + list.GetListNumber() + " is now sorted.";
	}

	public SortCommand(List list) {
		this.list = list;
	}
}
