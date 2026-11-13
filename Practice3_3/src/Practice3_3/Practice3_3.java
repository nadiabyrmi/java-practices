package Practice3_3;
import java.util.Scanner;
public class Practice3_3 
{
	static Scanner console=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int n=1;
		while(n!=0)
		{
			System.out.print("Enter an integer: or zero to quit: ");
			n=console.nextInt();
			perfect(n);
		}
		console.close();
	}
	
	public static void perfect(int x)
	{
		if (x!=0)
		{
		int sum=0;
		for(int i=1; i<x;i++)
		{
			if (x%i==0)
			{
				sum+=i;
			}
		}
	  if(sum==x)
		  System.out.print("\nnumber is: "+x+" sum of its divisors is : "+sum+" => perfect.\n ");
	  else 
		  System.out.print("\nnumber is: "+x+" sum of its divisors is : "+sum+" => not perfect.\n");
		}
		else 
			System.out.print("goodbye!");
	}	
}

