package tut1_2;
public class ex2_1_Bike extends ex2_1_Vehicle {

	private int cc;

	public ex2_1_Bike(String n, double d, double h, double l, double w, int c, String r, int cc ) {
		super(n, d, h, l, w, c, r);
		// TODO Auto-generated constructor stub
		if (validateCC(cc) ) {
			this.cc = cc;
		}
	}

	private boolean validateCC(int cc2) {
		if (cc <= 0) {
			return false;
		} else {
			return true;
		}
	}	
}
