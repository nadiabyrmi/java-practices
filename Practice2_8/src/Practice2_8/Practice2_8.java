package Practice2_8;
import java.util.Scanner;
public class Practice2_8 
{
	static Scanner console= new Scanner(System.in);
	public static void main(String[] args) 
	{
		float x,y;
		double price;
		System.out.print("enter land's dimension's and price per square meter to calculate land's total price(separate with space)" );
		x=console.nextFloat();
		y=console.nextFloat();
		price=console.nextDouble();
		System.out.printf("\nlands length is: %5.2f & width is: %5.2f\nprice per square meter is: %8.4f\ntotal price: %9.5f ",x,y,price,totalPrice(x,y,price));
		console.close();
	}
	public static double totalPrice(float x,float y, double price)
	{
		return (x*y)*price;
	}
}
