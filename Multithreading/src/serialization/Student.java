package serialization;

import java.io.Serializable;



public class Student implements Serializable {
	
	
	private static final long serialversionuid = 100l;
	int id;
	String name;
	String email;
	transient String pwd;

}
