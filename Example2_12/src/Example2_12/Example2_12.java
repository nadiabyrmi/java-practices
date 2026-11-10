package Example2_12;
import java.util.Scanner;
public class Example2_12 
{	
	static Scanner console= new Scanner(System.in);
	public static void main(String[] args) 
	{
		int num1, num2;
		System.out.print("Enter two integers to find the sum of their square: ");
		num1=console.nextInt();
		num2=console.nextInt();
		System.out.printf("\n expected number is: %8d", sumSqr(num1,num2));
		console.close();
	}
	public static int sumSqr(int x,int y)
	{
		int sum;
		return sum= (x*x) + (y*y);
	}
}
