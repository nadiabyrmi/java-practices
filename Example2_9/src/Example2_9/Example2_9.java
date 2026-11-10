package Example2_9;
import java.util.Scanner;
public class Example2_9 
{
	static Scanner console=new Scanner(System.in);
	public static void main(String[] args) 
	{
		String firstName, lastName, line;
		int age;
		double weight;
		System.out.print("Enter your firstname, lastname, age and weight(separeted with space):");
		line=console.nextLine(); //this one read the whole line written
		System.out.println("line is: "+line);
		System.out.print("Enter first name, last name, age and weight(separated with space):");
		firstName=console.next();
		lastName=console.next();
		age=console.nextInt();
		weight=console.nextDouble();
		System.out.println("Name is :" + firstName +"\nsirname is :" +lastName+"\nage is :"+age+"\nweight is :"+weight );
		console.close();
	}

}
