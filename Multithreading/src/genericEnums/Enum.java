package genericEnums;

public class Enum {
	enum WEEKDAYS{
		MONDAY,TUESDAY,WEDNESDAY,THRUSDAY,FRIDAY;
	}
	enum WEEKENDDAY{
		SATURDAY,SUNDAY;
	}
	public static void main(String[] args) {
		Course[] values = Course.values();
		for(Course c : values) {
			System.out.println(c);
		}
		Course docker = Course.DOCKER;
		System.out.println(docker);
	}

}
