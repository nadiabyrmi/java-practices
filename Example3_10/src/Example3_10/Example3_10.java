package Example3_10;
import java.util.Scanner;
public class Example3_10 
{
	static Scanner console=new Scanner(System.in);
	public static void main(String[] args) 
	{
		double grade;
		System.out.print("Enter the student's grade: ");
		grade=console.nextDouble();
		System.out.print("grade = "+grade+" order= " +ranking(grade));
		console.close();
	}
	public static char ranking(double grade)
	{
		if(grade>=17&&grade<=20)
		{
			return 'A';
		}
		else if(grade>=15&&grade<17)
		{
			return 'B';
		}
		else if(grade>=12&&grade<15)
		{
			return 'C';
		}
		else if(grade<12)
		{
			return 'D';
		}
		else 
		{
			return 'E';
		}
	}
}
