package Example2_14;
import java.util.Scanner;
public class Example2_14 
{	static Scanner console=new Scanner(System.in);
	public static void main(String[]args) 
	{
		int num1,num2,num3;
		System.out.print("Enter three integer numbers to find the max:");
		num1=console.nextInt();
		num2=console.nextInt();
		num3=console.nextInt();
		double nom1,nom2,nom3;
		System.out.print("Enter three double numbers to find the max:");
		nom1=console.nextDouble();
		nom2=console.nextDouble();
		nom3=console.nextDouble();
		System.out.printf("Max of integr's is: %5d, Max of doubles is: %5.2f",findMax(num1,num2,num3),findMax(nom1,nom2,nom3));
		console.close();
	}
	public static int findMax(int x,int y,int z)
	{
		int max;
		max=(x>y? x:y);
		max=(max>z? max:z);
		return max;
	}
	public static double findMax(double x, double y, double z)
	{
		double max;
		max=(x>y? x:y);
		max=(max>z? max:z);
		return max;
	}
}
