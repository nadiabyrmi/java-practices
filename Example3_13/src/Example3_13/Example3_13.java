package Example3_13;
import java.util.Scanner;
public class Example3_13 
{
	static Scanner console=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int x,y;
		System.out.print("enter x's vslue to find y: ");
		x=console.nextInt();
		switch(x)
		{
		case 5:
			y=5*x+3*x;
			break;
		case 10:
			y=5*x-3*x+6;
			break;
		case 20:
			y=5*x;
			break;
		default:
			y=5;
			break;
		}
		System.out.print("\nfor x= "+x+", y= "+y+" .");
		console.close();
	}

}
