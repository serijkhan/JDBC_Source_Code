package reflectionAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo {
	public static void main(String[] args)throws Exception {
		Class clz = Class.forName("reflectionAPI.Student");
		Field[] fields = clz.getDeclaredFields();
		
		for(Field f : fields) {
			System.out.println(f.getName());
		}
		Method[] methods =clz.getDeclaredMethods();
		
		for(Method m: methods) {
			System.out.println(m.getName());
		}
	   Constructor[] constructor = clz.getDeclaredConstructors();
	   
	   for(Constructor c : constructor) {
		   System.out.println(c.getName());
	   }
	}

}
