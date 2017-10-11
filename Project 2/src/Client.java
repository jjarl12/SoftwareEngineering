
public class Client {

	public static void main(String[] args) {
		new Client(2);
	}
	
	public Client(int numLists) {
		int addMax = numLists;
		int printMax = numLists * 2;
		int sortMax = numLists * 3;
		int clearMax = numLists * 4;
		int quit = numLists * 4 + 1;
		List[] lists = new List[numLists];
		for (int i = 0; i < numLists; i++) {
			lists[i] = new List();
		}
		for (int i = 1; i <= addMax; i++) {
			int whichList = i - 1;
			Command add = new AddCommand(lists[whichList]);
		}
		for (int i = numLists + 1; i <= printMax; i++) {
			int whichList = i - numLists - 1;
			Command print = new PrintCommand(lists[whichList]);
		}
		for (int i = numLists * 2 + 1; i <= sortMax; i++) {
			int whichList = i - numLists * 2 - 1;
			Command sort = new SortCommand(lists[whichList]);
		}
		for (int i = numLists * 3 + 1; i <= clearMax; i++) {
			int whichList = i - numLists * 3 - 1;
			Command clear = new ClearCommand(lists[whichList]);
		}
	}
}