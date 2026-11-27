package Example4_7;

public class StaticTest
{
	private int x;
	private static int count;
	StaticTest() //constructor without parameter
	{
		x=0;
	}
	StaticTest(int a) //Constructor with parameter
	{
		x=a; 
	}
	StaticTest(StaticTest otherobject) //copy constructor
	{
		x=otherobject.x;
	}
	public void setTest(int a)// setter method
	{
		x=a;
	}
	public int getTest() //getter method
	{
		return x;
	}
	public int getcount() //returning count value
	{
		return count;
	}
	public static void incerementCount() //increasing count value without returning anything
	{
		count++; //static method which has access only to static variable of count
	}
	public String toString() // this method(non static) has access to static and non static fields
	{
		return ("x = "+x+" and count = "+count);
	}
}
