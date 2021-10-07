package regex.com;
	
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * @purpose:Validating Email using lambda expression
 * @author:shivani
 */

@FunctionalInterface
interface UserRegistrationInterface
{
    boolean EmailVaildate (String Email);
}

public class Email 
{	
	public static void main(String[] args)
	{
		UserRegistrationInterface userRegistration = (Email)->
		{
		    String EmailRegex = "^[a-z0-9+_.-]+@[a-z0-9.-]+$";
		    Pattern pattern = Pattern.compile(EmailRegex);
			Matcher matcher = pattern.matcher(Email);
			System.out.println(Email + " is vaild " + matcher.matches() );
              return matcher.matches();
	    };
		    System.out.println(userRegistration.EmailVaildate("nandinibaride1234@gmail.com") );
	}			
}
