import java.util.Scanner;

public class AddNumberCommand implements Command{
	
	private NumberList list;
	
	private String printOut;

	@Override
	public String Execute() {
		System.out.println("\nEnter numbers into List " + list.GetListNumber() + " one at at time");
		System.out.println("Enter the word \"quit\" to stop");
		String newNumber = "";
		Scanner input = new Scanner(System.in);
		while (!newNumber.equals("quit")) {
			System.out.print("Enter number " + list.GetItemInList() + ": ");
			newNumber = input.nextLine();
			if (!newNumber.equals("quit")) {
				try {
					try {
						int inputNumber = Integer.parseInt(newNumber);
						list.AddToList(inputNumber);
					} catch(Exception e) {
						double inputNumber = Double.parseDouble(newNumber);
						list.AddToList(inputNumber);
					}					
				} catch(Exception e) {
					System.out.println("Invalid Input");
				}
			}
		}
		return "";
	}
	
	public AddNumberCommand(NumberList list) {
		this.list = list;
		printOut = "Enter numbers into List " + list.GetListNumber();
	}

	@Override
	public String GetPrintOut() {
		return printOut;
	}

}
