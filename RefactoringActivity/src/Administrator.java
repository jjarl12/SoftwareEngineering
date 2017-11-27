
public class Administrator extends Bethelite{

	public Administrator(int idNum, String name, double salary, String Responsibilities) {
		this.idNum = idNum;
		this.name = name;
		this.salary = salary;
		this.Responsibilities = Responsibilities;
	}
	
	private double salary;
	
	private String Responsibilities;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getResponsiblities() {
		return Responsibilities;
	}

	public void setResponsiblities(String responsiblities) {
		Responsibilities = responsiblities;
	}
}
