package seraj;
class RBIBank{
	boolean checkEligibility() {
		return true;
	}
	double getHomeLoanRofi() {
		return 10.85;
	}
}

public class SBIBank extends RBIBank{
	double getHomeLoanRofi() {
		return 12.85;
	}
	public String applyHomeLoans() {
		boolean status = checkEligibility();
		if(status) {
			double homeLoanRofi = getHomeLoanRofi();
			String msg = "Your loan approved with RI as::"+homeLoanRofi;
			return msg;
		}else {
			return "You are not eligible for home loan";
		}
	}
public static void main(String[] args) {
	SBIBank bank = new SBIBank();
	String msg = bank.applyHomeLoans();
	System.out.println(msg);
}
}
	
		 
		
	


