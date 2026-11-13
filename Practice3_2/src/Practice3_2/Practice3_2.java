package Practice3_2;
import java.util.Scanner;
public class Practice3_2 
{
	static Scanner console=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int n=10;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		console.close();
	}

}
