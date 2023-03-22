package exception;



public class Demoes {
	private String getName(int id) throws NoDataFoundException {
		if(id==100) {
			return"shamsul";
		}else if(id==101) {
			return"mantoo";
			
		}else {
			throw new NoDataFoundException();
		}
	}
	public static void main(String[] args) throws NoDataFoundException{
		Demoes d = new Demoes();
		d.getName(200);
	}
		
	}


