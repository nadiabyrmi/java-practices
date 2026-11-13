package Example3_8;
import java.util.Scanner;
public class Example3_8 {
	static Scanner console=new Scanner(System.in);;
	public static void main(String[] args) 
	{
		float hour;
		double wage;
		System.out.print("enter your employee's worked hours and wage: ");
		hour=console.nextFloat();
		wage=console.nextDouble();
		calculate(hour,wage);
		console.close();
	}
	public static void calculate(float h, double w)
	{
		if(h>40)
		{
			System.out.printf("regular worked hours salary is: %5.2f & extra worked hours salary is: %5.2f\ntotal payment: %5.2f",(40*w),((h-40)*w*3/2),((40*w)+(h-40)*w*3/2));
		}
		else
		System.out.printf("regular worked hours salary is: %5.2f &total payment is: %5.2f",(w*40),(w*40));
	}
}
