import java.util.Scanner;

public class AddCommand implements Command {
	
	private List list;

	@Override
	public String Execute() {
		System.out.println("Enter words into List " + (list.GetListNumber()) + " one at a time");
		System.out.println("Enter the number 0 to stop\n");
		String word = "";
		int i = 1;
		Scanner input = new Scanner(System.in);
		while (!word.equals("0")) {
			System.out.print("Enter word " + list.GetWordInList() + ": ");
			word = input.nextLine();
			if (!word.equals("0"))
			{
				list.AddToList(word);
				i++;
			}
		}
		return "";
	}
	
	public AddCommand(List list) {
		this.list = list;
	}
}
