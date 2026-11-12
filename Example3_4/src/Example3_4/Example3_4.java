package Example3_4;
import java.util.Scanner;
public class Example3_4 
{
	static Scanner console= new Scanner(System.in);
	public static void main(String[] args) 
	{
		for(int i=1; i<=10;i++)
		{
			for  (int j=1; j<=10;j++)
			{
				System.out.print(i*j+"\t");
			}
			System.out.println();
		}
		console.close();
	}

}
