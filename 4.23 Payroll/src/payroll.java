/** Program:  4.23
  * File:     payroll.java 
  * Summary:  prints payroll for employees
  * Author:   Eric Roberts
  * Date:     July 2, 2016
**/
import java.util.Scanner;

public class payroll {

	public static void main(String[] args) {
		//Start Scanner for payroll
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee's name: ");
		String name = sc.nextLine();
		System.out.println("Enter number of hours worked in a week: ");
		double hours = sc.nextDouble();
		System.out.println("Enter hourly pay rate: ");
		double pay = sc.nextDouble();
		System.out.println("Enter federal tax withholding rate: ");
		double federalTax = sc.nextDouble();
		System.out.println("Enter state tax withholding rate: ");
		double stateTax = sc.nextDouble();
				
		//print result
		double totalPay = hours * pay;
		double federal = totalPay * federalTax;
		double state = totalPay * stateTax;
		double deduction = federal + state;
		
		System.out.println("Employee name " + name);
		System.out.println("Hours worked " + hours);
		System.out.println("Pay Rate " + pay);
		System.out.println("Gross Pay " + totalPay);
		System.out.println("Deductions: \nFederal Withholding (%20.0): $" + federal + "\nState WithHolding (%9.0): $" + state + "\nTotal deduction: $" + deduction);
        System.out.println("Net Pay: $" + (totalPay - deduction));
	}

}
