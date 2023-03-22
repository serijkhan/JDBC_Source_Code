package reflectionAPI;

import java.lang.reflect.Method;

public class Teacher {
	public static void main(String[] args) throws Exception {
		Class<?> clz = Class.forName("reflectrionAPI.Students");
		Method method = clz.getDeclaredMethod("getAge");
		
		Object obj = clz.newInstance();
		
		
		
		method.invoke(obj, null);
	}

}
