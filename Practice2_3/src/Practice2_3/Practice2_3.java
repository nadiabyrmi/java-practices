package Practice2_3;
import java.util.Scanner;
public class Practice2_3 
{
	static Scanner console=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int s;
		int hour,minute,second;
		System.out.print("Enter seconds to view it in a expected format:" );
		s=console.nextInt();
		hour=s/3600;
		minute= (s%3600)/60;
		second=s%60;
		System.out.print(s+"\n Second's is equal to: "+hour+" hours, "+minute+" minutes ,"+second+" second's. ");
		console.close();
	}
}
