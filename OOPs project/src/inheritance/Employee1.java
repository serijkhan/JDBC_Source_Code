package inheritance;

public class Employee1 extends User2 {
	double salary;
	public Employee1() {
		System.out.println("child class-m2 () method called");
	}
		void m2() {
			System.out.println("child class-m2() method called");
		}		
		public static void main(String[]args) {
			Employee1 emp = new Employee1();
			emp.id =101;
			emp.name="sameer";
			emp.salary=4523.00;
			
			System.out.println(emp.id+"--"+emp.name+"--"+emp.salary);
			
		}
		
		
	}


