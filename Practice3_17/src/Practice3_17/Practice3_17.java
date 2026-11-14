package Practice3_17;
import java.util.Scanner;
public class Practice3_17 
{
	static Scanner console=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int score;
		double sum=0;
		int a=0,b=0,c=0;
		for(int i=1;i<=10;i++)
		{
			System.out.print("Enter student "+i+" score= ");
			score=console.nextInt();
			sum+=score;
			if(score>=90 && score<=100)
			{
				a++;
			}
			else if(score>=60 && score<=89)
			{
				b++;
			}
			else
				c++;
		}
		System.out.print("average score of 10 student is: "+(double)sum/10+"\n"+a+" student's score is between 100 & 90\n");
		System.out.print(b+" student's score is between 89 & 60\n"+c+" student's score is between 59 & 1.");
		console.close();

	}

}
