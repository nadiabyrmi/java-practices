package Example2_15;
import java.util.Scanner;
public class Example2_15 
{
	static Scanner console=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int number=6;
		System.out.print("In main before calling the method: "+number+"\n");
		printParameter(number);
		System.out.print("In main after calling the method: "+number+"\n");
		console.close();
	}
	public static void printParameter(int num)
	{
		System.out.print("In method before changing: num = "+num+"\n");
		num=20;
		System.out.print("In method after changing: num = "+num+"\n");
		
		
	}
}
