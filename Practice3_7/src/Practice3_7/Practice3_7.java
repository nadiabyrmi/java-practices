package Practice3_7;
import java.util.Scanner;
public class Practice3_7 
{
	static Scanner console=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int n;
		String day=" ";
		System.out.print("enter number of the week day: ");
		n=console.nextInt();
		switch(n)
		{	
		case 1:
			day="saturday";
			break;
		case 2:
			day="sunday";
			break;
		case 3:
			day="monday";
			break;
		case 4:
			day="tuesday";
			break;
		case 5:
			day="wednesday";
			break;
		case 6:
			day="thursday";
			break;
		case 7:
			day="friday";
			break;
		default:
				System.out.print("number you've entered does not match to any week day!");
		}
		System.out.printf("week day is %s7",day);
		console.close();
	}

}
