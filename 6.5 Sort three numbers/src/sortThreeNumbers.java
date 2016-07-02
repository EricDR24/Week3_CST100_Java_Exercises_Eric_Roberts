/** Program:  6.5 Sort three numbers
  * File:     sortThreeNumbers.java 
  * Summary:  Sorts Three numbers in increasing order.
  * Author:   Eric Roberts
  * Date:     July 2, 2016
**/
import java.util.Scanner;

public class sortThreeNumbers {

	public static void main(String[] args) {
		//Start Scanner for numbers
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		double number1 = sc.nextDouble();
		double number2 = sc.nextDouble();
		double number3 = sc.nextDouble();
		
		displaySortedNumbers(number1, number2, number3);

	}
    //print numbers increasing order
	public static void displaySortedNumbers(double num1, double num2,
			double num3) {
		double temp;
		
		if (num2 < num1 && num2 < num3) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		} else if (num1 > num3 && num2 > num3) {
			temp = num1;
			num1 = num3;
			num3 = temp;
		} if (num2 > num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		System.out.println(num1 + " " + num2 + " " + num3);
	
		
	}

}
