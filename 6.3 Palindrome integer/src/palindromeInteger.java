/** Program:  6.3 palindrome Integer
  * File:     palindromeInteger.java 
  * Summary:  prints payroll for employees
  * Author:   Eric Roberts
  * Date:     July 2, 2016
**/
import java.util.Scanner;

public class palindromeInteger {

	public static void main(String[] args) {
		//Scanner for integer
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a three-digit number: ");
		int number = sc.nextInt();
		
		//is number an integer?
		if (isPalindrome(number)) {
			System.out.println(number + " is a palindrome.");
		} else {
			System.out.println(number + " is not a palindrome");
		}
	}
	//Return true if a palindrome	
	public static boolean isPalindrome(int number) {
		return number == reverse(number);
	}
	//Return the reversal of an integer, i.e. reverse(456) return 654
	public static int reverse(int number) {
		String reverse = "";
		String num = number + "";
		for (int i = num.length() - 1; i >= 0; i--) {
			reverse += num.charAt(i);
		}
		return Integer.parseInt(reverse);
	}

}
