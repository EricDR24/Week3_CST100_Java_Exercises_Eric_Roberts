/** Program:  18.2 fibonacciNumbers
  * File:     fibonacciNumbers.java 
  * Summary:  displays the index fibonacci number
  * Author:   Eric Roberts
  * Date:     July 3, 2016
**/
import java.util.Scanner;

public class fibonacciNumbers {

	public static void main(String[] args) {
		//Start scanner for index
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a fibonacci index, e.g., 0 or 1: ");
		int index = sc.nextInt();
		
		//print fibonacci index
		System.out.println("The fibonacci number for the index is " + fib(index));

	}

	public static long fib(int index) {
		if (index == 0)
			return 0;
		if (index == 1)
			return 1;
		
		int f0 = 0;
		int f1 = 1;
		int fib;
		for (int i = 2; i <= index; i++) {
			fib = f0 + f1;
			f0 = f1;
			f1 = fib;
		}
		return f1;
	}

}
