package comparableComoarator;

import java.util.Optional;

public class User {
	public String getUsernameById(Integer id) {
		if(id==100) {
			return"Sameer";
		}else if(id==101) {
			return "Mantoo";
		}else if(id==102) {
			return "Shamsul";
		}else {
			return null;
		}
	}


  public Optional<String> getUsername(Integer id){
	  String name = null;
	  if(id==100) {
		  name = "Sameer";
	  }else if(id==101) {
		  name = "Mantoo";
	  }else if(id==102);
	  name = "John";
	  
	  
  return Optional.ofNullable(name);
	  }
  }