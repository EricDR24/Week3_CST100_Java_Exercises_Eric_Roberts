/** Program:  6.31 credit card check
  * File:     creditCard.java 
  * Summary:  checks to see if credit card is valid
  * Author:   Eric Roberts
  * Date:     July 3, 2016
**/
import java.util.Scanner;

public class creditCard {

	public static void main(String[] args) {
		//Start Scanner for credit card check
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter credit card number as long interger: ");
		long ccNumber = sc.nextLong();
		
		//print credit card valid or not
		System.out.println(ccNumber + " is " + (isValid(ccNumber) ? "valid" : "invalid"));

	}

	private static boolean isValid(long ccNumber) {
		boolean valid = (getSize(ccNumber) >= 13 && getSize(ccNumber) <= 16) && (prefixMatched(ccNumber, 4) || prefixMatched(ccNumber, 5)
				|| prefixMatched(ccNumber, 6) || prefixMatched(ccNumber, 37)) && ((sumofDoubleEvenPlace(ccNumber) + sumofOddPlace(ccNumber)) % 10 == 0);
		return valid;
	}


	//step 2 add all single-digit numbers from Step 1
	public static int sumofDoubleEvenPlace(long ccNumber) {
		int sum = 0;
		String num = ccNumber + "";
		for (int i = getSize(ccNumber) - 2; i >= 0; i -= 2) {
			sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
		}
		return sum;
	}
	//if number is single number or sum of two numbers
	private static int getDigit(int ccNumber) {
		if (ccNumber < 9)
			return ccNumber;
		else
			return ccNumber / 10 + ccNumber % 10;
	}
	// step 3 add all odd digits from right to left
	private static int sumofOddPlace(long ccNumber) {
		int sum = 0;
		String num = ccNumber + "";
		for (int i = getSize(ccNumber) - 1; i >= 0; i -= 2) {
			sum += Integer.parseInt(num.charAt(i) + "");
		}
		return sum;
	}
	//true if prefix is d
	public static int getSize(long d) {
		String num = d + "";
		return num.length();
	}
	public static boolean prefixMatched(long ccNumber, int d) {
		return getPrefix(ccNumber, getSize(d)) == d; 
	}
	
	private static long getPrefix(long ccNumber, int k) {
		if (getSize(ccNumber) > k) {
			String num = ccNumber + "";
			return Long.parseLong(num.substring(0, k));
		}
		return ccNumber;
	}


}
