package zoconverter;
/**
 * BitShifting  as we parse string left to right
 * @author gosnat
 *
 */
public class ZOConverterB implements ZOStringConverter{

	@Override
	public long convertStringToLong(String s) {
		long count = 0;
		//read in the actual zebra/ocelot pattern
		for(int i = 0; i < s.length(); i++) {
			count = count << 1; //add a zero on the right and shift everything down
			if(s.charAt(i) == 'O') {
				count += 1; //Ocelot, so make the rightmost spot a 1
			}
		}
		return count;
	}

}
