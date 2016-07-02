/** Program:  4.11 decimal to hex
  * File:     decimalToHex.java 
  * Summary:  Converts decimals to hex value
  * Author:   Eric Roberts
  * Date:     July 2, 2016
**/
import java.util.Scanner;

public class decimalToHex {

	public static void main(String[] args) {
		// Start Scanner to input 0 - 15
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal value (0 to 15): ");
		double decimal = sc.nextDouble();
		
		//print hex number
		if (decimal >= 0 && decimal <= 9.0)
			System.out.println("The hex value is " + decimal);
		else if (decimal >= 9.1 && decimal <= 15.0)
			System.out.println("The hex value is " + (char)(decimal + 'A' - 10));
		else
			System.out.println(decimal + " is an invalid input");

	}

}
