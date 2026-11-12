package Example3_6;
import java.util.*;
public class Example3_6 
{
	static Scanner console=new Scanner(System.in);
	public static void main(String[] args) 
	{	
		long  sum=0;
		int x,i=0;
		System.out.print("enter any integers to find their sum or 0 to stop the program:");
		x=console.nextInt();
		while(x!=0)
		{
			sum+=x;
			i++;
			System.out.print("\ndo you want to continue? if not, enter 0: ");
			x=console.nextInt();
		}
		System.out.printf("\nsum of %d numbers you've entered is : %d", i,sum);
		System.out.close();
	}

}
