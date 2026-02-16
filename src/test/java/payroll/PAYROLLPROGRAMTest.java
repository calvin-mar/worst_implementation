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
		shellPayroll.SETHOURS(0, 0);
	}

	@Test
	void ContractorTest() {
		fail("Not yet implemented");
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
