/** 
 * A Class representing a Bethel Faculty member
 * Refactoring "Pull Up" example
 * Also used for simulating multiple inheritance example
 * @author Nathan Gossett
 *
 */
public class Faculty extends Bethelite{
	/** Constructor */
	public Faculty(int idNum, String name, FacRank rank, double salary) {
		this.idNum = idNum;
		this.name = name;
		this.rank = rank;
		this.salary = salary;
	}

	/** Faculty Rank */
	private FacRank rank;
	
	/** Yearly salary */
	private double salary;
	
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * @return the rank
	 */
	public FacRank getRank() {
		return rank;
	}

	/**
	 * @param rank the rank to set
	 */
	public void setRank(FacRank rank) {
		this.rank = rank;
	}
	
	/**
	 * @return dollars per weekly paycheck
	 */
	public double getWeeklyPay() {
		return salary/52;
	}

	/** Faculty Rank */
	public enum FacRank {INSTRUCTOR, ASSISTANT_PROF, ASSOCIATE_PROF, PROFESSOR};
}