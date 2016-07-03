/** Program:  18.9 reverse string
  * File:     reverseString.java 
  * Summary:  displays a string in reverse.
  * Author:   Eric Roberts
  * Date:     July 3, 2016
**/
import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		//Start Scanner for String
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String s = sc.nextLine();
		
		//display reverse String
		reverseDisplay(s);

	}

	public static void reverseDisplay(String s) {
		if (s.length() == 0)
			return;
		System.out.println(s.substring(s.length() - 1));
		reverseDisplay(s.substring(0, s.length() - 1));
		
	}

}
