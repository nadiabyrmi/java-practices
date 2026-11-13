package Example3_14;
import java.util.Scanner;
public class Example3_14 
{
	static Scanner console=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int n;
		System.out.print("enter an integer to find it's factorial: ");
		n=console.nextInt();
		System.out.print("\n number "+n+" factorial is : "+ factorial(n));
		console.close();
	}
	public static int factorial(int x)
	{
		if(x!=0)
		{
			return x*factorial(x-1);
		}
		else
			return 1;
	}
}
