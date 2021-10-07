package regex.com;
		
	import java.util.Scanner;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;
	/*
	 * @purpose:Validating LastName using lambda expression
	 * @author:shivani
	 */
	
	@FunctionalInterface
	interface UserRegistrationInterface
	{
	    boolean LastNameVaildate (String LastName);
	}
	
	public class LastName 
	{	
		public static void main(String[] args)
		{
			UserRegistrationInterface userRegistration = (LastName)->
			{
			    String LastNameRegex = "^[A-Z]{1}[a-z]{3,}$";
			    Pattern pattern = Pattern.compile(LastNameRegex);
				  Matcher matcher = pattern.matcher(LastName);
				  System.out.println(LastName + " is vaild " + matcher.matches() );
	           return matcher.matches();
		    };
			    System.out.println(userRegistration.LastNameVaildate("Baride") );
		}			
	}
