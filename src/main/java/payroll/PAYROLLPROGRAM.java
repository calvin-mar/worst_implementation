package payroll; 

public class PAYROLLPROGRAM {
	
	int[] T;						// Array of ints signifying employee type. 1 = Contractor, 2 = Hourly, 3 = Salary
	String[] N;				// Parallel array for names
	int[] H;						// Parallel array for hours worked
	float[] M;						// Parallel array for amount of money they are paid
	int P;							// Universal counter that tracks the arrays
	float[] R;						// Parallel array for RATE they are paid


	// Constructor
	public PAYROLLPROGRAM() {
		this.T = new int[100];			// We are assuming (for some reason) that employees will not exceed 100
		this.N = new String[100];	
		this.H = new int[100];				
		this.R = new float[100];				
		this.P = 0;							
	}
	
	// Add employee (modify four arrays...)
	public void ADDEMPLOYEE(String n, int t) {
		N[P] = n;
		T[P] = t;
		H[P] = 0;
		R[P] = 0;
		P++;
	}
	
	// Set employee hours
	public void SETHOURS(int e, int h) {		// I guess the user is expected to know the index?
		H[e] = h;
	}
	
	//Set employee rate
	public void SETRATE(int e, float r) {
		R[e] = r;
	}
	
	
	public float[] PAYEMPLOYEES() {
		// Evil behemoth if statement goes here determining what to set the payroll values to.
		for(int i=0; i<N.length;i++) {
			if(T[i] == 1) {
				M[i]=H[i]*R[i];
			}else if (T[i]==2) {
				
				if(H[i] > 40) {
					int f = H[i] - 40;
					M[i]=(int) ((40*R[i]) + (f*(1.5*R[i])));		
				}

			}else if(T[i]==3) {
				M[i]=40*R[i];

			}
			else {
				M[i]=0;
			}
		}
		// Returns the payroll
		return M;
	}

	public int[] getT() {
		return T;
	}

	public void setT(int[] t) {
		T = t;
	}

	public String[] getN() {
		return N;
	}

	public void setN(String[] n) {
		N = n;
	}

	public int[] getH() {
		return H;
	}

	public void setH(int[] h) {
		H = h;
	}

	public float[] getR() {
		return R;
	}

	public void setR(float[] r) {
		R = r;
	}
	

}
