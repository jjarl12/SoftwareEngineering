
public class FloatElement implements Element{

	private float number;
	
	public FloatElement(float n) {
		number = n;
	}
	
	public float getNumber() {
		return number;
	}
	
	public void setNumber(float n) {
		number = n;
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}
	
	public String toString() {
		return "" + number;
	}
}
