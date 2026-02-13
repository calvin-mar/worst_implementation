package payroll;

public class PAYROLLPROGRAM {
	
	int[] paytype;						// Array of ints signifying employee type. 1 = Contractor, 2 = Hourly, 3 = Salary
	String[] employeenames;				// Parallel array for names
	int[] hours;						// Paralle array for hours worked
	int[] payroll;						// Parallel array for amount of money they are paid
	
	int index;							// Universal counter that tracks the arrays


	// Constructor
	public PAYROLLPROGRAM() {
		this.paytype = new int[100];			// We are assuming (for some reason) that employees will not exceed 100
		this.employeenames = new String[100];	
		this.hours = new int[100];				
		this.index = 0;							
	}
	
	// Add employee (modify four arrays...)
	public void ADDEMPLOYEE(String name, int thetype) {
		employeenames[index] = name;
		paytype[index] = thetype;
		hours[index] = 0;
		index++;
	}
	
	// Set employee hours
	public void SETHOURS(int employeeindex, int thehours) {		// I guess the user is expected to know the index?
		hours[employeeindex] = thehours;
	}
	
	public int[] PAYEMPLOYEES() {
		// Evil behemoth if statement goes here determining what to set the payroll values to.
		
		// Returns the payroll
		return payroll;
	}
	

}
