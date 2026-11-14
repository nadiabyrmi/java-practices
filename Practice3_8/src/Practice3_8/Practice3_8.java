package Practice3_8;
import java.util.Scanner;
public class Practice3_8 
{
	static Scanner console=new Scanner(System.in);
	public static void main(String[] args)
	{
		int a, b, c;
		System.out.print("enter coefficient of a quadric equation, in this order: a, b, c\n");
		a=console.nextInt();
		b=console.nextInt();
		c=console.nextInt();
		root(a,b,c);
		console.close();
	}
	public static void root(int a,int b,int c)
	{
		 double delta=(b*b-4*a*c);
		 double x1= (-b+Math.sqrt(delta))/(2*a);
		 double x2= (-b-Math.sqrt(delta))/(2*a);
		 if (delta>0)
		 {
			 System.out.printf("root one is: %5.2f\nroot two is: %5.2f", x1,x2);
		 }
		 else if(delta<0)
		 {
			System.out.print("the equation has no roots because delta is negative.");
		 }
		 else
		 {
			System.out.printf("equation has only one root: %5.2f", x1);
		 }
	}
}
