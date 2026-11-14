package Practice3_12;
import java.util.Scanner;
public class Practice3_12
{
	static Scanner console=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int num;
		System.out.print("enter an integer: ");
		num=console.nextInt();
		for(int i=1;i<num;i++)
		{
			Perfect(i);
		}
		console.close();

	}
	public static void Perfect(int n)
	{  
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
			if (n==sum)
			{
				System.out.print(sum+" ");
			}
	}
}
