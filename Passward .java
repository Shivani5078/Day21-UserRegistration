ackage regex.com;
	
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * @purpose:Validating Password using lambda expression
 * @author:shivani
 */

@FunctionalInterface
interface UserRegistrationInterface
{
    boolean PasswardVaildate (String Passward);
}

public class Passward 
{	
	public static void main(String[] args)
	{
	   UserRegistrationInterface userRegistration = (Passward)->
	 {
		    String PasswardRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()])([a-zA-Z0-9]*).{8,}$";
		    Pattern pattern = Pattern.compile(PasswardRegex);
			  Matcher matcher = pattern.matcher(Passward);
			  System.out.println(Passward + " is vaild " + matcher.matches() );
                return matcher.matches();
	  };
		    System.out.println(userRegistration.PasswardVaildate("Pass@1234") );
	}			
}
