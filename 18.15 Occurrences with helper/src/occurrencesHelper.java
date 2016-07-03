/** Program:  18.15 occurrences with helper
  * File:     occurrencesHelper.java 
  * Summary:  displays occurrences in a string with a helper method
  * Author:   Eric Roberts
  * Date:     July 3, 2016
**/
import java.util.Scanner;

public class occurrencesHelper {

	public static void main(String[] args) {
		// Start Scanner for string and character
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string and a character: ");
		String[] str = sc.nextLine().split("[ ]");
		
		//display occurrences
		System.out.println("The character \'" + str[1] + "\' is in the string \"" + str[0] + "\" " + count(str[0] , str[1].charAt(0)) + " times.");
		

	}
	//method for occurrences
	public static int count(String str, char a) {
		return count(str, a, str.length() - 1);
	}
	//helper method
	private static int count(String str, char a, int high) {
		if (high < 0)
			return 0;
		else if (str.charAt(high) == a) {
			return 1 + count(str, a, high - 1);
		} else
			return count(str, a, high - 1);
	}

}
