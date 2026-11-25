package Example4_2;
import java.util.Scanner;

public class Rectangle 
{	
	static Scanner console=new Scanner(System.in);
	private float length,width;
	private double perimeter,area;
	
	public void readsize() 
	{
		System.out.print("enter rectangles length: ");
		length=console.nextFloat();
		System.out.print("\nenter rectangles width: ");
		width=console.nextFloat();
	}
	public void calculate()
	{
		perimeter=2*(width+length);
		area=length*width;
	}
	public void show()
	{
		System.out.print("The ractangles size is: "+ length+"*"+width);
		System.out.print("\nIt's perimeter is: "+perimeter+" area is: "+area);	
	}
	
}
