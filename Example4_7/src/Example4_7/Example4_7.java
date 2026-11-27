package Example4_7;

public class Example4_7 
{

	public static void main(String[] args) 
	{
		StaticTest object1=new StaticTest(3);
		StaticTest object2=new StaticTest(5);
		StaticTest object3=new StaticTest();
		StaticTest object4=new StaticTest(object1);
		
		System.out.print("line 13: object 1 = "+object1);
		System.out.print("\nline 14: object 2 = "+object2);
		System.out.print("\nobject 3 = "+object3);
		System.out.print("\nobject 4 = "+object4);
		System.out.print("\nline 17: incerement count using the class");
		StaticTest.incerementCount(); //calling without any object, static method
		System.out.print("\nline 19: object 1 = "+object1);
		System.out.print("\nline 20: object 2 = "+object2);
		System.out.print("\nincerement count using object 1");
		object1.incerementCount(); //calling a static method on a thing which is not good, working though
		System.out.print("\nline 23 : object 1 = "+object1);
		System.out.print("\nline 24 : object 2 = "+object2);
		System.out.print("\n incerement count using object 2");
		object2.incerementCount(); // calling static method on a thing, again!
		System.out.print("\nline 27 : object 1 = "+object1);
		System.out.print("\nline 29 : object 2 = "+object2);
		object1.setTest(10);
		System.out.println();
		System.out.print("\nline 30 : object 1 = "+object1);
		System.out.print("\nline 31 : object 2 = "+object2);
		System.out.print("\nline 32 : object 3 = "+object3);
		System.out.print("\nline 33 : object 4 = "+object4);
	}

}
