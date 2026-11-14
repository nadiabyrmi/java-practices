package Practice3_13;
import java.util.Scanner;
public class Practice3_13 
{
	static Scanner console=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int n;
		double sum=0;
		System.out.print("enter an integer: ");
		n=console.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum+=1.00/factorial(i);
		}
		System.out.printf("sum of the series: %.6f", sum);
		console.close();
	}
	
	public static long factorial(int n)
	{
		long fact=1;
		if (n==0)
			return 1;
		else
		for(int i=1;i<=n;i++)
			{
				fact*=i;
			}
			return fact;
	}
	
	
	
	
	
	
	

}
