package Example4_6_2;

public class Example4_6_2 {

	public static void main(String[] args) 
	{
		Date d1=new Date();
		Date d2=new Date(1994,10,1);
		Date d3=new Date(d1);
		Date d4=new Date(d2);
		System.out.print("d1= ");
		d1.showDate();
		System.out.print("\nd2= ");
		d2.showDate();
		System.out.print("\nd3= ");
		d3.showDate();
		System.out.print("\nd4= ");
		d4.showDate();	
	}

}
