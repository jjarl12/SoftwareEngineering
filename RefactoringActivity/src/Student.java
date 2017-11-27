/**
 * A class representing a Bethel Student
 * Refactoring "Pull Up" example
 * @author Nathan Gossett
 *
 */
public class Student extends Bethelite{
	/**
	 * @param idNum
	 * @param name
	 * @param gpa
	 */
	public Student(int idNum, String name, double gpa) {
		this.idNum = idNum;
		this.name = name;
		this.gpa = gpa;
		this.hourlyWage = 0;
		this.hoursPerWeek = 0;
	}

	/**
	 * @param idNum
	 * @param name
	 * @param gpa
	 * @param hourlyWage
	 * @param hoursPerWeek
	 */
	public Student(int idNum, String name, double gpa, double hourlyWage, double hoursPerWeek) {
		this.idNum = idNum;
		this.name = name;
		this.gpa = gpa;
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}

	/**
	 * @return the gpa
	 */
	public double getGpa() {
		return gpa;
	}

	/**
	 * @param gpa the gpa to set
	 */
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	/** Cummulative GPA */
	private double gpa;
	
	/**
	 * @return the hourlyWage
	 */
	public double getHourlyWage() {
		return hourlyWage;
	}

	/**
	 * @param hourlyWage the hourlyWage to set
	 */
	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	/**
	 * @return the hoursPerWeek
	 */
	public double getHoursPerWeek() {
		return hoursPerWeek;
	}

	/**
	 * @param hoursPerWeek the hoursPerWeek to set
	 */
	public void setHoursPerWeek(double hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	/** Pay rate */
	private double hourlyWage;
	
	/** Hours per week as student employee*/
	private double hoursPerWeek;
	
	/**
	 * @return Dollars per weekly paycheck
	 */
	public double getWeeklyPay() {
		return hourlyWage * hoursPerWeek;
	}
	
}