package payroll;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PAYROLLPROGRAMTest {
	PAYROLLPROGRAM shellPayroll;
	
	@BeforeEach
	void setUp() throws Exception {
		shellPayroll = new PAYROLLPROGRAM();
		shellPayroll.ADDEMPLOYEE("Natalie", 0);
		shellPayroll.ADDEMPLOYEE("Ben",1);
		shellPayroll.ADDEMPLOYEE("Avery",2);
		shellPayroll.SETHOURS(0, 40);
		shellPayroll.SETHOURS(1, 40);
		shellPayroll.SETHOURS(2, 40);
		shellPayroll.SETRATE(0, 18.75f);
		shellPayroll.SETRATE(0, 15.50f);
		shellPayroll.SETRATE(0, 11.66f);
	}

	@Test
	void ContractorTest() {
		shellPayroll.
	}
	
	@Test
	void HourlyEmployeeTest() {
		fail("Not yet implemented");
	}
	
	@Test
	void SalaryEmployeeTest() {
		fail("Not yet implemented");
	}
	
	@Test
	void payrollListTest() {
		fail("Not yet implemented");
	}

	@Test
	void createEmployeeTest() {
		fail("Not yet implemented");

	@Test
	void changeHoursTest() {
		fail("Not yet implemented");		
	}
	
	@Test
	void payAllTest() {
		fail("Not yet implemented");	}
}
