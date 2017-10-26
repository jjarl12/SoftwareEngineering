
public class BiggestNumberCommand implements Command {
	
	private NumberList list;
	
	private String printOut;
	
	public BiggestNumberCommand(NumberList list) {
		this.list = list;
		printOut = "Return biggest number in List " + list.GetListNumber();
	}

	@Override
	public String Execute() {
		return list.GetLargestNumber();
	}

	@Override
	public String GetPrintOut() {
		return printOut;
	}

}
