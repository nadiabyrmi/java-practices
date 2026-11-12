package Example3_2;
import java.util.Scanner;
public class Example3_2 
{
	static Scanner console=new Scanner(System.in);
	public static void main(String[] args) 
	{
		for(char letter='A'; letter<='F';letter++)
		{
			System.out.printf(" character %c's ascii code is: %d", letter,(int)letter);
			System.out.println();
		}
		console.close();
	}

}
