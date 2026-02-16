package payroll; 
public class PAYROLLPROGRAM {	int[] T;					
	String[] N;
	int[] H; float[] M; int P;
	float[] R;
	public PAYROLLPROGRAM() { this.T = new int[100];		
		this.N =new String[100];	
			this.H = new int[100];				
				this.R = new float[100];this.M = new float[100];this.P = 0;							
	}
	public void ADDEMPLOYEE(String n,int t) { N[P]= n; T[P] =t; H[P] =0;R[P] = 0;
		P++;}public void SETHOURS(int e,int h) {		H[e] = h;}
	public void SETRATE(int e,float r) {					R[e]=r;			}
	public float[] PAYEMPLOYEES() {	for(int i=0;  i<N.length;i++) {
if(T[i]==1) {
		M[i]=H[i]*R[i];}else if (T[i]==2) {
			if(H[i] > 40) {
						int f=H[i]-40;
					M[i]=(int) ((40*R[i]) + (f*(1.5*R[i])));		
				}
else {
				M
[
				 i
				 ]
						 =
						 (
								 float
								 )
						 (
								 40
								*
								 R
								 								[
								  i
]
										 )					;
			}
		}else if(T[i]==3) {
						M[i]=40*R[i];
			}
				else {M[i]=0;
		}
				}
		return M;}
	public int[] getT() {return T;}
	

	public void setT(int[] t) {		T=t;}
	public String[] getN() {	return N;								}
	public void setN(String[] n) {		N =n;	}
	public int[] getH() {
		return H;}
	
	
	
	
	
	public void setH(int[] h) {H= h;		}
	public float[] getR() {										return R;		}
	public void setR(float[] r) {
		R=r;}
}
