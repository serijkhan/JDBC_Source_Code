package comparableComoarator;

import java.util.function.Supplier;

public class Test {
	public static void main(String[] args) {
		Supplier<Doctor> s = Doctor::new;
		 Doctor doctor = s.get();
		 System.out.println(doctor.hashCode());
	}

}

class Doctor{
	public Doctor() {
		System.out.println("Doctor constructor...");
	}
}