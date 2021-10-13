package login;

import java.io.FileInputStream;
import java.util.Properties;



public class App {
 public boolean userlogin(String user,String pass) throws Exception {
	 Properties prop= new Properties();
	 prop.load(new FileInputStream("src/main/resources/credentials.property"));
	String un=prop.getProperty("username");
	String pwd=prop.getProperty("password");

	 if(un.equals(user) && pwd.equals(pass))
	 return true;
	else  
	 return false;
	 
 }
	
	
}
