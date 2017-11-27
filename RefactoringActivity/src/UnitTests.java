import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class UnitTests {
	
	private Student myStudent;
	
	private Student myWorkerStudent;
	
	private Faculty myFaculty;
	
	private Administrator myAdmin;
	
	@Before
	public void testNewStudent() {
		myStudent = new Student(1, "Jon", 4.0);
		myWorkerStudent = new Student(1, "Jon", 4.0, 10.0, 20);
		myFaculty = new Faculty(2, "Gossett", Faculty.FacRank.PROFESSOR, 52);
		myAdmin = new Administrator(3, "Me", 52, "Screw around");
	}
	
	@Test
	public void testMyStudent() {
		assertEquals("Id not added or got correctly", myStudent.getIdNum(), 1);
		assertEquals("Name not added or got correctly", myStudent.getName(), "Jon");
		assertEquals("GPA not added or got correctly", myStudent.getGpa(), 4.0, 0);
	}
	
	@Test
	public void testMyWorkerStudent() {
		assertTrue("HourlyWage not added or got correctly", myWorkerStudent.getHourlyWage() == 10.0);
		assertTrue("HoursPerWeek not added or got correctly", myWorkerStudent.getHoursPerWeek() == 20);
	}
	
	@Test
	public void testStudentGetWeeklyPay() {
		assertTrue("WeeklyPay not returned correctly", myWorkerStudent.getWeeklyPay() == 200);
	}
	
	@Test
	public void testMyFaculty() {
		assertEquals("Id not added or got correctly", myFaculty.getIdNum(), 2);
		assertEquals("Name not added or got correctly", myFaculty.getName(), "Gossett");
		assertEquals("Rank not added or got correctly", myFaculty.getRank(), Faculty.FacRank.PROFESSOR);
		assertTrue("Salary not added or got correctly", myFaculty.getSalary() == 52);
	}

	@Test
	public void testFacultyGetWeeklyPay() {
		assertTrue("WeeklyPay not returned correctly", myFaculty.getWeeklyPay() == 1);
	}
	
	@Test
	public void testAdministrator() {
		assertEquals("Id not added or got correctly", myAdmin.getIdNum(), 3);
		assertEquals("Name not added or got correctly", myAdmin.getName(), "Me");
		assertTrue("Salary not added or got correctly", myAdmin.getSalary() == 52);
		assertEquals("Responsibilities not added or got correctly", myAdmin.getResponsiblities(), "Screw around");
	}
}
