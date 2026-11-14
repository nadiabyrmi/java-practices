package Practice3_9;
import java.util.Scanner;
public class Practice3_9 
{
	static Scanner console=new Scanner(System.in);
	public static void main(String[] args) 
	{
		for(int i=2;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
		console.close();
	}
}
