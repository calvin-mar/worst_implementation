package payroll; 

public class PAYROLLPROGRAM {
	
	int[] paytype;						// Array of ints signifying employee type. 1 = Contractor, 2 = Hourly, 3 = Salary
	String[] employeenames;				// Parallel array for names
	int[] hours;						// Parallel array for hours worked
	int[] payroll;						// Parallel array for amount of money they are paid
	int index;							// Universal counter that tracks the arrays
	int[] rate;						// Parallel array for RATE they are paid


	// Constructor
	public PAYROLLPROGRAM() {
		this.paytype = new int[100];			// We are assuming (for some reason) that employees will not exceed 100
		this.employeenames = new String[100];	
		this.hours = new int[100];				
		this.rate = new int[100];				
		this.index = 0;							
	}
	
	// Add employee (modify four arrays...)
	public void ADDEMPLOYEE(String name, int thetype) {
		employeenames[index] = name;
		paytype[index] = thetype;
		hours[index] = 0;
		rate[index] = 0;
		index++;
	}
	
	// Set employee hours
	public void SETHOURS(int employeeindex, int thehours) {		// I guess the user is expected to know the index?
		hours[employeeindex] = thehours;
	}
	
	
	public int[] PAYEMPLOYEES() {
		// Evil behemoth if statement goes here determining what to set the payroll values to.
		for(int i=0; i<employeenames.length;i++) {
			if(paytype[i] == 1) {
				payroll[i]=hours[i]*rate[i];
			}else if (paytype[i]==2) {
				
				if(hours[i] > 40) {
					int hrsovertime = hours[i] - 40;
					payroll[i]=(int) ((40*rate[i]) + (hrsovertime*(1.5*rate[i])));		
				}

			}else if(paytype[i]==3) {
				payroll[i]=40*rate[i];

			}
			else {
				payroll[i]=0;
			}
		}
		// Returns the payroll
		return payroll;
	}
	

}
