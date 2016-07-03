/** Program:  18.17 occurrences with an array
  * File:     occurrencesHelper.java 
  * Summary:  displays occurrences in an array
  * Author:   Eric Roberts
  * Date:     July 3, 2016
**/
import java.util.Scanner;

public class occurrencesArray {

	public static void main(String[] args) {
		//Start Scanner for list of characters
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a list of characters in on line");
		String str = sc.nextLine();
		char[] ch = new char[str.length() - 1];
		for (int i = 0; i < ch.length; i++)
			ch[i] = str.charAt(i);
		char c = str.charAt(str.length() - 1);
		
		//print the occurrences of character
		System.out.println("The character \"" + c + "\" is in the list " + count(ch, c) + " times " + str.substring(0, str.length() - 1) + "\".");

	}
	//methods to print occurrences
	public static int count(char[] ch, char c) {
		return count(ch, c, ch.length - 1);
	}
	
	//helper method
	public static int count(char[] ch, char c, int high) {
		if (high < 0)
			return 0;
		else if (ch[high] == c)
			return 1 + count(ch, c, high - 1);
		else
			return count(ch, c, high - 1);
	}

}
