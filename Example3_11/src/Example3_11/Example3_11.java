package Example3_11;
import java.util.Scanner;
public class Example3_11 
{
	static Scanner console=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int num, even=0, odd=0;
		while(true)
		{
			System.out.print("enter an integer number's or zreo to stop: ");
			num=console.nextInt();
			if(num==0)
				break;
			if (num%2==0)
			{
				even++;
			}
			else
				odd++;
		}
		System.out.print("you've entered "+even+" even numbers and "+odd+" odd numbers.");
		console.close();
	}
}
