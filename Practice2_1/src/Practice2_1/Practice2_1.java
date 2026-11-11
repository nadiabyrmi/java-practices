package Practice2_1;
import java.util.Scanner;
public class Practice2_1 
{
	static Scanner console=new Scanner(System.in);
	public static void main(String[] args) 
	{	//printing star's
		char star='*';
		System.out.printf("%11c\n",star);
		System.out.printf("%6c%10c\n",star,star);
		System.out.printf("%1c%10c%10c\n", star,star,star);
		System.out.println();
		System.out.println("          "+star);
		System.out.println("     "+star+"          "+star);
		System.out.println(star+"         "+star+"          "+star);
		console.close();
	}
}
