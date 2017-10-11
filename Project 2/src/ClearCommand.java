
public class ClearCommand implements Command {
	
	private List list;

	@Override
	public String Execute() {
		list.ClearList();
		return "List " + list.GetListNumber() + " is now empty";
	}

	public ClearCommand(List list) {
		this.list = list;
	}
}
