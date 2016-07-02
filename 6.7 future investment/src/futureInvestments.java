/** Program:  6.7 future investments
  * File:     futureInvestments.java 
  * Summary:  computes future investments
  * Author:   Eric Roberts
  * Date:     July 2, 2016
**/
import java.util.Scanner;

public class futureInvestments {

	public static void main(String[] args) {
		//Start Scanner for future investments
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the invested amount (e.g., 1000): ");
		double investment = sc.nextDouble();
		System.out.println("Enter the interest rate: ");
		double interestRate = sc.nextDouble();
		
		final int NUMBER_YEARS = 30;
		double monthlyInterestRate = interestRate / 1200;
		
		//print future years
		System.out.println("Years      Future Value");
		for (int years = 1; years <= NUMBER_YEARS; years++) {
			System.out.printf("%-10d", years);
			System.out.printf("%11.2f\n", futureInvestmentValue(investment, monthlyInterestRate, years));
		}
		
		
	}

	public static double futureInvestmentValue(double investment,
			double monthlyInterestRate, int years) {
		return investment * (1 + monthlyInterestRate * years * 12);
	}

}
