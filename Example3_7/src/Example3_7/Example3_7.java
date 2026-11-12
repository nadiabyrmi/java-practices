package Example3_7;
import java.util.*;
public class Example3_7
{
	static Scanner console=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int x;
		System.out.print("enter any positive integer's to get it's reversed form: ");
		x=console.nextInt();
		System.out.print("\nthe reversed form using string method is:"+method2(x)+"\nthe reversed form using numeral method is:"+method1(x));
		console.close();
	}
	
	
	public static int method1(int n)
	{ 
		int digit=0,reversed=0;
		do
		{
		digit=n%10;
		n/=10;
		reversed=(reversed*10)+digit;
		}
		while(n>=10);
		{
		reversed=(reversed*10)+n;
		}
		return reversed;
	}
	
	
	public static String method2(int n)
	{
		String reversed=" ";
		int digit;
		do
		{
			digit= n%10;
			n/=10;
			reversed+=digit;
		}
		while(n>=10);
		{
			reversed+=n;
		}
		return reversed;
	}
}
