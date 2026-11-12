package Practice2_7;
import java.util.Scanner;
public class Practice2_7 
{
	static Scanner console=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int x;
		System.out.print("Enter x: ");
		x=console.nextInt();
		System.out.printf("for x=%5d, 1/x*x+x+3 is = %5.2f",x, calculate(x));

	}
	public static float calculate(int x)
	{
		return (float)1/(x*x+x+3);
	}

}
