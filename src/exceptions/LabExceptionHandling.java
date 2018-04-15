package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * first answer: java.util.IllegalFormatConversionException:
 * 
 * second answer: java.util.InputMismatchException and 
 * line 7: int digit = numberFromUser();
 * 
 * third answer: java.lang.ArithmeticException: / by zero
 * line 8: int digit = numberFromUser();
 * 
 */

public class LabExceptionHandling
{
	public static void main(String[] args)
	{
		try {
			int digit = numberFromUser();
			int result = sevenModulusN(digit);
			System.out.printf("7 %% %d = %d", digit, result);
			
		}catch (Exception ex) { //Guideline: catch more specific exceptions types unless this
								//is the top level to avoid showing a stack trace to the user
			System.out.println(ex.getMessage());
		}
	}

	private static int numberFromUser()
	{
			
		//@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		boolean done = false;
		int number = 0;
		while (!done) {
			System.out.print("number: ");
			if (input.hasNextInt()) { // Where possible, prefer if-else over exceptions
				number = input.nextInt();
				done = true;
			}
			else {
				System.out.println("Needs to be a whole number.");
				input.nextLine();
			}
		}
			return number;
	}
		

	private static int sevenModulusN(int number)
	{
		if(number == 0) 
			throw new IllegalArgumentException ("Can't calculate 7 % 0");
		
		return 7 % number;
	}
}
