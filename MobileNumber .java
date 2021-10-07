package regex.com;
	
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * @purpose:Validating MobileNumber using lambda expression
 * @author:shivani
 */

@FunctionalInterface
interface UserRegistrationInterface
{
    boolean MobileNumberVaildate (String MobileNumber);
}

public class MobileNumber 
{	
	public static void main(String[] args)
	{
	   UserRegistrationInterface userRegistration = (MobileNumber)->
	 {
		    String MobileNumberRegex = "^[0-9]{2}\s{1}[0-9]{10}$";
		    Pattern pattern = Pattern.compile(MobileNumberRegex);
			  Matcher matcher = pattern.matcher(MobileNumber);
			  System.out.println(MobileNumber + " is vaild " + matcher.matches() );
                return matcher.matches();
	  };
		    System.out.println(userRegistration.MobileNumberVaildate("91 8765453323") );
	}			
}
