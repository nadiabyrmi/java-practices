package Practice2_2;
import java.util.Scanner;
public class Practice2_2 
{
	static Scanner console=new Scanner(System.in);
	public static void main(String[] args) 
	{	int h, a;
	System.out.print("Enter triangle's height and base to find it's area: ");
	h=console.nextInt();
	a=console.nextInt();
	System.out.print("\narea is: "+ (a*h)/2);
	console.close();
	}
}
