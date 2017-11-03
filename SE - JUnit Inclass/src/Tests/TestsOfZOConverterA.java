package Tests;
import zoconverter.ZOConverterA;
import zoconverter.ZOStringConverter;

public class TestsOfZOConverterA extends TestsOfZOStringConverter {

	@Override
	protected ZOStringConverter getConcreteConverter() {
		return new ZOConverterA();
	}

}
