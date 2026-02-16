package payroll;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PAYROLLPROGRAMTest {
	PAYROLLPROGRAM shellPayroll;
	// 1 is Contractor
	// 2 is Hourly
	// 3 is Salary
	@BeforeEach
	void setUp() throws Exception {
		shellPayroll = new PAYROLLPROGRAM();
		shellPayroll.ADDEMPLOYEE("Natalie", 1);
		shellPayroll.ADDEMPLOYEE("Ben",2);
		shellPayroll.ADDEMPLOYEE("Avery",3);
		shellPayroll.SETHOURS(0, 40);
		shellPayroll.SETHOURS(1, 40);
		shellPayroll.SETHOURS(2, 40);
		shellPayroll.SETRATE(0, 18.75f);
		shellPayroll.SETRATE(1, 15.50f);
		shellPayroll.SETRATE(2, 11.66f);
	}

	@Test
	void ContractorTest() {
		assertEquals(shellPayroll.getN()[0], "Natalie");
		assertEquals(shellPayroll.getT()[0], 1);
		assertEquals(shellPayroll.getH()[0], 40);
		assertEquals(shellPayroll.getR()[0], 18.75f);
	}
	
	@Test
	void HourlyEmployeeTest() {
		assertEquals(shellPayroll.getN()[1], "Ben");
		assertEquals(shellPayroll.getT()[1], 2);
		assertEquals(shellPayroll.getH()[1], 40);
		assertEquals(shellPayroll.getR()[1], 15.50f);
	}
	
	@Test
	void SalaryEmployeeTest() {
		assertEquals(shellPayroll.getN()[2], "Avery");
		assertEquals(shellPayroll.getT()[2], 3);
		assertEquals(shellPayroll.getH()[2], 40);
		assertEquals(shellPayroll.getR()[2], 11.66f);
	}

	@Test
	void createEmployeeTest() {
		shellPayroll.ADDEMPLOYEE("Zoe",1 );
		shellPayroll.SETHOURS(3, 40);
		shellPayroll.SETRATE(3, 14.88f);
		assertEquals(shellPayroll.getN()[3], "Zoe");
		assertEquals(shellPayroll.getT()[3], 1);
		assertEquals(shellPayroll.getH()[3], 40);
		assertEquals(shellPayroll.getR()[3], 14.88f);
	}
	@Test
	void changeHoursTest() {
		shellPayroll.SETHOURS(0, 30);
		assertEquals(shellPayroll.getH()[0], 30);
		shellPayroll.SETHOURS(1, 50);
		assertEquals(shellPayroll.getH()[1], 50);
	}
	
	@Test
	void payAllTest() {
		float[] payments = {750.0f, 620.0f, 466.4f};
		float[] returnedpays = shellPayroll.PAYEMPLOYEES();
		assertEquals(payments[0], returnedpays[0]);
		assertEquals(payments[1], returnedpays[1]);
		assertEquals(payments[2], returnedpays[2]);
	}
}
