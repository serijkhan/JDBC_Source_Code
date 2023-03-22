package reflectionAPI;


import java.text.DateFormat.Field;

public class Demoe {
	

	public static void main(String[] args)throws Exception {
		Class clz = Class.forName("reflectionAPI.Students");
		Object obj = clz.newInstance();
		java.lang.reflect.Field field = clz.getDeclaredField("age");
		field.setAccessible(true);
		field.set(obj, 35);
		
		//Students s = new (Students) obj;
		//s.getAge();
	}

}
