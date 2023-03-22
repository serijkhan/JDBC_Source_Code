package hierarchical;
class RBIBank{
	boolean checkEligibility() {
		return true;
	}
	double getHomeLoneRofi() {
		return 10.58;
	}
}
public class SBIBank extends RBIBank{
	double getHomeLoanRofi() {
		return 12.85;
	}
	public String applyHomeLoans() {
		boolean status = checkEligibility();
		if(status) {
			double HomeLoanRofi = getHomeLoanRofi();
			String msg ="Your loan approved with RI as:"+HomeLoanRofi;
			return msg;
		}else {
			return"you are not eligible for home loan";
			
		}
	}
	public static void main(String[] args) {
		SBIBank bank = new SBIBank();
		String msg = bank.applyHomeLoans();
		System.out.println(msg);
	}
	}
	
		
	


