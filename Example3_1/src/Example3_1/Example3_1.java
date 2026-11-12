package Example3_1;
import java.util.Scanner;
public class Example3_1 
{
	static Scanner console=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int x,i,sum=0;
		double average;
		for(i=0;i<5;i++)
		{
			System.out.print("Enter number "+(i+1)+":");
			x=console.nextInt();
			sum+=x;
		}
		average=(double)sum/5;
		System.out.printf("Average is : %5.2f", average);
		console.close();
	}

}
