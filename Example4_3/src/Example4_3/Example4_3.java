package Example4_3;
import java.util.Scanner;
public class Example4_3 
{
	static Scanner console=new Scanner(System.in);
	public static void main(String[] args) 
	{
		Temperature tempo=new Temperature();
		System.out.println("the temperature in class is: "+tempo.showTemperature());
		tempo.setTemperature(54.2);
		System.out.println("\nafter calling setter method, it is: "+tempo.getTemperature());
	}

}
