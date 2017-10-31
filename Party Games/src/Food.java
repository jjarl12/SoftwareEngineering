
public class Food implements PartyFood{
	
	private int food = 5;

	@Override
	public void serveFood() {
		food--;
	}

	@Override
	public boolean isFoodRemaining() {
		if(food > 0)
			return true;
		return false;
	}

}
