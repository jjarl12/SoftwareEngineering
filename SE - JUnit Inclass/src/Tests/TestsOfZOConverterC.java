package Tests;
import zoconverter.ZOConverterC;
import zoconverter.ZOStringConverter;

public class TestsOfZOConverterC extends TestsOfZOStringConverter {

	@Override
	protected ZOStringConverter getConcreteConverter() {
		return new ZOConverterC();
	}

}
