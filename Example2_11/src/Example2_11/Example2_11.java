package Example2_11;
import java.util.Scanner;
public class Example2_11 
{	static Scanner console=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int num1,num2,num3;
		System.out.print("Enter three integer numbers:");
		num1=console.nextInt();
		num2=console.nextInt();
		num3=console.nextInt();
		findMax(num1,num2,num3);
		console.close();
	}
		public static void findMax(int x,int y,int z)
		{
			int max;
			max= (x>y ? x: y);
			max= (max>z ? max:z);
			System.out.print("maximum of:"+x+", and "+y+", and "+z+", is: "+max);
		}
}