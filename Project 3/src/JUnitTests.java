import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public abstract class JUnitTests {
	
	private NumberList myList;
	
	protected abstract NumberList getConcreteList();

	@Before
	public void Setup() throws Exception {
		myList = getConcreteList();
	}
	
	@Test
	public void testAddInt() {
		myList.AddToList(5);
		assertEquals("5 failed to be added to list", myList.GetList().get(0), 5);
	}
	
	@Test
	public void testAddDouble() {
		myList.AddToList(5.435);
		assertEquals("5.435 failed to be added to list", myList.GetList().get(0), 5.435);
	}
}
