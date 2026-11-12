package Example3_3;
import java.util.Scanner;
public class Example3_3
{	
	static Scanner console=new Scanner(System.in);
	public static void main(String[] args) 
	{	
		int i=0;
		for(float x=15.0f;x<=18.0f;x+=0.5)
		{   
			System.out.print("number "+(i+1)+"is: "+x+"\n");
			i++;
		}
	console.close();
	}
}
