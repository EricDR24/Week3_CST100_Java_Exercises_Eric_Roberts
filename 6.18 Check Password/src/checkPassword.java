/** Program:  6.18 Check Password
  * File:     checkPassword.java 
  * Summary:  checks to see if password is valid
  * Author:   Eric Roberts
  * Date:     July 2, 2016
**/
import java.util.Scanner;

public class checkPassword {
	
	public static void main(String[] args) {
		//Start Scanner for password
		Scanner sc = new Scanner(System.in);
		System.out.println("Password must have at least eight characters."
				+ "\nPassword consists of only letters and numbers."
				+ "\nPassword must contain at least two numbers."
				+ "\nEnter a password with the requirements: ");
		String password = sc.nextLine();
		
		
		
		//print if password is valid
		if (isValid(password)) {
			System.out.println("Password is valid: " + password);
		} else {
			System.out.println("Password not valid: " + password);
		}
		
		
		
	}
    //method for isValid()
	//password required length
	public static boolean isValid(String password) {
		if (password.length() < 8) return false;
		
		int charCount = 0;
		int numCount = 0;
		for (int i = 0; i < password.length(); i++) {
			char pass = password.charAt(i);
			
			if (isNumber(pass)) numCount++;
			else if (isLetters(pass)) charCount++;
			else return false;
		}
		return (charCount >= 2 && numCount >= 2);
	
	
	}
	//letters check return true or false
	private static boolean isLetters(char pass) {
		pass = Character.toUpperCase(pass);
		return (pass >= 'A' && pass <= 'Z');
	}
	//number check return true or false
	private static boolean isNumber(char pass) {
		return (pass >= '0' && pass <= '9');
	}

}
