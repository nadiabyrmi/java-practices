package Example2_8;
import java.util.Scanner;
public class Example2_8 
{
	static Scanner console= new Scanner(System.in);
	public static void main(String[] args) 
	{
		float r,p,s;
		final float PI=3.14f;
		System.out.println("Enter the radius of your circle: ");
		r=console.nextFloat();
		s=PI*r*r;
		p=2*PI*r;
		System.out.printf("cricle's circumference is: %7.3f\ncircle's area is: %7.3f", p,s);
		console.close();
	}

}
