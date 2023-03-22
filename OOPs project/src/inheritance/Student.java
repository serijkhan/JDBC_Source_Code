package inheritance;

public class Student extends User1 {
	int rank;
	public static void main(String[] args) {
		Student s= new Student();
		s.rank= 1;
		s.id = 102;
		s.name = "Sameer";
		System.out.println(s.id+"--"+s.name+"--"+s.rank);
		
	}

}
