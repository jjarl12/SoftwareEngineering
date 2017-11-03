package zoconverter;
/** A just plain incorrect implementation */
public class ZOConverterD implements ZOStringConverter{

	@Override
	public long convertStringToLong(String s) {
		long answer = 1 << s.length();
		for(int i = 0; i < s.length(); i++) {
			answer -= 1 << s.length() - i - 1;
		}
		
		return answer;
	}

}
