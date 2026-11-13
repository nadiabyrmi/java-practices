package Practice3_6;
import java.util.Scanner;
public class Practice3_6 
{
	static Scanner console=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int n;
		System.out.print("enter a number to have fibonacci sequence up until it: ");
		n=console.nextInt();
		System.out.print("\nfibonacci until "+n+" is :\n");
		fibonacci(n);
		
		console.close();
	}
	public static void fibonacci(int x)
	{
		int num1=1,num2=1,fibo=0;
		System.out.print("1, 1,");
		while(fibo<x)
		{	
			fibo=num1+num2;
			if (fibo>x) break;
			System.out.print(" ,"+fibo);
			num1=num2;
			num2=fibo;
		}
		 System.out.print(" .");
			
	}
}
