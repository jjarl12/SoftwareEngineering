/**
 * Project 2
 * 1203
 * @author Jonathan Jarl
 *
 */
public class Client {

	public static void main(String[] args) {
		new Client(2);
	}
	
	/**
	 * Client Constructor that creates program
	 * @param numLists
	 */
	public Client(int numLists) {
		int addMax = numLists;
		int printMax = numLists * 2;
		int sortMax = numLists * 3;
		int clearMax = numLists * 4;
		int quitMax = numLists * 4 + 1;
		List[] lists = new List[numLists];
		Command[] commands = new Command[quitMax];
		for (int i = 0; i < numLists; i++) {
			lists[i] = new List(i + 1);
		}
		for (int i = 0; i < addMax; i++) {
			int whichList = i;
			Command add = new AddCommand(lists[whichList]);
			commands[i] = add;
		}
		for (int i = numLists; i < printMax; i++) {
			int whichList = i - numLists;
			Command print = new PrintCommand(lists[whichList]);
			commands[i] = print;
		}
		for (int i = numLists * 2; i < sortMax; i++) {
			int whichList = i - numLists * 2;
			Command sort = new SortCommand(lists[whichList]);
			commands[i] = sort;
		}
		for (int i = numLists * 3; i < clearMax; i++) {
			int whichList = i - numLists * 3;
			Command clear = new ClearCommand(lists[whichList]);
			commands[i] = clear;
		}
		
		Command quit = new QuitCommand();
		commands[clearMax] = quit;
		new Invoker(commands);
	}
}