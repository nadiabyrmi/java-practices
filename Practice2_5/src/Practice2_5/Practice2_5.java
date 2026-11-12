package Practice2_5;
import java.util.Scanner;
public class Practice2_5 
{
	static Scanner console=new Scanner(System.in);
	public static void main(String[] args) 
	{	
		int temperature;
		System.out.print("enter the temperature in centigrade to convert:");
		temperature=console.nextInt();
		System.out.printf("\n%3d cantigrade is equal to: %5.2f farenhait", temperature, Farenhait(temperature));
		console.close();
	}
	public static double Farenhait(int c)
	{
		double farenhait;
		farenhait=9/5*c+32;
		return farenhait;
	}
}
