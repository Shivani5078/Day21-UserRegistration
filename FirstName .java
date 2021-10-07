package regex.com;
	
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * @purpose:Validating firstName using lambda expression
 * @author : shivani
 */

@FunctionalInterface
interface UserRegistrationInterface
{
   boolean firstNameVaildate (String FirstName);
}

public class FirstName 
{	
	public static void main(String[] args)
	{
		 UserRegistrationInterface userRegistration = (FirstName)->
		 {
		    String firstNameRegex = "^[A-Z]{1}[a-z]{3,}$";
		    Pattern pattern = Pattern.compile(firstNameRegex);
			  Matcher matcher = pattern.matcher(FirstName);
			  System.out.println(FirstName + " is vaild " + matcher.matches() );
        return matcher.matches();
	    };
		    System.out.println(userRegistration.firstNameVaildate("Nandini") );
	}			
}
