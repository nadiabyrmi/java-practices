package Practice3_14;
import java.util.Scanner;
public class Practice3_14 
{
	static Scanner console=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int n;
		double sum=0;
		System.out.print("enter an integer: ");
		n=console.nextInt();
		int sign= +1;
		for(int i=1;i<=n;i++)
		{	
			sum += (double)(sign)*1/i;
			sign=-1*sign;
		}
		System.out.print("sum of series is: "+sum);
		console.close();
	}
}
