package Tests;
import zoconverter.ZOConverterB;
import zoconverter.ZOStringConverter;

public class TestsOfZOConverterB extends TestsOfZOStringConverter {

	@Override
	protected ZOStringConverter getConcreteConverter() {
		return new ZOConverterB();
	}

}
