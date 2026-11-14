package Practice3_16;
import java.util.Scanner;
public class Practice3_16 
{
	static Scanner console=new  Scanner(System.in);
	public static void main(String[] args) 
	{
		int n,num;
		float sum=0;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		System.out.print("how many numbers do you need?");
		n=console.nextInt();
		for(int i=1;i<=n;i++)
		{	
			System.out.print("enter your number or 0 to quit: ");
			num=console.nextInt();
			if(num==0) break;
			sum+=num;
			max=(max>num? max:num);
			min=(min<num? min:num);
		}
		System.out.print("minimum number is: "+min+"\nmaximum number is: "+max+"\n their avwerage is: "+(float)sum/n);
		console.close();
	}

}
