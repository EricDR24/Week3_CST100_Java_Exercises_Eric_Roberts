/** Program:  18.10 occurrences in a string
  * File:     occurrences.java 
  * Summary:  displays occurrences in a string
  * Author:   Eric Roberts
  * Date:     July 3, 2016
**/
import java.util.Scanner;

public class occurrences {

	public static void main(String[] args) {
		//Start scanner for string
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string and a character: ");
		String[] str = sc.nextLine().split("[ ]");
		
		//print number of occurrences
		System.out.println("The number of occurrences of the character \'" + str[1] + "\' in the string \"" + str[0] + "\" is " + count(str[0], str[1].charAt(0)));
		
	}
	//method for number occurrences

	public static int count(String str, char a) {
		int index = 0;
		int count = 0;
		return count(str, a, index, count);
	}

	public static int count(String str, char a, int index, int count) {
		if (index == str.length())
			return count;
		else if (str.charAt(index) == a)
			return count(str, a, ++index, ++count);
		else
			return count(str, a, ++index, count);
		
	}

	

}
