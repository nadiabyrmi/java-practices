package Practice2_6;
import java.util.Scanner;
public class Practice2_6 
{
	static  Scanner console= new Scanner(System.in);
	public static void main(String[] args) 
	{	
		float a,b,c,d,e;
		System.out.print("Enter five numbers with 5 floating points: ");
		a=console.nextFloat();
		b=console.nextFloat();
		c=console.nextFloat();
		d=console.nextFloat();
		e=console.nextFloat();
		float average= a+b+c+d+e/5;
		System.out.printf("our numbers was: %5.2f, %5.2f, %5.2f, %5.2f\n average = %5.3f", a,b,c,d,e,average);
		console.close();
	}

}
