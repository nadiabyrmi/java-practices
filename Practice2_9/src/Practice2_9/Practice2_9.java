package Practice2_9;
import java.util.Scanner;
public class Practice2_9 
{
	static Scanner console=new Scanner(System.in);
	public static void main(String[] args) 
	{
	 float price;
	 int discount;
	 System.out.print("enter book's price: ");
	 price=console.nextFloat();
	 System.out.print("\nhow much is book's diccount percentage? ");
	 discount=console.nextInt();
	 System.out.printf("books price is %f and discount is %d%%, you must pay :%f", price,discount,price(price,discount));
	 console.close();
	 }
	static public float price(float p, int d)
	{
		return p-((p*d)/100);
	}
}
