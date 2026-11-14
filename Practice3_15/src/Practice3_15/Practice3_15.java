package Practice3_15;
import java.util.Scanner;
public class Practice3_15 
{
	static Scanner console=new Scanner(System.in);
	public static void main(String[] args) 
	{
		char shape;
		System.out.print("enter one of these letters to get the shape: (T,S,C)");
		shape=console.next().charAt(0);
		switch(shape)
		{
		case ('T'):
			System.out.print("shape is: Triangle");
			break;
		case 'S':
			System.out.print("shape is: Square");
			break;
		case'C':
			System.out.print("shape is: Circle");
			break;
		default:
			System.out.print("character you've entered is not supported!");
		}

	}

}
