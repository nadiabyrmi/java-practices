package Example3_12;
import java.util.Scanner;
public class Example3_12
{
	static Scanner console=new Scanner(System.in);
	public static void main(String[] args) 
	{
		boolean done=true;
		int lampWatt, price;
		while(done)
		{
			System.out.print("\nEnter your lamp's watt to get the price: ");
			lampWatt=console.nextInt();
			switch(lampWatt)
			{
			case 40:
				price=2000;
				System.out.print("\n"+lampWatt+" watt lamp's price is: "+price);
				break;
			case 60:
			   price=2500;
			   System.out.print("\n"+lampWatt+" watt lamp's price is: "+price);
			   break;
			case 75:
				price=3000;
				System.out.print("\n"+lampWatt+" watt lamp's price is: "+price);
				break;
			case 100:
			case 150:
				price=4000;
				System.out.print("\n"+lampWatt+" watt lamp's price is: "+price);
				break;
			case 200:
				price=5000;
				System.out.print("\n"+"lamp's price is: "+ price);
				break;
			default:
				System.out.print("\n"+lampWatt+" watt lamp is not currently availabe in our store. ");
				done=false;
			}
		}
	console.close();
	}

}
