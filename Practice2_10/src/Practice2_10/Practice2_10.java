package Practice2_10;
import java.util.Scanner;
public class Practice2_10 
{
	static Scanner console=new Scanner(System.in);
	public static void main(String[] args) 
	{
		double money;
		int interest;
		System.out.print("how much is the amount of money in your bank account? ");
		money=console.nextDouble();
		System.out.print("\nwhat is your bank's interest rate percentage? ");
		interest=console.nextInt();
		double annualInterest= (((money*interest*30)/36500)*12);
		System.out.printf("\nyour annual rate for %f with %d%% percentage is %f", money,interest,annualInterest);
		console.close();
	}
}
