package Practice3_11;
import java.util.Scanner;
public class Practice3_11 
{
	static Scanner console=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int n;
		long sum=0;
		System.out.print("enter an integer: ");
		n=console.nextInt();
		for(int i=1; i<=n; i++)
		{
			sum+=i;
		}
		System.out.print("sum of numbers until "+n+" is ="+sum);
		console.close();
	}

}
