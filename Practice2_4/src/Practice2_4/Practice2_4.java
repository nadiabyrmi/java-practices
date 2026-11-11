package Practice2_4;
import java.util.Scanner;
public class Practice2_4 
{
	static Scanner console=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int w_hours;
		double w_rate;
		System.out.print(" how many hours does the employee work and how much is his wage pair an hour?(separate with space)");
		w_hours=console.nextInt();
		w_rate=console.nextDouble();
		double salary, taxedSalary;
		salary= w_hours*w_rate;
		taxedSalary=(salary*10/100);
		System.out.print("\nemployee's salary without tax is: "+salary+"\nemployee's salary with 10% tax is:"+(salary-taxedSalary));
		console.close();
	}

}
