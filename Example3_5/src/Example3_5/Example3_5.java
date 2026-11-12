package Example3_5;
import java.util.Scanner;
public class Example3_5
{
	static Scanner console=new Scanner(System.in);
	public static void main(String[] args)
	{
		int n;
		System.out.print("enter an integer: ");
		n=console.nextInt();
		System.out.format("\nfactorial %d is : %d", n,Factorial(n));
		console.close();
	}
	public static long Factorial(int x)
	{	
		long fact=1;
		for(int f=1;f<=x;f++)
		{
			fact *=f;
		}
		return fact;
	}

}
