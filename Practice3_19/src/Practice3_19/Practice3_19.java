package Practice3_19;
import java.util.Scanner;
public class Practice3_19 
{
	static Scanner console=new Scanner(System.in);
	public static void main(String[] args)
	{
		int y1,y2,m1,m2,d1,d2;
		System.out.print("enter your birth year: ");
		y1=console.nextInt();
		System.out.print("\nenter your birth month(numeral): ");
		m1=console.nextInt();
		System.out.print("\nenter your birth day: ");
		d1=console.nextInt();
		System.out.print("\nyour birthdate is: "+y1+"."+m1+"."+d1+"\nnow enter today's year:");
		y2=console.nextInt();
		System.out.print("\nenter today's month(numeral): ");
		m2=console.nextInt();
		System.out.print("\nenter today's : ");
		d2=console.nextInt();
		
		//year
		int years=y2-y1;
		//month
		int months=m2-m1;
		//days
		int days=d2-d1;
		if(days<0)
		{
			if(m2<=6)
			{
				days +=31;
				months--;
			}
			else
			{
				days+=30;
				months--;
			}
		}
		if(months<0)
		{
			months +=12;
			years-=1;
		}
		//seconds
		long seconds;
		if(m2>=6)
		{
			seconds=(years*365+months*31+days)*86400;
		}
		else
		{
			seconds=(years*365+months*30+days)*86400;
		}
		System.out.print("you have lived on earth for :"+years+" . "+months+" . "+days+"\n and "+seconds+" second's");
		console.close();
	}

}
