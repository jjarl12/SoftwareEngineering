package zoconverter;
/**
 * Use Math.pow() to add in powers of 2
 * @author gosnat
 *
 */
public class ZOConverterC implements ZOStringConverter{

	@Override
	public long convertStringToLong(String s) {
		long answer = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(s.length() - i - 1) == 'O') {
				answer += Math.pow(2, i);
			}
		}
		return answer;
	}

}
