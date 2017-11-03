package Tests;
import zoconverter.ZOConverterD;
import zoconverter.ZOStringConverter;

public class TestsOfZOConverterD extends TestsOfZOStringConverter {

	@Override
	protected ZOStringConverter getConcreteConverter() {
		return new ZOConverterD();
	}

}
