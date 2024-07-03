import java.util.Scanner;

public class Exercise_02_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the investment amount,
		// annual interest rate and number of years.
		System.out.print("Enter investment amount: ");
		double amount = input.nextDouble();
		System.out.print("Enter annual interest rate in percentage: ");
		double monthlyInterestRate = input.nextDouble();
		monthlyInterestRate /= 1200;
		System.out.print("Enter number of years: ");
		int years = input.nextInt();

		// Calculate future investment value
		double futureInvestmentValue = 
			amount * Math.pow(1 + monthlyInterestRate, years * 12);
		
		// Display result
		System.out.println("Accumulated value is $" + futureInvestmentValue);
	}
}
© 2022 GitHub, Inc.