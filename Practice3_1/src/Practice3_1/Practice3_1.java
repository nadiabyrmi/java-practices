package Practice3_1;
import java.util.Scanner;
public class Practice3_1 
{
	static Scanner console= new Scanner(System.in);
	public static void main(String[] args)
	{
		for(int i=1; i<=6; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*\t");
			}
			System.out.println();
		}
		console.close();
	}

}
