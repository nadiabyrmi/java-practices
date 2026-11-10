package Example2_7;
import java.util.Scanner;

public class Example2_7
{	
	public static void main(String[] args) 
	{
		int x,y,perime,area;
		Scanner console= new Scanner(System.in);
		System.out.print("Enter length and width :");
		x=console.nextInt();
		y=console.nextInt();
		perime= (x+y)*2;
		area= x*y;
		System.out.printf("perime is= %d, area= %d", perime, area);
		console.close();
	}
}
