package com.shameer;

public class Driver3 {
College mi() {
	College c = new College ();
	c.id = 102;
	c.name = "hitm";
	
	return c;
}
public static void main(String[] args) {
	Driver3 d = new Driver3();
	College c = d.mi();
	System.out.println(c.id + "--" + c.name);
}
}
class College{
	int id;
	String name;
}


