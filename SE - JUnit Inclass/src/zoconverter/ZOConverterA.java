package zoconverter;
/**
 * Converts ZO string to 01 string and then uses parseLong to convert
 * @author gosnat
 *
 */
public class ZOConverterA implements ZOStringConverter {

	@Override
	public long convertStringToLong(String s) {
		String zForZero = s.replace('Z', '0');
		String oForOne = zForZero.replace('O', '1');
		return Long.parseLong(oForOne, 2);
	}

}
