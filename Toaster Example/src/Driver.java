/**
 * Driver for toaster State Pattern demonstration
 * @author gosnat
 *
 */
public class Driver {

	public static void main(String[] args) {
		Client toaster = new Client();
		
		toaster.insert();
		toaster.pushLever();
		toaster.timerPops();
		toaster.remove();
		//what happens if we try an illegal operation?
		try {
			System.out.println("I'm trying to remove a non-existant slice of bread");
			toaster.remove(); //but there's no slice to remove
		}catch(UnsupportedOperationException e) {
			System.out.println(e);
		}
	}
}
