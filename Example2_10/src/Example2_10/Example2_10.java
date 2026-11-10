package Example2_10;
import java.util.Scanner;
public class Example2_10 
{
	static Scanner console= new Scanner(System.in);
	public static void main(String[] args) 
	{
		int num1,num2,num3;
		float average;
		System.out.print("Enter three numbers to find their average: ");
		num1=console.nextInt();
		num2=console.nextInt();
		num3=console.nextInt();
		average=(num1+num2+num3)/3;
		System.out.printf("Average without type casting: %5.2f", average);
		average=(float)(num1+num2+num3)/3;
		System.out.printf("\nAverage with type casting: %5.2f", average);
		console.close();
	}
}
