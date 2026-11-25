package Example4_1;
import java.util.Scanner;

public class Fabric 
{
	static Scanner console=new Scanner(System.in);
	private double size;
	
	public void readSize()
	{
		System.out.print("Enter your fabric's size in meter: ");
		size=console.nextDouble();
	}
	public double meter2yard(double size)
	{
		return size*1.196;
	}
	public void showYard()
	{
		System.out.printf("your fabrics size in meter is: %5.2f and in yard is: %8.4f", size, meter2yard(size));
	}
}
