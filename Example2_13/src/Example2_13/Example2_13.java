package Example2_13;
import java.util.Scanner;
public class Example2_13 
{	static Scanner console=new Scanner(System.in);
	public static void main(String[]args) 
	{
		int num1,num2,num3;
		System.out.print("Enter three integers to find the minimum and maximum of them: ");
		num1=console.nextInt();
		num2=console.nextInt();
		num3=console.nextInt();
		System.out.printf("\nmaximum is = %3d, minimum is = %3d", findMax(num1,num2,num3), findMin(num1,num2,num3));
		
	}
	public static int findMin(int x, int y, int z)
	{
		int min;
		min=(x<y? x:y);
		min=(min<z? min:z);
		return min;
	}
	public static int findMax(int x, int y, int z)
	{
		int max;
		max=(x>y? x:y);
		max=(max>z? max:z);
		return max;
	}
}
