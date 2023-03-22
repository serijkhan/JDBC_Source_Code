
public class User {

	int id;
	String name;
	public User() {
		
	}
	public User(int id , String name) {
		this.id=id;
		this.name=name;
	}
	public void speak() {
		System.out.println("Hii ,I am"+ name);
	}
	

}



