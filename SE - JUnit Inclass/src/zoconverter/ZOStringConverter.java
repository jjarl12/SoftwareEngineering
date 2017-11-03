package zoconverter;
/**
 * Interface for JUnit Demo
 * Modification of "Zebra vs Ocelot" problem from NCNA ICPC 2017
 * @author gosnat
 *
 */
public interface ZOStringConverter {
	/**
	 * 
	 * @param s A string of up to 60 "Z" and "O" characters
	 * @return Replace "Z" with 0 and "O" with 1 to form a binary representation of a long
	 */
	public long convertStringToLong(String s);

}
